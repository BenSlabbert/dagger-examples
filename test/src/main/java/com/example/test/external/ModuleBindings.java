/* Licensed under Apache-2.0 2024. */
package com.example.test.external;

import dagger.Binds;
import dagger.Module;

@Module
interface ModuleBindings {

  @Binds
  ExternalService provideRemoteService(ExternalServiceImpl remoteService);
}
