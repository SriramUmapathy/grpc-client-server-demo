package com.proto.contact;

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
    comments = "Source: contact/Contact.proto")
public final class ContactServiceGrpc {

  private ContactServiceGrpc() {}

  public static final String SERVICE_NAME = "contact.ContactService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.contact.ContactRequest,
      com.proto.contact.ContactResponse> getUnaryContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unaryContact",
      requestType = com.proto.contact.ContactRequest.class,
      responseType = com.proto.contact.ContactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.contact.ContactRequest,
      com.proto.contact.ContactResponse> getUnaryContactMethod() {
    io.grpc.MethodDescriptor<com.proto.contact.ContactRequest, com.proto.contact.ContactResponse> getUnaryContactMethod;
    if ((getUnaryContactMethod = ContactServiceGrpc.getUnaryContactMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getUnaryContactMethod = ContactServiceGrpc.getUnaryContactMethod) == null) {
          ContactServiceGrpc.getUnaryContactMethod = getUnaryContactMethod =
              io.grpc.MethodDescriptor.<com.proto.contact.ContactRequest, com.proto.contact.ContactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "unaryContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.contact.ContactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.contact.ContactResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("unaryContact"))
              .build();
        }
      }
    }
    return getUnaryContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.contact.Filter,
      com.proto.contact.ContactResponse> getServerStreamContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverStreamContact",
      requestType = com.proto.contact.Filter.class,
      responseType = com.proto.contact.ContactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.contact.Filter,
      com.proto.contact.ContactResponse> getServerStreamContactMethod() {
    io.grpc.MethodDescriptor<com.proto.contact.Filter, com.proto.contact.ContactResponse> getServerStreamContactMethod;
    if ((getServerStreamContactMethod = ContactServiceGrpc.getServerStreamContactMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getServerStreamContactMethod = ContactServiceGrpc.getServerStreamContactMethod) == null) {
          ContactServiceGrpc.getServerStreamContactMethod = getServerStreamContactMethod =
              io.grpc.MethodDescriptor.<com.proto.contact.Filter, com.proto.contact.ContactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "serverStreamContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.contact.Filter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.contact.ContactResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("serverStreamContact"))
              .build();
        }
      }
    }
    return getServerStreamContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.contact.ContactRequest,
      com.proto.contact.Status> getClientStreamContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clientStreamContact",
      requestType = com.proto.contact.ContactRequest.class,
      responseType = com.proto.contact.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.contact.ContactRequest,
      com.proto.contact.Status> getClientStreamContactMethod() {
    io.grpc.MethodDescriptor<com.proto.contact.ContactRequest, com.proto.contact.Status> getClientStreamContactMethod;
    if ((getClientStreamContactMethod = ContactServiceGrpc.getClientStreamContactMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getClientStreamContactMethod = ContactServiceGrpc.getClientStreamContactMethod) == null) {
          ContactServiceGrpc.getClientStreamContactMethod = getClientStreamContactMethod =
              io.grpc.MethodDescriptor.<com.proto.contact.ContactRequest, com.proto.contact.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clientStreamContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.contact.ContactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.contact.Status.getDefaultInstance()))
              .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("clientStreamContact"))
              .build();
        }
      }
    }
    return getClientStreamContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.contact.ContactRequest,
      com.proto.contact.ContactResponse> getBiDirectionalStreamContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "biDirectionalStreamContact",
      requestType = com.proto.contact.ContactRequest.class,
      responseType = com.proto.contact.ContactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.contact.ContactRequest,
      com.proto.contact.ContactResponse> getBiDirectionalStreamContactMethod() {
    io.grpc.MethodDescriptor<com.proto.contact.ContactRequest, com.proto.contact.ContactResponse> getBiDirectionalStreamContactMethod;
    if ((getBiDirectionalStreamContactMethod = ContactServiceGrpc.getBiDirectionalStreamContactMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getBiDirectionalStreamContactMethod = ContactServiceGrpc.getBiDirectionalStreamContactMethod) == null) {
          ContactServiceGrpc.getBiDirectionalStreamContactMethod = getBiDirectionalStreamContactMethod =
              io.grpc.MethodDescriptor.<com.proto.contact.ContactRequest, com.proto.contact.ContactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "biDirectionalStreamContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.contact.ContactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.contact.ContactResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("biDirectionalStreamContact"))
              .build();
        }
      }
    }
    return getBiDirectionalStreamContactMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContactServiceStub newStub(io.grpc.Channel channel) {
    return new ContactServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContactServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ContactServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContactServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ContactServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ContactServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void unaryContact(com.proto.contact.ContactRequest request,
        io.grpc.stub.StreamObserver<com.proto.contact.ContactResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnaryContactMethod(), responseObserver);
    }

    /**
     */
    public void serverStreamContact(com.proto.contact.Filter request,
        io.grpc.stub.StreamObserver<com.proto.contact.ContactResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getServerStreamContactMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.contact.ContactRequest> clientStreamContact(
        io.grpc.stub.StreamObserver<com.proto.contact.Status> responseObserver) {
      return asyncUnimplementedStreamingCall(getClientStreamContactMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.contact.ContactRequest> biDirectionalStreamContact(
        io.grpc.stub.StreamObserver<com.proto.contact.ContactResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBiDirectionalStreamContactMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUnaryContactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.contact.ContactRequest,
                com.proto.contact.ContactResponse>(
                  this, METHODID_UNARY_CONTACT)))
          .addMethod(
            getServerStreamContactMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.contact.Filter,
                com.proto.contact.ContactResponse>(
                  this, METHODID_SERVER_STREAM_CONTACT)))
          .addMethod(
            getClientStreamContactMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.contact.ContactRequest,
                com.proto.contact.Status>(
                  this, METHODID_CLIENT_STREAM_CONTACT)))
          .addMethod(
            getBiDirectionalStreamContactMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.contact.ContactRequest,
                com.proto.contact.ContactResponse>(
                  this, METHODID_BI_DIRECTIONAL_STREAM_CONTACT)))
          .build();
    }
  }

  /**
   */
  public static final class ContactServiceStub extends io.grpc.stub.AbstractStub<ContactServiceStub> {
    private ContactServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContactServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContactServiceStub(channel, callOptions);
    }

    /**
     */
    public void unaryContact(com.proto.contact.ContactRequest request,
        io.grpc.stub.StreamObserver<com.proto.contact.ContactResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnaryContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverStreamContact(com.proto.contact.Filter request,
        io.grpc.stub.StreamObserver<com.proto.contact.ContactResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getServerStreamContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.contact.ContactRequest> clientStreamContact(
        io.grpc.stub.StreamObserver<com.proto.contact.Status> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getClientStreamContactMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.contact.ContactRequest> biDirectionalStreamContact(
        io.grpc.stub.StreamObserver<com.proto.contact.ContactResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBiDirectionalStreamContactMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ContactServiceBlockingStub extends io.grpc.stub.AbstractStub<ContactServiceBlockingStub> {
    private ContactServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContactServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContactServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.contact.ContactResponse unaryContact(com.proto.contact.ContactRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnaryContactMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.contact.ContactResponse> serverStreamContact(
        com.proto.contact.Filter request) {
      return blockingServerStreamingCall(
          getChannel(), getServerStreamContactMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ContactServiceFutureStub extends io.grpc.stub.AbstractStub<ContactServiceFutureStub> {
    private ContactServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContactServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContactServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.contact.ContactResponse> unaryContact(
        com.proto.contact.ContactRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnaryContactMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNARY_CONTACT = 0;
  private static final int METHODID_SERVER_STREAM_CONTACT = 1;
  private static final int METHODID_CLIENT_STREAM_CONTACT = 2;
  private static final int METHODID_BI_DIRECTIONAL_STREAM_CONTACT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ContactServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ContactServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNARY_CONTACT:
          serviceImpl.unaryContact((com.proto.contact.ContactRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.contact.ContactResponse>) responseObserver);
          break;
        case METHODID_SERVER_STREAM_CONTACT:
          serviceImpl.serverStreamContact((com.proto.contact.Filter) request,
              (io.grpc.stub.StreamObserver<com.proto.contact.ContactResponse>) responseObserver);
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
        case METHODID_CLIENT_STREAM_CONTACT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientStreamContact(
              (io.grpc.stub.StreamObserver<com.proto.contact.Status>) responseObserver);
        case METHODID_BI_DIRECTIONAL_STREAM_CONTACT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biDirectionalStreamContact(
              (io.grpc.stub.StreamObserver<com.proto.contact.ContactResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ContactServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContactServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.contact.ContactOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContactService");
    }
  }

  private static final class ContactServiceFileDescriptorSupplier
      extends ContactServiceBaseDescriptorSupplier {
    ContactServiceFileDescriptorSupplier() {}
  }

  private static final class ContactServiceMethodDescriptorSupplier
      extends ContactServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ContactServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ContactServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContactServiceFileDescriptorSupplier())
              .addMethod(getUnaryContactMethod())
              .addMethod(getServerStreamContactMethod())
              .addMethod(getClientStreamContactMethod())
              .addMethod(getBiDirectionalStreamContactMethod())
              .build();
        }
      }
    }
    return result;
  }
}
