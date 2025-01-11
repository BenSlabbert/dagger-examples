/* Licensed under Apache-2.0 2024. */
package com.example.test.di;

import com.example.test.config.AppConfiguration;
import com.example.test.external.ExternalService;
import com.example.test.service.ServiceModule;
import dagger.BindsInstance;
import dagger.Component;
import jakarta.inject.Singleton;

@Singleton
@Component(modules = {ServiceModule.class})
public interface TestProvider extends Provider {

  @Component.Builder
  interface Builder {
    @BindsInstance
    Builder externalService(ExternalService service);

    @BindsInstance
    Builder appConfiguration(AppConfiguration config);

    TestProvider build();
  }
}
