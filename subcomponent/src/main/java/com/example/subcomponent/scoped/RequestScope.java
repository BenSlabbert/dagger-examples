/* Licensed under Apache-2.0 2024. */
package com.example.subcomponent.scoped;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import jakarta.inject.Scope;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

@Scope
@Documented
@Retention(RUNTIME)
public @interface RequestScope {}
