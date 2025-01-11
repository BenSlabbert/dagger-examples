/* Licensed under Apache-2.0 2024. */
package com.example.simple;

import com.example.externallibrary.Context;
import com.example.externallibrary.ExternalLibraryModule;
import com.example.simple.component.DepA;
import com.example.simple.component.DepC;
import com.example.simple.di.DaggerProvider;
import com.example.simple.di.Provider;
import com.example.simple.library.LibraryModule;

public class Main {

  public static void main(String[] args) {
    ConfigurableObject configurableObject = new ConfigurableObject();
    Provider provider =
        DaggerProvider.builder()
            .stringB("B")
            .externalLibraryModule(new ExternalLibraryModule(new Object()) {})
            .libraryModule(new LibraryModule(configurableObject))
            .configurableObject(configurableObject)
            .build();
    provider.init();

    DepA depA = provider.depA();
    depA.run();

    // the same
    System.err.println("depA.hashCode: " + depA.hashCode());
    System.err.println("depA.hashCode: " + provider.depA().hashCode());

    // different
    System.err.println("depB.hashCode: " + provider.depB().hashCode());
    System.err.println("depB.hashCode: " + provider.depB().hashCode());

    DepC depC = provider.depC();
    depC.run();

    Context c1 = provider.context();
    Context c2 = provider.context();
    System.err.println("c1.hashCode: " + c1.hashCode());
    System.err.println("c2.hashCode: " + c2.hashCode());

    provider.stringContext().run();
  }
}
