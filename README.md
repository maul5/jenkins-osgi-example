# jenkins-osgi-sample

## *HelloWorldService* Project

Implements a simple OSGi service.
It's a Maven project that generates the OSGi Manifest using the `maven-bundle-plugin` plugin.

## *HelloWorld* Project

Uses the OSGi service from *HelloWorldService*.
As a Maven project, it lists the HelloWorldService as one of its dependencies. Plus, it uses the `<Embed-Dependency>` in order to package the project and all its dependencies into a single *jar*.