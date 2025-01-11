/* Licensed under Apache-2.0 2024. */
package com.example.assisted.di;

import com.example.assisted.service.DataServiceFactory;
import dagger.BindsInstance;
import dagger.Component;
import jakarta.inject.Singleton;

@Singleton
@Component
public interface Provider {

  DataServiceFactory getDataServiceFactory();

  @Component.Builder
  interface Builder {
    @BindsInstance
    Builder config(Object config);

    Provider build();
  }
}
