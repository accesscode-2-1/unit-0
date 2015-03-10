Objectives
=

1. To be able to properly initialize, terminate, and increment a `for` statement.
2. To know when to use `continue` and `break`.

Review of the `while` statement
=

> *Definition:* A `loop` is code that is run over and over again.

Remember a `while` loop?

```java
while (condition) {
    // do something over and over
}
```

> *Definition:* A `while statement` repeatedly executes a block of code while a given condition is `true`.

`for` statement
=
A `for` statement is a loop construct that looks like this...
 
```java
for (initialization; termination; increment) {
    // do something
}
```

...where:
1. The *initialization* is executed once, beginning the loop.
2. When the *termination* expression is `false`, the loop terminates; this is analogous to the condition in a `while` statement.
3, The *increment* expression is executed after each iteration; this can also decrement.

As with `if` and `while`, you can the body of the loop contains a single statement.

> **Demo: `for` loop that prints 0-4 inclusive. **

> **Exercise:** Rewrite the following `for loop` as a `while` loop:

```java
for (int x = 0; x < 100; x++) {
   // executed until x >= 100
}
```

`while` and `for` loops can both express the exact same computation.

> *Definition:* *[syntactic sugar](http://en.wikipedia.org/wiki/Syntactic_sugar)* is a syntax designed to make the code easier to read.

What is wrong with this `for` loop?

```java
for (int i = 3; i < 30; i--) {
    System.out.println("counting... " + i);
}
```

The hardest part about `for` loops is properly stopping the loop. Programmers often make mistakes when setting the termination condition for a loop. In particular, we are often off by one:

> *Definition:* An ["off-by-one error"](http://en.wikipedia.org/wiki/Off-by-one_error)

> **Exercise:** [Counting Machine](http://programmingbydoing.com/a/counting-machine.html): Write a program that counts from 0 to a user-specified number.

> **Exercise:** [harder][Counting Machine Revisited](http://programmingbydoing.com/a/counting-machine-revisited.html): Now let the user input the initial value, the max value, and the increment.

Just counting can be a little boring. One fun thing to count over are `String`s. We can get the length of a `String` using the function `String.length()`. For example:

```java
System.out.println("Queens!".length());
// 7
```

The function `String.charAt()` returns the `char` at the index provided. For example:

```java
System.out.println("Queens!".charAt(3));
// e
```

> **In-class assignment:** Here is a quote from [Grace Hopper](http://en.wikipedia.org/wiki/Grace_Hopper), the inventor of the first compiler:
> "We must include in any language with which we hope to describe complex **data**-processing situations the capability for describing **data**. We must also include a mechanism for determining the priorities to be applied to the **data**. These priorities are not fixed and are indicated in many cases by the **data**.
> "Thus we must have a language and a structure that will take care of the **data** descriptions and priorities, as well as the operations we wish to perform. If we think seriously about these problems, we find that we cannot work with procedures alone, since they are sequential. We need to define the problem instead of the procedures. The Language Structures Group of the Codasyl Committee has been studying the structure of languages that can be used to describe **data**-processing problems. The Group started out by trying to design a language for stating procedures, but soon discovered that what was really required was a description of the **data** and a statement of the relationships between the **data** sets. The Group has since begun writing an algebra of processes, the background for a theory of **data** processing.
> "Clearly, we must break away from the sequential and not limit the computers. We must state definitions and provide for priorities and descriptions of **data**. We must state relationships, not procedures."
> Write a program that uses a `for` loop to count how many times she says the word "data" (it's 10 times). You'll need two `String` functions in order to complete this assignment.
