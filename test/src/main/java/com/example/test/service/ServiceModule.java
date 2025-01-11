/* Licensed under Apache-2.0 2024. */
package com.example.test.service;

import dagger.Module;

@Module(includes = {ModuleBindings.class})
public interface ServiceModule {

  DataService dataService();

  ConfigService configService();
}
