/* Licensed under Apache-2.0 2025. */
package com.example.three;

import com.example.three.di.Child1Component;
import com.example.three.di.Child2Component;
import com.example.three.di.DaggerParentComponent;
import com.example.three.di.ParentComponent;
import com.example.three.model.ServiceA;
import com.example.three.model.ServiceB;
import com.example.three.model.ServiceC;

public class Main {

  public static void main(String[] args) {
    // Create the parent component
    ParentComponent parentComponent = DaggerParentComponent.create();

    // Get ServiceA from the parent component
    ServiceA serviceA = parentComponent.serviceA();
    System.out.println("ServiceA from parent: " + serviceA);
    serviceA.doSomething();

    System.out.println("\n--- Child1Component ---");

    // Create the first child component
    Child1Component child1Component = parentComponent.child1ComponentFactory().create();

    // Get services from the first child component
    ServiceB serviceB1 = child1Component.serviceB();
    System.out.println("ServiceB from child1: " + serviceB1);
    serviceB1.doSomething();

    ServiceC serviceC1 = child1Component.serviceC();
    System.out.println("ServiceC from child1: " + serviceC1);
    serviceC1.doSomething();

    // Get another instance of ServiceB from the first child component
    ServiceB anotherServiceB1 = child1Component.serviceB();
    System.out.println("Another ServiceB from child1: " + anotherServiceB1);
    System.out.println("Are ServiceB instances the same? " + (serviceB1 == anotherServiceB1));

    System.out.println("\n--- Child2Component ---");

    // Create the second child component
    Child2Component child2Component = parentComponent.child2ComponentFactory().create();

    // Get services from the second child component
    ServiceB serviceB2 = child2Component.serviceB();
    System.out.println("ServiceB from child2: " + serviceB2);
    serviceB2.doSomething();

    ServiceC serviceC2 = child2Component.serviceC();
    System.out.println("ServiceC from child2: " + serviceC2);
    serviceC2.doSomething();

    // Compare ServiceA instances from different components
    ServiceA serviceAFromParent = parentComponent.serviceA();
    System.out.println("\n--- Comparing ServiceA instances ---");
    System.out.println("ServiceA from parent: " + serviceAFromParent);
    System.out.println("Are ServiceA instances the same? " + (serviceA == serviceAFromParent));

    // Compare ServiceB instances from different child components
    System.out.println("\n--- Comparing ServiceB instances ---");
    System.out.println("ServiceB from child1: " + serviceB1);
    System.out.println("ServiceB from child2: " + serviceB2);
    System.out.println(
        "Are ServiceB instances from different children the same? " + (serviceB1 == serviceB2));
  }
}
