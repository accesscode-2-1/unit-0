Objective
==

1. To understand how to chain conditionals using `else if`.
2. To know all the ways to combine boolean expressions.
4. To understand how to repeat statements in loops using `while`, using conditions and `break`.


Complex conditionals
==

`if ... else` lets us choose between two cases.  What if there are more than two?  

```java
int score = Scanner.nextInt();
if (score == 100)
    System.out.println("Perfect score!");
else if (score >= 90)
    System.out.println("Great!");
else if (score >= 75)
    System.out.println("Not bad!");
else if (scopre >= 60)
    System.out.println("You passed.");
else
    System.out.println("You failed. :("); 
```

Use `else ... if` attach more conditions between the `if` and the `else`.  Java tries each until the _first_ that evaluates to true, and evaluates that section of code.  It then skips all the to the end.  The `else` block is evaluated only if _all_ the conditions evaluate to false.

The code above has a bug: can you spot it?

> **Exercise:** Write a program that reads an emoticon like `:)` or `:(` and prints out its emotion.
> 
> ```
> How do you feel?  :)
> Today you're happy.
> How do you feel?  :(
> Today you're sad.
> ```
> 
> Don't forget to use `.equals()` to compare strings.


#### Variables and `if ... else`

The statements in `if`, `else if`, and `else` clauses don't have to be `println()`.  We can, for example, set a variable.

```java
int score = scanner.nextInt();
String result;
if (score == 100)
    result = "Perfect score!";
else if (score >= 90)
    result = "Great!";
else if (score >= 75)
    result = "Not bad!";
else if (scopre >= 60)
    result = "You passed.";
else
    result = "You failed. :(";
System.out.println(result); 
```

> **Exercise:** Simplify your prefious exercise by assigning the emotion to a variable.


#### Code blocks and `if ... else`

Remember that you can put multiple statements in an `if`, `else if`, or `else` condition by surrounding them with curly braces.

* _statement_ -- one instruction to Java, which ends with a semicolon

* _code block_ -- zero or more statements grouped with curly braces

If a code block contains exactly one statement, the curly braces may be omitted.

```java
String fruit = scanner.next();
String color;
String flavor;
if (fruit.equals("banana")) {
    color = "yellow";
    flavor = "sweet";
}
else if (fruit.equals("grapefruit")) {
    color = "pink";
    flavor = "bitter";
}
else if (fruit.equals("lemon")) {
    color = "yellow";
    flavor = "sour";
}
else {
    System.out.println("I don't know that fruit.");
}
System.out.println("a " + fruit + " is " + color + " and tastes " + flavor);
```

> **Exercise:** The code above doesn't work.  Why not?  Fix it!

Hint: The Java compiler lets you declare a variable without providing its initial value, but it tracks carefully that you don't _use_ the variable until it has a value.

Remember also that we can have `boolean` variables, that store the result of a boolean expression: either `true` or `false`. (Because of this, we often name boolean variables to start with `is`.)  So, we could write,

```java
boolean isBanana = fruit.equals("banana");
if (isBanana) 
    ...
```

> **Exercise:** Space boxing: http://programmingbydoing.com/a/space-boxing.html


Combining boolean expressions
==

What if we want to reverse this: guess the fruit from the color and flavor?  We need to be able to check two things at the same time:

* Is it yellow _and_ sweet?  a banana
* Is it pink _and_ bitter?  a grapefruit
* Is it yellow _and_ sour?  a lemon

In Java, we write _and_ like this: `&&`.  For example, to see if `age` is greater than 12 but less than 20:

```java
if (age > 12 && age < 20)
    System.out.println("you are a teenager");
```

> **Exercise:** Write code that asks for the month and day of the month and reports if the day is New Years Day (January 1), Cinco de Mayo (May 5), the Fourth of July (July 4), or Christmas (December 25).
>
> **Exercise:** [harder] Write a program that asks for the month and the day of the month, and reports whether Daylight Savings Time is in effect for that day.  Assume the year is 2015: the first day of DST is March 8 and the last is October 31. (Technically, it starts 2 AM on March 8 and ends at 2 AM on November 1.)  Use a single conditional expression.

Now we can guess the fruit from color and flavor.

```java
System.out.print("flavor? ");
String flavor = scanner.next();
System.out.print("color? ");
String color = scanner.next();

if (color.equals("yellow") && flavor.equals("sweet"))
    System.out.println("banana");
else if (color.equals("pink") && flavor.equals("bitter"))
    System.out.println("grapefruit");
else if (color.equals("yellow") && flavor.equals("sour"))
    System.out.println("lemon");
else 
    System.out.println("I don't know that fruit.");
```

Let's print out the _truth table_ for `&&`.

```java
System.out.println("true  && true  = " + (true && true));
System.out.println("true  && false = " + (true && false));
System.out.println("false && true  = " + (false && true));
System.out.println("false && false = " + (false && false));
```

In Java, we write _or_ like this: `||`.

```java
String input = scanner.next();
boolean result;
if (input.equals("yes") || input.equals("y"))
    result = true;
else if (input.equals("no") || input.equals("n"))
    result = false;
else {
    System.out.println("Can't you answer a yes/no question??");
    return;
}
System.out.println(result);
```


