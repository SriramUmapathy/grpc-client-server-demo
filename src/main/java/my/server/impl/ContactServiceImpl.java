package my.server.impl;

import com.proto.contact.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceImpl extends ContactServiceGrpc.ContactServiceImplBase {

    private static List<Contact> contacts = new ArrayList<>();


    @Override
    public void unaryContact(ContactRequest request, StreamObserver<ContactResponse> responseObserver) {
        System.out.println("Unary server");
        Contact contact =request.getContact();
        contacts.add(contact);

        System.out.println("First Name = "+contact.getFirstName() +", Last Name = "+contact.getLastName()+", Email = "+contact.getEmail());

        ContactResponse response =ContactResponse.newBuilder().setContact(contact).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void serverStreamContact(Filter request, StreamObserver<ContactResponse> responseObserver) {

        System.out.println("Server Stream server");

        String name = request.getFirstName();
        try {
          for(Contact contact : contacts) {
//              if(contact.getFirstName().equals(name))
                  responseObserver.onNext(ContactResponse.newBuilder().setContact(contact).build());
          }
        } catch (Exception e) {
           System.err.println(e.getMessage());
        } finally {
            responseObserver.onCompleted();
        }

    }

    @Override
    public StreamObserver<ContactRequest> clientStreamContact(StreamObserver<Status> responseObserver) {

        System.out.println("Client Stream server");

        StreamObserver<ContactRequest> request = new StreamObserver<ContactRequest>() {
            @Override
            public void onNext(ContactRequest value) {
                Contact contact =value.getContact();
                contacts.add(contact);

                System.out.println("First Name = "+contact.getFirstName() +", Last Name = "+contact.getLastName()+", Email = "+contact.getEmail());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(Status.newBuilder().setStatus("Successs").build());
                responseObserver.onCompleted();
            }
        };

        return request;
    }

    @Override
    public StreamObserver<ContactRequest> biDirectionalStreamContact(StreamObserver<ContactResponse> responseObserver) {

        System.out.println("Bi-directional Stream server");

        StreamObserver<ContactRequest> request = new StreamObserver<ContactRequest>() {
            @Override
            public void onNext(ContactRequest value) {

                Contact contact =value.getContact();
                contacts.add(contact);

                System.out.println("First Name = "+contact.getFirstName() +", Last Name = "+contact.getLastName()+", Email = "+contact.getEmail());

                responseObserver.onNext(ContactResponse.newBuilder().setContact(contact).build());

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

        return request;
    }


}
