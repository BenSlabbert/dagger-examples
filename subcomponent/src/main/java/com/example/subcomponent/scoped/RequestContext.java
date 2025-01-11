/* Licensed under Apache-2.0 2024. */
package com.example.subcomponent.scoped;

import jakarta.inject.Inject;

/** no scope, new instance every time */
public class RequestContext {

  private final String data;

  @Inject
  RequestContext(String data) {
    this.data = data;
  }

  public String getData() {
    return data;
  }
}
