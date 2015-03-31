# Objectives

To continue learning about `HashMap`:
- How to add and get values by key (review)
- How to use more advanced methods (`size`, `remove`, `clear`, `isEmpty`)

# Homework

Introducing [this week's homework](https://github.com/accesscode-2-1/unit-0/issues/6)...

# Twelve Days redux

Let's look at how much simpler "The Twelve Days of Christmas" assignment can be [with a `HashMap`](https://github.com/accesscode-2-1/unit-0/blob/master/in-class%20exercise%20solutions/TwelveDaysHM.java).

# Review
> *Definition:* A *map* is a collection that associates keys with values.

> **Exercise:** Create a class `WordTracker`; import `HashMap`; and create a new `HashMap` named `words`. Its keys should be of type `String` and its values of type `Integer`.

> **Exercise:** Prompt the user for some words; continue reading in words until the user inputs "stop". When calling `put()`, just pass 1 as the second parameter. Here's example program:
> ```
> Please give me some words:
> latte
> coffee
> mocha
> stop
> Thanks!
> ```

# HashMap advanced methods

#### size()

Just like with an `ArrayList`, you can get the size of a `HashMap` by calling the method `size`.

> **Exercise:** Modify your program to tell the user how many words they input.
> ```
> Please give me some words:
> latte
> coffee
> stop
> Thanks! You have given me 2 word(s)!
> ```

#### remove()

Call `remove(key)` to remove the `key` parameter from the `HashMap`. For example, to remove "latte" from the previous exercise, we would write:

```java
words.remove("latte");
```

> **Exercise:** Modify your program so that if the user types `rm`, every subsequent word the user types *removes* it from the `HashMap`. If the user types `add`, the program switches back to adding. Use a boolean `addMode` to track which mode the program is in. Initialize it outside of your loop. 
> ```
> Please give me some words:
> latte
> coffee
> rm
> coffee
> stop
> Thanks! You have given me 1 word(s)!
> ```
> Here's another program run:
> ```
> Please give me some words:
> foo
> bar
> rm
> bar
> add
> qux
> stop
> Thanks! You have input 2 words.
> ```

#### clear()

Call `clear()` to remove all the elements from the `HashMap`.

> **Exercise:** Modify your program so that if the user types "clr", the tracked words are cleared.
> ```
> Please give me some words:
> foo
> bar
> clr
> stop
> Thanks! You have input 0 words.
> ```

#### isEmpty()

Call `isEmpty()` to return a `boolean` indicating whether or not the `HashMap` is empty. Notice it is just syntactic sugar for...

```java
words.size() == 0;
```

> **Exercise:** Modify your program to check if `words` is empty at the end of the program. 
> ```
> Please give me some words:
> stop
> Thanks! You have input 0 words.
> Words is empty.
> ```

#### keySet()

There are many ways to iterate over a `HashMap`. We're going to learn just one:

```java
for (String word : words.keySet()) {
}
```

We'll look at the `Set` data structure on Thursday; for now, just know that calling `keySet()` returns an iterable collection and that you can iterate over it like above.

> **Exercise:** Modify your program to print the counts of each word. For example:
> ```
> Please give me some words:
> banana
> orange
> stop
> Thanks! You have input 2 words.
> Here they are:
> orange: 1
> banana: 1
> ```

Final exercise!

> **Exercise:** Modify your program to keep track of multiple inputs of the same word. For example:
> ```
> Please give me some words:
> banana
> banana
> banana
> orange
> stop
> Thanks! You have input 2 words.
> Here they are:
> orange: 1
> banana: 3

You've written a complex program! This kind of input should work for you now:

```
Please give me some words:
banana
orange
rm
orange
add
water
sugar
juice
juice
juice
juice
stop
Thanks! You have input 4 words.
Here they are:
water: 1
banana: 1
juice: 4
sugar: 1
```

# In-class assignment: RestaurantFacts based on NYC Open Data

We'll be using NYC Open Data again to build a `HashMap` of [restaurant data](https://data.cityofnewyork.us/Health/DOHMH-New-York-City-Restaurant-Inspection-Results/xx67-kt59). Use [`FileParser`](in-class%20exercise%20solutions/RestaurantFacts/FileParser.java) to get an `ArrayList` representing the lines in the file and follow [this stencil file](in-class%20exercise%20solutions/RestaurantFacts/RestaurantFacts.java).

Here's a simple program execution:

```
Name a restaurant:
MORRIS PARK BAKE SHOP
A
```

#### Bonus
> Modify your `HashMap` of `String`s to hold an `ArrayList` of `String`s. When the user inputs a restaurant name, print all the relevant facts that you have.
