# ApplicationContext Example with XML Configuration
This is a simple example demonstrating the usage of the Spring Framework's `ApplicationContext` to create and manage beans. 
The application showcases how to initialize and use the `TimeService` bean with both `ClassPathXmlApplicationContext` and `FileSystemXmlApplicationContext`.

## Before Using Spring IoC
Before integrating Spring Inversion of Control (IoC), the application directly creates an instance of `TimeService` and calls its `currentTime` method.

```java
TimeService timeService = new TimeService();
timeService.currentTime();
```

### Using ApplicationContext with XML Configuration
In this section, the application leverages the `ApplicationContext` to manage the lifecycle of the `TimeService` bean using XML configuration.

### Spring Bean Configuration Based On XML File
The `spring.xml` file provided is a Spring Framework configuration file using XML syntax. It defines a bean named "currentTime" of the class `com.arash.ariani.service.TimeService`.
Let's break down the contents of the XML file:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:util="http://www.springframework.org/schema/util" xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util.xsd">

    <!-- bean definitions here -->
    <bean id="currentTime" class="com.arash.ariani.service.TimeService"></bean>
</beans>
```
#### Beans Namespace and Schema Declarations
- xmlns="http://www.springframework.org/schema/beans": Declares the default namespace for Spring beans.
- xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance": Declares the XML Schema Instance namespace.
- xmlns:util="http://www.springframework.org/schema/util": Declares the namespace for the Spring util schema, though it's not used in the provided XML.
- xsi:schemaLocation: Specifies the locations of the XML schemas for validation.

#### Bean Definition
- `<bean>`: Defines a Spring bean.
- `id="currentTime"`: Assigns a unique identifier ("currentTime") to the bean within the context.
- `class="com.arash.ariani.service.TimeService"`: Specifies the fully qualified class name of the bean to be instantiated.

This bean definition instructs the Spring container to create an instance of `TimeService` with the ID "currentTime" whenever it is requested by the application.

### ClassPathXmlApplicationContext
```java
// Initialize ApplicationContext with xml configuration from the classpath
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

// Retrieve the TimeService bean from the ApplicationContext
TimeService timeService1 = applicationContext.getBean("currentTime", TimeService.class);

// Call the currentTime method on the TimeService bean
timeService1.currentTime();
timeService1.currentTime(ZoneId.of("UTC"));
```
### FileSystemXmlApplicationContext

```java
// Get the absolute path of the current directory
String currentDirectory = System.getProperty("user.dir");

// Specify the relative path to your XML configuration file
String relativePath = "/springcontext/src/main/config/spring.xml";

// Construct the full path
String configPath = "file:" + currentDirectory + relativePath;

// Initialize ApplicationContext with xml configuration from the filesystem
ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext(configPath);

// Retrieve the TimeService bean from the ApplicationContext
TimeService timeService2 = applicationContext1.getBean("currentTime", TimeService.class);

// Call the currentTime method on the TimeService bean
timeService2.currentTime();
timeService2.currentTime(ZoneId.of("UTC"));

```

Make sure to replace "spring.xml" with the actual name of your XML configuration file. Adjust the paths according to your project structure.

