# Imperative thinking

*Declarative knowledge* refers to facts and information, sometimes called "book learning." For example, "The apple is a fruit" is a fact. *Imperative knowledge* is "how-to" stuff, like knowing how to bake an apple pie.

Programming is hard because there is a big difference between knowing *what to do* and *how to do it*! Let's talk about some ways we can break up a problem so we can translate *what to do* into *how to do it*.

We're going to use [Fizz Buzz](http://programmingbydoing.com/a/fizzbuzz.html) as a running example.

### 1. Understand the problem

##### Restate the problem in plain language.

At the beginning, we'll often give you a problem statements. But as you grow as a programmer, you'll encounter problems without clear problem statements. Try to be clear about what it is you want to do. For example:

> "Fizz Buzz is a program that starts at 1 and counts to 100. When a number is divisible by 3 it prints 'Fizz', by 5 it prints 'Buzz', and by both it prints 'FizzBuzz'."

##### Clarify any jargon.
While writing a solution to Fizz Buzz, you may hear the word `modulo` or `modulo operator`. What does that word mean? Can you test it to see what it does?

##### Focus on what is essential; ignore what is inessential.
Let's say you *don't* know what `modulo` does. Can you still explain a solution imperatively?

### 2. Break the problems into pieces
##### Write [pseudocode](http://en.wikipedia.org/wiki/Pseudocode)
Pseudocode looks a lot like code but glosses over the details. It allows you to think and write more freely. This is related to the suggestion to *ignore the inessential details*. Here is some pseudocode for Fizz Buzz:

```
for numbers 1-100:
    if number is divisible by 3:
        say "Fizz"
    else if number is divisible by 5:
        say "Buzz"
    else if number is divisible by both:
        say "FizzBuzz"
    else
        say the number
```

Notice that while the above pseudocode isn't anything the computer can understand, it is imperative. You are getting much closer to the idea of *what to do*. This is a first step in translating from the problem statement to code.

##### Analyze how your mind imperatively solves the problem without code:
If I asked you to perform Fizz Buzz without a computer, you could. How? This is not a trivial or easy question. Your brain is smarter than any computer we have ever built. Ask it, slowly, how it solved the problem.

##### Draw a diagram
Diagrams, like code, can help clarify a problem. Often an unclear diagram will suggest that one's thinking is unclear.

```
num
 |
 +--> if [ num div by 15  ] else if [num div by 3] else if [  num div by 5  ]
                 |                        |                        |
         [print "FizzBuzz"]         [print "Fizz"]         [  print "Buzz"  ]
                 |                        |                        |
                 +------------------------+------------------------+
                                          |
                                    [   num++    ]
                                          |
                                    [back to top ]
```

### 3. Write a solution

##### Translate the pseudocode
Let's translate `for numbers 1-100:` into real Java:

```java
for (int i = 1; i < 101; i++) {
}
```

Notice that computers and humans do not always think alike. For example, when I see "1-100", I think 100 is included in that list (although maybe you don't!). In Java, we have to be careful to translate this pseudocode into the equivalent Java code.

##### Focus the brute-force solution
Before you start optimizing your code or worrying about edge cases or elegance, make sure your solution just works. There is nothing wrong with the most simple, straightforward, brute-force solution. Often, it will teach you something about the essential difficulty of the problem.


##### Write code in testable blocks

Let's say we have a bug in our half-written solution:

```java
for (int i = 0; i < 100; i++) {
    if (i % 3 == 0) {
        System.out.println("Fizz");
    } else {
        System.out.println("Buzz");
    }
}
```

The output will be:

```
Fizz
1
2
Fizz
4
5
Fizz
```

We notice that we're printing "Fizz" too early and start looking at our `if` statement to see if we're handling modulo incorrectly. But the problem is actually that our `for` loop is initialized too early. It should start at 1.

Debugging is finding a needle in a haystack. If we had been careful when creating our `for` loop, we would have reduced the size of our haystack.

##### Test every block
Most people don't cook an elaborate meal for friends without tasting the food along the way. You don't want to wait until your company is biting down to find out if you confused salt with sugar. Test every block of code you write. Think of ways you can verify that each piece works as it should. In fact, a big reason programmers like to write code in blocks is because it makes things easier to test.

### 4. If you're stuck

#### Talk it through with someone else
This is popolar among programmers and is called [Rubber Duck Debugging](http://en.wikipedia.org/wiki/Rubber_duck_debugging). Often, the very act of explaining what you are trying to do helps you understand the problem better.

##### Take a walk and come back later
You're in a marathon, not a sprint. Pace yourself and relax.

### 5. When you have a bug

##### Isolate the problem
As mentioned previously, debugging is the act of finding a needle in a very complex haystack. Comment out blocks of code until your program works; if you are able to do this, you can have some confidence that your bug is in the commented block. For example, here is how we might fix the Fizz Buzz issue:

```java
for (int i = 0; i < 100; i++) {
    System.out.println(i);
    /*if (i % 3 == 0) {
        System.out.println("Fizz");
    } else {
        System.out.println("Buzz");
    }*/
}
```
Hopefully we'll notice that we start counting at 0 rather than 1!

##### Rollback to a stable state
Do you remember when your code last worked? Delete any new changes until your code works again. Then retry to implement the new block of code, testing each new line or block.

### 6. Improving your work

#### Check the edge cases
Do you have a working program? Check the edge cases, such as extreme values in input or legal inputs that you didn't consider at first.

##### Compare
Programming requires experience, skill, and even taste. Many problems have multiple solutions. For example, here are two solutions to Fizz Buzz:

```java
public static void f1() {
    for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }
}
```
```java
public static void f2() {
    for (int i = 1; i <= 100; i++) {
        String line = "";
        if (i % 3 == 0) {
            line += "Fizz";
        }
        if (i % 5 == 0) {
            line += "Buzz";
        }
        if (line == "") {
            line = Integer.toString(i);
        }
        System.out.println(line);
    }
}
```

Which one do you prefer? Why?
