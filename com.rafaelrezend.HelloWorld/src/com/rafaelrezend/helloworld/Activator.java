package com.rafaelrezend.helloworld;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.rafaelrezend.helloworldservice.service.HelloWorldService;

public class Activator implements BundleActivator {

  ServiceReference helloWorldServiceReference;

  /*
   * (non-Javadoc)
   * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
   */
  @Override
  public void start(BundleContext context) throws Exception {
    System.out.println("Hello World!!");
    helloWorldServiceReference = context.getServiceReference(HelloWorldService.class.getName());
    HelloWorldService helloWorldService = (HelloWorldService) context.getService(helloWorldServiceReference);
    System.out.println(helloWorldService.sayHello());
  }

  /*
   * (non-Javadoc)
   * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
   */
  @Override
  public void stop(BundleContext context) throws Exception {
    System.out.println("Goodbye World!!");
    context.ungetService(helloWorldServiceReference);
  }

}
