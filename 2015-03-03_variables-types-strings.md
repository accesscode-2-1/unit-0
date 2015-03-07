Variables
=
*Variables* are names (or symbols) associated with values (or data) in a computer. Variables allow programmers to save data and reference it later. Let's look at some code:

    public class Variables {
        public static void main(String[] args) {
            int favoriteNumber = 9;
            System.out.println("My favorite number is " + favoriteNumber);
        }
    }

In the above code, `favoriteNumber` is a variable that stores the value `9`. Whenever you use `favoriteNumber` in your code, the computer will know you mean `9`. Notice that `favoriteNumber` is preceded by the word "int". `int` is a *type* and indicates that the variable is an integer. Every variable in Java is preceded by a type. We'll discuss types in more detail later; for now, just copy the type names provided in the assignments.

> **Exercise**: Variables and Names
> http://programmingbydoing.com/a/variables-and-names.html

> **Exercise**: More Variables and Printing
> http://programmingbydoing.com/a/more-variables-and-printing.html

Rules for naming variables
-
* Names are case sensitive.
* Names can be any length of Unicode letters and digits.
* Names must begin with a letter, dollar sign "$", or underscore "_".
* By convention, names begin with a letter.
* Whitespace is not permitted.

> **Exercise**: Convince yourself that the above rules are true.
> Your compiler will complain if you break a rule.


Primitive types
=
All Java variables have a type. A type is a set of values and operations on those values. A "type" sounds abstract, but we use the concept every day. For example, you can think of "bananas" and "strawberries" as both of the type "fruit." When you use a type in Java, you are telling the compiler what kind of data you are using.

In Java, every variable is declared along with a type. The language has 8 primitive types:
* `byte` - 8-bit integer
* `short` - 16-bit integer
* `int` - 32-bit integer
* `long` - 64-bit integer
* `float` - 32-bit floating point number
* `double` - 64-bit floating point number
* `boolean` - true or false
* `char` - a single character, like 'A' or '$'

Numbers
-
The types `byte`, `short`, `int`, and `long` represent integers. They vary in size. `float` and `double` represent *real numbers*. For our uses, this means that they can have decimals in them. For example, 2 is an integer but 2.1 is a real number.

> Review: Numbers and Math
> http://programmingbydoing.com/a/numbers-and-math.html

> Exercise: Variables and their sizes
> What happens when you:
> - Assign a really big number to a short?
> - Add a short and an int?
> - Add an int and a double?

Booleans
-
A *boolean* represents the values `true` and `false`. Booleans are useful when data has a "yes" or "no" answer. For example, the question "Is this a banana?" has a boolean answer. Booleans can also be created by comparing two variables. For example, "Is 7 greater than 3?" has a boolean answer. In Java, we write this:

    boolean answer = 7 > 3;

The value of `answer` will be the boolean value `true`. Try it!

The boolean comparators are:
* `<`
* `<=`
* `>`
* `>=`
* `==`
* `!=`

What else can you compare?

Chars and strings
-
A *char* represents a single character. In Java, you denote a char by placing it between single quotes ''. For example, the following are chars: 'a', 'c', '$', '7', and '_'. In this workshop, we will also play with the type String. Strings are sequences of characters and denoted with double quotes "". For example, the following are strings: "hello", "Queens!", "$99.999". Strings are not primitive types but that distinction does not matter to us now.

> Exercise: Play with characters and Strings. What happens if you do the following:
> - `char c = "a";`
> - `String b = 'foo';`
> - What happens if you add, using `+`, two strings together?
> - Two chars?
> - A string and a char?
> - A char and a string?
> - Do any other mathematical operations work on strings?

> **Exercise**: Using Variables
> http://programmingbydoing.com/a/using-variables.html

> **Exercise**: Still Using Variables
> http://programmingbydoing.com/a/still-using-variables.html

> **Exercise**: Your Schedule
> http://programmingbydoing.com/a/your-schedule.html

Let's explore these ideas with a longer in-class problem:

> **In-class homework**: Print "The Twelve Days of Christmas", an English carol with a lot of repetition! You can find the structure of the lyrics here: http://en.wikipedia.org/wiki/The_Twelve_Days_of_Christmas_%28song%29#Lyrics. Use variables to store bits of repeated data and print the full lyrics.

Food for thought
=
Have you noticed that when you perform an operation on two variables of the same type, the result is also a variable of the same type? But when you perform the same operation on two slightly different types, the result—if the operation is legal—is the type of the "parent" type. If you throw some strawberries into a fruit salad, do you have strawberries or a bigger fruit salad?
