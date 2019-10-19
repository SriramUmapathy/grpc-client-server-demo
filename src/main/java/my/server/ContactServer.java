package my.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import my.server.impl.ContactServiceImpl;

import java.io.IOException;

public class ContactServer {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Contact Grpc Server Running");

        Server server = ServerBuilder.forPort(50051)
                .addService(new ContactServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread( () -> {

            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println("Successfully stopper the learning.server");

        }));

        server.awaitTermination();

    }
}
