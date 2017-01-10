/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.tools.intellij.resources;

import com.sun.istack.NotNull;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * This model item is shown in the project selector when a resource manager call is outstanding.
 */
class ResourceLoadingModelItem extends DefaultMutableTreeNode {

}

class ResourceEmptyModelItem extends DefaultMutableTreeNode {
  private String message;

  public ResourceEmptyModelItem(@NotNull String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}

/**
 * This model item represents a node shown in the project selector when an error occurs attempting
 * to query resource manager. The user can recover and try again by hitting refresh at the bottom
 * right. The error message is displayed under the user name.
 */
class ResourceErrorModelItem extends DefaultMutableTreeNode {

  private String errorMessage;

  public ResourceErrorModelItem(@NotNull String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String getErrorMessage() {
    return errorMessage;
  }
}
