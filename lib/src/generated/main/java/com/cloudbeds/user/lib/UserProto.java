// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.cloudbeds.user.lib;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_cloudbeds_user_NameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_cloudbeds_user_NameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_cloudbeds_user_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_cloudbeds_user_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_cloudbeds_user_UserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_cloudbeds_user_UserResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\022com.cloudbeds.user\" \n\013Name" +
      "Request\022\021\n\tfirstName\030\001 \001(\t\":\n\004User\022\021\n\tfi" +
      "rstName\030\001 \001(\t\022\020\n\010lastName\030\002 \001(\t\022\r\n\005email" +
      "\030\003 \001(\t\"7\n\014UserResponse\022\'\n\005users\030\001 \003(\0132\030." +
      "com.cloudbeds.user.User2i\n\013UserService\022Z" +
      "\n\023GetUsersByFirstName\022\037.com.cloudbeds.us" +
      "er.NameRequest\032 .com.cloudbeds.user.User" +
      "Response\"\000B%\n\026com.cloudbeds.user.libB\tUs" +
      "erProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_cloudbeds_user_NameRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_cloudbeds_user_NameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_cloudbeds_user_NameRequest_descriptor,
        new java.lang.String[] { "FirstName", });
    internal_static_com_cloudbeds_user_User_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_cloudbeds_user_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_cloudbeds_user_User_descriptor,
        new java.lang.String[] { "FirstName", "LastName", "Email", });
    internal_static_com_cloudbeds_user_UserResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_cloudbeds_user_UserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_cloudbeds_user_UserResponse_descriptor,
        new java.lang.String[] { "Users", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
