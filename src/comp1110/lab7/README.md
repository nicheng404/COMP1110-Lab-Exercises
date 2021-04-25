# COMP1110 Lab 7

This lab contains material from module [**J14**](https://cs.anu.edu.au/courses/comp1110/lectures/java/#J14) (Collections).

## Before the Lab

* Complete Week 8 of your personal journal, commit and push at least 5 minutes prior to the start of your lab.

## Purpose

In this lab you will solve a simple search problem to find all of the different orderings of planting crops, given some basic rules.

**Your tutor will mark your engagement during the lab.**

## Part I: 30-Minute Check-In

As usual, you will do _two_ things during the 30-minute check-in:

1.  Check in with **your tutor** together with the other members of your group.    Briefly outline any issues you're having that you'd particularly like help with during the lab (make sure you have your journal open and refer to it when you meet with your tutor).
2.  When you're not checking in with your tutor, you should be listening to the **lab leader** as they give an overview of what you'll be working through in this week's lab.

## Part II:  Your Lab Tasks

### Recursion, Sets, and Lists: Crop Rotation

Complete the missing methods (marked `FIXME`) in the `CropRotation` class.   This question is based on a question from the 2020 S1 final exam.   

To solve it, you need to use sets and lists, and you need to solve a search problem, like the [Boggle game](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-lectures/-/blob/master/src/comp1110/lectures/J14/Boggle.java) we solved in lectures in unit J14. 

1. **Handle Simple Cases**

    It is a good strategy to identify and deal with simple cases first.   In
     this problem, notice that there are a number of circumstances where you
     should return an empty list.  You should address this simple case first.
    
    Add an `if` statement to `getAllRotations()` that checks for the cases where an empty list must be returned, and return the empty `rotations` list.

2. **Implement Switch**

    A search typically involves moving from one possibility to another (for example,
    moving from one die in the [Boggle game](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-lectures/-/blob/master/src/comp1110/lectures/J14/Boggle.java)
    to another).  Doing so involves at least two considerations:  a) ensuring that 
    the possibility you're considering is not one you've already considered (if
    you don't do this, your search will never complete because you will continuously
    revisit cases you've already encountered), and b) ensuring that you only consider
    _legal_ cases.
    
    Ensuring that you don't consider the same case twice was addressed in the [Boggle game](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-lectures/-/blob/master/src/comp1110/lectures/J14/Boggle.java)
    by using an array of booleans called `used[]`, and the code carefully
    kept track of which dice were already considered in the current search (you
    may want to inspect the `findWords()` method in the [Boggle game](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-lectures/-/blob/master/src/comp1110/lectures/J14/Boggle.java)
    to see how this was done).   In this problem you've been given a `List` of 
    `Vegetables` called `used`, which you should use in a similar way, adding
    vegetables to the list when they're being considered, and checking whether
    they're already in the set before you try to use them.
    
    In the [Boggle game](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-lectures/-/blob/master/src/comp1110/lectures/J14/Boggle.java),
    checking for _legal_ cases was doing by using a set of neighbours, so that
    we knew for each die which were its legal neighbours.   In this case
    you need to implement `canFollow()`, which will allow your code to determine
    whether a particular crop is a legal follower of the current crop.
    
    Use a switch statement to complete the `canFollow()` method, returning the correct value according the the vegetable groups of the `first` and `next` vegetables.
    
3. **Complete the Search**

    You should notice that the `findWords()` method in the [Boggle game](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-lectures/-/blob/master/src/comp1110/lectures/J14/Boggle.java)
    is not terribly complex once the other parts are in place.   You now 
    need to write the body of `getFixedRotation()`, which will be recursive,
    filling a similar role to `findWords()` method in the [Boggle game](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-lectures/-/blob/master/src/comp1110/lectures/J14/Boggle.java).

    Write the search by completing `getFixedRotation()`, and adding a `for` loop to `getAllRotations()` that calls `getFixedRotation()` for each of the vegetables in `crops`, adding the vegetable to `used` before calling, and removing it from `used` afterwards. 

### Extension: Hashing

**Create a hash program**

Using the lecture code from C03 as a template:

* Read the data from `assets\us_postal_codes.txt`. Each line contains a postal code,town name, state name, state code,county name, latitude and longitude.


Then:
Imagine you are in charge of the entire US postal service, and you have only 50 delivery officers to cover the entire country (40933 zip codes).
You want to give each person a roughly equal amount of work (imagine each post code has the same amount of mail).

Create a hash function that will:
1. Split the work as evenly as possible (imagine that each post code has the same amount of mail)
2. Minimise the travel each person does as much as possible. Imagine that each person starts at any one of their zip codes, and avoid them having to travel across the country.

You can test 1. by running the program and checking the histogram of results to see if the hash function is even.


How many ways can you do this?

### Work on your group assignment

Use any spare time to work on your group assignment.
