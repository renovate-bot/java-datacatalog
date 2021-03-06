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
// source: google/cloud/datacatalog/v1/data_source.proto

package com.google.cloud.datacatalog.v1;

public final class DataSourceProto {
  private DataSourceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_DataSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_DataSource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/datacatalog/v1/data_sourc"
          + "e.proto\022\033google.cloud.datacatalog.v1\032\037go"
          + "ogle/api/field_behavior.proto\"\245\001\n\nDataSo"
          + "urce\022@\n\007service\030\001 \001(\0162/.google.cloud.dat"
          + "acatalog.v1.DataSource.Service\022\020\n\010resour"
          + "ce\030\002 \001(\t\"C\n\007Service\022\027\n\023SERVICE_UNSPECIFI"
          + "ED\020\000\022\021\n\rCLOUD_STORAGE\020\001\022\014\n\010BIGQUERY\020\002B\334\001"
          + "\n\037com.google.cloud.datacatalog.v1B\017DataS"
          + "ourceProtoP\001ZFgoogle.golang.org/genproto"
          + "/googleapis/cloud/datacatalog/v1;datacat"
          + "alog\370\001\001\252\002\033Google.Cloud.DataCatalog.V1\312\002\033"
          + "Google\\Cloud\\DataCatalog\\V1\352\002\036Google::Cl"
          + "oud::DataCatalog::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1_DataSource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_DataSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_DataSource_descriptor,
            new java.lang.String[] {
              "Service", "Resource",
            });
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
