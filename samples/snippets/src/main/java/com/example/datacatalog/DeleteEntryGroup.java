/*
 * Copyright 2020 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.datacatalog;

// [START data_catalog_delete_entry_group]
import com.google.cloud.datacatalog.v1.DataCatalogClient;
import com.google.cloud.datacatalog.v1.DeleteEntryGroupRequest;
import com.google.cloud.datacatalog.v1.EntryGroupName;
import java.io.IOException;

// Sample to delete a entry group
public class DeleteEntryGroup {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "MY_PROJECT_ID";
    String location = "MY_LOCATION";
    String entryGroupId = "MY_ENTRY_GROUP_ID";
    EntryGroupName entryGroupName = EntryGroupName.of(projectId, location, entryGroupId);
    deleteEntryGroup(entryGroupName);
  }

  public static void deleteEntryGroup(EntryGroupName entryGroupName) throws IOException {
    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (DataCatalogClient client = DataCatalogClient.create()) {
      DeleteEntryGroupRequest request =
          DeleteEntryGroupRequest.newBuilder().setName(entryGroupName.toString()).build();
      client.deleteEntryGroup(request);
      System.out.println("Entry group deleted successfully");
    }
  }
}
// [END data_catalog_delete_entry_group]
