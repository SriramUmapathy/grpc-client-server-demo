package my.client;

import com.proto.contact.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import my.server.ContactServer;

import java.util.concurrent.CountDownLatch;

public class ContactClient {

    static ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",50051).usePlaintext().build();

    public static void main(String ar[]) {
        ContactClient contactClient = new ContactClient();

        contactClient.unaryClient();

        contactClient.clientStreamClient();

        contactClient.serverStreamClient();

        contactClient.biDiStreamClient();
    }

    private void unaryClient(){
        ContactServiceGrpc.ContactServiceBlockingStub request = ContactServiceGrpc.newBlockingStub(managedChannel);

        Contact contact = Contact.newBuilder().setFirstName("sriram").setLastName("umapathy").setEmail("palanisriram@gmail.com").setNumber("9840676684").build();

        ContactRequest contactRequest = ContactRequest.newBuilder().setContact(contact).build();

        ContactResponse response = request.unaryContact(contactRequest);

        System.out.println(response.getContact().getFirstName()+"  "+response.getContact().getLastName()+"  "+response.getContact().getEmail()+"  "+response.getContact().getNumber());
    }

    private void serverStreamClient(){
        ContactServiceGrpc.ContactServiceBlockingStub request = ContactServiceGrpc.newBlockingStub(managedChannel);


        request.serverStreamContact(Filter.newBuilder().setFirstName("sri").build()).forEachRemaining(response -> {
            System.out.println(response.getContact().getFirstName()+"  "+response.getContact().getLastName()+"  "+response.getContact().getEmail()+"  "+response.getContact().getNumber());
        });

    }

    private void clientStreamClient(){
        ContactServiceGrpc.ContactServiceStub request = ContactServiceGrpc.newStub(managedChannel);

        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<ContactRequest> req = request.clientStreamContact(new StreamObserver<Status>() {
            @Override
            public void onNext(Status value) {
                System.out.println(value.getStatus());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });

        for(int i= 0; i < 10; i++) {
            Contact contact = Contact.newBuilder().setFirstName("sriram").setLastName(""+i).setEmail("palanisriram@gmail.com").setNumber("9840676684").build();

            ContactRequest contactRequest = ContactRequest.newBuilder().setContact(contact).build();
            req.onNext(contactRequest);
        }
        req.onCompleted();

        try{
            latch.await();
        }catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

    }

    private void biDiStreamClient(){

        ContactServiceGrpc.ContactServiceStub request = ContactServiceGrpc.newStub(managedChannel);

        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<ContactRequest> req = request.biDirectionalStreamContact(new StreamObserver<ContactResponse>() {
            @Override
            public void onNext(ContactResponse response) {

                System.out.println(response.getContact().getFirstName()+"  "+response.getContact().getLastName()+"  "+response.getContact().getEmail()+"  "+response.getContact().getNumber());

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });


        for(int i= 0; i < 10; i++) {
            Contact contact = Contact.newBuilder().setFirstName("sriram").setLastName(""+i).setEmail("palanisriram@gmail.com").setNumber("9840676684").build();

            ContactRequest contactRequest = ContactRequest.newBuilder().setContact(contact).build();
            req.onNext(contactRequest);
        }
        req.onCompleted();

        try{
            latch.await();
        }catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

    }

}
