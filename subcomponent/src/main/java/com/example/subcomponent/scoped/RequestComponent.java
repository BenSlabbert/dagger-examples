/* Licensed under Apache-2.0 2024. */
package com.example.subcomponent.scoped;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * all types produced by this component must be @AnotherScope, @RequestScope, @Singleton, or no
 * scope, otherwise we will get a compilation failure: <br>
 * [Dagger/IncompatiblyScopedBindings] ... may not reference bindings with different scopes
 *
 * @see <a href="https://dagger.dev/dev-guide/subcomponents#subcomponents-and-scope">Dagger
 *     subcomponents docs</a>
 */
@AnotherScope
@RequestScope
@Subcomponent
public interface RequestComponent {

  RequestContext requestContext();

  ScopedRequestContext scopedRequestContext();

  SingletonRequestContext singletonRequestContext();

  AnotherScopeRequestContext anotherScopeRequestContext();

  @Subcomponent.Builder
  interface Builder {
    @BindsInstance
    Builder string(String data);

    RequestComponent build();
  }
}
