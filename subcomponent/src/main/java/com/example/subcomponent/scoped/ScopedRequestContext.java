/* Licensed under Apache-2.0 2024. */
package com.example.subcomponent.scoped;

import jakarta.inject.Inject;

/** scope same as the component, behaves like singleton */
@RequestScope
public class ScopedRequestContext {

  @Inject
  ScopedRequestContext() {}
}
