/* Licensed under Apache-2.0 2024. */
package com.example.assisted;

import com.example.assisted.di.DaggerProvider;
import com.example.assisted.di.Provider;
import com.example.assisted.service.DataService;

public class Main {

  public static void main(String[] args) {

    Provider provider = DaggerProvider.builder().config(new Object()).build();

    DataService ds1 = provider.getDataServiceFactory().create("s1");
    DataService ds2 = provider.getDataServiceFactory().create("s2");

    // new instance each time
    System.err.println("ds1.hashCode: " + ds1.hashCode());
    System.err.println("ds2.hashCode: " + ds2.hashCode());

    ds1.run();
    ds2.run();
  }
}
