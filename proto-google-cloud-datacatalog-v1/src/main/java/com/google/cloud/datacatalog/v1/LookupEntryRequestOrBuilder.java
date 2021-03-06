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
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

public interface LookupEntryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.LookupEntryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full name of the Google Cloud Platform resource the Data Catalog
   * entry represents. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name.
   * Full names are case-sensitive.
   * Examples:
   *  * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
   *  * //pubsub.googleapis.com/projects/projectId/topics/topicId
   * </pre>
   *
   * <code>string linked_resource = 1;</code>
   *
   * @return Whether the linkedResource field is set.
   */
  boolean hasLinkedResource();
  /**
   *
   *
   * <pre>
   * The full name of the Google Cloud Platform resource the Data Catalog
   * entry represents. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name.
   * Full names are case-sensitive.
   * Examples:
   *  * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
   *  * //pubsub.googleapis.com/projects/projectId/topics/topicId
   * </pre>
   *
   * <code>string linked_resource = 1;</code>
   *
   * @return The linkedResource.
   */
  java.lang.String getLinkedResource();
  /**
   *
   *
   * <pre>
   * The full name of the Google Cloud Platform resource the Data Catalog
   * entry represents. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name.
   * Full names are case-sensitive.
   * Examples:
   *  * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
   *  * //pubsub.googleapis.com/projects/projectId/topics/topicId
   * </pre>
   *
   * <code>string linked_resource = 1;</code>
   *
   * @return The bytes for linkedResource.
   */
  com.google.protobuf.ByteString getLinkedResourceBytes();

  /**
   *
   *
   * <pre>
   * The SQL name of the entry. SQL names are case-sensitive.
   * Examples:
   *   * `pubsub.project_id.topic_id`
   *   * ``pubsub.project_id.`topic.id.with.dots` ``
   *   * `bigquery.table.project_id.dataset_id.table_id`
   *   * `bigquery.dataset.project_id.dataset_id`
   *   * `datacatalog.entry.project_id.location_id.entry_group_id.entry_id`
   * `*_id`s should satisfy the standard SQL rules for identifiers.
   * https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical.
   * </pre>
   *
   * <code>string sql_resource = 3;</code>
   *
   * @return Whether the sqlResource field is set.
   */
  boolean hasSqlResource();
  /**
   *
   *
   * <pre>
   * The SQL name of the entry. SQL names are case-sensitive.
   * Examples:
   *   * `pubsub.project_id.topic_id`
   *   * ``pubsub.project_id.`topic.id.with.dots` ``
   *   * `bigquery.table.project_id.dataset_id.table_id`
   *   * `bigquery.dataset.project_id.dataset_id`
   *   * `datacatalog.entry.project_id.location_id.entry_group_id.entry_id`
   * `*_id`s should satisfy the standard SQL rules for identifiers.
   * https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical.
   * </pre>
   *
   * <code>string sql_resource = 3;</code>
   *
   * @return The sqlResource.
   */
  java.lang.String getSqlResource();
  /**
   *
   *
   * <pre>
   * The SQL name of the entry. SQL names are case-sensitive.
   * Examples:
   *   * `pubsub.project_id.topic_id`
   *   * ``pubsub.project_id.`topic.id.with.dots` ``
   *   * `bigquery.table.project_id.dataset_id.table_id`
   *   * `bigquery.dataset.project_id.dataset_id`
   *   * `datacatalog.entry.project_id.location_id.entry_group_id.entry_id`
   * `*_id`s should satisfy the standard SQL rules for identifiers.
   * https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical.
   * </pre>
   *
   * <code>string sql_resource = 3;</code>
   *
   * @return The bytes for sqlResource.
   */
  com.google.protobuf.ByteString getSqlResourceBytes();

  /**
   *
   *
   * <pre>
   * Fully qualified name (FQN) of the resource.
   * FQNs take two forms:
   * * For non-regionalized resources:
   *   `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   * * For regionalized resources:
   *   `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   * Example for a DPMS table:
   * `dataproc_metastore:project_id.location_id.instance_id.database_id.table_id`
   * </pre>
   *
   * <code>string fully_qualified_name = 5;</code>
   *
   * @return Whether the fullyQualifiedName field is set.
   */
  boolean hasFullyQualifiedName();
  /**
   *
   *
   * <pre>
   * Fully qualified name (FQN) of the resource.
   * FQNs take two forms:
   * * For non-regionalized resources:
   *   `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   * * For regionalized resources:
   *   `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   * Example for a DPMS table:
   * `dataproc_metastore:project_id.location_id.instance_id.database_id.table_id`
   * </pre>
   *
   * <code>string fully_qualified_name = 5;</code>
   *
   * @return The fullyQualifiedName.
   */
  java.lang.String getFullyQualifiedName();
  /**
   *
   *
   * <pre>
   * Fully qualified name (FQN) of the resource.
   * FQNs take two forms:
   * * For non-regionalized resources:
   *   `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   * * For regionalized resources:
   *   `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   * Example for a DPMS table:
   * `dataproc_metastore:project_id.location_id.instance_id.database_id.table_id`
   * </pre>
   *
   * <code>string fully_qualified_name = 5;</code>
   *
   * @return The bytes for fullyQualifiedName.
   */
  com.google.protobuf.ByteString getFullyQualifiedNameBytes();

  public com.google.cloud.datacatalog.v1.LookupEntryRequest.TargetNameCase getTargetNameCase();
}
