# Objectives
- How to instantiate a class.
- How to use a class's methods.

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

![Object-oriented programming](https://github.com/accesscode-2-1/unit-0/blob/master/images/car.jpg)

*Figure: A car can be thought of as an object with certain state and behavior.*

We've already talked about methods. A method models the behavior of an object--it *does something*.

In Java, **everything is an object.**

### Classes

You may notice that many real world objects share attributes and behavior. For example, a motorcycle, sedan, truck, and semi-truck are all vehicles. They can be thought of as the same kind of object.

![Object-oriented programming](https://github.com/accesscode-2-1/unit-0/blob/master/images/oop.jpg)

In Java, objects of the same kind are said to share a "type", a word we already know! For example, we might say that `motorcycle` and `semi-truck` are both of type `vehicle`. 

What if we'd like to make lots of a particular type of object? We can create a `class`:

> *Definition:* A *class* is a blueprint for creating objects.

Thus, we can amend our previous definition:

> *Definition:* An *object* is an *instance* of a *class*.

What's an instance? "Instance" and "object" mean the same thing; typically, "instance" is used to refer to an object in reference to its class. For example, "The sedan is an instance of a vehicle."

##### Why use classes?

- Modularity: Objects can be maintained independent of other objects in the system.
- Information-hiding: You can use an object without knowing how it is implemented!
- Code reuse: Many objects may share attributes or behavior; we can model this with classes.

##### Using a class

You've already used classes and objects--in fact, you can't avoid it in Java. For example, when you created a new Scanner instance, you wrote:

```java
    Scanner input = new Scanner(System.in);
```

In the above code, the `new` keyword tells Java to create a new instance of type `Scanner`. Remember how we always put a type in front of our variable names...

```java
int myNumber = 9;
boolean isTrue = 99 < 100;
```

...? This is the same as when we say that `input` is of type `Scanner`.

We've also already used methods on a class.

```java
char c = "Queens!".charAt(0); // 'Q'
```

