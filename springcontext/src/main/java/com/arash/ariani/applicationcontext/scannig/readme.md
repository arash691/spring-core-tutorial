# Spring Scanning Approach For Creating Bean
In this approach, we use package scanning to automatically detect and register beans in a specific package.

## Component Scanning:
Beans are automatically discovered by scanning specified packages.
Classes annotated with @Component (or its specializations like @Service, @Repository, etc.) are considered as beans.

In this example, we define a `MathService` bean using the `@Component` annotation. Spring, during its initialization process, automatically scans the specified package for annotated classes and registers them as beans.
```java
@Component
public class MathService {
    public void abs(int number) {
        System.out.println("ABS of " + number + " is " + Math.abs(number));
    }
}
```
Here's a breakdown of the components involved:

- `@Component` Annotation: Indicates that the class is a Spring component and should be automatically registered as a bean.
- `MathService` Class: Represents the bean with a method abs that performs a simple mathematical operation.