package server;

import com.proto.prime.PrimeRequest;
import com.proto.prime.PrimeResponse;
import com.proto.prime.PrimeServiceGrpc;
import io.grpc.stub.StreamObserver;

public class PrimeServiceImpl extends PrimeServiceGrpc.PrimeServiceImplBase {

    @Override
    public void prime(PrimeRequest request, StreamObserver<PrimeResponse> responseObserver) {
        int N = request.getPrime().getA();
        int k = 2;

        while(N > 1){
            if(N % k == 0){
                responseObserver.onNext(PrimeResponse.newBuilder().setResp(k).build());
                N = N / k;
            } else {
                k+=1;
            }
        }
        responseObserver.onCompleted();
    }
}
