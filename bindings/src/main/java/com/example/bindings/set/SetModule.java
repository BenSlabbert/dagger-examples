/* Licensed under Apache-2.0 2024. */
package com.example.bindings.set;

import dagger.Module;
import dagger.Provides;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Module(includes = ModuleBindings.class)
public final class SetModule {

  private SetModule() {}

  @Provides
  @Singleton
  @Named("A")
  static String stringA() {
    return "A";
  }

  @Provides
  @Singleton
  @Named("B")
  static String stringB() {
    return "B";
  }
}
