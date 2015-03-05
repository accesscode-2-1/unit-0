What is Java?
==

Java is not Javascript!

Java is programming a language and a platform.

* platform = an environment for running other programs

The Java platform consists of:

1. the JVM
2. the Java language and compiler
3. the Java standard libraries

These are all included in the JDK.  The JRE only contains the JVM and standard libraries.

* JDK = Java Development Kit

* JRE = Java Runtime Environment
*   - used primarily for RUNNING java programs, but does NOT allow for developing 

* runtime = The point at which a program is run, as opposed to the point at which it is created.

* JVM = Java Virtual Machine

* virtual = opposite of physical, i.e. does not really exist

* virtual machine = A computer that doesn't physically exist.  In this case, another program pretends to be ("emulates") the virtual computer.

* compiler = A program that translates source code into machine code.

The Java compiler (the `javac` program) translates Java source code into machine code for the virtual machine, known as "Java bytecode".

* library = A collection of software.

* standard library = A library of basic routines that comes packaged with a programming language.

> **Exercise**: Find the Java7 standard library documentation.

> **Exercise**: Find the JDK documentation.


Command-line Java
==

* command line = An environment that expects you to type commands, and that executes these one by one and prints out the result.  For example, the `Terminal` app.

Terminal shows you a `$` prompt and waits for your commands.

* prompt = An indication that the computer is waiting for you to type something.

To use your Java7 JDK:

    export PATH=/Library/Java/JavaVirtualMachines/jdk1.7.0_75.jdk/Contents/Home/bin:$PATH
    
This tells your command line to find the `java` and related programs in your JDK.

    $ cd
    $ mkdir java
    $ cd java

Open `TextEdit`.  Select `Format > Make Plain Text`. _(Important!)_  Enter some Java code.

    public class Hello {
        public static void main(String[] argv) {
            System.out.println("Hello, world!");
        }
    }
    
Save the file as `Hello.java` in your java directory.  _(Important! The file name **must** match the class name in the program.)_ Back in the terminal:

    $ ls
    Hello.java
    $ javac Hello.java
    $ ls
    Hello.class    Hello.java

You should see a new file named `Hello.class`.  That contains the Java bytecode.

    $ java Hello
    Hello, world!
     
> **Exercise**: Make it greet you three times (in one run of the program).

OK now we can go back to IntelliJ, which takes care of all of this for us.


Printing
==

For each exercise, create a new class!

1. Select `File > New > Java Class`, or press `^⌥ N` and select `Java Class`.
2. Give the class a name.  _Important: Capitalize the class name!_
3. Add the `main()` function as from 'hello world'.

When you run your code, make sure you are running the correct class!

* camel caps = Words smushed together with each one capitalized.  For example, "My name is Alex" in camel caps is `MyNameIsAlex`.


> **Exercise**: http://programmingbydoing.com/a/comments-and-slashes.html

* comment = Text within source code that it ignored by the compiler; it's there only for humans reading the source.

> **Exercise**: There's a second comment syntax in Java.  Find it.  Why two?

> **Exercise**: http://programmingbydoing.com/a/letter-to-yourself.html
 
> **Exercise**: http://programmingbydoing.com/a/your-initials.html

Strings in Java are always quoted with double quotes.

* quoting = Surrounding text with quotes or other special markers to indicate that the text between the quotes should be interpreted specially.

> **Exercise**: http://programmingbydoing.com/a/a-good-first-program.html

What if you want to print two strings on the same line?

* Try adding the strings as if they're numbers.

* Try changing some `println` to `print`. What's the difference?

Some Java string escapes:

| Escape | result |
|--------|--------|
| `\n`   | end the line |
| `\b`   | backspace |
| `\"`   | double quote |

* escape = escape sequence = A sequence of characters that has a special or unusual interpretation.

> **Exercise**: Why do we need these?

> **Exercise**: Find the full list of Java escapes.
> 
> **Exercise**: Write a Java program that prints out some Java source code!  It should print out the 'Hello world' line.
> 
>     System.out.println("Hello, world!");

So far we've printed only strings.  You can print numbers too.

> **Exercise**: Try these:
> 
>     println(42)
>     println("42")
>
>     println(42.0)
>     println(42.0000)
>     println("42.0000")
>     println(41.999999999999999)    // fifteen 9's
>     println("41.999999999999999")
> 
> What's going on? 

* integer = A round number, which has no fractional part.  It may be positive, negative, or zero.

* floating-point number = A computer representation of a number with a fractional part, i.e. a decimal point.

> **Exercise**: Try these:
> 
>     println(17 + 25)
>     println("17" + "25")
>     println("17" + 25)
>     println(17 + "25")
> 
> What's going on? 
> 
> **Exercise**: Using Java, compute the sum of the numbers one through ten.

* literal = A fixed value (numerical, string, or otherwise) that you type in explicitly.

* expression = A formula for a value computed by the computer.

Today, it's -4 C outside.  

> **Exercise**: Print the temperature in Farenheit.
> 
> Can you get the output to look like this?
> 
>     temperature: 25 F
> 
> How about like this?
> 
>     temperature: 25°F

There are a few other things, too: single characters, booleans, 

* character = A letter, digit, punctuation mark, or another _single_ symbol.
* boolean = A choice between true and false.

>     println(Hello, world!)
>
>     println('x')
>     println("x")
>     println('Hello, world!')
> 
>     println(true)
>     println(false)

There's one more special thing called `null`.  

> **Exercise**: Try to print out `null`.

> **Exercise**: http://programmingbydoing.com/a/numbers-and-math.html


Exit ticket
==

https://docs.google.com/forms/d/1LTrWmkDmxw1_9TRIw6e3Ihi68Y-OCX3Cx2dljYGeNI4/viewform
