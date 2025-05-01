/* Licensed under Apache-2.0 2024. */
package com.example.three.di;

import com.example.three.model.ServiceA;
import dagger.Component;
import jakarta.inject.Singleton;

@Singleton
@Component(modules = {SubcomponentsModule.class})
public interface ParentComponent {

  // Expose ServiceA to child components
  ServiceA serviceA();

  // Factory method for creating Child1Component
  Child1Component.Factory child1ComponentFactory();

  // Factory method for creating Child2Component
  Child2Component.Factory child2ComponentFactory();
}
