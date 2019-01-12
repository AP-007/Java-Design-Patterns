
# Design Patterns
[Design Patterns](https://en.wikipedia.org/wiki/Software_design_pattern) are generic solutions to commonly occuring Software Engineering problems.

Following are some of the perks of design patterns;
  -Large Scale Reusablity	 
  -Tested and Proven
  -Easy to comprehend 

There are various types of design patterns that addesses different problems in software engineering;
 1. Gang Of Four Patterns
    - Creational
    - Structural
    - Behavioral
 2. Concurrency Patterns
 3. Architectural Patterns
 4. Other Patterns

Gang of Four patterns are the set of classic software design  patterns, described in the book *'Design Patterns: Elements of Reusable Object-Oriented Software'* written by; Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides.


### Creational Patterns
Creational design patterns deals with problems related to object creation.
Singleton, Factory, Abstract-Factory, Builder and Prototype are some of the commonly used Creational design patterns 

**Singleton** is used when we want to restrict object creation to only one single instance. Exactly one single object of a Singleton can be created. The concept can be more generalized to restrict the instantiation to a certain no of objects.

**Factory** pattern transfers the responsibility of object creation from the client class to a factory class. Based on the parameters provided to it, a factory method instantiates and returns the respective object without exposing the object creation logic to the client.

**Abstract Factory** is similar to factory pattern, except the fact that it has a super-factory which creates other factories. It is more like a factory of factories. Here the client will pass an instance of the respective factory class of the object it want to create, to the Abstract Factory class. The abstract Factory will then return the corresponding subclass object of the factory instance that was passed.

**Builder** pattern solves some of the problems in Factory and Abstract Factory design patterns. Factory and Abstract Factory are error prone when the object is complex, having many properties, or when the object has optional properties. Builder pattern solves these issues by restricting external object instatiation. It provides a builder class which handles the object creation and provides setter methods for optional properties, which can be used for creating the object step by step.  
