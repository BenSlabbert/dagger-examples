/* Licensed under Apache-2.0 2024. */
package com.example.test.external;

import dagger.Module;

@Module(includes = {ModuleBindings.class})
public interface ExternalModule {

  ExternalService remoteService();
}
