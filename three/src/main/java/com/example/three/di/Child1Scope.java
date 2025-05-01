/* Licensed under Apache-2.0 2024. */
package com.example.three.di;

import jakarta.inject.Scope;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface Child1Scope {}
