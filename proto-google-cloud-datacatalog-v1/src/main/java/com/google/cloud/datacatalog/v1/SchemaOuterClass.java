/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/schema.proto

package com.google.cloud.datacatalog.v1;

public final class SchemaOuterClass {
  private SchemaOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_Schema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_Schema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ColumnSchema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ColumnSchema_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/datacatalog/v1/schema.pro"
          + "to\022\033google.cloud.datacatalog.v1\032\037google/"
          + "api/field_behavior.proto\"D\n\006Schema\022:\n\007co"
          + "lumns\030\002 \003(\0132).google.cloud.datacatalog.v"
          + "1.ColumnSchema\"\247\001\n\014ColumnSchema\022\023\n\006colum"
          + "n\030\006 \001(\tB\003\340A\002\022\021\n\004type\030\001 \001(\tB\003\340A\002\022\030\n\013descr"
          + "iption\030\002 \001(\tB\003\340A\001\022\021\n\004mode\030\003 \001(\tB\003\340A\001\022B\n\n"
          + "subcolumns\030\007 \003(\0132).google.cloud.datacata"
          + "log.v1.ColumnSchemaB\003\340A\001B\313\001\n\037com.google."
          + "cloud.datacatalog.v1P\001ZFgoogle.golang.or"
          + "g/genproto/googleapis/cloud/datacatalog/"
          + "v1;datacatalog\370\001\001\252\002\033Google.Cloud.DataCat"
          + "alog.V1\312\002\033Google\\Cloud\\DataCatalog\\V1\352\002\036"
          + "Google::Cloud::DataCatalog::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1_Schema_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_Schema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_Schema_descriptor,
            new java.lang.String[] {
              "Columns",
            });
    internal_static_google_cloud_datacatalog_v1_ColumnSchema_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1_ColumnSchema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ColumnSchema_descriptor,
            new java.lang.String[] {
              "Column", "Type", "Description", "Mode", "Subcolumns",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
