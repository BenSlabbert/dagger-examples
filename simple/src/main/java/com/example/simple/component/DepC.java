/* Licensed under Apache-2.0 2024. */
package com.example.simple.component;

import com.example.simple.ConfigurableObject;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class DepC {

  private final ConfigurableObject configurableObject;
  private final DepA depA;

  @Inject
  DepC(ConfigurableObject configurableObject, DepA depA) {
    this.configurableObject = configurableObject;
    this.depA = depA;
  }

  public void run() {
    depA.run();
  }
}
