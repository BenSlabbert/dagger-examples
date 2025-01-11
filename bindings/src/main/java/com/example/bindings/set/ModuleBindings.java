/* Licensed under Apache-2.0 2024. */
package com.example.bindings.set;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;
import jakarta.inject.Named;

@Module
interface ModuleBindings {

  @Binds
  @IntoSet
  String stringA(@Named("A") String a);

  @Binds
  @IntoSet
  String stringB(@Named("B") String b);
}
