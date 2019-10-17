package learning.client;

import com.proto.calculator.AddServiceGrpc;
import com.proto.calculator.Calculator;
import com.proto.calculator.CalculatorRequest;
import com.proto.calculator.CalculatorResponse;
import com.proto.greet.*;
import com.proto.prime.Prime;
import com.proto.prime.PrimeRequest;
import com.proto.prime.PrimeServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class GreetingClient {

    static ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",50051).usePlaintext().build();

    public static void main(String[] args) {
        System.out.println("Hello i am a Grpc learning.client");
        //unary
        greetRequest();
        addRequest();

        //serverStream
        greetMany();
        prime();

        //clientStream
        clientSteam();

        //biDirectional Stream
        greetBiClient();



        System.out.println("Shutting down channel");
        managedChannel.shutdown();


    }


    public static void greetRequest() {
        GreetServiceGrpc.GreetServiceBlockingStub syncGreetClient = GreetServiceGrpc.newBlockingStub(managedChannel);

        Greeting greeting = Greeting.newBuilder().setFirstName("Hi palani").setLastName("sriram").build();

        GreetRequest request = GreetRequest.newBuilder().setGreeting(greeting).build();

        GreetResponse response = syncGreetClient.greet(request);

        System.out.println(response.getResult());
    }

    public static void addRequest() {

        AddServiceGrpc.AddServiceBlockingStub add = AddServiceGrpc.newBlockingStub(managedChannel);

        CalculatorResponse response = add.add( CalculatorRequest.newBuilder().setCalculatory(Calculator.newBuilder().setA(4).setB(6).build()).build());
        System.out.println(response.getResp());

    }
    //learning.server stream
    public static void greetMany(){

        GreetServiceGrpc.GreetServiceBlockingStub syncGreetClient = GreetServiceGrpc.newBlockingStub(managedChannel);
        Greeting greeting = Greeting.newBuilder().setFirstName("Hi palani").setLastName("sriram").build();

        GreetManyRequest greetManyRequest = GreetManyRequest.newBuilder().setGreeting(greeting).build();

        syncGreetClient.greetManyTime(greetManyRequest).forEachRemaining(resp ->{
            System.out.println(resp.getResult());
        });
    }

    public static void prime(){
        PrimeServiceGrpc.newBlockingStub(managedChannel)
                .prime(
                        PrimeRequest.newBuilder().setPrime(Prime.newBuilder().setA(120).build()).build()
                ).forEachRemaining(resp -> {
            System.out.println(resp.getResp());
        });
    }

    public static void clientSteam(){

        GreetServiceGrpc.GreetServiceStub client = GreetServiceGrpc.newStub(managedChannel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<GreetRequest> reqObs = client.greetManyClient(new StreamObserver<GreetResponse>() {
            @Override
            public void onNext(GreetResponse value) {
                System.out.println(value.getResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });

        System.out.println("sent 1");
        reqObs.onNext(GreetRequest.newBuilder().setGreeting(
                Greeting.newBuilder().setFirstName("palani").setLastName("sriram").build()
        ).build());
        System.out.println("sent 2");
        reqObs.onNext(GreetRequest.newBuilder().setGreeting(
                Greeting.newBuilder().setFirstName("umapathy").setLastName("sriram").build()
        ).build());
        System.out.println("sent 1");
        reqObs.onNext(GreetRequest.newBuilder().setGreeting(
                Greeting.newBuilder().setFirstName("saraswathi").setLastName("sriram").build()
        ).build());
        reqObs.onCompleted();

        try{
            latch.await();
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public static void greetBiClient(){

        GreetServiceGrpc.GreetServiceStub client = GreetServiceGrpc.newStub(managedChannel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<GreetRequest> resp = client.greetBiClient(new StreamObserver<GreetResponse>() {
            @Override
            public void onNext(GreetResponse value) {
                System.out.println(value.getResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });

        resp.onNext(
                GreetRequest.newBuilder().setGreeting(
                        Greeting.newBuilder().setFirstName("palani").setLastName("sriram").build()
                )
                        .build());

        resp.onNext(
                GreetRequest.newBuilder().setGreeting(
                        Greeting.newBuilder().setFirstName("palani").setLastName("sriram1").build()
                )
                        .build());

        resp.onNext(
                GreetRequest.newBuilder().setGreeting(
                        Greeting.newBuilder().setFirstName("palani").setLastName("sriram2").build()
                )
                        .build());

        resp.onNext(
                GreetRequest.newBuilder().setGreeting(
                        Greeting.newBuilder().setFirstName("palani").setLastName("sriram3").build()
                )
                        .build());

        resp.onNext(
                GreetRequest.newBuilder().setGreeting(
                        Greeting.newBuilder().setFirstName("palani").setLastName("sriram5").build()
                )
                        .build());

        resp.onCompleted();

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
