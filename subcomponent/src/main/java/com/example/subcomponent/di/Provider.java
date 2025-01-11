/* Licensed under Apache-2.0 2024. */
package com.example.subcomponent.di;

import com.example.subcomponent.scoped.RequestComponent;
import com.example.subcomponent.subcomponent.SubComponent;
import dagger.Component;
import jakarta.inject.Singleton;

@Singleton
@Component
public interface Provider {

  RequestComponent.Builder requestComponentBuilder();

  SubComponent.Builder subComponentBuilder();
}
