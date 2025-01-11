/* Licensed under Apache-2.0 2024. */
package com.example.subcomponent.scoped;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

/** good old singleton scope */
@Singleton
public class SingletonRequestContext {

  @Inject
  SingletonRequestContext() {}
}
