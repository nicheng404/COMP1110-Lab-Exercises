# COMP1110 Lab 4

This lab contains material from modules [**S2**](https://cs.anu.edu.au/courses/comp1110/lectures/se/#S2) (Branches and Merging) and [**J4**](https://cs.anu.edu.au/courses/comp1110/lectures/java/#J4) (Random).

## Before the Lab

* Complete your personal journal for Week 5, commit and push at least 5 minutes before your lab.

### Purpose

In this lab you will design a simple object-oriented program, practise using Git in a group setting, and learn additional strategies for debugging Java programs.

**Your tutor will mark your engagement during the lab.**

## Part I: 30-Minute Check-In

As usual, you will do _two_ things during the 30-minute check-in:

1.  Check in with **your tutor**.
    From this week onwards, you will do your check-in with the other members of your group.
    You should briefly outline any issues you're having (as individuals or as a group), that you'd particularly like help with during the lab.
    You should refer to your journal as you do this.
2.  When you're not checking in with your tutor, you should be listening to the **lab leader** as they give an overview of what you'll be working through in this week's lab.

## Part II:  Your Lab Tasks

### Group design exercise

Your tutor will walk you through a group design exercise for the following problem.

*Problem brief*

A client at a software design company wants assistance processing their documents. 
After interviewing the client, you find that their documents consist of a one sentence title, a date, and a series of paragraphs.
Each paragraph is a simple list of sentences.
Paragraphs are separated by new lines.
Each document also has an author (first and last name) and a document access level (open, internal or confidential).

At a minimal level, the client would like the software to be able to:
* Count the number of words in the document (with or without the title)
* Count the number of characters in the document
* Print out a document
* Print out the date of the document
* Print out the author of the document

Additional desirable features:
* Count the number of a particular type of word (noun, verb, proper noun or other)
* Given a title, date, author and a string for the remaining document, create a document file
* Spell check the document

### GitLab Upstream Pulls for Assignment

If you haven't already done so, you should add the class version of the assignment two repository as an upstream repository as per the notes for [lab 2](../lab2/README.md#gitlab-pull-upstream-commits).
The remote URL is `https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2.git` (or `https://gitlab.cecs.anu.edu.au/comp1110/comp1140-ass2.git` for COMP1140).

*One* member of the group should pull changes from upstream, then push the changes to your group's assignment repository.
The other group members can then pull the changes to their clones of the group repo.

### Git groupwork

In this exercise you will practise most of the Git skills that you will need in COMP1110.
This exercise is demonstrated in a [how-to video](https://cs.anu.edu.au/courses/comp1110/help/mp4/gitexercise.mp4).
If you have not seen the video, I strongly recommend you watch it.
If you get into trouble doing this exercise, you may find it helpful to look at the video again.
In the [video](https://cs.anu.edu.au/courses/comp1110/help/mp4/gitexercise.mp4) I performed the role of all three characters (Alice, Bob and Cindy).
You should do this exercise in the lab with your group members.
If there are only two people in the group, you can adapt the exercise by delegating Cindy's activities to Alice (so you just have Alice and Bob).

1. Before you start, **everyone** in the group must have a clone of your group
repo and an associated project in IntelliJ.  In the physical lab, this will work best if you're
sitting nearby to each other, but it also works well when all participants are in a video call.
	 
2.  **Alice** does the following (with the others watching...):
    
    **Create a new package and two new classes**
    * Create a new package, `gittest`.
	* Within this package, create two new Java classes, `Main` (which has an empty `main()` method), and `A`, which just has a `toString()`.  When IntelliJ prompts you to add the new classes to Git, select **Add**.
    * If you neglected to add the new files when you created them, add them now.
      You will notice that if a file has not been added to version control, IntelliJ shows the name of the file in red.
      You can add a file by right-clicking and selecting **Git > Add**, or via the keyboard shortcut `Ctrl+Alt+A`.
      The file name will appear green once added.
    
    **Commit and push new files classes to group repo**
    * Select **Git > Commit...** (or `Ctrl+K`).
    * Click ![show commit options button](../../../assets/intellij-icon-settings.png) **Show Commit Options** and set the author's name to `Alice <u1234567@anu.edu.au>` (replacing "u1234567" with your UID).
    * Write a commit message.
    * Click **Commit and Push**.
	* You should see a notification dialogue at the bottom of the workspace "Pushed 1 commit to origin/master", which indicates that the push was successful.
		
3. **Bob** does the following (*without co-ordinating with Cindy*):
    
    **Pull changes from group repo**
    * Pull Alice's changes: select **Git > Pull...**, leave the defaults and click **Pull**.
	* In the **Git** tool window at the bottom of the IntelliJ workspace, you should see Alice's changes.
    
    **Add a new class to group project**
    * Create a new Java class in the `gittest` package, `B` which just has a `toString()` method.  When prompted to add the new class to Git, choose **Add**.
	
    **Commit changes but do not push to group repo**
    * Select **Git > Commit...** (or `Ctrl+K`), set the author to `Bob <u1234567@anu.edu.au>`
    * Click **Commit** - *do not* choose "Commit and Push"!
      (We want to imagine Bob gets interrupted before pushing).
	
4. **Cindy** does the following (*without co-ordinating with Bob*):
    
    **Pull changes from group repo**
    * Pull Alice's changes: select **Git > Pull...**, leave the defaults and click **Pull**.
	* In the **Git** tool window at the bottom of the IntelliJ workspace, and you should see Alice's changes.
	
    **Add a new class to group project**
    * Create a new Java class in the `gittest` package, `C` which just has a `toString()` method.  When prompted to add the new class to Git, choose **Add**.
	
    **Commit changes and push to group repo**
    * Commit (`Ctrl+K`), set the author to `Cindy <u1234567@anu.edu.au>`, and then choose **Commit and Push...**
	* You should see a notification dialogue at the bottom of the workspace "Pushed 1 commit to origin/master", which indicates that the push was successful.
	
5. **Bob** now does the following:
    
    **Try to push your commit to group repo**
    * Try to push (`Ctrl+Shift+K`, then click **Push**).
      IntelliJ will pop up a dialog telling you that your push was rejected, and giving you the option to either "Merge" or "Rebase".
      We will merge the changes in the following step.
	
    **Merge your changes with group repo**
    * Click **Merge**.
	* You should see a notification saying that the push was successful and that two commits were pushed.  The first of the two commits is the one that Bob did in step 3.   The second is an automatically generated commit that captures the merge of Cindy and Bob's work.
    * View the log by clicking on the **Git** tool window's **Log** tab.
      You should see a graph showing the merge of Cindy's work with Bob's.

6. **Alice** and **Cindy** update (select **Git > Update Project...**, then select "Merge incoming changes into the current branch").  Now everyone should be in the same state. Check the **Git** tool window to ensure this is so.

7. **Bob** now conducts an experiment, but doesn't want to mess things up for Alice and Cindy (because his idea may not necessarily work out), so he uses a *branch*:
	
    **Create a new branch of your group repo**
    * Add a new branch named `BobsExperiment` (select **Git > Branches...**, then select ![add button](../../../assets/icon-add.png) **New Branch**).
      Branch names must comply with [rules for Git reference names](https://www.kernel.org/pub/software/scm/git/docs/git-check-ref-format.html).
	
    **Make changes to the group project, commit and push to your branch of group repo**
    * Make a simple change to class `B`, commit that change (`Ctrl+K`), being sure to set the author to Bob.
    * Make another simple change to class `B`, commit that change.
    * Push your changes.

8. **Everyone** does the following (*at the same time*):
    * Update project (`Ctrl+T`).
    * Look at the **Git** tool window's **Log** tab.
    * Ensure that you are on the head of the `master` branch (i.e. not on Bob's experimental branch). 
      The changeset you are on is marked with a yellow tag; if you hover the mouse over the tag it should show the word "HEAD". 
      If you followed the steps correctly, Alice and Cindy should have the changeset where Bob did a merge (right before he made the branch). 
      Bob will be on the wrong changeset, so he should switch to the `master` branch: select **Git > Branches...**, then **Local Branches > master**, then **Update**.
	* Now (ignoring Bob's experiment), everyone should edit the main method of `Main` and add a line such as `A a = new A();`, changed suitably to reflect the author (i.e. `B` for Bob and `C` for Cindy).
	* Each person should now save and commit (*but don't yet push*) their change.  Remember to set your author name and a commit message.

9. **Alice** pushes her changes. There should be no error. 
	
10. **Bob** now tries to push his change, but will find a problem that he must now resolve. (Why can't you push? What's causing the problem?)
    * Try to push (`Ctrl+Shift+K`).
	
    **Manually merge changes with group repo**
    * You should get an error message, which you should read (you will resolve the problem by merging, so click **Merge**).
	* You will see a dialogue which presents you with three choices ("Accept Yours", which would throw away Alice's work, "Accept Theirs", which would throw away your work, or "Merge...", which we will allow us to choose between changes for each line).  Click **Merge...**.
	* You will see a window with three panes, the centre shows the result, the left shows your (Bob's) changes, and the right shows theirs (Alice's).
	* Click ![accept button - double left arrow](../../../assets/intellij-icon-merge-server.png) **Accept** next to Alice's change to bring it into the merged result.
	* Click ![accept button - double downwards-right arrow](../../../assets/intellij-icon-merge-your.png) **Accept** next to your (Bob's) change to bring it into the merged result.
	* Once you have merged all changes, click **Apply**.
	* Push your result (`Ctrl+Shift+K`).
	
11. **Cindy** now tries to push her change, but will run into the same problem as Bob.
    * Try to push (`Ctrl+Shift+K`).
	
    **Manually merge changes with group repo**
    * You should get the same error message as Bob, which you should read.
      Click **Merge**.
	* You will see a dialogue which presents you with three choices: ("Accept Yours", which would throw away Alice and Bob's work, "Accept Theirs", which would throw away your work, or "Merge...", which we will do).  Click **Merge...**.
	* You will see a window with three panes, the centre shows the result, the left shows your (Cindy's) changes, and the right shows theirs (Alice and Bob's).
	* Click ![accept button - double left arrow](../../../assets/intellij-icon-merge-server.png) **Accept** next to Alice and Bob's change to bring it into the merged result.
	* Click ![accept button - double downwards-right arrow](../../../assets/intellij-icon-merge-your.png) **Accept** next to your (Cindy's) change to bring it into the merged result.
	* Once you have merged all changes, click **Apply**.
	* Push your result (`Ctrl+Shift+K`).

12. **Everyone** pulls and updates and should see the `Main` file with all three contributions.

That completes the group exercise.  Close the associated issue (#15).  The next exercise is an individual exercise.


### The Stack Trace and a Debugging Exercise
Think back to Lab 2. We discussed some common and very useful
debugging strategies which will have you, with practice, easily
finding and fixing bugs with minimal fuss. Now you will put those
skills into practice. But one thing first - sometimes IntelliJ does
most of the work for you! Consider two common cases:

**Unexpected output with no exception**: You have written a program
which compiles and runs without any exceptions (i.e. the program does
not _crash_ or display errors in the standard output), however, the
program does not work as expected. Maybe it never responds to input or
maybe the value it prints is not what you expect. This is the
situation we experienced in lab 2, and this situation can be difficult
to debug.
In many cases, it is *useful* for your program to crash when it is receiving values that are incorrect or for which the results will be meaningless.
For example, if you have a
function that expects only positive numbers, you would expect the
program to gracefully crash at this point (or possibly just abort the
processing and display an error). You now have limited the number of
functions in which the error could have been occurring! While it may
seem like a good idea to avoid throwing errors at all costs, errors
are useful tools which allow you to catch bugs when and where they
occur (which brings us to the next point). However, if all else fails,
you can always use the techniques discussed last week (among
[others](https://spin.atomicobject.com/2018/08/01/debugging-strategies-tips/)).

**No output due to unexpected input/error**: You have written a program which you expect to run and produce an output; instead, an error occurs at some point which stops the program from finishing.
Don't panic!
As we addressed above, in some cases this is a _good_ thing since we wouldn't want our program carrying on with unreliable and unpredictable behaviour.
Generally, when an error
occurs, whether the error is handled by the program or causes a crash,
it is associated with a **stack trace** which is an extremely powerful
record of when and where the error occurred in your program. Learning
how to read a stack trace is a crucial skill in efficiently debugging
your program. Here is an example of a simple stack trace (taken from
an introduced error in the sample code `RunLengthDecoder` from lab 2);
```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
	at comp1110.lab2.RunLengthDecoder.groupedIntegers(RunLengthDecoder.java:55)
	at comp1110.lab2.RunLengthDecoder.decode(RunLengthDecoder.java:19)
	at comp1110.lab2.RunLengthDecoder.main(RunLengthDecoder.java:12)
```
Okay, so this looks intimidating but it is really quite simple. When
an error occurs, the location is recorded as a nesting of method
calls at particular line numbers. The term 'stack trace' comes from
the concept of a stack which is a memory allocation in your device
which grows as each method call is executed, by 'stacking'
information. In this case, we are being told that an exception has
occurred within the main thread of the program. The exception is of
the type `java.lang.ArrayIndexOutOfBoundsException`. Usually the last
part is the important one; `ArrayIndexOutOfBoundsException`. So we are
trying to get an element of an array, where the index we provide is
outside of the bounds of the array. But we have even more
information - we are told that the index we tried to get is `6` and
that the length of the array is `6` (why is this a
problem?). Furthermore, we are told at which line the error
occurs. Generally, the most _shallow_ element of the stack trace is
the most relevant, in this case;

`at
comp1110.lab2.RunLengthDecoder.groupedIntegers(RunLengthDecoder.java:55)`


tells us that the index out of bounds error occurred at line `55` of
the class `RunLengthDecoder`. Looking at this line, this is indeed
where I introduced an error;
`output[inner_index] = repeatInt(current, sequence[outer_index + 1]);`
in this case I had the inner and outer indexes in the incorrect
order. The _next_ line of a stack trace tells you where the
_current_ line of a stack trace was called from; in this case the error
occurred from the main method calling decode at line `12` which calls
the `groupedIntegers` method at line `19`.
See, stack traces are simple!
Don't be afraid to dig into them and use them to quickly pinpoint errors.
Some other common stack trace errors ([exceptions](https://www.baeldung.com/java-common-exceptions)) are:

* **[NullPointerException](https://stackoverflow.com/questions/218384/what-is-a-nullpointerexception-and-how-do-i-fix-it)**:
  Your program is usually trying to access some property or method of an
  object which is actually a null reference. For example, you may
  assign the output of a function to a variable, but the function
  provides a null value due to an error. If you then tried to get,
  say, the `length` of the object, this error would occur.

*  **[StringIndexOutOfBoundsException](https://examples.javacodegeeks.com/java-basics/exceptions/java-lang-stringindexoutofboundsexception-how-to-solve-stringindexoutofboundsexception/)**:
  This is another example of an 'index out of bounds' exception. In
  this case, you are trying to address a character of a string at a
  position which does not exist.

* **[NumberFormatException](https://www.baeldung.com/java-number-format-exception)**:
  Sometimes when you try to convert a string to an integer (or another
  number, known as _parsing_), the _parser_ doesn't know what number
  to give you, so throws this error. For example, you might try to
  parse the string "13 - 15" as an `Integer` - this will throw an
  error.

* **[IllegalArgumentException](https://stackoverflow.com/questions/15208544/when-should-an-illegalargumentexception-be-thrown)**:
  Well written functions, often those found in standard Java
  libraries, will very carefully check the input provided to them to
  ensure that the input is reasonable. For example, the argument of a
  function which requires a number of milliseconds to sleep should not
  be negative.

There are many more exceptions and techniques to analyse stack traces,
but these should be enough to get you started in understanding how to
use them to quickly find errors in your code.

### Your turn: Debugging
Now, equipped with some common strategies (like print statements, code
reduction and using the built-in IntelliJ debugger) as well as a
good understanding of the stack trace, see if you can find all the
bugs in the code provided in the class `Dice`. Make sure that the
output of the program matches the specifications included in the
comments of the class. Feel free to add any code you feel is necessary
to properly test the functionality of the program.

### Extension - Heads or Tails
This exercise requires using object-oriented design and imperative
design. 

* Hopefully, having completed the debugging exercise, you will have a working
`Dice` class which, given a lower and upper bound, can produce random
values in this range (inclusive). 

* If you haven't got this class working yet, please take this time now
to complete the debugging exercise.

* Please take some time to revise how `Random` is used to generate
  random numbers between two values. If you are having trouble
  understanding how `Random` works or are stuck on the debugging task,
  now is a good time to ask a peer or your tutor for help.


* Copy the working Dice class to your lab 4 package, and create a new
class, `HeadsOrTails`. 

* The class `HeadsOrTails` should enable the user to play many games
of heads or tails by accepting the 'prediction' from the terminal. 
* The user should input `h` for heads and `t` for tails. Any other
inputs should result in `Unexpected input` being printed to the
terminal. 

* When a heads or tails guess is received from the user, the program
should use the `Dice` class to create a `coin` which should then be
flipped.  If the user's prediction is correct, print `Good guess!` to
the terminal, otherwise print `Bad luck!`.

* The program should accept guesses and give answers
repeatedly until the user exits with `Ctrl+D`. Please don't print any
extra content to the terminal besides that precisely described above -
this will impact testing.

* **Consider**: how many `coin`'s do we need? Does `coin` have to be a
  local variable or can we declare it once? Can `coin` be an
  instance variable? Can `coin` be a class variable
  (i.e. static)? Can `coin` be a final variable? If `coin` is
  final, will calling `rollDice()` on `coin` still be random? 

Once you have completed the `HeadsOrTails` class, test your code using
the provided test class `L4 HeadsOrTailsTest`. Commit, push to git,
close the issue (#16) and show your tutor. 

**Background**

Professor [Richard P. Brent](https://researchers.anu.edu.au/researchers/brent-rp) (Emeritus professor at ANU!) made significant contributions to the field of random number generators, and created some algorithms to produce pseudo-random numbers.
[Further reading for those interested.](https://arxiv.org/abs/1004.3115)

**Write your own 'random' code**

As discussed in lectures, java.util.random gives you *pseudo-random* numbers- it looks random, but is created using a formula.

Without using java.util.random, write a code that will 'randomly' return an int in [1,2,3] every time you run it.

**Test your own 'random' code using collections**

Write some code to run your program 150 times, and collect the results. Read through the next steps and work out which collection type will be most useful here. (Array,list,set,map?)

To be *pseudo-random*, your code should:

- Print each number roughly the same amount of times. Using your collection, print how often each number came up-the closer to (50,50,50) the better!

- It should look random- if your code runs 1,2,3,1,2,3,1,2,3... that won't look random.
  Separate the results into the first 50 (1-50), second 50 (51-100) and third 50 results (101-150).
How often is the same result in the same place- (e.g. Does the 1st result = 51st result = 101st result? How often does this happen?)

- Should contain all small sequences of numbers. Check that your results contain the following sets: (1,1,1), (1,2,3),(2,3,2),(3,2,1),(3,1,2).



How many different ways can you think of to create a 'random' number generator? You don't have to program more than one, but if you do try testing them against each other.
