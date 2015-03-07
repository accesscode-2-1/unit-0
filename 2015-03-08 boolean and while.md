Objective
==

1. To understand how to chain conditionals using `else if`.
2. To know all the ways to combine boolean expressions.
4. To understand how to repeat statements in loops using `while`.


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

* _code block_ -- Zero or more statements grouped with curly braces.

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

> **Exercise:** Write code that reads the month and day of the month and reports if the day is New Years Day (January 1), Cinco de Mayo (May 5), the Fourth of July (July 4), or Christmas (December 25).

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

There's one more like this: _exclusive or_, which we write `^`.  It is true if either, but not both, of the two operans is true.

> **Exercise:** Print out the truth table for `^`.

Finally, there is _not_, which works on a single boolean value and simply flips it.

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




