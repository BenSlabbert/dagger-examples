/* Licensed under Apache-2.0 2024. */
package com.example.simple.di;

import com.example.externallibrary.Context;
import com.example.externallibrary.ExternalLibraryModule;
import com.example.externallibrary.StringContext;
import com.example.simple.ConfigurableObject;
import com.example.simple.component.DepA;
import com.example.simple.component.DepB;
import com.example.simple.component.DepC;
import com.example.simple.config.ConfigModule;
import com.example.simple.library.LibraryModule;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import jakarta.annotation.Nullable;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Component(
    modules = {
      Provider.EagerModule.class,
      ConfigModule.class,
      LibraryModule.class,
      ExternalLibraryModule.class
    })
public interface Provider {

  @Nullable Void init();

  DepA depA();

  DepB depB();

  DepC depC();

  Context context();

  StringContext stringContext();

  @Component.Builder
  interface Builder {
    Builder externalLibraryModule(ExternalLibraryModule externalLibraryModule);

    Builder libraryModule(LibraryModule libraryModule);

    @BindsInstance
    Builder stringB(@Named("B") String stringB);

    @BindsInstance
    Builder configurableObject(ConfigurableObject configurableObject);

    Provider build();
  }

  @Module
  final class EagerModule {

    @Inject
    EagerModule() {}

    @Provides
    @Nullable static Void provideEager(DepA depA) {
      // this eagerly builds any parameters specified and returns nothing
      return null;
    }
  }
}
