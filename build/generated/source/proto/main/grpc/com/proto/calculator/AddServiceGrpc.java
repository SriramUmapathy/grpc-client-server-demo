package com.proto.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: calculator/Calculator.proto")
public final class AddServiceGrpc {

  private AddServiceGrpc() {}

  public static final String SERVICE_NAME = "calculator.AddService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.CalculatorRequest,
      com.proto.calculator.CalculatorResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = com.proto.calculator.CalculatorRequest.class,
      responseType = com.proto.calculator.CalculatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.CalculatorRequest,
      com.proto.calculator.CalculatorResponse> getAddMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.CalculatorRequest, com.proto.calculator.CalculatorResponse> getAddMethod;
    if ((getAddMethod = AddServiceGrpc.getAddMethod) == null) {
      synchronized (AddServiceGrpc.class) {
        if ((getAddMethod = AddServiceGrpc.getAddMethod) == null) {
          AddServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.CalculatorRequest, com.proto.calculator.CalculatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.CalculatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.CalculatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AddServiceMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AddServiceStub newStub(io.grpc.Channel channel) {
    return new AddServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AddServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AddServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AddServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AddServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AddServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void add(com.proto.calculator.CalculatorRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.CalculatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.CalculatorRequest,
                com.proto.calculator.CalculatorResponse>(
                  this, METHODID_ADD)))
          .build();
    }
  }

  /**
   */
  public static final class AddServiceStub extends io.grpc.stub.AbstractStub<AddServiceStub> {
    private AddServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddServiceStub(channel, callOptions);
    }

    /**
     */
    public void add(com.proto.calculator.CalculatorRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.CalculatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AddServiceBlockingStub extends io.grpc.stub.AbstractStub<AddServiceBlockingStub> {
    private AddServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.calculator.CalculatorResponse add(com.proto.calculator.CalculatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AddServiceFutureStub extends io.grpc.stub.AbstractStub<AddServiceFutureStub> {
    private AddServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.CalculatorResponse> add(
        com.proto.calculator.CalculatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AddServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AddServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((com.proto.calculator.CalculatorRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.CalculatorResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AddServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AddServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculator.CalculatorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AddService");
    }
  }

  private static final class AddServiceFileDescriptorSupplier
      extends AddServiceBaseDescriptorSupplier {
    AddServiceFileDescriptorSupplier() {}
  }

  private static final class AddServiceMethodDescriptorSupplier
      extends AddServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AddServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AddServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AddServiceFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .build();
        }
      }
    }
    return result;
  }
}
