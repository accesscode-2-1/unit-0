# Objectives
- To take a quick detour to ensure that we  understand what exactly `Object Oriented Programming` is
- Review of `ArrayList`
- `ArrayLists` vs. `simple arrays`
- Learn more methods of `ArrayList`
- More about`Iterator` from an `ArrayList`.
- More on looping over an `ArrayList` .


<br />
## Do you understand the following? Otherwise...
<br />
![do not pass go](https://github.com/accesscode-2-1/unit-0/blob/master/images/donotpassgo.jpg)

#### Object Oriented Programming (OOP)?

1. [What are object-oriented languages?](https://www.youtube.com/watch?v=SS-9y0H3Si8)
2. [Classes](http://www.lynda.com/Java-tutorials/Creating-classes/184457/374311-4.html)
3. [Instantiating  classses](http://www.lynda.com/Java-tutorials/Instantiating-classes/184457/374312-4.html)

#### Simple arrays

1. [Simple arrays](http://www.lynda.com/Java-tutorials/Understanding-arrays/184457/374294-4.html)

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

####2. Removing elements from the list
    - void clear()
       Removes all the elements from the list.
      - E remove(int index)
        Removes the element at the specified position in the list.
      - protected void removeRange(int start, int end)
       Removes from the list all the elements starting from index start (included) until index end (not included).


####3. Getting elements from the list
     - E get(int index)
         Returns the element at the specified position.
     - Object[] toArray()
        Returns an array containing all the elements of the list in proper sequence.


####4. Setting an element
     - E set(int index, E element)
       Replaces the element at the specified position with the specified element.

####5. Searching elements
     - boolean contains(Object o)
        Returns true if the specified element is found in the list.
     -  int indexOf(Object o)
        Returns the index of the first occurrence of the specified element in the list. If this element is not in the list, the method returns -1.
     -  int lastIndexOf(Object o)
         Returns the index of the last occurrence of the specified element in the list. If this element is not in the list, the method returns -1.

####6. Iterating the arraylist
      - Iterator iterator()
         Returns an iterator over the elements in the list.
      - ListIterator listIterator()
        Returns a list iterator over the elements in this list.

####7. Checking if the list is empty
       -  boolean isEmpty()
          Returns true if the list does not contain any element.

####8. Getting the size of the list
      -    int size()
           Returns the length of the list (the number of elements contained in the list).

