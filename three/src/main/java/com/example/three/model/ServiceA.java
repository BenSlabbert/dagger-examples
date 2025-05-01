/* Licensed under Apache-2.0 2024. */
package com.example.three.model;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class ServiceA {

  @Inject
  public ServiceA() {
    System.out.println("ServiceA created");
  }

  public void doSomething() {
    System.out.println("ServiceA doing something");
  }
}
