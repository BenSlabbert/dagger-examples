/* Licensed under Apache-2.0 2024. */
package com.example.bindings.types;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.io.Closeable;
import java.io.IOException;

@Singleton
public class ExternalResource implements Closeable {

  @Inject
  ExternalResource() {}

  @Override
  public void close() throws IOException {
    // do nothing
  }
}
