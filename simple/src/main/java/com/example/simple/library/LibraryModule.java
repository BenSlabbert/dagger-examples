/* Licensed under Apache-2.0 2024. */
package com.example.simple.library;

import com.example.simple.ConfigurableObject;
import dagger.Module;
import dagger.Provides;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Module
public class LibraryModule {

  private final ConfigurableObject configurableObject;

  // https://proandroiddev.com/dagger-2-component-builder-1f2b91237856
  // this module depends on ConfigurableObject and provides @Named("C") String to the object graph
  public LibraryModule(ConfigurableObject configurableObject) {
    this.configurableObject = configurableObject;
  }

  @Provides
  @Singleton
  @Named("C")
  String string() {
    return "C";
  }
}
