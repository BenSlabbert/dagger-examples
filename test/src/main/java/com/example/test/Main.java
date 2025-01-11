/* Licensed under Apache-2.0 2024. */
package com.example.test;

import com.example.test.config.AppConfiguration;
import com.example.test.di.DaggerProvider;
import com.example.test.di.Provider;
import com.example.test.service.DataService;

public class Main {

  public static void main(String[] args) {
    Provider provider =
        DaggerProvider.builder().appConfiguration(new AppConfiguration("name")).build();
    DataService dataService = provider.dataService();
    String generate = dataService.generate();
    System.err.println("generate: " + generate);
  }
}
