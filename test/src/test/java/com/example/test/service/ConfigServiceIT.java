/* Licensed under Apache-2.0 2024. */
package com.example.test.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import com.example.test.IntegrationTestBase;
import com.example.test.config.AppConfiguration;
import com.example.test.di.DaggerTestProvider;
import com.example.test.di.Provider;
import java.util.concurrent.CompletableFuture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConfigServiceIT extends IntegrationTestBase {

  private ConfigService configService;

  @BeforeEach
  void setUp() {
    Provider provider =
        DaggerTestProvider.builder()
            .externalService(externalService)
            .appConfiguration(new AppConfiguration("name"))
            .build();
    configService = provider.configService();
  }

  @Test
  void test() throws Exception {
    when(externalService.getNameFromRemote())
        .thenReturn(CompletableFuture.completedFuture("value"));
    CompletableFuture<String> future = configService.getConfig("name");
    assertThat(future.get()).isEqualTo("from-remote-value");
  }
}
