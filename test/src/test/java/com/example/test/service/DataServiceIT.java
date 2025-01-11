/* Licensed under Apache-2.0 2024. */
package com.example.test.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verifyNoInteractions;

import com.example.test.IntegrationTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataServiceIT extends IntegrationTestBase {

  private DataService dataService;

  @BeforeEach
  void setUp() {
    dataService = provider.dataService();
  }

  @Test
  void test() {
    assertThat(dataService.generate()).isEqualTo("name-data");
    verifyNoInteractions(externalService);
  }
}
