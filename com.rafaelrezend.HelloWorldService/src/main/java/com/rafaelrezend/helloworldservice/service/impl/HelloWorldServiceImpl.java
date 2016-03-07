/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package com.rafaelrezend.helloworldservice.service.impl;

import com.rafaelrezend.helloworldservice.service.HelloWorldService;


/**
 * @author rar6si
 */
public class HelloWorldServiceImpl implements HelloWorldService {

  /**
   * {@inheritDoc}
   */
  @Override
  public String sayHello() {

    System.out.println("Inside HelloServiceImple.sayHello()");
    return "Say Hello";

  }

}
