/* Licensed under Apache-2.0 2024. */
package com.example.test.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import com.example.test.config.AppConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DataServiceImplTest {

  @Mock private AppConfiguration appConfiguration;

  @InjectMocks private DataServiceImpl dataService;

  @Test
  void test() {
    when(appConfiguration.name()).thenReturn("name");
    assertThat(dataService.generate()).isEqualTo("name-data");
  }
}
