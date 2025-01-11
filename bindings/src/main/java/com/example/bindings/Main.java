/* Licensed under Apache-2.0 2024. */
package com.example.bindings;

import com.example.bindings.di.DaggerProvider;
import com.example.bindings.di.Provider;
import com.example.bindings.types.ExternalResource;
import java.io.Closeable;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    Provider provider = DaggerProvider.create();

    Closeable closeable = provider.closeable();
    ExternalResource externalResource = provider.externalResource();
    // same instance, different reference types
    System.err.println("closeable.hashCode: " + closeable.hashCode());
    System.err.println("externalResource.hashCode: " + externalResource.hashCode());

    for (String string : provider.strings()) {
      System.err.println("string: " + string);
    }

    for (Map.Entry<String, Long> entry : provider.map().entrySet()) {
      System.err.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
