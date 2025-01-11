/* Licensed under Apache-2.0 2024. */
package com.example.bindings.types;

import dagger.Binds;
import dagger.Module;
import java.io.Closeable;

@Module
public interface TypesModule {

  @Binds
  Closeable externalResource(ExternalResource externalResource);
}
