package learning.server;

import com.proto.calculator.AddServiceGrpc;
import com.proto.calculator.Calculator;
import com.proto.calculator.CalculatorRequest;
import com.proto.calculator.CalculatorResponse;
import io.grpc.stub.StreamObserver;

public class AddServiceImpl  extends AddServiceGrpc.AddServiceImplBase {

    @Override
    public void add(CalculatorRequest request, StreamObserver<CalculatorResponse> responseObserver) {

        Calculator calculator = request.getCalculatory();

        int resp = calculator.getA()+calculator.getB();

        responseObserver.onNext(CalculatorResponse.newBuilder().setResp(resp).build());
        responseObserver.onCompleted();

    }

}
