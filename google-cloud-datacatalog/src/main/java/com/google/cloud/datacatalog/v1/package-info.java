/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= DataCatalogClient =======================
 *
 * <p>Service Description: Data Catalog API service allows clients to discover, understand, and
 * manage their data.
 *
 * <p>Sample for DataCatalogClient:
 *
 * <pre>{@code
 * try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   String entryGroupId = "entryGroupId1228924712";
 *   EntryGroup entryGroup = EntryGroup.newBuilder().build();
 *   EntryGroup response = dataCatalogClient.createEntryGroup(parent, entryGroupId, entryGroup);
 * }
 * }</pre>
 *
 * <p>======================= PolicyTagManagerClient =======================
 *
 * <p>Service Description: Policy Tag Manager API service allows clients to manage their policy tags
 * and taxonomies.
 *
 * <p>Policy tags are used to tag BigQuery columns and apply additional access control policies. A
 * taxonomy is a hierarchical grouping of policy tags that classify data along a common axis.
 *
 * <p>Sample for PolicyTagManagerClient:
 *
 * <pre>{@code
 * try (PolicyTagManagerClient policyTagManagerClient = PolicyTagManagerClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   Taxonomy taxonomy = Taxonomy.newBuilder().build();
 *   Taxonomy response = policyTagManagerClient.createTaxonomy(parent, taxonomy);
 * }
 * }</pre>
 *
 * <p>======================= PolicyTagManagerSerializationClient =======================
 *
 * <p>Service Description: Policy Tag Manager serialization API service allows clients to manipulate
 * their policy tags and taxonomies in serialized format, where taxonomy is a hierarchical group of
 * policy tags.
 *
 * <p>Sample for PolicyTagManagerSerializationClient:
 *
 * <pre>{@code
 * try (PolicyTagManagerSerializationClient policyTagManagerSerializationClient =
 *     PolicyTagManagerSerializationClient.create()) {
 *   ImportTaxonomiesRequest request =
 *       ImportTaxonomiesRequest.newBuilder()
 *           .setParent(TaxonomyName.of("[PROJECT]", "[LOCATION]", "[TAXONOMY]").toString())
 *           .build();
 *   ImportTaxonomiesResponse response =
 *       policyTagManagerSerializationClient.importTaxonomies(request);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.datacatalog.v1;

import javax.annotation.Generated;
