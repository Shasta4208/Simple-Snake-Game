# Simple-Snake-Game
===================
=: Core Concepts :=
===================

- List the four core concepts, the features they implement, and why each feature
  is an appropriate use of the concept. Incorporate the feedback you got after
  submitting your proposal.

  1. Novel Linked list. The feature is implemented in that this linked list keeps track of where the snake
  is on the grid when being drawn and what squares the snake occupies on the grid. Along with when the snake
  head comes in contact with an apple, wall, or itself. This is appropriate because it is easy to add to the list
  Unlike an array, because a linked list does not have a predetermined size, adding to the list, such as when eating an
  apple, adds one square to the snake.

  2. Recursion. The feature that this is implemented in is that this part draws the grid tile by tile
  with the assignment of how big the grid is supposed to be based on the GAME_SIZE given to it in the Game.java file.
  The recursion draws the grid and makes the game a specific size. This is appropriate because due to
  how well recursion can draw grids because of its one-by-one style of processioning makes it appropriate to use
  recursion to draw the grid.

  3. 2D Arrays. The feature that this implements would be I use the 2D array to keep track of how to draw out what the
  Grid is by coordinates, whether free space, a wall, or an apple, as seen in the spawnable method
  and giving them their colors (also gives the apple its color). The 2D array stores the state of each tile and where
  it is on the grid. This is an appropriate use of the concept because using a 2D array is the easiest way to keep
  track of each unit on the grid.

  4. Inheritance and subtyping. The features that this implements are in a KeyListener import, which listens for key
  presses using an addKeyListener, which allows the program to listen for key events of a key is pressed, typed, or released
  and corresponds to a Key event, which is when you press down on the key and send a signal to the snake as to what
  to do. This is appropriate because I felt this was a clean way to organize the kay movements while importing the
  tools I needed to do the task.

=========================
=: Your Implementation :=
=========================

- Provide an overview of each of the classes in your code and what their function is in the overall game.

Intro- This class creates a new window with the instructions and introduction to the game where you can press anywhere to exit the screen to the game.

Grid- This class is responsible for drawing the grid and assigning each grid tile a state and coordinate.
Along with "spawning "apples on the grid.

Functions- This class keeps track of the game's functionality by having control of the control buttons.
It also allows the game to keep track of the score, spawn a new apple after one is picked up, and have control of the
timer the game runs on to control how fast the snake travels from tile to tile.

Drawer- This class is in charge of creating the window the game operates inside, along with the layout of the game.
Along with sizing the grid tiles on the game to be consistent, one size no matter the size of the screen and setting the game space that would be playable by using top-level containers and Panes to access the root panes visible contents in the content pane.

Snake-This class keeps track of the direction the snake is moving, the color of the parts of the snake, the position
the snake is occupying; it keeps track of whether the snake makes contact with a wall or itself, in which case it terminates
the game or if the snake touches an apple, which adds to the length of the snake.

Game- This class tells how big the game grid should be and gives directions to the other classes on how large
the grid is; the class also calls the classes. Make sure that the intro screen is called first.



- Were there any significant stumbling blocks while you were implementing your
  game (related to your design or otherwise)?

  Yes, in the drawer class, getting everything to draw correctly because of how I envisioned the game working earlier
  caused me to do some extra reading on how to draw things into the GUI correctly. Luckily, we did a bit of
  Java swing in high school, and we made a game then, too (I made a game of tic-tac-toe then), but I did remember my
  teacher talking about JFrames and that there were a few panes. More importantly, I remembered that the content pane
  was the container that held all the GUIs and visible parts. So, I did some digging and found a way
  to draw the game and set the background color. I should have just come to office hours, but it has been a rough past
  week, and I didn't feel well enough to go or didn't have time.


- Evaluate your design. Is there a good separation of functionality? How well is
  the private state encapsulated? What would you refactor if given the chance?

  There is a good separation of functionality in my design; with that, I have a good separation in each
  class with its own job. With this setup, the private state is well-encapsulated for the most part.
  I would refactor how I draw things with my drawing method; it needs to be revised and simplified. Like I
  said I should have just gone to office hours when I had the chance.


========================
=: External Resources :=
========================

- Cite any external resources (images, tutorials, etc.) that you may have used 
  while implementing your game.
  https://docs.oracle.com/javase/tutorial/uiswing/components/toplevel.html
  https://docs.oracle.com/javase/tutorial/uiswing/events/componentlistener.html
  https://docs.oracle.com/javase/8/docs/api/java/awt/event/ComponentEvent.html#getComponent--
  https://docs.oracle.com/javase/tutorial/uiswing/components/rootpane.html
  https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html#eg
