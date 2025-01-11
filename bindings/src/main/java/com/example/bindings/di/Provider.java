/* Licensed under Apache-2.0 2024. */
package com.example.bindings.di;

import com.example.bindings.map.MapModule;
import com.example.bindings.set.SetModule;
import com.example.bindings.types.ExternalResource;
import com.example.bindings.types.TypesModule;
import dagger.Component;
import jakarta.inject.Singleton;
import java.io.Closeable;
import java.util.Map;
import java.util.Set;

@Singleton
@Component(modules = {TypesModule.class, SetModule.class, MapModule.class})
public interface Provider {

  Closeable closeable();

  ExternalResource externalResource();

  Set<String> strings();

  Map<String, Long> map();
}
