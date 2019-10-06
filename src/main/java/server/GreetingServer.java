package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GreetingServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Hello Grpc");

        Server server = ServerBuilder.forPort(50051)
                .addService(new GreetServiceImpl())
                .addService(new AddServiceImpl())
                .addService(new PrimeServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread( () -> {

            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println("Successfully stopper the server");

        }));

        server.awaitTermination();

    }

}
