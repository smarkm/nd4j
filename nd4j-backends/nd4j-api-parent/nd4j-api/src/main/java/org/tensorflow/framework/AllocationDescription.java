// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/allocation_description.proto

package org.tensorflow.framework;

/**
 * Protobuf opType {@code tensorflow.AllocationDescription}
 */
public  final class AllocationDescription extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.AllocationDescription)
    AllocationDescriptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AllocationDescription.newBuilder() to construct.
  private AllocationDescription(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllocationDescription() {
    requestedBytes_ = 0L;
    allocatedBytes_ = 0L;
    allocatorName_ = "";
    allocationId_ = 0L;
    hasSingleReference_ = false;
    ptr_ = 0L;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AllocationDescription(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            requestedBytes_ = input.readInt64();
            break;
          }
          case 16: {

            allocatedBytes_ = input.readInt64();
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            allocatorName_ = s;
            break;
          }
          case 32: {

            allocationId_ = input.readInt64();
            break;
          }
          case 40: {

            hasSingleReference_ = input.readBool();
            break;
          }
          case 48: {

            ptr_ = input.readUInt64();
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
    return AllocationDescriptionProtos.internal_static_tensorflow_AllocationDescription_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return AllocationDescriptionProtos.internal_static_tensorflow_AllocationDescription_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AllocationDescription.class, Builder.class);
  }

  public static final int REQUESTED_BYTES_FIELD_NUMBER = 1;
  private long requestedBytes_;
  /**
   * <pre>
   * Total number of bytes requested
   * </pre>
   *
   * <code>int64 requested_bytes = 1;</code>
   */
  public long getRequestedBytes() {
    return requestedBytes_;
  }

  public static final int ALLOCATED_BYTES_FIELD_NUMBER = 2;
  private long allocatedBytes_;
  /**
   * <pre>
   * Total number of bytes allocated if known
   * </pre>
   *
   * <code>int64 allocated_bytes = 2;</code>
   */
  public long getAllocatedBytes() {
    return allocatedBytes_;
  }

  public static final int ALLOCATOR_NAME_FIELD_NUMBER = 3;
  private volatile Object allocatorName_;
  /**
   * <pre>
   * Name of the allocator used
   * </pre>
   *
   * <code>string allocator_name = 3;</code>
   */
  public String getAllocatorName() {
    Object ref = allocatorName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      allocatorName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the allocator used
   * </pre>
   *
   * <code>string allocator_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAllocatorNameBytes() {
    Object ref = allocatorName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      allocatorName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALLOCATION_ID_FIELD_NUMBER = 4;
  private long allocationId_;
  /**
   * <pre>
   * Identifier of the allocated buffer if known
   * </pre>
   *
   * <code>int64 allocation_id = 4;</code>
   */
  public long getAllocationId() {
    return allocationId_;
  }

  public static final int HAS_SINGLE_REFERENCE_FIELD_NUMBER = 5;
  private boolean hasSingleReference_;
  /**
   * <pre>
   * Set if this tensor only has one remaining reference
   * </pre>
   *
   * <code>bool has_single_reference = 5;</code>
   */
  public boolean getHasSingleReference() {
    return hasSingleReference_;
  }

  public static final int PTR_FIELD_NUMBER = 6;
  private long ptr_;
  /**
   * <pre>
   * Address of the allocation.
   * </pre>
   *
   * <code>uint64 ptr = 6;</code>
   */
  public long getPtr() {
    return ptr_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (requestedBytes_ != 0L) {
      output.writeInt64(1, requestedBytes_);
    }
    if (allocatedBytes_ != 0L) {
      output.writeInt64(2, allocatedBytes_);
    }
    if (!getAllocatorNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, allocatorName_);
    }
    if (allocationId_ != 0L) {
      output.writeInt64(4, allocationId_);
    }
    if (hasSingleReference_ != false) {
      output.writeBool(5, hasSingleReference_);
    }
    if (ptr_ != 0L) {
      output.writeUInt64(6, ptr_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestedBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, requestedBytes_);
    }
    if (allocatedBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, allocatedBytes_);
    }
    if (!getAllocatorNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, allocatorName_);
    }
    if (allocationId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, allocationId_);
    }
    if (hasSingleReference_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, hasSingleReference_);
    }
    if (ptr_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, ptr_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof AllocationDescription)) {
      return super.equals(obj);
    }
    AllocationDescription other = (AllocationDescription) obj;

    boolean result = true;
    result = result && (getRequestedBytes()
        == other.getRequestedBytes());
    result = result && (getAllocatedBytes()
        == other.getAllocatedBytes());
    result = result && getAllocatorName()
        .equals(other.getAllocatorName());
    result = result && (getAllocationId()
        == other.getAllocationId());
    result = result && (getHasSingleReference()
        == other.getHasSingleReference());
    result = result && (getPtr()
        == other.getPtr());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REQUESTED_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRequestedBytes());
    hash = (37 * hash) + ALLOCATED_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAllocatedBytes());
    hash = (37 * hash) + ALLOCATOR_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getAllocatorName().hashCode();
    hash = (37 * hash) + ALLOCATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAllocationId());
    hash = (37 * hash) + HAS_SINGLE_REFERENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasSingleReference());
    hash = (37 * hash) + PTR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPtr());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AllocationDescription parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AllocationDescription parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AllocationDescription parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AllocationDescription parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AllocationDescription parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AllocationDescription parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AllocationDescription parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AllocationDescription parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AllocationDescription parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AllocationDescription parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AllocationDescription parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AllocationDescription parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(AllocationDescription prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf opType {@code tensorflow.AllocationDescription}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.AllocationDescription)
      AllocationDescriptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AllocationDescriptionProtos.internal_static_tensorflow_AllocationDescription_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AllocationDescriptionProtos.internal_static_tensorflow_AllocationDescription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AllocationDescription.class, Builder.class);
    }

    // Construct using org.tensorflow.framework.AllocationDescription.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      requestedBytes_ = 0L;

      allocatedBytes_ = 0L;

      allocatorName_ = "";

      allocationId_ = 0L;

      hasSingleReference_ = false;

      ptr_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return AllocationDescriptionProtos.internal_static_tensorflow_AllocationDescription_descriptor;
    }

    public AllocationDescription getDefaultInstanceForType() {
      return AllocationDescription.getDefaultInstance();
    }

    public AllocationDescription build() {
      AllocationDescription result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public AllocationDescription buildPartial() {
      AllocationDescription result = new AllocationDescription(this);
      result.requestedBytes_ = requestedBytes_;
      result.allocatedBytes_ = allocatedBytes_;
      result.allocatorName_ = allocatorName_;
      result.allocationId_ = allocationId_;
      result.hasSingleReference_ = hasSingleReference_;
      result.ptr_ = ptr_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof AllocationDescription) {
        return mergeFrom((AllocationDescription)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AllocationDescription other) {
      if (other == AllocationDescription.getDefaultInstance()) return this;
      if (other.getRequestedBytes() != 0L) {
        setRequestedBytes(other.getRequestedBytes());
      }
      if (other.getAllocatedBytes() != 0L) {
        setAllocatedBytes(other.getAllocatedBytes());
      }
      if (!other.getAllocatorName().isEmpty()) {
        allocatorName_ = other.allocatorName_;
        onChanged();
      }
      if (other.getAllocationId() != 0L) {
        setAllocationId(other.getAllocationId());
      }
      if (other.getHasSingleReference() != false) {
        setHasSingleReference(other.getHasSingleReference());
      }
      if (other.getPtr() != 0L) {
        setPtr(other.getPtr());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      AllocationDescription parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AllocationDescription) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long requestedBytes_ ;
    /**
     * <pre>
     * Total number of bytes requested
     * </pre>
     *
     * <code>int64 requested_bytes = 1;</code>
     */
    public long getRequestedBytes() {
      return requestedBytes_;
    }
    /**
     * <pre>
     * Total number of bytes requested
     * </pre>
     *
     * <code>int64 requested_bytes = 1;</code>
     */
    public Builder setRequestedBytes(long value) {
      
      requestedBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total number of bytes requested
     * </pre>
     *
     * <code>int64 requested_bytes = 1;</code>
     */
    public Builder clearRequestedBytes() {
      
      requestedBytes_ = 0L;
      onChanged();
      return this;
    }

    private long allocatedBytes_ ;
    /**
     * <pre>
     * Total number of bytes allocated if known
     * </pre>
     *
     * <code>int64 allocated_bytes = 2;</code>
     */
    public long getAllocatedBytes() {
      return allocatedBytes_;
    }
    /**
     * <pre>
     * Total number of bytes allocated if known
     * </pre>
     *
     * <code>int64 allocated_bytes = 2;</code>
     */
    public Builder setAllocatedBytes(long value) {
      
      allocatedBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total number of bytes allocated if known
     * </pre>
     *
     * <code>int64 allocated_bytes = 2;</code>
     */
    public Builder clearAllocatedBytes() {
      
      allocatedBytes_ = 0L;
      onChanged();
      return this;
    }

    private Object allocatorName_ = "";
    /**
     * <pre>
     * Name of the allocator used
     * </pre>
     *
     * <code>string allocator_name = 3;</code>
     */
    public String getAllocatorName() {
      Object ref = allocatorName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        allocatorName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Name of the allocator used
     * </pre>
     *
     * <code>string allocator_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAllocatorNameBytes() {
      Object ref = allocatorName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        allocatorName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the allocator used
     * </pre>
     *
     * <code>string allocator_name = 3;</code>
     */
    public Builder setAllocatorName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      allocatorName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the allocator used
     * </pre>
     *
     * <code>string allocator_name = 3;</code>
     */
    public Builder clearAllocatorName() {
      
      allocatorName_ = getDefaultInstance().getAllocatorName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the allocator used
     * </pre>
     *
     * <code>string allocator_name = 3;</code>
     */
    public Builder setAllocatorNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      allocatorName_ = value;
      onChanged();
      return this;
    }

    private long allocationId_ ;
    /**
     * <pre>
     * Identifier of the allocated buffer if known
     * </pre>
     *
     * <code>int64 allocation_id = 4;</code>
     */
    public long getAllocationId() {
      return allocationId_;
    }
    /**
     * <pre>
     * Identifier of the allocated buffer if known
     * </pre>
     *
     * <code>int64 allocation_id = 4;</code>
     */
    public Builder setAllocationId(long value) {
      
      allocationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Identifier of the allocated buffer if known
     * </pre>
     *
     * <code>int64 allocation_id = 4;</code>
     */
    public Builder clearAllocationId() {
      
      allocationId_ = 0L;
      onChanged();
      return this;
    }

    private boolean hasSingleReference_ ;
    /**
     * <pre>
     * Set if this tensor only has one remaining reference
     * </pre>
     *
     * <code>bool has_single_reference = 5;</code>
     */
    public boolean getHasSingleReference() {
      return hasSingleReference_;
    }
    /**
     * <pre>
     * Set if this tensor only has one remaining reference
     * </pre>
     *
     * <code>bool has_single_reference = 5;</code>
     */
    public Builder setHasSingleReference(boolean value) {
      
      hasSingleReference_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Set if this tensor only has one remaining reference
     * </pre>
     *
     * <code>bool has_single_reference = 5;</code>
     */
    public Builder clearHasSingleReference() {
      
      hasSingleReference_ = false;
      onChanged();
      return this;
    }

    private long ptr_ ;
    /**
     * <pre>
     * Address of the allocation.
     * </pre>
     *
     * <code>uint64 ptr = 6;</code>
     */
    public long getPtr() {
      return ptr_;
    }
    /**
     * <pre>
     * Address of the allocation.
     * </pre>
     *
     * <code>uint64 ptr = 6;</code>
     */
    public Builder setPtr(long value) {
      
      ptr_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of the allocation.
     * </pre>
     *
     * <code>uint64 ptr = 6;</code>
     */
    public Builder clearPtr() {
      
      ptr_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.AllocationDescription)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.AllocationDescription)
  private static final AllocationDescription DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AllocationDescription();
  }

  public static AllocationDescription getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllocationDescription>
      PARSER = new com.google.protobuf.AbstractParser<AllocationDescription>() {
    public AllocationDescription parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AllocationDescription(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AllocationDescription> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AllocationDescription> getParserForType() {
    return PARSER;
  }

  public AllocationDescription getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
