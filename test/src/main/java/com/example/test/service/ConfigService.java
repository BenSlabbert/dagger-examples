/* Licensed under Apache-2.0 2024. */
package com.example.test.service;

import java.util.concurrent.CompletableFuture;

public interface ConfigService {

  CompletableFuture<String> getConfig(String key);
}
