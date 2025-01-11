/* Licensed under Apache-2.0 2024. */
package com.example.test;

import static org.mockito.Mockito.reset;

import com.example.test.config.AppConfiguration;
import com.example.test.di.DaggerTestProvider;
import com.example.test.di.Provider;
import com.example.test.external.ExternalService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public abstract class IntegrationTestBase {

  @Mock protected ExternalService externalService;

  protected Provider provider;

  @BeforeEach
  void setUp() {
    provider =
        DaggerTestProvider.builder()
            .externalService(externalService)
            .appConfiguration(new AppConfiguration("name"))
            .build();
  }

  @AfterEach
  void afterEach() {
    reset(externalService);
  }
}
