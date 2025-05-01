/* Licensed under Apache-2.0 2024. */
package com.example.three.di;

import com.example.three.model.ServiceB;
import com.example.three.model.ServiceC;
import dagger.Subcomponent;

@Child1Scope
@Subcomponent
public interface Child1Component {

  // Expose ServiceB from this component
  ServiceB serviceB();

  // Expose ServiceC from this component
  ServiceC serviceC();

  @Subcomponent.Factory
  interface Factory {
    Child1Component create();
  }
}
