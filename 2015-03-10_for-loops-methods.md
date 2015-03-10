Objectives
=

1. To be able to properly initialize, terminate, and increment a `for` statement.
2. To be able to use `continue` and `break`.

Review of the `while` statement
=

> *Definition:* A `loop` is code that is run over and over again.

Remember a `while` loop?

```java
while (condition) {
    // do something over and over
}
```

> *Definition:* A `while` statement repeatedly executes a block of code while a given condition is `true`.

`for` statement
=
A `for` statement is a loop that looks like this...
 
```java
for (initialization; termination; increment) {
    // do something
}
```

...where:

1. The *initialization* is executed once, beginning the loop.
2. When the *termination* expression is `false`, the loop terminates; this is analogous to the condition in a `while` statement.
3. The *increment* expression is executed after each iteration; this can also decrement.

As with `if` and `while`, the body of the loop contains a single statement.

> **Demo:** `for` loop that prints 0-4 inclusive.

> **Exercise:** Rewrite the following `while` loop as a `for` loop:
> ```java
> int i = 0;
> while (i <= 100) {
>     i++;
>     System.out.println(i);
> }
> ```

`while` and `for` loops can both express the exact same computation.

> *Definition:* *[syntactic sugar](http://en.wikipedia.org/wiki/Syntactic_sugar)* is a syntax designed to make the code easier to read.

Common errors
-

What is wrong with this `for` loop?

```java
for (int i = 3; i < 30; i--) {
    System.out.println("counting... " + i);
}
```

The hardest part about `for` loops is properly stopping the loop. Programmers often make mistakes when setting the termination condition for a loop. In particular, we are often off-by-one. This kind of bug it so common, it has its own [Wikipedia page](http://en.wikipedia.org/wiki/Off-by-one_error).

> **Exercise:** [Counting Machine](http://programmingbydoing.com/a/counting-machine.html): Write a program that counts from 0 to a user-specified number.

> **Exercise:** [harder] [Counting Machine Revisited](http://programmingbydoing.com/a/counting-machine-revisited.html): Now let the user input the initial value, the max value, and the increment.

> **Exercise:** "FizzBuzz" is a very famous program, up there with "Hello World!". Write [FizzBuzz](http://programmingbydoing.com/a/fizzbuzz.html) using a `for` loop.

`break` and `continue`
=

Remember `break`?

> *Definition:* `break` terminates the loop.

Java also has another useful keyword, `continue`:

> *Definition:* `continue` jumps to the next iteration of the loop.

`continue` can be useful skip over some unnecessary computation.

```java
for (int i = 1; i <= 20; i++) {
    if (i % 2 == 0) continue;
    System.out.println(i);
}
```

Is `continue` syntactic sugar? What could you do with the above code if Java didn't provide the `continue` statement?

> **Exercise:** Simplify your code for FizzBuzz using `continue`.

Iterating over strings
-

Often, programmers need to iterate over text. Java provides two functions, `String.length()` and `String.charAt()` that make iterating over a `String` fun. Here is how to use them:

```java
System.out.println("Queens!".length()); // 7
```

The function `String.charAt()` returns the `char` at the index provided. For example:

```java
System.out.println("Queens!".charAt(3)); // e
```

> **In-class assignment:** [hard] Below is a quote from [Grace Hopper](http://en.wikipedia.org/wiki/Grace_Hopper), the inventor of the first compiler. Write a program that uses a `for` loop to count how many times she says the word "data". You'll need two `String` functions in order to complete this assignment. Make sure to verify your answer.

> > "We must include in any language with which we hope to describe complex **data**-processing situations the capability for describing **data**. We must also include a mechanism for determining the priorities to be applied to the **data**. These priorities are not fixed and are indicated in many cases by the **data**.

> > "Thus we must have a language and a structure that will take care of the **data** descriptions and priorities, as well as the operations we wish to perform. If we think seriously about these problems, we find that we cannot work with procedures alone, since they are sequential. We need to define the problem instead of the procedures. The Language Structures Group of the Codasyl Committee has been studying the structure of languages that can be used to describe **data**-processing problems. The Group started out by trying to design a language for stating procedures, but soon discovered that what was really required was a description of the **data** and a statement of the relationships between the **data** sets. The Group has since begun writing an algebra of processes, the background for a theory of **data** processing.

> > "Clearly, we must break away from the sequential and not limit the computers. We must state definitions and provide for priorities and descriptions of **data**. We must state relationships, not procedures."

Methods
=

Methods are blocks of code that perform a computation. Methods can take in data, process it, and *return* a result. Methods have names and are used by specifying their name followed by parentheses. Here is an example:

```java
public class Adder {
    public static void main(String[] args) {
        int sum = add(1,2);
        System.out.println(sum); // 3
    }
    public static int add(int x, int y) {
        return x + y;
    }
}
```

In the above code, we've created a function called `add()`. `add` takes in data, called "parameters", adds them together, and uses the keyword `return` to return the result. Notice we can assign the return value to an `int sum`. The components of a method declaration are:

1. Modifiers such as `public` and `private`. Do not worry about these for now.
2. The type of the `return` value or *return type*. In the above example, the return type is `int`. Notice it is declared before the word `add`.
3. The method name, in this case `add`.
4. Parameters, a comma-separated list in parentheses. Notice each parameter has a type.
5. An exception list. Do not worry about this for now.
6. The method body. Just like a `while`, `if`, or `for` statement body, the method body is in brackets.

> **Exercise:** Write a method `subtract` that takes two parameters two `int x` and `int y` returns the difference, subtracting y from x.
