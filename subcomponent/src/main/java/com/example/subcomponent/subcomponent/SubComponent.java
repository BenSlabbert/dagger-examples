/* Licensed under Apache-2.0 2024. */
package com.example.subcomponent.subcomponent;

import dagger.Subcomponent;

/**
 * all types produced by this component must be @Singleton, or no scope; otherwise we will get a
 * compilation failure: <br>
 * [Dagger/IncompatiblyScopedBindings] ... may not reference bindings with different scopes
 *
 * @see <a href="https://dagger.dev/dev-guide/subcomponents#subcomponents-and-scope">Dagger
 *     subcomponents docs</a>
 */
@Subcomponent
public interface SubComponent {

  SubComponentContext subcomponentContext();

  SingletonSubComponentContext singletonSubComponentContext();

  @Subcomponent.Builder
  interface Builder {
    SubComponent build();
  }
}
