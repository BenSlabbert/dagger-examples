/* Licensed under Apache-2.0 2024. */
package com.example.three.di;

import dagger.Module;

@Module(subcomponents = {Child1Component.class, Child2Component.class})
public interface SubcomponentsModule {
  // This module doesn't need to provide any dependencies directly.
  // It just declares the subcomponents that can be created from the parent component.
}
