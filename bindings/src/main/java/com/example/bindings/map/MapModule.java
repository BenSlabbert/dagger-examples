/* Licensed under Apache-2.0 2024. */
package com.example.bindings.map;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public final class MapModule {

  private MapModule() {}

  @Provides
  @IntoMap
  @StringKey("foo")
  static Long provideFooValue() {
    return 1L;
  }

  @Provides
  @IntoMap
  @StringKey("bar")
  static Long provideBarValue() {
    return 2L;
  }
}
