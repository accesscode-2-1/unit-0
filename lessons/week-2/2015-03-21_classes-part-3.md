# Objectives
- To understand what wrapper classes are
- To become comfortable with the subject of autoboxing and unboxing
- To understand about static methods of the Integer Class

# Terminology

> *Defination* A *wrapper class* wraps (encloses) around a data type and gives it an object appearance. Wherever, the data type is required as an object, this object can be used. Wrapper classes include methods to unwrap the object and give back the data type. It can be compared with a chocolate. The manufacturer wraps the chocolate with some foil or paper to prevent from pollution. The user takes the chocolate, removes and throws the wrapper and eats it.

Below are two examples:

a) Value passed as a parameter

```java
List<Integer> numbers = new ArrayList<>();

numbers.add(5); // Although the add method ask for a parameter of type Integer, we can use 
                // the primitive 5 because it gets automatically autoboxed into 
                // an object of type Integer implicitly.

numbers.add(6);

System.out.println(numbers.get(0)); // prints 5

System.out.println(numbers.get(1)); // prints 6
```

b) Value passed to a variable

```java
Integer number = 13;
```

A wrapper class in the Java language is one of eight classes provided in the java.lang package to provide object methods for the eight primitive types. All of the primitive wrapper classes in Java are immutable. J2SE 5.0 introduced autoboxing of primitive types into their wrapper object, and automatic unboxing of the wrapper objects into their primitive value—the implicit conversion between the wrapper objects and primitive values.
