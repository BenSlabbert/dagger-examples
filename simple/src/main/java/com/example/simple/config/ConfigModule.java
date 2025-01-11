/* Licensed under Apache-2.0 2024. */
package com.example.simple.config;

import dagger.Module;
import dagger.Provides;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Module
public final class ConfigModule {

  private ConfigModule() {}

  @Provides
  @Singleton
  @Named("A")
  static String string() {
    return "A";
  }
}
