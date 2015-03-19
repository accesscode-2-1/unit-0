# Objectives
- To know the difference between primitive and reference types

# Hangman.java
Many students looked at the code rather than the API documentation. This is fine so long as you *used the API correctly*. Some common questions:
- "What does `private` mean?
- "How do I use `wordToHash`?"

# Review
- **Correction:** I said, "Everything is an object," and this is not true. We'll talk about why later.
- Some definitions:
 >> *Definition:* *class* is a blueprint for creating objects.
 
 >> *Definition:* An *object* is an instance of a class.

- We can create an instance using the `new` keyword, e.g. `String s = new String("Hi");`.
- We can call an object's methods using the *dot-notation*, e.g. `s.charAt(0);`.

# Person.java

Today, we'll be working with a small class, `Person.java`. Download it from GitHub.

# Terminology

Let's introduce terminology for ideas that are becoming familiar:

>> *Definition:* A *constructor* is a special function that creates an object. It differs from a method in that it has no explicit return type.

```java
// Here, `Person` is a constructor. The return value is an object, an instance of type or class `Person`.
Person guy = new Person("Fred");
```

> *Definition:* A *getter* is a method that returns some value from an object.

A getter is just a method but by convention it often follows a simple naming convention `getSomeProperty`. If we want some attribute `foo`, we call `getFoo`. Let's try it with our `Person` class:

```java
String name = guy.getName(); // Stores "Fred" in `name`
```

> *Definition:* a *setter* is a method that sets a value on an objet.

```java
// Returns `void` so we don't see anything happen,
// but the internal variable for the person's name will be updated to "Bob".
guy.setName("Bob");
```

# Reference Types

#### Review of types
In Java, every variable has a type. This tells Java...
- How much memory to allocate
- How to interpret that memory

Java has some basic types, such as `int`, `char`, etc. These are called *primitive types*.

#### Reference type

Classes allow us to create objects. When we create a new object, we have to declare its type. This is called a **reference type**. Also somtimes referred to as a "class type" or "object type."

```java
Person p = new Person("Fred");
Circle c = new Circle();
Date d = new Date();
Scanner in = new Scanner();
String s = new String("Hello");
```

In the above code, every variable is preceded by a capitalized type, the reference type.

#### What's different?

Variables that store reference types store them differently than a variable that stores a primitive type. When we write...

```java
int n = 9;
```

...the number `9` is actually stored at the memory location of `n`. But what about our `Person` instance?

```java
Person p1 = new Person("Fred", 35);
Person p2;
p2 = p1;
p2.setName("Bob");

// This will print "Bob".
System.out.println(p1.getName());
```

Here, the variables `p1` and `p2` both reference the same object. When we change `p2`, `p1` also changed. This is beause a reference type refers to an object in memory but only stores the memory address of where the object is located.

![Reference vs Primitive](http://thinkingweb.co/wp-content/uploads/2014/06/Capture.png)

This memory address is called a *reference* to the object.

#### Mutability

To *mutate* means to change while still having the same identity. Some reference types are *mutable* while others are *immutable*. `Person` is mutable. It is possible to change the state of the object. `String`, on the other hand, is immutable.

#### == vs equals()

The distinction between a reference type and a primitive type is tricky; let's look at the `String` class for a testable example.

> *Definition:* `==` compares by reference.

> *Definition:* `equals()` compares by value.

Let's look at some examples:

This is `true` because they share the same value.

```java
String s1 = "Hello";
s1.equals("Hello");
```

The next two are both `true` but for tricky reasons! The compiler is performing an optimization where it only stores one copy of each distinct string:

```java
"Hello" == "Hello";
s1 == "Hello";
```

This is `true` because the compiler concatenates the Strings at compile time:

```java
System.out.println(s1 == "Hel" + "lo");
```

This is `false` because Java creates two new `String` objects:

```java
new String("Hello") == new String("Hello")
```

#### Null type

`null` is a special type used to indicate:
- Uninitialized state
- Termination condition
- Nonexistent object
- Unknown value

`null` is not an instance of any type.

This is from the Java Language Specification:

> "There is also a special null type, the type of the expression null, which has no name. Because the null type has no name, it is impossible to declare a variable of the null type or to cast to the null type. The null reference is the only possible value of an expression of null type. The null reference can always be cast to any reference type. **In practice, the programmer can ignore the null type and just pretend that null is merely a special literal that can be of any reference type.**"

#### toString()

All reference types have a method `toString()`. For example, this won't work because it is a primitive type:

```java
9.toString();
```

But this will:

```java
new Person("Tom").toString()
```

This will make more sense soon, but just know that Java will let you stringify almost anything.
