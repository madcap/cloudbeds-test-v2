/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.cloudbeds.user;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class UserResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7822756806105727169L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserResponse\",\"namespace\":\"com.cloudbeds.user\",\"fields\":[{\"name\":\"users\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"User\",\"fields\":[{\"name\":\"firstName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"lastName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"email\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UserResponse> ENCODER =
      new BinaryMessageEncoder<UserResponse>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UserResponse> DECODER =
      new BinaryMessageDecoder<UserResponse>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<UserResponse> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<UserResponse> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<UserResponse> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<UserResponse>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this UserResponse to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a UserResponse from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a UserResponse instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static UserResponse fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.List<com.cloudbeds.user.User> users;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserResponse() {}

  /**
   * All-args constructor.
   * @param users The new value for users
   */
  public UserResponse(java.util.List<com.cloudbeds.user.User> users) {
    this.users = users;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return users;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: users = (java.util.List<com.cloudbeds.user.User>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'users' field.
   * @return The value of the 'users' field.
   */
  public java.util.List<com.cloudbeds.user.User> getUsers() {
    return users;
  }


  /**
   * Sets the value of the 'users' field.
   * @param value the value to set.
   */
  public void setUsers(java.util.List<com.cloudbeds.user.User> value) {
    this.users = value;
  }

  /**
   * Creates a new UserResponse RecordBuilder.
   * @return A new UserResponse RecordBuilder
   */
  public static com.cloudbeds.user.UserResponse.Builder newBuilder() {
    return new com.cloudbeds.user.UserResponse.Builder();
  }

  /**
   * Creates a new UserResponse RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserResponse RecordBuilder
   */
  public static com.cloudbeds.user.UserResponse.Builder newBuilder(com.cloudbeds.user.UserResponse.Builder other) {
    if (other == null) {
      return new com.cloudbeds.user.UserResponse.Builder();
    } else {
      return new com.cloudbeds.user.UserResponse.Builder(other);
    }
  }

  /**
   * Creates a new UserResponse RecordBuilder by copying an existing UserResponse instance.
   * @param other The existing instance to copy.
   * @return A new UserResponse RecordBuilder
   */
  public static com.cloudbeds.user.UserResponse.Builder newBuilder(com.cloudbeds.user.UserResponse other) {
    if (other == null) {
      return new com.cloudbeds.user.UserResponse.Builder();
    } else {
      return new com.cloudbeds.user.UserResponse.Builder(other);
    }
  }

  /**
   * RecordBuilder for UserResponse instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserResponse>
    implements org.apache.avro.data.RecordBuilder<UserResponse> {

    private java.util.List<com.cloudbeds.user.User> users;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.cloudbeds.user.UserResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.users)) {
        this.users = data().deepCopy(fields()[0].schema(), other.users);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing UserResponse instance
     * @param other The existing instance to copy.
     */
    private Builder(com.cloudbeds.user.UserResponse other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.users)) {
        this.users = data().deepCopy(fields()[0].schema(), other.users);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'users' field.
      * @return The value.
      */
    public java.util.List<com.cloudbeds.user.User> getUsers() {
      return users;
    }


    /**
      * Sets the value of the 'users' field.
      * @param value The value of 'users'.
      * @return This builder.
      */
    public com.cloudbeds.user.UserResponse.Builder setUsers(java.util.List<com.cloudbeds.user.User> value) {
      validate(fields()[0], value);
      this.users = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'users' field has been set.
      * @return True if the 'users' field has been set, false otherwise.
      */
    public boolean hasUsers() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'users' field.
      * @return This builder.
      */
    public com.cloudbeds.user.UserResponse.Builder clearUsers() {
      users = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UserResponse build() {
      try {
        UserResponse record = new UserResponse();
        record.users = fieldSetFlags()[0] ? this.users : (java.util.List<com.cloudbeds.user.User>) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UserResponse>
    WRITER$ = (org.apache.avro.io.DatumWriter<UserResponse>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UserResponse>
    READER$ = (org.apache.avro.io.DatumReader<UserResponse>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    long size0 = this.users.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.cloudbeds.user.User e0: this.users) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      long size0 = in.readArrayStart();
      java.util.List<com.cloudbeds.user.User> a0 = this.users;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.cloudbeds.user.User>((int)size0, SCHEMA$.getField("users").schema());
        this.users = a0;
      } else a0.clear();
      SpecificData.Array<com.cloudbeds.user.User> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.cloudbeds.user.User>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          com.cloudbeds.user.User e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new com.cloudbeds.user.User();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          long size0 = in.readArrayStart();
          java.util.List<com.cloudbeds.user.User> a0 = this.users;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.cloudbeds.user.User>((int)size0, SCHEMA$.getField("users").schema());
            this.users = a0;
          } else a0.clear();
          SpecificData.Array<com.cloudbeds.user.User> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.cloudbeds.user.User>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              com.cloudbeds.user.User e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new com.cloudbeds.user.User();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










