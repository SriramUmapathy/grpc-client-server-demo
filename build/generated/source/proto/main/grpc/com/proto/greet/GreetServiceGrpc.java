package com.proto.greet;

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
    comments = "Source: greet/greet.proto")
public final class GreetServiceGrpc {

  private GreetServiceGrpc() {}

  public static final String SERVICE_NAME = "greet.GreetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.greet.GreetRequest,
      com.proto.greet.GreetResponse> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Greet",
      requestType = com.proto.greet.GreetRequest.class,
      responseType = com.proto.greet.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.greet.GreetRequest,
      com.proto.greet.GreetResponse> getGreetMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.GreetRequest, com.proto.greet.GreetResponse> getGreetMethod;
    if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
          GreetServiceGrpc.getGreetMethod = getGreetMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.GreetRequest, com.proto.greet.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("Greet"))
              .build();
        }
      }
    }
    return getGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.GreetManyRequest,
      com.proto.greet.GreetmanyResponse> getGreetManyTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetManyTime",
      requestType = com.proto.greet.GreetManyRequest.class,
      responseType = com.proto.greet.GreetmanyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greet.GreetManyRequest,
      com.proto.greet.GreetmanyResponse> getGreetManyTimeMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.GreetManyRequest, com.proto.greet.GreetmanyResponse> getGreetManyTimeMethod;
    if ((getGreetManyTimeMethod = GreetServiceGrpc.getGreetManyTimeMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetManyTimeMethod = GreetServiceGrpc.getGreetManyTimeMethod) == null) {
          GreetServiceGrpc.getGreetManyTimeMethod = getGreetManyTimeMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.GreetManyRequest, com.proto.greet.GreetmanyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetManyTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetManyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetmanyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetManyTime"))
              .build();
        }
      }
    }
    return getGreetManyTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.GreetRequest,
      com.proto.greet.GreetResponse> getGreetManyClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetManyClient",
      requestType = com.proto.greet.GreetRequest.class,
      responseType = com.proto.greet.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greet.GreetRequest,
      com.proto.greet.GreetResponse> getGreetManyClientMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.GreetRequest, com.proto.greet.GreetResponse> getGreetManyClientMethod;
    if ((getGreetManyClientMethod = GreetServiceGrpc.getGreetManyClientMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetManyClientMethod = GreetServiceGrpc.getGreetManyClientMethod) == null) {
          GreetServiceGrpc.getGreetManyClientMethod = getGreetManyClientMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.GreetRequest, com.proto.greet.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetManyClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetManyClient"))
              .build();
        }
      }
    }
    return getGreetManyClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.GreetRequest,
      com.proto.greet.GreetResponse> getGreetBiClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetBiClient",
      requestType = com.proto.greet.GreetRequest.class,
      responseType = com.proto.greet.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greet.GreetRequest,
      com.proto.greet.GreetResponse> getGreetBiClientMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.GreetRequest, com.proto.greet.GreetResponse> getGreetBiClientMethod;
    if ((getGreetBiClientMethod = GreetServiceGrpc.getGreetBiClientMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetBiClientMethod = GreetServiceGrpc.getGreetBiClientMethod) == null) {
          GreetServiceGrpc.getGreetBiClientMethod = getGreetBiClientMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.GreetRequest, com.proto.greet.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetBiClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetBiClient"))
              .build();
        }
      }
    }
    return getGreetBiClientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetServiceStub newStub(io.grpc.Channel channel) {
    return new GreetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreetServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GreetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public void greet(com.proto.greet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    /**
     * <pre>
     *server Stream
     * </pre>
     */
    public void greetManyTime(com.proto.greet.GreetManyRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetmanyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetManyTimeMethod(), responseObserver);
    }

    /**
     * <pre>
     *client Stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.GreetRequest> greetManyClient(
        io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGreetManyClientMethod(), responseObserver);
    }

    /**
     * <pre>
     *bi-directional  Stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.GreetRequest> greetBiClient(
        io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGreetBiClientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.greet.GreetRequest,
                com.proto.greet.GreetResponse>(
                  this, METHODID_GREET)))
          .addMethod(
            getGreetManyTimeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.greet.GreetManyRequest,
                com.proto.greet.GreetmanyResponse>(
                  this, METHODID_GREET_MANY_TIME)))
          .addMethod(
            getGreetManyClientMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.greet.GreetRequest,
                com.proto.greet.GreetResponse>(
                  this, METHODID_GREET_MANY_CLIENT)))
          .addMethod(
            getGreetBiClientMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.greet.GreetRequest,
                com.proto.greet.GreetResponse>(
                  this, METHODID_GREET_BI_CLIENT)))
          .build();
    }
  }

  /**
   */
  public static final class GreetServiceStub extends io.grpc.stub.AbstractStub<GreetServiceStub> {
    private GreetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public void greet(com.proto.greet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server Stream
     * </pre>
     */
    public void greetManyTime(com.proto.greet.GreetManyRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetmanyResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGreetManyTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client Stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.GreetRequest> greetManyClient(
        io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGreetManyClientMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *bi-directional  Stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.GreetRequest> greetBiClient(
        io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGreetBiClientMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GreetServiceBlockingStub extends io.grpc.stub.AbstractStub<GreetServiceBlockingStub> {
    private GreetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public com.proto.greet.GreetResponse greet(com.proto.greet.GreetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server Stream
     * </pre>
     */
    public java.util.Iterator<com.proto.greet.GreetmanyResponse> greetManyTime(
        com.proto.greet.GreetManyRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGreetManyTimeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetServiceFutureStub extends io.grpc.stub.AbstractStub<GreetServiceFutureStub> {
    private GreetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.greet.GreetResponse> greet(
        com.proto.greet.GreetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;
  private static final int METHODID_GREET_MANY_TIME = 1;
  private static final int METHODID_GREET_MANY_CLIENT = 2;
  private static final int METHODID_GREET_BI_CLIENT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET:
          serviceImpl.greet((com.proto.greet.GreetRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse>) responseObserver);
          break;
        case METHODID_GREET_MANY_TIME:
          serviceImpl.greetManyTime((com.proto.greet.GreetManyRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greet.GreetmanyResponse>) responseObserver);
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
        case METHODID_GREET_MANY_CLIENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetManyClient(
              (io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse>) responseObserver);
        case METHODID_GREET_BI_CLIENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetBiClient(
              (io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.greet.Greet.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetService");
    }
  }

  private static final class GreetServiceFileDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier {
    GreetServiceFileDescriptorSupplier() {}
  }

  private static final class GreetServiceMethodDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetServiceFileDescriptorSupplier())
              .addMethod(getGreetMethod())
              .addMethod(getGreetManyTimeMethod())
              .addMethod(getGreetManyClientMethod())
              .addMethod(getGreetBiClientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
