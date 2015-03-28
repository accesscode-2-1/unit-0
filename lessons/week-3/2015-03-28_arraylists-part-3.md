# Objectives
- To take a quick detour to ensure that we  understand what exactly `Object Oriented Programming` is
- Review of `ArrayList`
- `ArrayLists` vs. `simple arrays`
- Learn more methods of `ArrayList`
- More about`Iterator` from an `ArrayList`.
- More on looping over an `ArrayList` .


<br />
## At this point, do you truly understand the following topics? otherwise...
<br />
![do not pass go](https://github.com/accesscode-2-1/unit-0/blob/master/images/donotpassgo.jpg)

#### Object Oriented Programming (OOP)

1. [What are object-oriented languages?](https://www.youtube.com/watch?v=SS-9y0H3Si8)

#### Constructors

2. [Constructors](https://www.youtube.com/watch?v=tPFuVRbUTwA&list=PLFE2CE09D83EE3E28&index=17)

#### Creating an object, calling a class, and constructors...

3. [Creating objects](https://www.youtube.com/watch?v=XznNdY3Bfvg)

#### Arrays

1. [ Intro to Arrays ](https://www.youtube.com/watch?v=L06uGnF4IpY&list=PLFE2CE09D83EE3E28&index=27)

#### ArrayList

> A list is an ordered collection, and an ArrayList is one type of list.

1. [ArrayList](http://www.lynda.com/Java-tutorials/Using-ArrayLists/184457/374321-4.html)


## A word about encapsulation
It stands to reason that if I want to know your blood pressure, I would need to either ask or measure it ( via the public interface ).
It makes no sense to even think that I could look into you somehow as these internal values are hidden from plain view.
We want to take this idea and apply it when we create our classes. Attributes that are internal to objects should remain private and only
accessible via their corresponding setter and getter methods. This also applies to methods as well. Public methods may rely on private internal methods
to get their work done. It may be the case that you also don't want to expose those internals method. It is up to you to decide what to expose and 
what to hide but things that do not need to be modified by the user of the class should, in general, be hidden from plain view.


<br />
##ArrayList common methods

####Here are some of the most useful ArrayList methods:

###1. Adding elements to the list

    - boolean add(Element e)
      Adds the specified element to the end of this list.
    - void add(int index, Element e)
      Adds the specified element at the specified position in the list.

You're the manager of an up and coming dog kennel called "Happy Doggies"  and currently you've got six dogs that you look after:
* fido
* sport
* missy
* max
* sleepy
* sport

##### Your task:
1. Create a Dog class that stores a name, type of dog , and age.  
2. Create a Kennel class that is able to keep track of Dog objects in the Kennel via an ArrayList. 
3. Create a method call AddDog() that takes a dog object and adds it to the kennel

###2. Getting the size of the list
     - int size()
       Returns the length of the list (the number of elements contained in the list).

##### Your task:
4. As the manager of the kennel, you'll need to keep track of how many Dogs you have on site.
   Create a method called numOfDogs() that returns the number of Dogs on site.

###3. Checking if the list is empty
     - boolean isEmpty()
       Returns true if the list does not contain any element.

##### Your task:
5. You may want to know when all of your Dogs have been adopted. Implement a hasDogs() method returns false if you have no dogs, true otherwise.

###4. Removing elements from the list
    - void clear()
      Removes all the elements from the list.
    - E remove(int index)
      Removes the element at the specified position in the list.

##### Your task:
6. If you're cruel to your Dogs, the goverment may come by and shut you down.
   Create a shutdownKennel() method that removes all dogs from the kennel.

7. Hopefully, kind human beings will come by and adopt your Dogs. 
   Create a removeDog() method that removes the Dog from the kennel and returns the instance of Dog. 

###5. Getting elements from the list
     - E get(int index)
       Returns the element at the specified position.

##### Your task:
8. A person may come by to just play with the dog while having no intention of adopting so instead of using removeDog() let's create a getDog() method that 
   simply returns an instance of a Dog but doesn't remove it from the kennel.

###6. Setting an element
     - E set(int index, E element)
       Replaces the element at the specified position with the specified element.

##### Your task:
9. You decide to create a dog trading program ( because you're cool like that ). When someone is tired with their current dog, they can come by and exchange it for one 
   of the dogs in the kennel. Implement an exchangeDog() method that takes two parameters, an index and a Dog object and returns the substituted dog object

###7. Searching elements
     - boolean contains(Object o)
       Returns true if the specified element is found in the list.
     - int indexOf(Object o)
       Returns the index of the first occurrence of the specified element in the list. If this element is not in the list, the method returns -1.
     - int lastIndexOf(Object o)
       Returns the index of the last occurrence of the specified element in the list. If this element is not in the list, the method returns -1.

##### Your task:
10. Every now and then you may need to check if a particular instance of Dog is in your kennel. Implement a isDogInKennel() method that takes an instance of a Dog as a parameter
and returns true if Dog is in the Kennel otherwise returns false.

11. In addition to step #1, you will also need another method returnDogIndex() that takes an instance of a Dog as a parameter and returns the index of the Dog object if 
    found otherwise -1 is returned


###8. Iterating the arraylist
     - Iterator iterator()
       Returns an iterator over the elements in the list.
     - ListIterator listIterator()
       Returns a list iterator over the elements in this list.

##### Your task:
12. Create a method called returnIterator() that returns an Iterator for the Dogs in the kennel. 

13. Use the iterator returned from the returnIterator() method and use it to display the list of dogs in the kennel. Be careful, if the iterator goes beyond the available
number of dogs, an exception will be thrown. Be sure to catch it !


