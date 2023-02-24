# Welcome to this tutorial on the Spring Core module! 
![alt text](https://spring.io/img/spring-2.svg)

In this tutorial, we will cover all the important concepts, best practices, and advanced topics related to Spring Core. 
Spring Core is the foundation of the entire Spring Framework and provides essential features like dependency injection, inversion of control, and application context management.

Here is the list of topics we will be covering in this tutorial:

* [Introduction to Spring Framework](#introduction-to-spring-framework)
    - [What is Spring?](#what-is-spring)
    - [History and evolution of Spring Framework](#history-and-evolution-of-spring-framework)
    - [Advantages and disadvantages of using Spring Framework](#advantages-and-disadvantages-of-using-spring-framework)
    - [Alternative frameworks to Spring](#alternative-frameworks-to-spring)
    - [Spring framework vs Java EE](#spring-framework-vs-java-ee)
        -   [Which one to Choose?](#which-one-to-choose)
        -   [Why Spring is more popular?](#why-spring-is-more-popular)
        -   [Jakarta EE compare to Spring](#jakarta-ee-compare-to-spring)
        -   [Does it mean they are bad solutions compared to the spring framework?](#does-it-mean-they-are-bad-solutions-compared-to-the-spring-framework-)
    - [The Spring ecosystem](#the-spring-ecosystem)
* [Inversion of Control (IoC)](#inversion-of-control--ioc-)
    - [The Evolution of IoC: A Brief History](#the-evolution-of-ioc--a-brief-history)
    - [Inverting Control: Real-world examples of IoC in action](#inverting-control--real-world-examples-of-ioc-in-action)
    - [Inversion of Control (IoC) Design Pattern in Software Engineering](#inversion-of-control--ioc--design-pattern-in-software-engineering)
    - [IoC and Separating Concerns in Frameworks and Applications](#ioc-and-separating-concerns-in-frameworks-and-applications)
    - [Implement the IoC Without A Framework](#implement-the-ioc-without-a-framework)
* [Spring and Inversion of Control](#spring-and-inversion-of-control)
  - [Understanding the Role of ApplicationContext and Bean](#understanding-the-role-of-applicationcontext-and-bean)
  - [What's the Container?](#whats-the-container)
  - [How does the Spring use this concept?](#how-does-the-spring-use-this-concept)
  - [What is a Bean in Spring?](#what-is-a-bean-in-spring)


Throughout this tutorial, we will explore the key features of Spring Core and how they can help you build robust and maintainable applications.
We'll start by discussing the basics of Spring Framework and why it's widely used in enterprise applications. 
Then we'll dive into the essential concepts of inversion of control, dependency injection, beans, and bean factories. 
We'll also explore the different types of application contexts and configuration options in Spring.

The next section covers Spring Core annotations and stereotypes. We'll explain the most commonly used annotations like @Component, @Service, @Controller, and @Repository, along with their benefits and best practices. We'll also cover other important annotations like @Autowired, @Value, and @Qualifier.

The following section is dedicated to Spring AOP and covers the fundamental concepts like join points, pointcuts, and advice. We'll also discuss the different types of AOP proxies and how they can be used with Spring Core.

In the Spring Testing section, we'll explore unit testing and integration testing with Spring Core, along with testing using mock objects and test doubles.

Finally,The best practices and common pitfalls section covers common Spring anti-patterns, tips for writing clean and maintainable code, and best practices for testing Spring applications.

We encourage you to let us know your feedback and suggestions by opening an issue in our repository. We also welcome contributions from the community, so if you have any improvements or new sections to add, feel free to open a pull request. Let's get started!

# Introduction to Spring Framework

## What is Spring?
Spring is a popular open-source application framework for building enterprise-level Java applications. It provides a comprehensive programming and configuration model for modern Java-based enterprise applications. Spring is designed to address the complexity and challenges of enterprise application development by providing an easy-to-use, modular and flexible programming model.

Spring's core philosophy is based on the principles of Inversion of Control (IoC) and Dependency Injection (DI). These principles provide a way to remove the hard-coded dependencies and configurations that traditionally exist in application development. By using IoC and DI, developers can easily manage the dependencies and configurations of their application components, resulting in more flexible, maintainable and testable code.

Spring provides many modules that can be used independently or combined to create a comprehensive framework for building enterprise-level applications. The Spring Core module is the foundation of the Spring Framework and provides the fundamental building blocks for application development. This module includes features such as dependency injection, event handling, resource management, and more.


## History and evolution of Spring Framework
Spring Framework was initially developed by Rod Johnson, a software architect, in 2002 as an alternative to the heavily-coupled J2EE (Java 2 Enterprise Edition) platform. At the time, J2EE was the dominant enterprise platform, but it was known for its complexity, verbosity, and rigidity.

The first version of Spring Framework, version 1.0, was released in 2004. It was built on top of existing technologies such as J2EE and Hibernate, and introduced several key concepts that have become core to the framework. These include Inversion of Control (IoC), Aspect-Oriented Programming (AOP), and the Spring container.

Over the years, Spring Framework has evolved and expanded to become a comprehensive and modular platform for building enterprise applications. Spring 2.0, released in 2006, introduced support for annotations and additional container features, making it easier to configure and customize Spring applications. Spring 3.0, released in 2009, brought improvements in areas such as configuration, testing, and support for the latest Java technologies.

Spring Framework continued to expand its reach with the release of Spring Boot in 2014. Spring Boot is a convention-over-configuration framework that makes it easy to create standalone, production-grade Spring applications with minimal configuration. Spring Boot has been a game-changer for Spring Framework, making it more accessible and appealing to developers who are looking for a simpler way to build enterprise applications.

Today, Spring Framework has become a popular choice for building enterprise-level applications, and many top companies have recognized its benefits and adopted it in their software development. Some of the notable companies that use Spring Framework include Netflix, Amazon, LinkedIn, Salesforce, and Adobe. It is also known for its flexibility, modularity, and ease of use, and has a large and active community of developers and users. The Spring ecosystem has also expanded to include other projects such as Spring Security, Spring Data, and Spring Cloud, which provide additional functionality and integrations for building complex applications.

## Advantages and disadvantages of using Spring Framework
There are many advantages to using the Spring Framework for building enterprise applications. Here are some of the key benefits:

-   Lightweight: Spring is a lightweight framework, meaning that it has a small footprint and doesn't require a lot of resources to run. This makes it easy to deploy and run on different platforms.

-   Modular: Spring is a modular framework, which means that you can use only the modules you need for your application. This reduces the complexity of your code and makes it easier to maintain.

-   Inversion of Control (IoC): Spring makes use of IoC, which means that it takes care of object creation and dependency injection, allowing you to focus on the business logic of your application.

-   Testability: Spring makes it easy to write unit tests and integration tests for your application, which helps to ensure that your code is reliable and works as expected.

-   Flexibility: Spring is highly configurable and customizable, which means that you can adapt it to the specific needs of your application.

-   Community support: Spring has a large and active community of developers who contribute to its development and offer support to other developers. This means that there is a wealth of resources available to help you with your Spring projects.

-   Integration: Spring integrates with a wide range of other frameworks and technologies, making it easy to use with other tools in your application stack.

While there are many advantages to using Spring Framework, there are also some potential disadvantages to keep in mind:

-   Complexity: Spring is a large framework with many modules, which can make it overwhelming for beginners. The steep learning curve may deter some developers from using it.

-   Performance: While Spring is generally considered to be a high-performance framework, it can add overhead to your application due to its many features and layers.

-   Configuration: Spring's flexible configuration options can also be a disadvantage, as it can be difficult to determine the best way to configure your application. It may also take some time to configure your project correctly, which can lead to frustration for some developers.

-   Over-engineering: With its many features and modules, it can be tempting to over-engineer your application with Spring. This can lead to unnecessarily complex code and slower development times.

-   Dependency Injection: While Dependency Injection is a core feature of Spring, some developers may find the use of annotations and XML configurations to be verbose and difficult to maintain.

It's important to keep these potential disadvantages in mind when considering whether to use Spring Framework. However, many of these issues can be mitigated with careful planning and best practices, and the benefits of using Spring can often outweigh the drawbacks.

**If you're not familiar with some of the concepts like IoC, DI, etc., don't worry! We'll cover them soon ;).**

## Alternative frameworks to Spring
There are several alternative frameworks that can be used instead of Spring Framework depending on the specific use case and requirements. Here are a few examples:

-   Java EE (Jakarta EE): This is a set of specifications and APIs for enterprise Java, and provides similar features to Spring, such as dependency injection, transaction management, and web development capabilities.

-   Micronaut: This is a modern JVM-based framework that provides features like dependency injection, serverless functions, and cloud-native development.

-   Quarkus: This is another modern JVM-based framework that provides fast startup times and low memory footprint, and is suitable for building microservices.

-   Play Framework: This is a web application framework that uses the Scala programming language and provides features like routing, templating, and testing support.

-   Vert.x: This is a lightweight and high-performance reactive framework for building event-driven applications, and provides features like asynchronous I/O, routing, and clustering.

It's important to note that each of these frameworks has its own strengths and weaknesses, and the choice of which one to use ultimately depends on the specific requirements of the project.

## Spring framework vs Java EE

### Which one to Choose?

Both Spring and Java EE (now Jakarta EE) are powerful frameworks for building enterprise-level applications in Java. Deciding which one to learn depends on various factors, including the needs of your project and the community support.

### Why Spring is more Popular?

Spring Framework is more popular than Java EE for several reasons. Firstly, Spring was introduced in 2002, while Java EE was released in 1999, which gave Spring a head start in popularity. Secondly, Spring's architecture provides a lightweight and flexible approach to developing enterprise applications, making it easier for developers to work with. In contrast, Java EE's architecture can be more complex, and it can be harder for developers to find the right tools and frameworks for their projects.

Another reason for Spring's popularity is its community support. Spring has a large and active community that provides extensive documentation, tutorials, and resources, making it easier for developers to learn and use the framework. The Spring community also actively supports the development of new Spring-based tools and libraries, which further increases its popularity.

That being said, Java EE has its own advantages, such as providing a comprehensive set of APIs and specifications for building enterprise applications, and being backed by a well-established industry consortium (Eclipse Foundation). Ultimately, the choice between Spring and Java EE (Jakarta EE) depends on the specific needs and goals of your project.

**Let's see in action what Spring provides for us!**

Spring Framework simplifies application development in several ways. One of the key features of Spring is its implementation of Inversion of Control (IoC) and Dependency Injection (DI).

With IoC, instead of your application code instantiating objects directly, the framework creates and manages the objects for you. This means that your code only needs to focus on using the objects, rather than creating and managing them.

Dependency Injection is a key aspect of IoC, where the framework manages dependencies between objects. Dependencies are essentially services or resources that an object requires to function correctly. By using DI, the framework automatically provides these dependencies to the objects that need them.

To illustrate this concept, consider a simple example. Let's say we have a web application that uses a database to store user information. We would normally create a UserDao class to handle the interactions with the database.

```java
public class UserServlet extends HttpServlet {
  private UserDao userDao = new UserDao();
  // servlet methods that use the userDao object
}
```
However, with Spring, we can instead define the *UserDao* object as a Spring Bean and let the framework handle its creation and dependency injection.

To do this, we would create a configuration file that defines the *UserDao* Bean:

```java
@Configuration
public class AppConfig {
  @Bean
  public UserDao userDao() {
    return new UserDao();
  }
}
```

We would also need to annotate our servlet to indicate that it requires a *UserDao* dependency:
```java
public class UserServlet extends HttpServlet {
  @Autowired
  private UserDao userDao;
  // servlet methods that use the userDao object
}
```
With these changes, Spring automatically creates the UserDao object and injects it into our servlet, eliminating the need for manual object creation and dependency management.

Let's consider the same example of creating a web application with a form that saves data to a database. Here is how it might look in a Java EE application:

-   First, we would need to create a database connection pool and a datasource, which involves writing code to define a JNDI name, configure the database driver, set connection properties, and so on. This can be a complex and time-consuming task.

-   Next, we would need to define our data model using JPA annotations, which requires understanding the JPA API and the object-relational mapping (ORM) concepts that it employs. We would need to write code to create the persistence unit, configure the entity manager, and handle transactions.

-   Then, we would need to create a servlet or JSP to handle the HTTP request and process the form data. We would need to write code to parse the request parameters, validate the input, and use the entity manager to save the data to the database.

-  Finally, we would need to deploy the application to a server, which can involve configuring deployment descriptors, libraries, and other settings.

As you can see, this approach involves a lot of boilerplate code, configuration, and setup. While Java EE has evolved to become more lightweight and modular, it still requires a significant amount of knowledge and experience to work with effectively.

In contrast, Spring Framework simplifies many of these tasks by providing a set of easy-to-use, pre-built components and abstractions. 
For example, Spring provides a "data access object" (DAO) pattern that abstracts away the details of creating database connections, executing queries, and handling exceptions. Spring also provides a "controller" abstraction that handles the HTTP request and provides a simple way to process the form data and pass it to the DAO.

### Jakarta EE compare to Spring
Java EE has evolved significantly in recent years with the adoption of Jakarta EE, which is now developed by the Eclipse Foundation. Jakarta EE has made several improvements to simplify the development of enterprise applications using Java. Jakarta EE includes a wide range of APIs that provide different services such as messaging, security, and persistence, and it also includes a web application framework called JavaServer Faces (JSF).

However, while Jakarta EE has made significant progress in simplifying enterprise development with Java, it still requires more configuration and boilerplate code than Spring. For example, configuring a data source in Jakarta EE can still require multiple XML files, whereas in Spring, it can be done with a single annotation.

That being said, choosing between Spring and Jakarta EE should depend on the specific requirements of your project and your team's experience and preferences. Both frameworks have their strengths and weaknesses, and choosing one over the other is a matter of evaluating these factors and deciding which one is the best fit for your needs.

### Does it mean they are bad solutions compared to the spring framework?!

No, it doesn't mean that Java EE or Jakarta EE are bad solutions. They are still widely used in enterprise applications, and many companies and developers continue to use them to build robust and scalable applications.

Some of the top companies using Jakarta EE include:

-   Oracle : as the main contributor and supporter of Jakarta EE, Oracle uses it extensively in their own products and services.
-   IBM : a major player in the enterprise software market, IBM has been using Java EE for many years and continues to use Jakarta EE in its products and services.
-   Red Hat : a leading provider of open source solutions, Red Hat has been a long-time supporter of Java EE and now Jakarta EE, and uses it extensively in its own products and services.
-   Amazon : one of the largest technology companies in the world, Amazon uses Jakarta EE in its AWS platform and services.
-   Netflix : a leading provider of streaming services, Netflix uses Jakarta EE in its backend services and applications.
-   eBay : a popular online marketplace, eBay uses Jakarta EE in its applications and services.
-   Airbus : a leading aircraft manufacturer, Airbus uses Jakarta EE in its engineering and manufacturing systems.
-   BMW : a major automobile manufacturer, BMW uses Jakarta EE in its production and logistics systems.
These are just a few examples of the many companies and organizations using Jakarta EE.

Java EE/Jakarta EE provides a comprehensive set of specifications and APIs for building enterprise applications, including web services, messaging, persistence, and security, among others. It has a large ecosystem of tools and frameworks that can be used to simplify development and deployment, such as Apache TomEE, WildFly, and Open Liberty.

The choice between using Spring and Java EE/Jakarta EE ultimately depends on the specific needs of the project and the preferences of the development team. Both have their own advantages and disadvantages, and it's important to carefully evaluate them before making a decision.

## The spring ecosystem
The Spring Framework is a large and versatile ecosystem with many different modules that can be used in combination to create a wide variety of applications. Some of the main modules in the Spring Framework include:

Spring Core: This module provides the fundamental building blocks of the Spring Framework, such as Inversion of Control (IoC) and Dependency Injection (DI).

Spring Data: This module provides a set of utilities and templates for working with different kinds of data stores, such as relational databases, NoSQL databases, and in-memory data grids.

Spring Web MVC: This module provides a Model-View-Controller (MVC) framework for building web applications using Spring. It also includes support for handling web requests and responses, as well as a variety of view technologies.

Spring Security: This module provides a comprehensive security framework for Spring-based applications. It includes features such as authentication, authorization, and session management, as well as support for common security protocols such as OAuth and OpenID Connect.

Spring Integration: This module provides a set of tools for building messaging-based applications using Spring. It includes support for various messaging patterns such as pipes and filters, as well as adapters for integrating with various messaging systems.

Spring Batch: This module provides a framework for building batch processing applications using Spring. It includes support for batch processing features such as chunking, retrying, and skipping.

Spring Cloud: This module provides a set of tools and frameworks for building cloud-native applications using Spring. It includes features such as service discovery, distributed configuration, and circuit breaking, as well as support for various cloud platforms.

These modules, among others, make up the Spring ecosystem, providing developers with a wide range of tools to choose from when building their applications. By using the right combination of modules, developers can create applications that are efficient, scalable, and maintainable.

# Inversion of Control (IoC)

## The Evolution of IoC: A Brief History

The concept of Inversion of Control (IoC) has been around for many years and has its roots in object-oriented programming.
It was first introduced in the mid-1990s in the form of a design pattern called the Hollywood Principle, which states "Don't call us, we'll call you." This means that instead of the client code calling the server code, the server code calls the client code.

The term "Inversion of Control" was introduced in 2004 by Martin Fowler, an expert in software engineering and design patterns.
Fowler popularized the term in his article <a href="doc:introduction" target="_blank">"Inversion of Control Containers and the Dependency Injection pattern"</a>, which described the use of IoC containers to manage dependencies in software applications.

Since then, the concept of IoC has become an important part of modern software engineering and is now widely used in many software frameworks and programming languages. 
The Spring Framework, for example, is built around the concept of IoC and has become one of the most popular frameworks for building enterprise Java applications.
Other popular frameworks that use IoC include .NET Core, Angular, and React.

## Inverting Control: Real-world examples of IoC in action

### Example 1 : Ordering in Restaurant

Imagine you are going to a restaurant and ordering food. Normally, you would tell the chef what ingredients to use and how to cook the food. That means you are in control of the cooking process.
Now, imagine you go to a different kind of restaurant where you just tell the waiter what kind of food you want, and the chef decides what ingredients to use and how to cook it. This means that the chef is in control of the cooking process, and you just provide the inputs to get the output you want.

### Example 2 : Building a House

Imagine you're building a house. In the traditional model of building a house, you are responsible for managing all the different contractors (plumbing, electrical,air-condition,etc.) and making sure they are working together in a coordinated way.
You have to understand how all the pieces fit together and be constantly checking and adjusting everything to make sure it all works properly.

In contrast, in the IoC model of building a house, you hire a general contractor who manages all the different subcontractors and makes sure they are working together in a coordinated way.
You don't have to worry about the details of how the plumbing, electrical, or air-condition systems work; you just provide the general contractor with your requirements and they take care of the rest.

## Inversion of Control (IoC) Design Pattern in Software Engineering

In the same way, in software engineering, instead of you telling the software what to do and how to do it, the software itself decides how to do it based on the inputs you provide.
You don't have to worry about the details of how the software works, you just provide the inputs and the software (the framework actually!) does the rest.
The basic idea is to delegate control of the flow of execution to an external framework or container, rather than having the application code manage its own dependencies and interactions.
In the IoC model, the dependencies are managed by an external framework or container, and the application code is simply provided with the necessary components.

Let's see some examples of this pattern:

### Game Engine

Imagine you're a character in a video game. You have a set of skills and abilities, and you can interact with various objects and characters in the game world.
In the traditional approach to game design, your character would need to have code that tells it how to interact with each of those objects and characters.

But with IoC, the game engine itself takes care of those interactions for you. All you need to do is provide the inputs (like pressing a button to attack) and the engine takes care of the rest, including deciding what happens when you attack a particular enemy or interact with a specific object.
This way, the game engine acts as the "container" for all the various components of the game, including your character, the enemies, and the objects in the game world.
The engine is responsible for managing how all of these components interact with each other, so you don't have to worry about the details of how it all works. Instead, you can just focus on playing the game and having fun.

### Tomcat as a Servlet Container

Tomcat web server is an example of IoC. Tomcat uses IoC to manage the lifecycle of its various components, such as servlets and filters.
These components are declared as beans and are managed by the Tomcat container, which is responsible for their instantiation, configuration, and lifecycle management.
This allows the application code to be decoupled from the details of how the servlets and filters are managed, making it easier to maintain and update the application over time.

### Kubernetes as a Container Orchestration Platform

Kubernetes is an example of a software that uses IoC. Kubernetes is a container orchestration platform that manages containerized applications across a cluster of hosts.
It uses a declarative model to define the desired state of the application, and then manages the deployment, scaling, and maintenance of the application based on that desired state.
This means that the application code does not have to worry about the underlying infrastructure or the details of how it is deployed and managed, as Kubernetes takes care of these concerns through the use of IoC.


## IoC and Separating Concerns in Frameworks and Applications

The framework is a general-purpose software platform that provides a set of services and functionalities, while the application is a specific software system that is built using the framework to address a specific business problem. 
The framework is responsible for managing the dependencies and interactions between the components of the application, while the application is responsible for implementing the specific business logic or use cases.
The IoC pattern allows for the separation of concerns between the framework and the application, allowing the application developers to focus on implementing the business logic, while the framework takes care of the details of managing the dependencies and interactions between the components.
This makes it easier to maintain and modify the application over time, as changes to the dependencies or interactions can be made in the framework, rather than the application code itself.

## Implement the IoC Without A Framework

Let's see an examples that represent how we can implement the IoC in our application without using any frameworks.

In order to implement IoC in your application without using a framework like Spring, we can follow a few general principles:

1. Define an interface: Create an interface that defines the behavior of a class, which will be used to perform certain tasks.
2. Implement the interface: Create a class that implements the interface, providing the actual implementation of the behavior defined in the interface.
3. Create a factory: Create a factory class that is responsible for creating instances of the class that implements the interface.
4. Use the factory: Use the factory class to obtain an instance of the class that implements the interface. This is typically done by passing the factory class to the code that needs the instance, and then invoking a method on the factory to obtain the instance.
5. Configure the factory: The factory can be configured with different implementations of the class that implements the interface, allowing different behaviors to be used depending on the configuration.

Here's a simple example:
let's say we have an interface called Task that defines a method called perform().
```java
// Task interface
public interface Task {
    void perform();
}
```
We could create a class called TaskImpl that implements the Task interface and provides the actual implementation of the perform() method.
```java
// TaskImpl class
public class TaskImpl implements Task {
    public void perform() {
        System.out.println("Performing the task...");
    }
}
```
We could then create a factory class called TaskFactory that is responsible for creating instances of the TaskImpl class.
The TaskFactory class could be used to obtain an instance of the Task class by invoking a method like createTask().
```java
// TaskFactory class
public class TaskFactory {
    private Task task;

    public void setTask(Task task) {
        this.task = task;
    }

    public Task createTask() {
        return this.task;
    }
}
```
Finally, we could configure the TaskFactory class with different implementations of the Task interface, allowing different behaviors to be used depending on the configuration.
```java
// Main class
public class Main {
    public static void main(String[] args) {
        // Create a new instance of TaskFactory
        TaskFactory taskFactory = new TaskFactory();

        // Set the TaskImpl instance on the TaskFactory
        Task task = new TaskImpl();
        taskFactory.setTask(task);

        // Use the TaskFactory to obtain an instance of the Task class
        Task taskInstance = taskFactory.createTask();

        // Invoke the perform() method on the Task instance
        taskInstance.perform();
    }
}
```
That was a simple code that represent how we can implement the IoC just by pure Java without any framework.

## Spring and Inversion of Control

In this section, we'll explore how the Spring IoC container works, using a simple example.

Consider a scenario where we have a class called _CustomerService_ that depends on a class called _CustomerRepository_ to perform its operations. 
The _CustomerService_ class needs an instance of _CustomerRepository_ to be available in order to function properly. 
Without the Spring IoC container, we would need to manually instantiate _CustomerRepository_ and pass it to _CustomerService_, like this:

```java
public class CustomerService {
  private CustomerRepository repository;
  
  public CustomerService() {
    repository = new CustomerRepository();
  }
  // ...
}
```
This approach has several drawbacks. 
First, it tightly couples the _CustomerService_ class to the _CustomerRepository_ class, making it difficult to change the implementation of _CustomerRepository_ without modifying _CustomerService_.
Second, it makes it difficult to manage the lifecycle of _CustomerRepository_, such as creating, configuring, and destroying instances of _CustomerRepository_.

To solve these problems, we can use the Spring IoC container to manage the _CustomerRepository_ instance and inject it into _CustomerService_.

Here's how it works:

1.Define _CustomerRepository_ as a bean in the Spring application context.
```xml
<bean id="customerRepository" class="com.example.CustomerRepository" />
```
2.Define _CustomerService_ as a bean in the Spring application context and inject _customerRepository_ into it
```xml
<bean id="customerService" class="com.example.CustomerService">
  <property name="repository" ref="customerRepository" />
</bean>
```
3.Retrieve the _CustomerService_ instance from the Spring application context.
```java
public class MyApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = (CustomerService) context.getBean("customerService");
        //...
    }
}
```
Let's break down each step in more detail:

1. Define _CustomerRepository_ as a bean in the Spring application context. 
We define _CustomerRepository_ as a bean in the Spring application context using an XML configuration file.
The _id_ attribute gives the bean a unique identifier, and the _class_ attribute specifies the class to be instantiated. 
By defining _CustomerRepository_ as a bean in the Spring context, we allow the Spring IoC container to manage its lifecycle and dependencies.

2. Define _CustomerService_ as a bean in the Spring application context and inject _customerRepository_ into it.
We define _CustomerService_ as a bean in the Spring application context using an XML configuration file. The property element specifies the repository property of _CustomerService_ and sets its value to the _customerRepository_ bean using the ref attribute.
This is known as dependency injection, where the Spring IoC container injects the _customerRepository_ bean into the repository property of _CustomerService_.

3. Retrieve the _CustomerService_ instance from the Spring application context.
We retrieve the _CustomerService_ instance from the Spring application context using the _getBean()_ method. 
This method takes the unique identifier of the _CustomerService_ bean, which is _customerService_, and returns an instance of _CustomerService_ that has been instantiated, configured, and managed by the Spring IoC container. 
Because _customerRepository_ is injected into _CustomerService_ by the Spring IoC container, we don't need to manually instantiate _CustomerRepository_ in the _CustomerService_ constructor.

### Understanding the Role of ApplicationContext and Bean

We've reviewed some code and instructions, and now it's time to dive deeper into what's really going on.

### What's the Container?

The main idea behind the container and Inversion of Control (IoC) is to promote a separation of concerns in software development by decoupling dependencies between components. 
The container acts as a centralized hub, responsible for creating and managing the lifecycle of objects, while IoC ensures that the flow of control is inverted, allowing for components to rely on abstractions rather than concrete implementations.
This promotes modularization, maintainability, and scalability, as it allows components to be developed independently and easily swapped out without affecting the rest of the system. Additionally, it enables developers to write more flexible and loosely coupled code, leading to easier testing, debugging, and overall code quality.

### How does the Spring use this concept?

In the Spring framework, the container responsible for managing objects and their dependencies is called the _ApplicationContext_. 
It creates and manages instances of beans and provides them with their required dependencies based on the configuration provided in the application context.
The _ApplicationContext_ is built on the principles of Inversion of Control (IoC) and Dependency Injection (DI).

### What is a Bean in Spring?

In the Spring, a bean is a class that is instantiated, assembled, and managed by the Spring IoC container. 
The IoC container takes care of the creation, initialization, and wiring of the beans. The beans can be configured using various techniques, such as annotations, XML, or Java configuration classes.
A bean can have dependencies on other beans, and these dependencies are resolved by the IoC container at runtime.

In other words, instead of the application controlling the creation and management of its objects, the _ApplicationContext_ controls it.
The application simply declares its dependencies, and the _ApplicationContext_ provides them.
To configure the _ApplicationContext_, we can use an XML file called _applicationContext.xml_, which defines the beans and their dependencies. 
This file includes information about the beans such as their class, properties, and dependencies.
