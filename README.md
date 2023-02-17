# Welcome to this tutorial on the Spring Core module! 

In this tutorial, we will cover all the important concepts, best practices, and advanced topics related to Spring Core. 
Spring Core is the foundation of the entire Spring Framework and provides essential features like dependency injection, inversion of control, and application context management.

Here is the list of topics we will be covering in this tutorial:

* [Introduction to Spring Framework](#)
    - [What is Spring?](#what-is-spring)
    - [History and evolution of Spring Framework](#history-and-evolution-of-spring-framework)
    - [Advantages and disadvantages of using Spring Framework](#advantages-and-disadvantages-of-using-spring-framework)
    - [Alternative Frameworks to Spring](#alternative-frameworks-to-spring)
    - [Spring Framework vs Java EE](#spring-framework-vs-java-ee)
        -   [Which One to Choose](#which-one-to-choose)
        -   [Why Spring is More Popular](#why-spring-is-more-popular)
        -   [Jakarta EE compare to Spring](#jakarta-ee-compare-to-spring)
        -   [Does it mean they are bad solutions compared to the spring framework](#does-it-mean-they-are-bad-solutions-compared-to-the-spring-framework)
    - [The Spring ecosystem](#)
* [Inversion of Control (IoC) and Dependency Injection (DI)](#)
    - [Understanding IoC and DI](#)
    - [How Spring implements IoC and DI](#)
    - [The BeanFactory and ApplicationContext](#)
    - [Bean scopes and lifecycle](#)
    - [Configuration options for Spring Beans](#)
    - [Profiles and environments in Spring](#)
    - [Spring Annotations and Stereotypes](#)
    - [@Component, @Service, @Controller, and @Repository annotations](#)
    - [@Autowired and other DI annotations](#)
    - [@Value and other property injection annotations](#)
    - [Stereotype annotations and their benefits](#)
    - [Advanced annotation features](#)
* [Spring AOP](#)
    - [Introduction to AOP](#)
    - [AOP in Spring](#)
    - [Creating AOP aspects using Spring](#)
    - [Using Join points, pointcuts, and advice](#)
    - [Combining AOP with Spring DI](#)
* [Spring Testing](#)
    - [Writing unit tests with Spring](#)
    - [Integration testing with Spring](#)
    - [Using mock objects and test doubles](#)
    - [Best practices for testing Spring applications](#)
* [Best Practices and Common Pitfalls](#)
    - [Common Spring anti-patterns](#)
    - [Tips for writing clean, maintainable Spring code](#)
    - [Best practices for testing Spring applications](#)
* [Conclusion](#)
    - [Recap of Spring Core concepts](#)
    - [Next steps for learning more about Spring!](#)

Throughout this tutorial, we will explore the key features of Spring Core and how they can help you build robust and maintainable applications.
We'll start by discussing the basics of Spring Framework and why it's widely used in enterprise applications. 
Then we'll dive into the essential concepts of inversion of control, dependency injection, beans, and bean factories. 
We'll also explore the different types of application contexts and configuration options in Spring.

The next section covers Spring Core annotations and stereotypes. We'll explain the most commonly used annotations like @Component, @Service, @Controller, and @Repository, along with their benefits and best practices. We'll also cover other important annotations like @Autowired, @Value, and @Qualifier.

The following section is dedicated to Spring AOP and covers the fundamental concepts like join points, pointcuts, and advice. We'll also discuss the different types of AOP proxies and how they can be used with Spring Core.

In the Spring Testing section, we'll explore unit testing and integration testing with Spring Core, along with testing using mock objects and test doubles.

Finally,The best practices and common pitfalls section covers common Spring anti-patterns, tips for writing clean and maintainable code, and best practices for testing Spring applications.

We encourage you to let us know your feedback and suggestions by opening an issue in our repository. We also welcome contributions from the community, so if you have any improvements or new sections to add, feel free to open a pull request. Let's get started!

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

## Alternative Frameworks to Spring
There are several alternative frameworks that can be used instead of Spring Framework depending on the specific use case and requirements. Here are a few examples:

-   Java EE (Jakarta EE): This is a set of specifications and APIs for enterprise Java, and provides similar features to Spring, such as dependency injection, transaction management, and web development capabilities.

-   Micronaut: This is a modern JVM-based framework that provides features like dependency injection, serverless functions, and cloud-native development.

-   Quarkus: This is another modern JVM-based framework that provides fast startup times and low memory footprint, and is suitable for building microservices.

-   Play Framework: This is a web application framework that uses the Scala programming language and provides features like routing, templating, and testing support.

-   Vert.x: This is a lightweight and high-performance reactive framework for building event-driven applications, and provides features like asynchronous I/O, routing, and clustering.

It's important to note that each of these frameworks has its own strengths and weaknesses, and the choice of which one to use ultimately depends on the specific requirements of the project.

## Spring Framework vs Java EE

### Which One to Choose?

Both Spring and Java EE (now Jakarta EE) are powerful frameworks for building enterprise-level applications in Java. Deciding which one to learn depends on various factors, including the needs of your project and the community support.

### Why Spring is More Popular?

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
