# Objectives
- To understand what wrapper classes are
- To become comfortable with the subject of autoboxing and unboxing
- To understand about static methods of the Integer Class

# Terminology

> *Defination* A *wrapper class* wraps (encloses) around a data type and gives it an object appearance. Wherever, the data type is required as an object, this object can be used. Wrapper classes include methods to unwrap the object and give back the data type. It can be compared with a chocolate. The manufacturer wraps the chocolate with some foil or paper to prevent from pollution. The user takes the chocolate, removes and throws the wrapper and eats it.

Below are two examples:

a) Value passed as a parameter

```java
List<Integer> numbers = new ArrayList<Integer>();

numbers.add(5); // Although the add method asks for a parameter of type Integer, we can use 
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

A primitive-wrapper class in the Java language is one of eight classes provided in the java.lang package to provide object methods for the eight primitive types. All of the primitive wrapper classes in Java are immutable. J2SE 5.0 introduced autoboxing of primitive types into their wrapper object, and automatic unboxing of the wrapper objects into their primitive value—the implicit conversion between the wrapper objects and primitive values.


# Terminology

> *Defination* Autoboxing is the term for getting a reference type out of a value type just through type conversion (either implicit or explicit). The compiler automatically supplies the extra source code which creates the object.

Instead of:

```java
Integer i = new Integer(9);
```

use this instead:

```java
Integer l = 9;
```

# Review

> *Static method:* A *static method* is a method that belongs to a class, not an instance of the class.

You can call a static method directly on the class:
    
```java
String.format("Formatting the number %d", 9);
```

Useful static methods of the Integer class are:

```java
static int parseInt(String s) 
```

This method parses the string argument as a signed decimal integer.

The following will generate a compiler error:

```java
String strNum1 = "1000"; 
int val = strNum1;
```

Output:
java: incompatible types
required: int
found: java.lang.String


Instead use:

```java
String strNum1 = "1000";     
int val = Integer.parseInt(strNum1);
```

Outputs: 1000

But be careful:

```java
String strNum1 = "1000cats";
int val = Integer.parseInt(strNum1);
```

Generates a NumberFormatException exception so you may want to use handle this exception:

```java
try{
   String strNum1 = "1000cats";
   int val = Integer.parseInt(strNum1);
}catch (NumberFormatException e){
   System.out.println("Not a proper integer value!");
}
```

Outputs: Not a proper integer value!
But atleast the exception is handled and the program may continue
