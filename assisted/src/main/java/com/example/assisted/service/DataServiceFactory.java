/* Licensed under Apache-2.0 2024. */
package com.example.assisted.service;

import dagger.assisted.AssistedFactory;

@AssistedFactory
public interface DataServiceFactory {

  DataService create(String name);
}
