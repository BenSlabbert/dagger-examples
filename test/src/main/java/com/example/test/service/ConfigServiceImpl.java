/* Licensed under Apache-2.0 2024. */
package com.example.test.service;

import com.example.test.external.ExternalService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.util.concurrent.CompletableFuture;

@Singleton
class ConfigServiceImpl implements ConfigService {

  private final ExternalService externalService;

  @Inject
  ConfigServiceImpl(ExternalService externalService) {
    this.externalService = externalService;
  }

  @Override
  public CompletableFuture<String> getConfig(String key) {
    return externalService.getNameFromRemote().thenApply(s -> "from-remote-" + s);
  }
}
