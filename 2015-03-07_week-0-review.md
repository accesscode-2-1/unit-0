# Week 0 Review

[Link to Slides](http://slides.com/alexandraqin/ac0307-lesson)

###Objectives

* Have a standard [Git + IntelliJ workflow](https://gist.github.com/noidontdig/fb11060af19159d040f8)
* Know what .gitignore is and how to use it
* Understand the Java package structure (review)
* Understand the different components of a Java program (review)
* Know the basic Java types and understand when to use them (review)
* Know how to get user input using Scanner (review)
* Know when and how to use an if statement (review)

###Review

* Git + IntelliJ
* a Java program
* Variables + Types
* User Input
* If statements

###Exercises

- Try to finish as many as you can!
- After every exercise, commit your work to GitHub!


**Madlibs**

This program should prompt the user for a minimum of six inputs (text inputs with at least one number) and then print out your "mad lib" result! Here is a sample partial run:

Sample input:

      Enter an adjective: purple
      Enter another adjective: ancient
      Enter a noun: dragon
      Enter another noun: spoon

Sample output:

      Here is your mad lib!!
      The purple bear went into the ancient house.
      There she saw a dragon and a spoon.


**Reverse Polish Notation Calcultator**

Write a [Reverse Polish notation calculator](http://en.wikipedia.org/wiki/Reverse_Polish_notation)! Reverse Polish notation is a mathematical notation where the operator comes after the two operands, like this `2 3 +`, which evaluates to `5`. Your task is to write a class `RPNCalculator` that prompts the user for two numbers and a mathmetical operator and then returns the correct result. 

Your calculator should support the following operations:

* a + b
* a - b
* a / b
* a * b
* a % b

Here is an example:

    "Please enter your first number"
    3
    "Please enter your second number"
    7
    "Please enter an operator"
    -
    "Result: -4"
    
A second example:

    "Please enter your first number"
    12
    "Please enter your second number"
    12
    "Please enter an operator"
    +
    "Result: 24"

Your calculator only needs to handle 3 user inputs: 2 `int`s and 1 operator. You may test an RPN calculator [here](http://www.abecedarical.com/javascript/script_reverse_polish.html).

**More fun with user input + if statements**

* Write a program that responds to different greetings

* Write a command line fortune teller that responds to your questions

###OUR FIRST GAME

[Make your own command line adventure game!](https://gist.github.com/noidontdig/92a4ead9fe8f2f21f178)

###More exercises

**User Input** 

> [A Dumb Calculator](http://programmingbydoing.com/a/a-dumb-calculator.html)
> - Printing the result here can be tricky!

> [BMI Calculator](http://programmingbydoing.com/a/bmi-calculator.html)

> [What if](http://programmingbydoing.com/a/what-if.html)

> [How Old Are You?](http://programmingbydoing.com/a/how-old-are-you.html)

**If**

> [Else and If](http://programmingbydoing.com/a/else-and-if.html)

> [A little quiz](http://programmingbydoing.com/a/a-little-quiz.html)
- Come up with your own questions and answers
- How can you keep track of the number of correct and incorrect answers?
