/* Licensed under Apache-2.0 2024. */
package com.example.externallibrary;

import dagger.Module;
import dagger.Provides;

@Module
public class ExternalLibraryModule {

  private final Object data;

  public ExternalLibraryModule(Object data) {
    this.data = data;
  }

  @Provides
  Context context() {
    return new Context(data);
  }
}
