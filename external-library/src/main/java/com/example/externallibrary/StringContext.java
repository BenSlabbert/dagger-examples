/* Licensed under Apache-2.0 2024. */
package com.example.externallibrary;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
public class StringContext {

  private final String stringA;

  @Inject
  StringContext(@Named("A") String stringA) {
    this.stringA = stringA;
  }

  public void run() {
    System.err.println("StringContext: " + stringA);
  }
}
