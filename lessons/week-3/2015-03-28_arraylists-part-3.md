# Objectives
- To take a quick detour to ensure that we  understand what exactly `Object Oriented Programming` is
- Review of `ArrayList`
- `ArrayLists` vs. `simple arrays`
- Learn more methods of `ArrayList`
- More about`Iterator` from an `ArrayList`.
- More on looping over an `ArrayList` .


<br />
## At this point, do you truly understand the folowing topics? otherwise...
<br />
![do not pass go](https://github.com/accesscode-2-1/unit-0/blob/master/images/donotpassgo.jpg)

#### Object Oriented Programming (OOP)?

1. [What are object-oriented languages?](https://www.youtube.com/watch?v=SS-9y0H3Si8)

#### Constructors

2. [Constructors](https://www.youtube.com/watch?v=tPFuVRbUTwA&list=PLFE2CE09D83EE3E28&index=17)

#### Creating an object, calling a class, and constructors...

3. [Creating objects](https://www.youtube.com/watch?v=XznNdY3Bfvg)

#### Arrays

1. [newboston - Intro to Arrays ](https://www.youtube.com/watch?v=L06uGnF4IpY&list=PLFE2CE09D83EE3E28&index=27)

#### ArrayList

> A list is an ordered collection, and an ArrayList is one type of list.

1. [ArrayList](http://www.lynda.com/Java-tutorials/Using-ArrayLists/184457/374321-4.html)



<br />
##ArrayList common methods

####Here are some of the most useful ArrayList methods:

<br />

####1. Adding elements to the list

    - boolean add(Element e)
     Adds the specified element to the end of this list.
     - void add(int index, Element e)
     Adds the specified element at the specified position in the list.

Example: You the manager of a dog kennel and currently you've got five dogs that you look after:
        1. fido
        2. sport
        3. missy
        4. max
        5. sleepy

1. Create a simple Dog class that at a minimum is able to store and retrieve its name. 
2. Create a Kennel class that is able to keep track of Dog objects in the Kennel via an ArrayList. 
3. Create a method call AddDog that takes a dog object and adds it to the kennel
  

####2. Getting the size of the list
      -    int size()
           Returns the length of the list (the number of elements contained in the list).

4. As the manager of the kennel, you'll need to keep track of how many Dogs you have on premises
   Create a method called numOfDogs() that returns the number of Dogs on premesis

####3. Checking if the list is empty
       -  boolean isEmpty()
          Returns true if the list does not contain any element.

5. You may want to know when all of your Dogs have been adopted. Implement a hasDogs() method returns false if you have no dogs, true otherwise.
####4. Removing elements from the list
    - void clear()
       Removes all the elements from the list.
      - E remove(int index)
        Removes the element at the specified position in the list.
      - protected void removeRange(int start, int end)
       Removes from the list all the elements starting from index start (included) until index end (not included).

6. If you're cruel to your Dogs, the state may come by and shut you down.
   Create a shutdownKennel() method that removes all dogs from the kennel.

7. Hopefully, kind human beings will come by and adopt your Dogs. 
   Create a removeDog() method that removes the Dog from the kennel and returns the instance. 

8. There may come a time when you may need to put dogs to sleep. Create a putDogstoSleep() method that takes a starting index and ending index and then use the removeRange()
   to remove them from the ArrayList or essentially put them to sleep.

####5. Getting elements from the list
     - E get(int index)
         Returns the element at the specified position.

8. A person may come by to just play with the dog while having no intention of adopting so instead of using removeDog() lets create a getDog() method that 
   simply returns an instance of a Dog but doesn't remove it from the kennel.

####6. Setting an element
     - E set(int index, E element)
       Replaces the element at the specified position with the specified element.

9. You decide to implementing a dog trading program. When someone is tired with their current dog, they can come by and exchange for one of the dogs in the kennel.
   Implement an exchangeDog() method that takes an index and a Dog object

####7. Searching elements
     - boolean contains(Object o)
        Returns true if the specified element is found in the list.
     -  int indexOf(Object o)
        Returns the index of the first occurrence of the specified element in the list. If this element is not in the list, the method returns -1.
     -  int lastIndexOf(Object o)
         Returns the index of the last occurrence of the specified element in the list. If this element is not in the list, the method returns -1.

10. Every now and then you may need to check if a particular instance of Dog is in your kennel. Implement a isDogInKennel() method that takes an instance of a Dog as a parameter
and returns true if Dog is in Kennel otherwise returns false.

11. In addition to step #10, you will also need another method returnDogIndex that takes an instance of a Dog as a parameter and returns the index of the Dog object if 
    found. Returns -1 otherwise.


####8. Iterating the arraylist
      - Iterator iterator()
         Returns an iterator over the elements in the list.
      - ListIterator listIterator()
        Returns a list iterator over the elements in this list.

12. Create a method called returnIterator that returns an Iterator for the Dogs in the kennel. 

13. Use the iterator returned from the returnIterator() method, use it to display the list of dogs in the kennel. Be careful, if the iterator goes beyond the available
number of dogs, an exception will be thrown. You may want to try to catch it.
