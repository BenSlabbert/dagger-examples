/* Licensed under Apache-2.0 2024. */
package com.example.test.external;

import java.util.concurrent.CompletableFuture;

public interface ExternalService {

  CompletableFuture<String> getNameFromRemote();
}
