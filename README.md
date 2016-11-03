## Exercise: DocStats (10 points)

The project name of this exercise is **DocStats** 

The purpose of this assignment is to learn how to work with a data file and iteration. You get more practice on how to write all of your own code and Javadoc comments.

### Problem Description

This problem is inspired by the book's Problem E11.5 on page 552.

You are going to write a program that gathers statistics on a text file in a way that is similar to word processors which tell you how many characters, words, and lines you have written.

### Getting Started

There is no code to copy for the assignment. You get to do it all! Don't forget to provide proper Javadoc documentation.

We are going to do this exercise by writing the object that solves the problem first (in a source file called TicketSeller.java) and then testing it using code we write into **DocStats.java**. Using the techniques shown on the web page titled [How to Start Every Project in this Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToStartEveryProject.md) to create a source file called **DocStats.java**. This is where your code will go. 

### Testing Your Code

Your **DocStats.java** should contain code for your solution to this problem. Ask the user for the name of a file (using a scanner) and outputs the statistics. A sample run is shown below:

```
Enter filename: goblin.txt
Number of characters: 1450 
Number of words: 257
Number of lines: 49 
```

The file "goblin.txt" is part of the project from GitHub, and should be seen in your project in Eclipse. It must be located in root directory of the project.

Once you've written your code run the code by single clicking on **DocStats.java** in the package explorer and selecting **Run->Run** from the menu or using the keyboard shortcut. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

### Running the Unit Tests

Next you'll want to run these unit tests. Start by right-clicking on the `unittest.cs105` package and selecting **Run As -> JUnit Test**. 

To go back to the project view, select the **Package Explorer** tab.

### How to turn in this exercise

The first step of turning in your code is to commit and push your code to GitHub. Once you've completed this step your code will be on GitHub in your repository, not the repository for the class. This will allow you to use all your projects later as a portfolio.

To start the process write click your project and select **Team -> Commit...** and follow the usual procedures.

#### Completing the turn-in process

Now to complete the turn-in process, once you confirmed that your code is on BitBucket, you need to create a **build plan** on Bamboo. This action will create a Bamboo build plan that will build and test your code every time you push code to your project. You can also run builds manually

Follow the directions in [How to Turn in Every Project in This Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToTurnInEveryProjectInThisClass.md)

**NOTE** You do not need to anything on Canvas to turn-in your assignment, but your grade will be posted on there so that you may track your progress throughout the term.