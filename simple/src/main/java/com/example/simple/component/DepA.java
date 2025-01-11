/* Licensed under Apache-2.0 2024. */
package com.example.simple.component;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
public class DepA {

  private final String stringA;
  private final String stringB;
  private final String stringC;

  @Inject
  DepA(@Named("A") String stringA, @Named("B") String stringB, @Named("C") String stringC) {
    this.stringA = stringA;
    this.stringB = stringB;
    this.stringC = stringC;
  }

  public void run() {
    System.err.println("stringA: " + stringA);
    System.err.println("stringB: " + stringB);
    System.err.println("stringC: " + stringC);
  }
}
