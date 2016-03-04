package com.rafaelrezend.helloworldservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.rafaelrezend.helloworldservice.service.HelloWorldService;
import com.rafaelrezend.helloworldservice.service.impl.HelloWorldServiceImpl;

public class HelloWorldServiceActivator implements BundleActivator {

  ServiceRegistration helloWorldServiceRegistration;

  /*
   * (non-Javadoc)
   * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
   */
  public void start(BundleContext context) throws Exception {

    HelloWorldService helloWorldService = new HelloWorldServiceImpl();
    helloWorldServiceRegistration = context.registerService(HelloWorldService.class.getName(), helloWorldService, null);
  }

  /*
   * (non-Javadoc)
   * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
   */
  public void stop(BundleContext context) throws Exception {
    helloWorldServiceRegistration.unregister();
  }

}
