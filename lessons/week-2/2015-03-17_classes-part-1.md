# Objectives
- How to instantiate a class.
- How to use a class's API.

# What you should know by now...
- How to print out using `System.out.println`.
- How to use primitive types, e.g. `int`, `char`, `boolean`, etc. 
- How to use `String`s.
- How to read user input with `Scanner`.
- How to use `while` loops.
- How to use an `if` statement.
- How to use `for` loops
- How to call methods
- How to declare a method

# Review
- [`DrawRocket.java`](https://github.com/accesscode-2-1/unit-0/blob/master/in-class%20exercise%20solutions/DrawRocket.java)

# Objects and classes
##### Today's lesson
- Object-oriented programming
- Creating Classes
- Using static methods

##### Thursday's lesson
- Creating our own classes
- References vs. values

### Object-oriented programming
Object-oriented programming is a style of computer programming in which the programmer represents the real world using "objects." An *object* is a very generic term in software development and will have different meanings depending on the context and language. For now, this definition is enough:

> *Definition:* An *object* is a group of primitive types, methods, and other objects.

Real world objects have state and behavior. For example, a car has state (color, make, model) and behavior (turning, accelerating). Object-oriented programming is an attempt to model this combination of state and behavior in a modular, comprehensible way.

> *Definition:* *State* is the condition of something at a moment in time.

![Object-oriented programming](https://github.com/accesscode-2-1/unit-0/blob/master/images/car.jpg)

*Figure: A car can be thought of as an object with certain state and behavior.*

##### Why use objects?
- Modularity: objects can be maintained independent of other objects in the system.
- Information-hiding: You can use an object without knowing how it is implemented!
- Code reuse: If an object already exists, you can just use it rather than creating it yourself.

### Classes

You may notice that many real world objects share attributes and behavior. For example, a motorcycle, sedan, truck, and semi-truck are all vehicles. They can be thought of as the same kind of object.

![Object-oriented programming](https://github.com/accesscode-2-1/unit-0/blob/master/images/oop.jpg)

> *Definition:* A *class* is a blueprint for creating objects.

##### Why use classes?
