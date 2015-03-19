# Objectives
- To know the difference between primitive and reference types.
- To become comfortable reading API documentation.

# Hangman.java
Many students looked at the source code for `SecretWord` and `Drawing` before reading the API documentation. This is fine so long as you *used the API correctly*. Some questions such as...
- "What does `private` mean?"
- "How do I use `wordToHash`?"
- "What's this `HashMap`?"

...were asked because students were trying to figure out *how* `SecretWord` worked rather than what to do with it.

# Review
- Correction: I said, "Everything is an object," and this is not true. We'll talk about this later.
- *Definition:* A *class* is a blueprint for creating objects.
- *Definition:* An *object* is an instance of a class.
- We can create an instance using the `new` keyword, e.g. `String s = new String("Hi");`.
- We can call an object's methods using the *dot-notation*, e.g. `s.charAt(0);`.

# Person.java

Today, we'll be working with a small class, `Person.java`. Please [download](https://github.com/accesscode-2-1/unit-0/blob/master/in-class%20exercise%20solutions/Person.java) it from GitHub.

# Terminology

Let's introduce terminology for ideas that are becoming familiar:

> *Definition:* A *constructor* is a special function that creates an object. It differs from a method in that it has no explicit return type.

Below, `Person` is a constructor. The return value is an object, an instance of type or class `Person`.

```java
Person guy = new Person("Fred");
```

> *Definition:* A constructor (or other methods) can be *overloaded*, meaning the method can take multiple parameters.

```java
Person guy = new Person("Fred", 45);
```

> *Definition:* A *factory method* is a static method on a class that creates an object.

This is another way of creating objects from classes:

```java
Calendar c = Calendar.getInstance();
```

The biggest difference for us right now is that a factory method is not required to return a new object each time it's called; it could be the same instance every time.

> *Static method:* A *static method* is a method that belongs to a class, not an instance of the class.

You can call a static method directly on the class:
    
```java
String.format("Formatting the number %d", 9);
```

> *Definition:* A *getter* is a method that returns some value from an object.

A getter is just a method but by convention it often follows a simple naming convention `getSomeProperty`. If we want some attribute `foo`, we call `getFoo`. Let's try it with our `Person` class:

```java
String name = guy.getName(); // Stores "Fred" in `name`
```

> *Definition:* a *setter* is a method that sets a value on an object.

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

A primitive type is a good example of something that is **not** an object.

#### Reference type

Classes allow us to create objects. When we create a new object, we have to declare its type. This is called a *reference type*. Also sometimes referred to as a "class type" or "object type."

```java
Person p = new Person("Fred");
Circle c = new Circle();
Date d = new Date();
Scanner in = new Scanner();
String s = new String("Hello");
```

In the above code, every variable is preceded by a capitalized type, the reference type.

#### What's different?

A variable that stores a reference type stores it differently than a variable that stores a primitive type. When we write...

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

Here, the variables `p1` and `p2` both reference the same object. When we change `p2`, `p1` also changes. This is beause a reference type refers to an object in memory but only stores the memory address of where the object is located.

![Reference vs Primitive](http://thinkingweb.co/wp-content/uploads/2014/06/Capture.png)

This memory address is called a *reference* to the object.

#### Mutability

To *mutate* means to change while still having the same identity. Some reference types are *mutable* while others are *immutable*. `Person` is mutable. It is possible to change the state of the object. `String`, on the other hand, is immutable.

It's hard to demonstrate that a `String` is immutable. But when you write:

```java
String s = "foo";
s += "bar";
```

You are actually creating a *new* object of type `String` and assigning it to the variable `s`. 

#### == vs equals()

The notion of a reference can be tricky; let's look at the `String` class for examples.

> *Definition:* `==` compares by reference.

> *Definition:* `equals()` compares by value.

Let's look at some examples:

This is `true` because they share the same value:

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

The important thing is that any reference type can reference `null`:

```java
Person bob = null;
```

You cannot do this with a primitive type:

```java
int n = null;
```

The compiler will tell you that you have incompatible types.

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


# In-class assignments: BirthdayCalculator.java

Use Java's `Calendar` class to write a program `BirthdayCalculator` that asks a user for their birthday and then tells them how many days there are until their birthday. This is an example program execution:

```
Please enter your birthday: 
What is the month (1-12): 7
What is the day (1-31): 4

There are 107 days until your birthday!
```

#### The Calendar API

Part of this assignment is to have you starting to get comfortable reading API documentation. [Here](http://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html) is the documentation for `Calendar`. Read the API to see what methods are available to you. To get you started, here's an example method call after creating a `Calendar`:

```java
calendar.get(Calendar.YEAR);
```

`Calendar.YEAR` is called a *field*. Fields are similar to static methods in that we can access them directly from the class. If we call the static method `get` and pass in the correct field, the `Calendar` class returns us some useful information. In this case, it returns the current year.

#### Suggestions
- Start by skimming the API documentation. Do you generally understand the `Calendar` class, the fields, and how to get information from the calendar?
- Calculate what day of the year it is, for example today (19 March) is day 78 of the year.
- Calculate what day of the year the user's birthday is.
- Calculate the difference (this is tricky!).    
- Use [WolframAlpha](http://www.wolframalpha.com/) to check your answers.

#### Bonus
- 2015 isn't a leap year, but what if it was? Could you handle it? First read the [algorithm](http://en.wikipedia.org/wiki/Leap_year#Algorithm) on Wikipedia; if that's too complicated, see if the [GregorianCalendar](http://docs.oracle.com/javase/7/docs/api/java/util/GregorianCalendar.html) API can help you.
