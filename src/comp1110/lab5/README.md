# COMP1110 Lab 5

This lab contains material from module [**X1**](https://cs.anu.edu.au/courses/comp1110/lectures/javafx/) (JavaFX).

## Before the Lab

* Complete Week 6 of your personal journal, commit and push at least 5 minutes prior to the start of your lab.

## Purpose

In this lab you will write a Java FX program that includes drag-and-droppable elements.

**Your tutor will mark your engagement during the lab.**

## Part I: 30-Minute Check-In

As usual, you will do _two_ things during the 30-minute check-in:

1.  Check in with **your tutor** together with the other members of your group.    Briefly outline any issues you're having that you'd particularly like help with during the lab (make sure you have your journal open and refer to it when you meet with your tutor).
2.  When you're not checking in with your tutor, you should be listening to the **lab leader** as they give an overview of what you'll be working through in this week's lab.

## Part II:  Your Lab Tasks

### JavaFX Shapes

1.  **Create a new JavaFX class.**

    In the Java package `comp1110.lab5` within your labs repo, create a new Java class, `Board`, which extends `javafx.Application`, that draws a 600x519 pixel window.  Set the window title to "Board".

2.  **Draw a triangle**

    Create an upright 200x200x200 equilateral triangle within the scene you made in step 1. Use the `Polygon` class. From the origin (0,0), the triangle should extend an equal distance in both positive and negative x directions, and positive and negative y directions. Use `setLayoutX()` and `setLayoutY()` to recenter the triangle in the middle of your window. Set the fill color of the triangle to `LIGHTGREY`.

    ![alt triangle](assets/lab5a.png)

    *Hint: Relative to the origin, the apex of the triangle should be at (0.0, -86.6), and the right and left corners of the base should be (100.0, 86.6) and (-100.0, 86.6), where 100 = 200/2 and 86.6 = sqrt((200*200)-(100*100))/2;*

3.  **Create an inner class**

    Create an inner class, `Triangle`, which extends `Polygon` and has a constructor with signature `Triangle(double x, double y, double side)`. This should create an upright equilateral triangle, centered at (`x`,` y`), with sides of length `side`.

    Comment out the code you wrote in step 2 (that drew the triangle with Polygon), and replace it with the creation of a `Triangle`. Set the fill color of the new triangle to `LIGHTGREY`. Don't forget to add your triangle to the root group.

4.  **Fill the board with triangles**

    Fill the board with a grid of triangles, storing each triangle in an ArrayList<Triangle>.  You should fit exactly three rows (each 173.2 pixels apart), each row having five triangles (three upright and two inverted). You will need to use the setRotate() method to invert some of the triangles.



5. **Create a white border**

   Reduce the size of each triangle to 196 pixels, while maintaining the spacing as if they were size 200. This should create the effect of a white border around each triangle.

   ![alt board](assets/lab5b.png)

6. **Finish up**

   Commit your code, push it, close the relevant issue (#18), and show your work
   to your tutor.

### Extension: JavaFX Drag and Drop

Extend the your Board program to include drag-and-drop.

1. **Create an inner class**

   Create a new inner class `DraggableTriangle`, that extends your inner class `Triangle`.

2. **Add a constructor**

   Add a constructor to your new inner class with the following signature: `DraggableTriangle(double x, double y, double size, Board board)`. Ensure that this constructor calls its parent constructor (`super(x, y, size)`), and then sets the fill color to`RED`.

3. **Add a new field**

   Add a private instance field `board` to your `DraggableTriangle` inner class and initialize it in the constructor (i.e. `this.board = board;`).

4. **Create a draggable triangle**

   Within the `start()` method of your `Board` class, create a new `DraggableTriangle` of size 200, centered at (300, 260), and with the board (i.e. `this`) passed as the fourth argument to the constructor. Remember to add the draggable triangle to your root group.

   ![alt board](assets/lab5c.png)

5. **Make the inner class draggable**

   Make the inner class `DraggableTriangle` draggable. The approach here is to identify how much the mouse has moved (by comparing its current position to its last position), and then move the triangle by that same amount.
    * Add two private instances fields to the inner class, both doubles, to track the location of the mouse as the object is dragged. Call them `mousex` and `mousey`.
    * Remember where the mouse is when it is first pressed, and ensure your triangle remains visible. Do this within the constructor by establishing a handler for mouse presses. You need to add code to the constructor for `DraggableTriangle` that looks something like this:

    ````Java
        this.setOnMousePressed(event -> {
        .. your code here ..
        });
    ````
    * Your code should store the current mouse x and y positions in the private fields (e.g. `mousex = event.getSceneX()`, etc), and should ensure the draggable triangle is not covered by other nodes in the scene (call `toFront()` to ensure this).
    * Move the triangle as the mouse is dragged using a handler via `setOnMouseDragged()` in much the same way as you did for `setOnMousePressed()` in the previous step. In that code, find out how much the mouse has moved (e.g. use `event.getSceneX() - mousex`), and change the location of the triangle by the same amount (use `setLayoutX()`, etc). Then remember the new mouse location (updating `mousex` and `mousey`), so that it is all ready for the next time the event occurs.

   You should now be able to drag the red triagle around.

6. **Add a distance calculator**

   Add a method to your inner class `Triangle` with signature `private double distance(double x, double y)` that returns the euclidian distance from the center of the triangle to the point (x,y), (using Pythagoras' theorem :-).

7. **Find the nearest triangle**

   Add an instance method to your `Board` class that allows you to find the nearest triangle to a given point, it should have a signature something like `Triangle findNearestTriangle(double x, double y)`. You can do this by simply iterating over all the triangles in your `ArrayList<Triangle>`, and returning the triangle with the smallest distance from (`x`,`y`).

8. **Highlight the nearest**

   Highlight the triangle nearest the draggable triangle:
    * Add a new field to your `Board` class that allows you to remember a 'highlighted' triangle, and initialize the field to `null` (e.g. `Triangle highlighted = null;`).
    * Add a method `void highlightNearestTriangle(double x, double y)` that highlights the triangle nearest a point (`x`, `y`). This method should first un-highlight the currently highlighted triangle (if there is one), by filling it with `LIGHTGREY`. It should then set the variable `highlighted` to be equal to the nearest triangle to (`x`, `y`), and then it should set the fill color of the highlighted triangle to `GREEN` (or whatever color you prefer).
    * Add a line to your `setOnMouseDragged()` event in the constructor of `DraggableTriangle` that calls `board.highlightNearestTriangle()` with the location of your draggable triangle as arguments. You should now find that as you drag your red triangle around, the triangle nearest it is highlighted green.

   ![alt board](assets/lab5d.png)

9. **Snap to nearest triangle**

   Finally, make your draggable triangle snap to the nearest triangle. To do this, add a handler for mouse release (use `setOnMouseReleased()`, just like you did for `setOnMousePressed()` and `setOnMouseDragged()`). In that code, find the nearest triangle to your draggable triangle, and then make the location and orientation of the draggable triangle be the same as that of the nearest triangle (using `setRotate()`, `getRotate()`, `setLayoutX()`, etc.).

10. **Finish off**

    Commit and push your work, close the relevant issue (#19), and notify your tutor.


### Work on your group assignment

Use any spare time to work on your group assignment.




