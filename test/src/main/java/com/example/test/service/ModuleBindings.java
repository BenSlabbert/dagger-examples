/* Licensed under Apache-2.0 2024. */
package com.example.test.service;

import dagger.Binds;
import dagger.Module;

@Module
interface ModuleBindings {

  @Binds
  DataService dataService(DataServiceImpl impl);

  @Binds
  ConfigService configService(ConfigServiceImpl impl);
}
