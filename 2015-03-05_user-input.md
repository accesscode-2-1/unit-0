Pre-work
-
Watch the following video before class:
* [Lecture 12 - Getting user input](https://www.udemy.com/java-tutorial/#/lecture/135297)


Input
=

Previously, we learned how to print. Remember the syntax?

    System.out.println("I am printing a line!");

But just printing gets a bit boring. Today, we're going to learn how to ask the user for feedback. In programming, we call this *reading user input*. Let's talk about how.

**Scanner**

In Java, a simple program that reads user input looks like this:

    import java.util.Scanner;

    public class Echo {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Say something:");
            String something = input.next();
            System.out.println(something);
        }
    }

First, we `import` the `Scanner`, which is some code written by another developer. Then to create a new `Scanner`, we type:

    Scanner input = new Scanner(System.in);

Don't worry if you don't know exactly what this does. Think of it like driving a car. You don't need to know how the engine works, just how to press the pedals and turn the wheel. In programming, we call this *abstraction*. We don't care *how* the `Scanner` works, but we know what it *does*. What can you do with a `Scanner`?

**Functions**

The `Scanner` gives you, the programmer, some magical powers called *functions*. Functions, like steering wheels on cars, allow you to use someone else's code without knowing how it works. For example, we can ask the `Scanner` to ask the user for an `int` like this:

    int usersAge = input.nextInt();

[This page](http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html) has a full list of `Scanner` functions. 

Let's go through the first exercise together.

> **Exercise:** [Asking Questions](http://programmingbydoing.com/a/asking-questions.html)

Okay, try it yourself, but first...

**Ground Rules for Exercises**

- Don't just copy and paste! Programming, like playing an instrument or speaking another language, requires muscle memory. It is important that you get used to *typing* Java for yourself. Also, you will notice things you would not otherwise if you are forced to type them.
- At the top of every exercise, write a *document comment*. A document comment is description of the program for another user (or your future self). Get used to documenting your work! Here is an example document comment for the previous exercise:

    /**
     * Access Code 2.1
     * Gregory Gundersen
     * AskingQuestions.java
     * This class prompts the user for some personal data and then repeats it back to them.
     */

- After every exercise, commit your work to GitHub!

> **Exercise:** [Forgetful Machine](http://programmingbydoing.com/a/the-forgetful-machine.html)

> **Exercise:** [Name, Age, Salary](http://programmingbydoing.com/a/name-age-and-salary.html)
> - What happens if the user inputs the wrong type of data?
> - What happens if you don't prompt the user for input but still run the program?
