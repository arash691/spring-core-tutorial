# Spring Java-Config Approach For Bean Creation
In Spring Framework, the approach you are using to create beans through Java configuration with the `@Configuration` and @Bean annotations is called "Java-based configuration" or "JavaConfig." This is an alternative to XML-based configuration and is a part of the broader Spring IoC (Inversion of Control) container.

Here's an explanation of the relevant annotations:

- @Configuration: This annotation is used to indicate that the class contains configuration methods. It serves as a replacement for the XML-based configuration file. Beans defined in a `@Configuration` class are managed by the Spring IoC container.
- @Bean: This annotation is used at the method level. It indicates that the annotated method produces a bean to be managed by the Spring container. The method name becomes the bean name by default.

```java
@Configuration
public class ApplicationBeanConfig {

    @Bean
    public CalendarService calendarService() {
        return new CalendarService();
    }
}
```
This code is defining a configuration class named `ApplicationBeanConfig`. It contains a method annotated with `@Bean` named `calendarService()`. This method returns an instance of `CalendarService`, and this instance becomes a managed bean in the Spring context.

To create an application context and retrieve the `CalendarService` bean, you typically use the following code:
```java
ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationBeanConfig.class);
CalendarService calendarService = context.getBean(CalendarService.class);
```
Here, the `AnnotationConfigApplicationContext` is used to create a context based on Java-based configuration, and then the getBean method is used to retrieve the `CalendarService` bean from the context.
