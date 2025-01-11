/* Licensed under Apache-2.0 2024. */
package com.example.assisted.service;

import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public class DataService {

  private final Object config;
  private final String serviceName;

  @AssistedInject
  DataService(Object config, @Assisted String serviceName) {
    this.config = config;
    this.serviceName = serviceName;
  }

  public void run() {
    System.err.println("DataService is running... " + serviceName);
  }
}
