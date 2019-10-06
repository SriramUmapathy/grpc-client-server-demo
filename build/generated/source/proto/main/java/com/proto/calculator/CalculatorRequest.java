// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/Calculator.proto

package com.proto.calculator;

/**
 * Protobuf type {@code calculator.CalculatorRequest}
 */
public  final class CalculatorRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:calculator.CalculatorRequest)
    CalculatorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalculatorRequest.newBuilder() to construct.
  private CalculatorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalculatorRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CalculatorRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CalculatorRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.proto.calculator.Calculator.Builder subBuilder = null;
            if (calculatory_ != null) {
              subBuilder = calculatory_.toBuilder();
            }
            calculatory_ = input.readMessage(com.proto.calculator.Calculator.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(calculatory_);
              calculatory_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.calculator.CalculatorOuterClass.internal_static_calculator_CalculatorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.calculator.CalculatorOuterClass.internal_static_calculator_CalculatorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.calculator.CalculatorRequest.class, com.proto.calculator.CalculatorRequest.Builder.class);
  }

  public static final int CALCULATORY_FIELD_NUMBER = 1;
  private com.proto.calculator.Calculator calculatory_;
  /**
   * <code>.calculator.Calculator calculatory = 1;</code>
   */
  public boolean hasCalculatory() {
    return calculatory_ != null;
  }
  /**
   * <code>.calculator.Calculator calculatory = 1;</code>
   */
  public com.proto.calculator.Calculator getCalculatory() {
    return calculatory_ == null ? com.proto.calculator.Calculator.getDefaultInstance() : calculatory_;
  }
  /**
   * <code>.calculator.Calculator calculatory = 1;</code>
   */
  public com.proto.calculator.CalculatorOrBuilder getCalculatoryOrBuilder() {
    return getCalculatory();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (calculatory_ != null) {
      output.writeMessage(1, getCalculatory());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (calculatory_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCalculatory());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.proto.calculator.CalculatorRequest)) {
      return super.equals(obj);
    }
    com.proto.calculator.CalculatorRequest other = (com.proto.calculator.CalculatorRequest) obj;

    if (hasCalculatory() != other.hasCalculatory()) return false;
    if (hasCalculatory()) {
      if (!getCalculatory()
          .equals(other.getCalculatory())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCalculatory()) {
      hash = (37 * hash) + CALCULATORY_FIELD_NUMBER;
      hash = (53 * hash) + getCalculatory().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.calculator.CalculatorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.CalculatorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.CalculatorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.CalculatorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.CalculatorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.CalculatorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.CalculatorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.calculator.CalculatorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.calculator.CalculatorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.calculator.CalculatorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.calculator.CalculatorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.calculator.CalculatorRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.calculator.CalculatorRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code calculator.CalculatorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:calculator.CalculatorRequest)
      com.proto.calculator.CalculatorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.calculator.CalculatorOuterClass.internal_static_calculator_CalculatorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.calculator.CalculatorOuterClass.internal_static_calculator_CalculatorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.calculator.CalculatorRequest.class, com.proto.calculator.CalculatorRequest.Builder.class);
    }

    // Construct using com.proto.calculator.CalculatorRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (calculatoryBuilder_ == null) {
        calculatory_ = null;
      } else {
        calculatory_ = null;
        calculatoryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.calculator.CalculatorOuterClass.internal_static_calculator_CalculatorRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.calculator.CalculatorRequest getDefaultInstanceForType() {
      return com.proto.calculator.CalculatorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.calculator.CalculatorRequest build() {
      com.proto.calculator.CalculatorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.calculator.CalculatorRequest buildPartial() {
      com.proto.calculator.CalculatorRequest result = new com.proto.calculator.CalculatorRequest(this);
      if (calculatoryBuilder_ == null) {
        result.calculatory_ = calculatory_;
      } else {
        result.calculatory_ = calculatoryBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.calculator.CalculatorRequest) {
        return mergeFrom((com.proto.calculator.CalculatorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.calculator.CalculatorRequest other) {
      if (other == com.proto.calculator.CalculatorRequest.getDefaultInstance()) return this;
      if (other.hasCalculatory()) {
        mergeCalculatory(other.getCalculatory());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.proto.calculator.CalculatorRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.calculator.CalculatorRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.calculator.Calculator calculatory_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.calculator.Calculator, com.proto.calculator.Calculator.Builder, com.proto.calculator.CalculatorOrBuilder> calculatoryBuilder_;
    /**
     * <code>.calculator.Calculator calculatory = 1;</code>
     */
    public boolean hasCalculatory() {
      return calculatoryBuilder_ != null || calculatory_ != null;
    }
    /**
     * <code>.calculator.Calculator calculatory = 1;</code>
     */
    public com.proto.calculator.Calculator getCalculatory() {
      if (calculatoryBuilder_ == null) {
        return calculatory_ == null ? com.proto.calculator.Calculator.getDefaultInstance() : calculatory_;
      } else {
        return calculatoryBuilder_.getMessage();
      }
    }
    /**
     * <code>.calculator.Calculator calculatory = 1;</code>
     */
    public Builder setCalculatory(com.proto.calculator.Calculator value) {
      if (calculatoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        calculatory_ = value;
        onChanged();
      } else {
        calculatoryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.calculator.Calculator calculatory = 1;</code>
     */
    public Builder setCalculatory(
        com.proto.calculator.Calculator.Builder builderForValue) {
      if (calculatoryBuilder_ == null) {
        calculatory_ = builderForValue.build();
        onChanged();
      } else {
        calculatoryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.calculator.Calculator calculatory = 1;</code>
     */
    public Builder mergeCalculatory(com.proto.calculator.Calculator value) {
      if (calculatoryBuilder_ == null) {
        if (calculatory_ != null) {
          calculatory_ =
            com.proto.calculator.Calculator.newBuilder(calculatory_).mergeFrom(value).buildPartial();
        } else {
          calculatory_ = value;
        }
        onChanged();
      } else {
        calculatoryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.calculator.Calculator calculatory = 1;</code>
     */
    public Builder clearCalculatory() {
      if (calculatoryBuilder_ == null) {
        calculatory_ = null;
        onChanged();
      } else {
        calculatory_ = null;
        calculatoryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.calculator.Calculator calculatory = 1;</code>
     */
    public com.proto.calculator.Calculator.Builder getCalculatoryBuilder() {
      
      onChanged();
      return getCalculatoryFieldBuilder().getBuilder();
    }
    /**
     * <code>.calculator.Calculator calculatory = 1;</code>
     */
    public com.proto.calculator.CalculatorOrBuilder getCalculatoryOrBuilder() {
      if (calculatoryBuilder_ != null) {
        return calculatoryBuilder_.getMessageOrBuilder();
      } else {
        return calculatory_ == null ?
            com.proto.calculator.Calculator.getDefaultInstance() : calculatory_;
      }
    }
    /**
     * <code>.calculator.Calculator calculatory = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.calculator.Calculator, com.proto.calculator.Calculator.Builder, com.proto.calculator.CalculatorOrBuilder> 
        getCalculatoryFieldBuilder() {
      if (calculatoryBuilder_ == null) {
        calculatoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.calculator.Calculator, com.proto.calculator.Calculator.Builder, com.proto.calculator.CalculatorOrBuilder>(
                getCalculatory(),
                getParentForChildren(),
                isClean());
        calculatory_ = null;
      }
      return calculatoryBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:calculator.CalculatorRequest)
  }

  // @@protoc_insertion_point(class_scope:calculator.CalculatorRequest)
  private static final com.proto.calculator.CalculatorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.calculator.CalculatorRequest();
  }

  public static com.proto.calculator.CalculatorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalculatorRequest>
      PARSER = new com.google.protobuf.AbstractParser<CalculatorRequest>() {
    @java.lang.Override
    public CalculatorRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CalculatorRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CalculatorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalculatorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.calculator.CalculatorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

