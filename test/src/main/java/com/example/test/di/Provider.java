/* Licensed under Apache-2.0 2024. */
package com.example.test.di;

import com.example.test.config.AppConfiguration;
import com.example.test.external.ExternalModule;
import com.example.test.external.ExternalService;
import com.example.test.service.ConfigService;
import com.example.test.service.DataService;
import com.example.test.service.ServiceModule;
import dagger.BindsInstance;
import dagger.Component;
import jakarta.inject.Singleton;

@Singleton
@Component(modules = {ServiceModule.class, ExternalModule.class})
public interface Provider {

  DataService dataService();

  ConfigService configService();

  ExternalService remoteService();

  @Component.Builder
  interface Builder {
    @BindsInstance
    Builder appConfiguration(AppConfiguration config);

    Provider build();
  }
}
