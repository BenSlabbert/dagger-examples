/* Licensed under Apache-2.0 2024. */
package com.example.three.model;

import jakarta.inject.Inject;

// ServiceC depends on ServiceA, which is a singleton in the parent component
// This demonstrates how child components can use dependencies from the parent component
public class ServiceC {

  private final ServiceA serviceA;

  @Inject
  public ServiceC(ServiceA serviceA) {
    this.serviceA = serviceA;
    System.out.println("ServiceC created with ServiceA: " + serviceA);
  }

  public void doSomething() {
    System.out.println("ServiceC doing something");
    serviceA.doSomething();
  }
}
