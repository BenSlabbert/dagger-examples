/* Licensed under Apache-2.0 2024. */
package com.example.subcomponent.scoped;

import jakarta.inject.Inject;

@AnotherScope
public class AnotherScopeRequestContext {

  @Inject
  AnotherScopeRequestContext() {}
}
