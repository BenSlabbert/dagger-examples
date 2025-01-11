/* Licensed under Apache-2.0 2024. */
package com.example.externallibrary;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class Context {

  @Inject
  public Context(Object data) {}
}
