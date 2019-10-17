package learning.server;

import com.proto.greet.*;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {

    //unary
    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {

        Greeting greet = request.getGreeting();

        String resp = greet.getFirstName()+" "+greet.getLastName();

        GreetResponse response = GreetResponse.newBuilder().setResult(resp).build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }

    //learning.server streaming
    @Override
    public void greetManyTime(GreetManyRequest request, StreamObserver<GreetmanyResponse> responseObserver) {

        Greeting greeting = request.getGreeting();

        try{

            for (int i = 0; i < 10; i++ ) {

                GreetmanyResponse greetmanyResponse = GreetmanyResponse
                        .newBuilder()
                        .setResult(greeting.getFirstName() +" - "+greeting.getFirstName() +" : "+i)
                        .build();
                responseObserver.onNext(greetmanyResponse);
                Thread.sleep(10);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            responseObserver.onCompleted();
        }
    }


    @Override
    public StreamObserver<GreetRequest> greetManyClient(StreamObserver<GreetResponse> responseObserver) {


        StreamObserver<GreetRequest> request = new StreamObserver<GreetRequest>() {
            String resp = "";
            @Override
            public void onNext(GreetRequest value) {
                System.out.println("learning.client sent message");
                resp+="hi "+ value.getGreeting().getFirstName()+"  "+value.getGreeting().getLastName()+", ";

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

                responseObserver.onNext(GreetResponse.newBuilder().setResult(resp).build());
                responseObserver.onCompleted();
            }
        };

        return request;
    }

    @Override
    public StreamObserver<GreetRequest> greetBiClient(StreamObserver<GreetResponse> responseObserver) {

        StreamObserver<GreetRequest> request = new StreamObserver<GreetRequest>() {
            @Override
            public void onNext(GreetRequest value) {

                responseObserver.onNext(GreetResponse.newBuilder().setResult(value.getGreeting().getFirstName()+" - "+value.getGreeting().getLastName()).build());

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
