/* Licensed under Apache-2.0 2024. */
package com.example.subcomponent;

import com.example.subcomponent.di.DaggerProvider;
import com.example.subcomponent.di.Provider;
import com.example.subcomponent.scoped.RequestComponent;
import com.example.subcomponent.scoped.RequestContext;
import com.example.subcomponent.scoped.ScopedRequestContext;
import com.example.subcomponent.scoped.SingletonRequestContext;
import com.example.subcomponent.subcomponent.SingletonSubComponentContext;
import com.example.subcomponent.subcomponent.SubComponent;
import com.example.subcomponent.subcomponent.SubComponentContext;

public class Main {

  public static void main(String[] args) {

    Provider provider = DaggerProvider.create();

    RequestComponent component1 = provider.requestComponentBuilder().string("hello1").build();
    RequestComponent component2 = provider.requestComponentBuilder().string("hello2").build();
    // new component each time
    System.err.println("component1.hashCode: " + component1.hashCode());
    System.err.println("component2.hashCode: " + component2.hashCode());

    // new instance each time, but same "data"
    RequestContext c1rc1 = component1.requestContext();
    RequestContext c1rc2 = component1.requestContext();
    System.err.println("c1rc1.hashCode: " + c1rc1.hashCode() + " data: " + c1rc1.getData());
    System.err.println("c1rc2.hashCode: " + c1rc2.hashCode() + " data: " + c1rc2.getData());

    // same object
    ScopedRequestContext c1sc1 = component1.scopedRequestContext();
    ScopedRequestContext c1sc2 = component1.scopedRequestContext();
    System.err.println("c1sc1.hashCode: " + c1sc1.hashCode());
    System.err.println("c1sc2.hashCode: " + c1sc2.hashCode());

    // same object
    SingletonRequestContext c1sr1 = component1.singletonRequestContext();
    SingletonRequestContext c1sr2 = component1.singletonRequestContext();
    System.err.println("c1sr1.hashCode: " + c1sr1.hashCode());
    System.err.println("c1sr2.hashCode: " + c1sr2.hashCode());

    RequestContext c2rc1 = component2.requestContext();
    RequestContext c2rc2 = component2.requestContext();
    // same behavior as above
    System.err.println("c2rc1.hashCode: " + c2rc1.hashCode() + " data: " + c2rc1.getData());
    System.err.println("c2rc2.hashCode: " + c2rc2.hashCode() + " data: " + c2rc2.getData());

    SubComponent subComponent1 = provider.subComponentBuilder().build();
    SubComponent subComponent2 = provider.subComponentBuilder().build();
    // new component each time
    System.err.println("subComponent1.hashCode: " + subComponent1.hashCode());
    System.err.println("subComponent2.hashCode: " + subComponent2.hashCode());

    SingletonSubComponentContext s1s1 = subComponent1.singletonSubComponentContext();
    SingletonSubComponentContext s1s2 = subComponent1.singletonSubComponentContext();
    // same object
    System.err.println("s1s1.hashCode: " + s1s1.hashCode());
    System.err.println("s1s2.hashCode: " + s1s2.hashCode());

    SubComponentContext s1c1 = subComponent1.subcomponentContext();
    SubComponentContext s1c2 = subComponent1.subcomponentContext();
    // new instance each time
    System.err.println("s1c1.hashCode: " + s1c1.hashCode());
    System.err.println("s1c2.hashCode: " + s1c2.hashCode());
  }
}
