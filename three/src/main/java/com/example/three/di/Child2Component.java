/* Licensed under Apache-2.0 2024. */
package com.example.three.di;

import com.example.three.model.ServiceB;
import com.example.three.model.ServiceC;
import dagger.Subcomponent;

@Child2Scope
@Subcomponent
public interface Child2Component {

  // Expose ServiceB from this component
  ServiceB serviceB();

  // Expose ServiceC from this component
  ServiceC serviceC();

  @Subcomponent.Factory
  interface Factory {
    Child2Component create();
  }
}
