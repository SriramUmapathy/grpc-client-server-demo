package my.server.impl;

import com.proto.contact.Contact;
import com.proto.contact.ContactRequest;
import com.proto.contact.ContactResponse;
import com.proto.contact.ContactServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceImpl extends ContactServiceGrpc.ContactServiceImplBase {

    private static List<Contact> contacts = new ArrayList<>();

    @Override
    public void unaryContact(ContactRequest request, StreamObserver<ContactResponse> responseObserver) {

        Contact contact =request.getContact();
        contacts.add(contact);

        System.out.println("First Name = "+contact.getFirstName() +", Last Name = "+contact.getLastName()+", Email = "+contact.getEmail());

        ContactResponse response =ContactResponse.newBuilder().setContact(contact).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void clientStreamContact(ContactRequest request, StreamObserver<ContactResponse> responseObserver) {
        super.clientStreamContact(request, responseObserver);
    }

    @Override
    public void serverStreamContact(ContactRequest request, StreamObserver<ContactResponse> responseObserver) {
        super.serverStreamContact(request, responseObserver);
    }

    @Override
    public void biDirectionalStreamContact(ContactRequest request, StreamObserver<ContactResponse> responseObserver) {
        super.biDirectionalStreamContact(request, responseObserver);
    }

}
