/* Licensed under Apache-2.0 2024. */
package com.example.test.external;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.util.concurrent.CompletableFuture;

@Singleton
class ExternalServiceImpl implements ExternalService {

  @Inject
  ExternalServiceImpl() {}

  @Override
  public CompletableFuture<String> getNameFromRemote() {
    return CompletableFuture.completedFuture("remote-name");
  }
}