> **Exercise:** Print out the truth table for `||`.

> **Exercise:** Write code that takes the day of the week and figures out if it is a weekday or weekend.  

There's one more like this: _exclusive or_, which we write `^`.  It is true if either, but not both, of the two operans is true.  It's not used as often as the others.

> **Exercise:** Print out the truth table for `^`.

Finally, there is _not_, which works on a single boolean value and simply flips it from true to false or from false to true.

```java
if  (! fruit.equals("lemon")) 
    System.out.println("I don't want it in my tea.");
```

> **Exercise:** [hard] Imagine the people who created Java forgot to include `!`.  Can you think of a substitute?

By the way, you can use `x != y` as a shortcut for `! (x == y)`.

> **Exercise:** Let's guess my profession.  Ask three questions: whether I carry a sword, whether I wear a helmet, and whether I use a shovel.  Based on that, guess my profession.
> 
> sword? | helmet? | shovel? | profession
> :------|:--------|---------|:----------
> y      | y       | n       | samurai
> y      | n       | n       | ninja
> n      | y       | y       | construction worker
> n      | n       | y       | gardener
> n      | y       | n       | astronaut
> n      | n       | n       | coder
> 
> What cases does this leave out?


While loops
==

* _loop_ - code that is run over and over again

Java's simplest loop construct is the `while` statement.  It looks like this:

```java
while (condition) {
  // do something over and over
}
```

As with an `if` statement, the `condition` is a boolean expression.  The code that runs over and over again is the _body_ of the loop.  Before the first and every subsequent iteration, Java evaluates the condition; if it comes out false, the loop ends and Java continues with the following code.  Note that if the condition initially evaluates false, the loop body is never evaluated.

As with `if`, you can leave out the curly braces if the body contains a single statement.

> **Exercise:** Write a program that tracks how many M&Ms you have left, as you eat them.  It should look like this:
> 
> ```
> 100 M&Ms left
> eat how many? 20
> 80 M&Ms left
> eat how many? 60
> 20 M&Ms left
> eat how many? 18
> 2 M&Ms left
> eat how many? 2
> you ate all the M&Ms
> ```

> **Exercise:** [harder] Make sure you can't eat more M&Ms than you have left.

Using a while loop, we can count.

```java
int count = 0;
while (count < 10) {
    System.out.println(count);
    count = count + 1;
}
```

What happens if we switch the order of the two statements in the loop body?

> **Exercise:** Change this to count _down_ from 10.  The last number should be 1.
> 
> **Exercise:** [harder] Change this to count down from 100 to 10 by 5, and then from 9 to 1.  The numbers it prints should be 100, 95, 90, ..., 20, 15, 10, 9, 8, ..., 2, 1.  At the end, print "blastoff".

A statement like `count = count - 5` is so common that Java gives us a shorter form: `count -= 5`.   Likewise for `+=`, `*=`, _etc_.


#### break

Java provides a special word that you can use only inside a loop: `break` says, Stop this loop right now!  So, we could count like this instead.

```java
int count = 0;
while (true) {
    System.out.println(count);
    count += 1;
    if (count > 10)
        break;
}
```

Generally, `while (true)` will cause the loop to run forever!  But we "break out" of it using the `break` statement.  

What are the first and last numbers this loop will print?

> **Exercise:** http://programmingbydoing.com/a/keep-guessing.html
> 
> Use `break` to end the game when the player guesses correctly.
> 
> For this program to be fun, you'll have to generate a random number between 1 and 10 (inclusive).  Here's how to do it:
> 
> ```java
> Random random = new Random();
> int number = random.nextInt(10) + 1;
> ```

> **Exercise:** Change your program so that it doesn't use `break`.  Instead use a boolean variable that is false until the player guesses the number correctly.

> **Exercise:** [harder] Change the program to pick a random number between 1 and 1000.  Play it a few times.  What's the best strategy to guess the random number as quickly as possible?

> **Exercise:** http://programmingbydoing.com/a/adding-values-in-a-loop.html


Solutions
==

Here's one solution to the professions exercise.

```java
package nyc.c4q.alexhsamuel.ac20150308;

import java.util.Scanner;

public class Profession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you carry a sword? ");
        String response = scanner.next();
        boolean sword =
          response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");

        System.out.print("Do you wear a helmet? ");
        response = scanner.next();
        boolean helmet =
                response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");

        System.out.print("Do you use a shovel? ");
        response = scanner.next();
        boolean shovel =
                response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");

        String profession;
        if (sword && helmet && ! shovel)
            profession = "samurai";
        else if (sword && ! helmet && ! shovel)
            profession = "ninja";
        else if (! sword && helmet && ! shovel)
            profession = "astronaut";
        else if (! sword && helmet && shovel)
            profession = "construction worker";
        else if (! sword && ! helmet && shovel)
            profession = "gardener";
        else if (! sword && ! helmet && ! shovel)
            profession = "coder";
        else
            profession = "unknown";

        System.out.println("your profession is " + profession);
    }
}
```
