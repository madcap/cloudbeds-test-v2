// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.cloudbeds.user.lib;

public interface UserResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.cloudbeds.user.UserResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.cloudbeds.user.User users = 1;</code>
   */
  java.util.List<com.cloudbeds.user.lib.User> 
      getUsersList();
  /**
   * <code>repeated .com.cloudbeds.user.User users = 1;</code>
   */
  com.cloudbeds.user.lib.User getUsers(int index);
  /**
   * <code>repeated .com.cloudbeds.user.User users = 1;</code>
   */
  int getUsersCount();
  /**
   * <code>repeated .com.cloudbeds.user.User users = 1;</code>
   */
  java.util.List<? extends com.cloudbeds.user.lib.UserOrBuilder> 
      getUsersOrBuilderList();
  /**
   * <code>repeated .com.cloudbeds.user.User users = 1;</code>
   */
  com.cloudbeds.user.lib.UserOrBuilder getUsersOrBuilder(
      int index);
}