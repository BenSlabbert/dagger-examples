/* Licensed under Apache-2.0 2024. */
package com.example.test.service;

import com.example.test.config.AppConfiguration;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
class DataServiceImpl implements DataService {

  private final AppConfiguration config;

  @Inject
  DataServiceImpl(AppConfiguration config) {
    this.config = config;
  }

  @Override
  public String generate() {
    return config.name() + "-data";
  }
}
