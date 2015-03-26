# Objectives
- To be able to create an `Iterator` from an `ArrayList`.
- To be able to loop over an `ArrayList` in 3 different ways.


# Looping over lists

Before we get started, let's create an `ArrayList` we can play with. Create a class `Adder` and `import` the `ArrayList`. We're going to use an `ArrayList` of integers. We can't add primitive types but Java has a "wrapper class", a reference type that wraps a primitive type, that we can use. It's call `Integer`. Create an `ArrayList` holding objects of type `Integer`.

```java
ArrayList<Integer> numbers = new ArrayList();
```

> **Exercise:** Write a program that asks the user for some integers and adds them to your `ArrayList`. Use a `while` loop and `break` when the user gives you a `-2`.
> ``` 
> Give me some numbers to add:
> 1
> 1
> 2
> -2
> Thanks!
>```

#### For loop

On Tuesday, we saw that we could loop over a list like this:

```java
for (int i = 0; i < numbers.size(); i++) {
    System.out.println( numbers.get(i) );
}
```

#### For each loop

We're going to look at two different ways of iterating over `ArrayList`s. The first is a *for each loop*. The syntax is this:

```java
for (Integer num : numbers) {
    System.out.println(num);
}
```

> **Exercise:** Using a for each loop, calculate the sum of numbers that the user input.
> ```
> Give me some numbers to add:
> 1
> 1
> 2
> -2
> Thanks! Your sum is 4.
>```

#### Iterator

Finally, we can iterate using an object of type `Iterator`. First, we need to import the class:

```java
import java.util.Iterator;
```

Next, we want to create an object of type `Iterator` by calling the `iterator()` method on `numbers`; you can call this method on any collection:

```java
Iterator<Integer> numbersIter = numbers.iterator();
```

Notice we have to give the `Iterator` a reference type, just like the `ArrayList`. Now we can use `numberIter`'s methods `hasNext()` and `next()` to loop or iterate over the collection:

while (numbersIter.hasNext()) {
    // numbersIter.next() will return the next integer
}

An iterator is *stateful*, meaning as you call the method `next()`, the contents of the iterator change. You *cannot* access them again! Try it...

```java
while (numbersIter.hasNext()) {
    numbersIter.next();
}
numbersIter.next(); // Exception in thread "main" java.util.NoSuchElementException
```

When would we want to do this? Perhaps if our input is stateful and we do not want the user to be able to "go back". For example, the `Scanner` class is an `Iterator`. You can't call `nextInt()` twice in a row for the same user input.

> **Exercise:** Rewrite your sum functionality to use an `Iterator` rather than a for each loop.

# clear()

`ArrayList`s have a nice method `clear()` that will clear their contents. Try it:

```java
numbers.add(1);
numbers.clear();
System.out.println(numbers.size()); // 0
```

> **Exercise:** Update your program so that the adder's stored values are cleared if the user inputs `-1`. It will keep waiting for more positive integers until the user types `-2`.
> ```
> Give me some numbers to add:
> 2
> 3
> 4
> -1
> 33
> 33
> -2
> 66
