/* Licensed under Apache-2.0 2024. */
package com.example.three.model;

import jakarta.inject.Inject;

// Note: ServiceB is not scoped, so each injection point will get a new instance
// unless it's requested from a scoped component
public class ServiceB {

  @Inject
  public ServiceB() {
    System.out.println("ServiceB created");
  }

  public void doSomething() {
    System.out.println("ServiceB doing something");
  }
}
