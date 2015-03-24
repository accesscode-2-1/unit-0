# Objectives
- Create a new `ArrayList`
- Add objects to list
- Get objects from the list

# DaysUntil
- [DaysUntil.java](https://github.com/accesscode-2-1/unit-0/blob/master/in-class%20exercise%20solutions/DaysUntil/DaysUntil.java)
- [DaysUntilWLD.java](https://github.com/accesscode-2-1/unit-0/blob/master/in-class%20exercise%20solutions/DaysUntil/DaysUntilWLD.java)


# ArrayLists

A *collection* is a group of objects. Today, we'll be looking at a very useful collection, the `ArrayList`. A *list* is an ordered collection, and an `ArrayList` is one type of list.

Create a class `NameTracker` and follow along in it.

Before we can use an `ArrayList`, we have to `import` it:

```java
import java.util.ArrayList;
```

Next, we call the constructor; but we have to declare the type of object the `ArrayList` is going to hold. This is how you create a new `ArrayList` holding `String` objects. 

```java
ArrayList<String> names = new ArrayList<String>();
```

Notice the word "`String`" in angle brackets: "<String>". This is the Java syntax for constructing an `ArrayList` of `String` objects.

We can add a new `String` to `names` using the `add()` method.

```java
names.add("Ana");
```

> **Exercise:** Write a program that asks the user for some names and then stores them in an `ArrayList`. Here is an example program:
> ```
> Please give me some names:
> Sam
> Alecia
> Trey
> Enrique
> Dave
> Your name(s) are saved!
> ```

We can see how many objects are in our `ArrayList` using the `size()` method.

```java
System.out.println(names.size()); // 5
```

> **Exercise:** Modify your program to notify the user how many words they have added.
> ```
> Please give me some names:
> Mary
> Judah
> Your 2 name(s) are saved!
> ```

Remember how the `String.charAt()` method returns the `char` at a particular index? We can do the same with `names`. Just call `get()`:

```java
names.add("Noah");
names.add("Jeremiah");
names.add("Ezekiel");
System.out.println(names.get(2)); // "Ezekiel"
```

> **Exercise:** Update your program to repeat the names back to the user in reverse order. Your solution should use a for loop and the `size()` method. For example:
> ```
> Please give me some names:
> Ying
> Jordan
> 
> Your 2 name(s) are saved! They are:
> Jordan
> Ying
> ```

Finally, we can ask our `names` `ArrayList` it has a particular string.

```java
names.add("Veer");
System.out.println(names.contains("Veer")); // true
```

> *Exercise:* Update your program to check if a name was input by the user. For example:
> ```
> Please give me some names:
> Ying
> Jordan
> 
> Search for a name:
> Ying
> Yes!
> ```

An `ArrayList` can hold any type of object! For example, here is a constructor for an `ArrayList` holding our `Person` class from last week.

```java
ArrayList<Person> people = new ArrayList<Person>();
```

> **Exercise:** Modify our program to save the user's input names as `Person` instances. Rather than storing `String` objects in the `ArrayList`, store `Person` objects by constructing them with the input name. You'll need to use the `Person` constructor to get a `Person` instance!

# In-class assignment

Write a class `BlueBook` that tells the user the price of their car, depending on the make, model, and year. You should use [`Car.java`](https://github.com/accesscode-2-1/unit-0/blob/master/in-class%20exercise%20solutions/BlueBook/Car.java) and the stencil file provided, [`BlueBook.java`](https://github.com/accesscode-2-1/unit-0/blob/master/in-class%20exercise%20solutions/BlueBook/BlueBook.java).

Your program depends on what cars your `BlueBook` supports, but here is an example program:

```
What is your car's make?
Toyota
What is your Toyota's model?
Corolla
What is your Toyota Corolla's year?
1999

Your 1999 Toyota Corolla is worth $2000.
```

> **Bonus exercise:** Notify the user if the car is not in your `BlueBook`.

> **Bonus exercise:** Clean up `main` by putting your code for creating the `ArrayList` in a separate method. What type should the method return?

> **Bonus exercise:** If the car is not in the `BlueBook`, ask the user to input the relevant data, construct a new `Car` instance, add it to your `ArrayList`.
