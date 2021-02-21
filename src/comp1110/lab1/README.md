# COMP1110 Lab 1

This lab contains material from modules [**I1**](https://cs.anu.edu.au/courses/comp1110/lectures/intro/#I1) (Academic Honesty),
  [**J1**](https://cs.anu.edu.au/courses/comp1110/lectures/java/#J1) (Basic I/O) and [**S1**](https://cs.anu.edu.au/courses/comp1110/lectures/se/#S1) (Gitlab).

## Purpose

In this lab, you will become familiar with the tools we will use throughout the semester.

**Have a tutor mark each of the following deliverables during the lab:**
1. [Pledge of academic integrity](#pledge-of-academic-integrity)
2. Complete your [personal journal](#personal-journal) for Week 1
3. [Complete the HelloWorld example in the ANU Linux VDI](#helloworld-vdi)
4. [Complete the HelloTutor JavaFX test in the ANU Linux VDI](#hellotutor-vdi)
5. [Complete the HelloWorld example on your computer](#modify-helloworld-home)
6. [Complete the HelloTutor JavaFX test on your computer](#hellotutor-home)

We want you to do this *now*, in Week One, so that you can focus on course content from the first day of Week Two rather than be distracted by concerns over how the tools work.
This lab is your chance to learn how to use the tools with the course tutors' assistance.
Please make the most of this opportunity.

We have created a step-by-step [video](https://cs.anu.edu.au/courses/comp1110/help/mp4/lab1.mp4) showing you how to complete this lab in the lab environment.

## Tasks


### Set up GitLab

0. **Install and launch the ANU Linux VDI**

   Follow the instructions on the course web page for [installing the RSCS VDI](https://cs.anu.edu.au/courses/comp1110/help/05-working-remotely/#linux-labs-vdi).   You need to log in to the VDI to complete the lab successfully.

1. **Set up your GitLab account.**

   You will use GitLab throughout the semester to manage all of your coursework.

   First, you need to set up your GitLab account. Open a browser (you can do this either on your computer or within the VDI---it may be easier to do it in your computer), and go to GitLab http://gitlab.cecs.anu.edu.au (ensure that
   you remember the .cecs. in the URL).
   Log in to GitLab using the **ANU ID** tab of the **Sign in** section of the front page with your student ID and your ANU password.

2.  **Fork the comp1110-labs repository.**

    In Git jargon, to [*fork*](http://docs.gitlab.com/ee/gitlab-basics/fork-project.html) a repository means to create a copy of the repo with a different owner.
    You and every other student will fork the course labs repo to create your own version.
    You can't push changes to the course repo (only the lecturer can do that), but you can push changes to your forked repo.

    To fork the repo, go to the GitLab page for the labs [https://gitlab.cecs.anu.edu.au/comp1110/comp1110-labs](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-labs).
    Notice that the text at top-centre is "comp1110 > comp1110-labs", which tells you that the owner is the group "comp1110", and that the repository is called "comp1110-labs".
    Click ![Fork button](../../../assets/icon-fork.png) **Fork** (upper centre-right).
    You may be asked to select which namespace to use; select your own account.

    You now have your own forked copy of the labs repo.
    Notice that the name at top-centre has changed to show that you own this new repo.
    It should now say something like "Your Name > comp1110-labs".
    The text below tells you where this new repo came from ("Forked from comp1110-labs").
    You will make changes to this copy of the course repo to complete this week's lab and all future labs.

    So far, your repo exists only on GitLab (in "the cloud").
    Soon you will make a working copy (a *clone*) that you can edit on the lab computer.
    Later you can do the same on your own computer.
    Although you might have multiple clones of your repo on different devices, the *definitive* version always resides on GitLab.

    At the end of this lab, you can repeat this process for the [homework](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-homework)
    and [assignment 1](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass1) repos.

3.  **Find this document within your labs repo.**

    You should now be looking at the project page for your own fork of the comp1110-labs project (you will see "Your Name > comp1110-labs" at top-centre of your GitLab page in your browser).
    If not, you can navigate there via your Projects dashboard (select the **GitLab** button in the navigation bar).
    You can filter the list of projects to show only Personal projects that you own.

    Once you are at the project page for your fork, scroll down below the brown horizontal line, and you'll see the contents of your repository.
    Navigate to your own version of *this* document within your repository select **src/comp1110**, and then **lab1**.
    A list of files inside the directory should be shown at the top, followed by your own copy of this document.  
    If you're in any doubt about which version of the document you're looking at, check the text at top-centre, and you should see your name followed by a ">" and then "comp1110-labs".
    You can also check the URL, which should be something like:
    `https://gitlab.cecs.anu.edu.au/u1234567/comp1110-labs/tree/master/src/comp1110/lab1`.

4. **Find Open Issues**

   We will use *Issues* throughout the semester to help assign and track work.
   Click ![Issues navigation bar button - coffee cup](../../../assets/icon-issues-navigation-bar.png) **Issues** in the navigation bar (to the right of the search bar) to view the issues dashboard.
   You will probably have zero open issues, as you have not yet assigned any issues to yourself.

   After exploring this dashboard, return to your fork of the labs project.

5. **Assign issues to yourself**

   Select ![Issues sidebar button - coffee cup](../../../assets/icon-issues-sidebar.png) **Issues** in the sidebar to see the list of issues associated with this project.
   These are the lab tasks you'll complete throughout this semester.
   Scroll down to find **Issue #1**, which refers to the task you are completing now.

   These issues are currently "unassigned" (no one is yet responsible for them); you need to assign them all to yourself.
    1. Click the **Edit issues** button in the top right, next to the bright green **New issue** button. A new panel will appear on the right which allows you to modify the assignee, status, milestones, labels, and subscriptions associated with the issue.
    2. In the upper-left corner of the list of issues, click the checkbox to select all the issues.
    3. Use the **Assignee** drop-down menu on the right to assign the issues to yourself, and apply this change by pressing the **Update all** button at the top of the panel.
       (When using GitLab, you may experience delays due to system load, particularly when modifying large numbers of issue assignments.
       Please be patient throughout the semester.)

   You should now see this assignment reflected in the number of open issues shown in green on the issues button on the top navigation bar.

You can use issues to track your work and milestones, and once you start your group project, you may use issues to assign tasks among your team.
You can continue this lab exercise either by continuing to read through the web page or by working through the issues (which point to the same info).

### Pledge of Academic Integrity

Before you continue, check again that you are reading these instructions from your own fork of the labs (you will see "Your Name > comp1110-labs" at top-centre of your GitLab page in your browser).
If not, repeat the step above, or ask for help.

Now navigate to the [pledge of academic integrity](Integrity.md).
You need to sign the pledge with your name, University ID, and date.

Click on the **Edit** button at top-right of the document.
At the bottom of the pledge, replace `<your name>` with your name (it needs to match your Gitlab username), `<your uid>` with your UID, and replace `<today's date>` with today's date in <yyyy-mm-dd> format.
Change the **Commit message** to read "Completed pledge", then select **Commit changes**.

### Continuous Integration

The change you just committed started a checking process on the GitLab server called *Continuous Integration* (CI).
CI is widely used in software development to automate checks for correctness and ensure that code changes do not (re)introduce known bugs.

Return to your comp1110-labs project page, where you should see ![CI running icon - small blue clock](../../../assets/icon-ci-running.png) **Pipeline: running** at upper right, which indicates that your change is being checked.
After a while, it should change to ![CI warning icon - orange circle with exclamation mark](../../../assets/icon-ci-warning.png) **Pipeline: passed**.
If you made an error filling out your information, it might change to ![CI failed icon - red circle with cross](../../../assets/icon-ci-failed.png) **Pipeline: failed**.
Click on that symbol now, and you should see what GitLab is doing to check your work.
You will see a pipeline with three phases: "Validate" (which checks your integrity statement), "Build" (which compiles your code), and "Test", which runs tests against many of the lab exercises (which you have not yet
started).
You should see ![CI passed icon - green circle with checkmark](../../../assets/icon-ci-passed.png) **validate - passed** and ![CI passed icon - green circle with checkmark](../../../assets/icon-ci-passed.png) **build - passed**.
If so, you can now select ![Repository sidebar button - file](../../../assets/icon-repository-sidebar.png) **Repository** in the sidebar, to go back to reading the instructions and browsing the repo.
If not, you should click on ![CI failed icon - red circle with cross](../../../assets/icon-ci-failed.png) **validate/build - failed** to discover what the problem was and then go back and fix up your pledge of integrity.

The fact that you have not completed the "Test" stage is not a problem right now; you'll complete some parts in this lab, and others in the weeks to come.

We will use CI throughout this course, so you should make a habit of checking whether your work passed CI.
You will be graded on the automated tests that you pass (for example, in your assignments).

### Personal Journal

Check again that you are reading this from your own fork of the labs.

Navigate to your [personal journal](journal.md), and read through the instructions in the file.

This week, you will complete your journal during the lab.
From Week 2 onwards, you will need to complete, commit, and push your
personal journal *at least 5 minutes before your lab*. Your tutor
will review your journal in your weekly lab.

Your journal should be *thoughtful* and *concise*.

Click on the **Edit** button at top right, and then scroll down the file to the table.

* In the first column next to Week 1, respond to the statement "Overall, I am happy with how this course is going for me" with a number from 1 to 5 (`1` strongly disagree, `2` disagree, `3` neutral, `4` agree, `5` strongly agree).

* This week, you can skip the second column, which asks about group work.
  You will complete it from Week 4 onwards.

* In the third column, in *just a few words*, write what you've *already done* for the course this week.
  This could be about the homework you have completed/attempted, concepts you have studied or practised, work you have done for assignments.
  Be honest about the work you have done.
  The journals are a useful tool for *you* to keep track of your progress in this course, be self-reflective, and make sure you stay on top of the material.

* In the fourth column, in *just a few words*, write what you *will do* for the course in the week to come.
  This could be: reviewing material, completing homework exercises, completing a section of an assignment.
  This could also be "I will discuss concept x with a tutor" or "I will ask my assignment group for help with completing this section".
  Remember: there are a lot of [people and resources that can help you](https://cs.anu.edu.au/courses/comp1110/help/) in understanding the course material.
  If you need help, ask!

* In the last column, in *just a few words*, write any *impediments* you see to you achieving your goals (from the previous column).
  An impediment is an obstacle or issue which is stopping you from progressing comfortably through the course.
  This could be having trouble with understanding a particular concept, timing issues, or more specific problems that have come up when completing homework/assignments ("there is a problem when I try to run program A").
  The more specific you are, the better.
  It is easier to fix a list of small problems than one big problem ("it's all too hard!").

Be sure to *stick to the table format*, keeping your responses for each week to a single row (no line breaks).

At the bottom of the page, change the commit message to `Completed journal Week 1!` and select **Commit changes**.
Check the CI result for any errors.

### Clone Your Repository

Earlier, you browsed your fork of the repository using the GitLab web interface.
In this part of the lab, we'll use Git to create a *clone* (local copy) of your lab repository.
Git is a [distributed Version Control System (VCS)](https://en.wikipedia.org/wiki/Distributed_version_control), a software tool used to manage different versions of a project which can be distributed across many locations and people.
Although Git has a [command-line interface](https://git-scm.com/book/en/v2/Getting-Started-The-Command-Line), IntelliJ includes a Git plugin that supports all the functionality you'll need in this course.

You can simply follow the instructions below, but if you'd like to understand more about Git we encourage you to read the section on [Basic Git Concepts](#basic-git-concepts) at the end of this document.

On the left of the VDI desktop window, you should see a square menu with the letters **IJ**.
Use this to start IntelliJ.
(If this is the first time you have started IntelliJ on the lab machines,  the initialization process may make the startup a little slow.)
You should now see a splash screen titled "Welcome to IntelliJ IDEA".

Select **Get from VCS** on the initial IntelliJ splash screen.
Use your browser to navigate to your GitLab project page, then select the **Clone** button to reveal the HTTPS and SSH URLs for your repo.
Copy the URL for HTTPS (**Clone with HTTPS**), which should be something like `https://gitlab.cecs.anu.edu.au/u1234567/comp1110-labs.git` (you can [configure IntelliJ](https://www.jetbrains.com/idea/help/using-git-integration.html) to use SSH rather than HTTPS, but that is outside the scope of this lab).
Paste the URL into the IntelliJ dialogue, and press **Clone**.
You will be prompted for your username and password, and a checkbox will ask if you would like IntelliJ to remember the password.
IntelliJ will also ask whether you wish to [set up a master password](https://www.jetbrains.com/idea/help/handling-passwords-for-git-remote-repositories.html#d686468e18637).
The choice is yours, but having IntelliJ remember the password and protect it with a master password is convenient and secure.

IntelliJ may take a minute or so to initialize the project.
Check the status bar at the bottom of the window; if it says "Indexing...", you should wait until that is complete before proceeding with the rest of the lab.

You can have multiple clones (for example, one in the ANU lab environment and one on your laptop), but the definitive version is *always* the one in GitLab.
To keep everything synchronized, after editing your local version, you should always *push* your changes back to GitLab. Conversely, you need to *pull* changes from GitLab before you start work on a different clone of the repo.


### Set up JDK in IntelliJ

Press `Alt+1` to open the comp1110-labs project (if it is not already open), or select the **Project** tab at the left of the window.
You should now see the directory structure for the project.

Now we'll run the unit tests for Lab 1.
The **Run Configuration** menu is at the top middle-left next to the ![build button - green hammer](../../../assets/intellij-icon-build.png) **Build** button.
From this menu, select `L1 HelloWorldTest`, and then click ![run button - green triangle](../../../assets/intellij-icon-run.png) **Run** to run the set of tests for Lab1.
At the bottom of the window, you should now see the message:
`java.lang.NoClassDefFoundError: comp1110/lab1/HelloWorld`, indicating that you've not yet created the code that IntelliJ is trying to test.
That's OK - the next task solves this problem.

However, you may instead see an error message that says "Cannot start compiler: the SDK is not specified...".
If you see this, select **Configure...**, which will bring up the Project Structure dialogue, which you can also reach from the **File** menu.
You'll see that the Project SDK is marked as either "invalid" or "No SDK".
If Java version 15 is available, select it and click **OK**.
Otherwise, select **Add SDK > JDK...** to select the location of your Java installation.
On the lab machines, it should direct you to `/usr/local/openjdk`.
Once that is highlighted, press **OK**.
Finally, click **OK** in the project structure dialogue.
You should now be able to run `L1 HelloWorldTest`.

### HelloWorld (VDI)

Do the following task in the VDI.

1. **Add a new class**

   In the left-hand navigation panel, open the blue `src` folder.
   Continue to navigate to `comp1110` and `lab1`.
   Inside that folder, you'll see `README.md`, which is a copy of this file, the lab instructions.
   While the `lab1` folder is selected, right-click on it and select **New...**, then choose **Java class**.
   Name the class `HelloWorld` (be careful with the spelling, including the upper case `W`).
   You will be asked whether you would like to add the class to Git; select **Add**.
   (*Consider the [discussion of Git concepts](#basic-git-concepts) below: why is IntelliJ asking you this? What does adding the file do? Why might you not want to add the file? If you say no, but change your mind later, how can you add the file?)*

2. **Add the main method for your class**

   You should now see a very simple piece of code.
   Click your mouse to the left of the closing brace (`}`), which is just below the word `public`.
   Type the letters `psvm`, and you should find an IntelliJ dialogue that recognizes this as a shortcut for a `main()` method declaration.
   Pressing enter will cause IntelliJ to generate a *main method* for your class, the code that will be run by default when your class is executed.
   Right now the method is empty, so it will do nothing.

3. **Add code to print out `Hi`**.

   Type `sout`, which is another IntelliJ shortcut, this time for
   producing code for printing strings.
   Press enter, which generates the code `System.out.println()`.
   This will print a new line containing what is between the brackets (currently, nothing!).
   Move your cursor between the brackets and add the text `"Hi"` (including the
   quotes).
   Save your file (either via the **File** menu or by typing `Ctrl+S`).
   From the **Run** menu, select **Run... > HelloWorld** to run your program.
   In the bottom panel of IntelliJ, you should see your program's output (the word "Hi" in black text).

4.  **Test your program**

    Run the tests again: select `L1 HelloWorldTest` from the **Run Configuration** menu and then click ![run button - green triangle](../../../assets/intellij-icon-run.png) **Run**.
    Look carefully at the output.
    It should state that it has `failed: 6 of 6 tests`.
    Look more carefully at the brownish text below, and you'll discover what's wrong with your code.

5. **Debug your program**

   Change your program so that it prints `Hello`.
   Read the comments and names of the tests you just failed - which ones are you now expecting to pass?
   Re-run the test, and you should find that you failed fewer tests.
   Try again with `Hello world`, and then finally with `Hello world!`.
   You should pass all tests.
   Notice that the testing is *very* pedantic.
   You need to have the correct number of spaces, correct punctuation, correct case, etc.
   There are many debugging strategies and tools which can help you identify the location of issues in your code.
   These include breakpoints and code step-through, print statements, writing or modifying test cases, code walkthroughs and peer review etc.
   As we progress through the labs, we will explore some of these strategies.
   For now, it is sufficient to use the provided tests to assess and debug your code.

### HelloTutor (VDI)

We will now set the path variable `PATH_TO_FX` to point to the JavaFX install location, which will allow you to run graphical programs including the `HelloTutor` example.

1. Select **File > Settings...** and then **Appearance and Behaviour > Path Variables**.
   (These instructions vary according to which OS you're using; see IntelliJ [documentation](https://www.jetbrains.com/help/idea/configuring-project-and-ide-settings.html#access-project-settings) for OS-specific info.)
2. Click ![add button](../../../assets/icon-add.png) **Add** in the bottom left of the window.
3. In the **Name** field enter `PATH_TO_FX` .
4. In the **Value** field, select ![browse button - folder](../../../assets/icon-browse.png) **Browse** and navigate to
   the `lib` subdirectory of the JavaFX installation.
   On the lab computers, this is `/usr/local/openjfx/lib`.
   On your home computer, this will be the install location you chose for JavaFX.
5. Press **OK** to confirm.
6. Now select the `HelloTutor` program from the **Run Configuration** menu and click ![run button - green triangle](../../../assets/intellij-icon-run.png) **Run**.
   If JavaFX is correctly configured, you should see a little window pop up.

If after following the above steps and reading the [instructions for working remotely](https://cs.anu.edu.au/courses/comp1110/help/05-working-remotely/#javafx) the program will still not execute, please seek help from your peers and your tutor.

Once you're able to run the program, please modify the source code of `HelloTutor` to correctly show your tutor's name in the title and in the text label visible in the displayed window.

Take a screenshot of your HelloTutor application window and save it as `HelloTutor.png`.
Add it to your IntelliJ project in the `src/comp1110/lab1` directory (alongside `HelloTutor.java`).

### Finishing Up

To finish up with the VDI, you need to commit and push your work and then close the associated issues.

1.  **Commit and push to Gitlab**

    Once you have completed your work on the lab computer, you should commit your new `HelloWorld` class, as well as your changes to `HelloTutor` and your `HelloTutor.png` screenshot, and push them all to GitLab.
    In the  **Git** menu, select **Commit...**.
    You should see that the default changelist contains your changed `HelloWorld`, `HelloTutor`, and `HelloTutor.png` files.
    Below the list of files is the commit message panel.
    Change the commit message to `Finished lab exercises and passed all tests!`, then click **Commit and Push**.
    Ignore any warnings, and click **Push** on the next dialogue. You
    should see a small notification stating that the push was
    successful.

    Now go to your GitLab page.  Click the `Commits` tab, and you should see the commit you just made.
    This means that the change you made in IntelliJ has been committed and propagated into GitLab.
    You will now see the result of that change on other devices whenever you clone and pull from GitLab.

    You should now check whether your commit passed CI.
    On the GitLab web page, select ![CI/CD sidebar button - rocket](../../../assets/icon-ci.png) **CI / CD** from the sidebar and then select your commit.
    You should see that the "Validate" and "Build" phases passed and that "Test > lab1" also passed.

2. **Close Issues**

   You can now close each of the issues that you've completed.
   On the GitLab web page, in the navigation bar, click on ![Issues navigation bar button - coffee cup](../../../assets/icon-issues-navigation-bar.png) **Issues**.
   Again, check that you are looking at your own GitLab page by checking your name at the top-centre and your UID in the URL for the repo.
   For each of the issues you've completed, click on the issue.
   You will see the history of the issue, then a text box where you can write a brief message to indicate that you've finished it (e.g. "All done, completed without any problems").
   Click **Comment & close issue** once your message is complete.
   If you don't see any issues, go [back](#set-up-gitlab) to the first task and check that you *assigned* the issues to yourself correctly.

   By default, GitLab only shows *open* issues, so once you've closed them, they'll disappear.
   However, you can list *all* issues or the *closed* ones by selecting the appropriate tab.

### Set up IntelliJ (Home)

You now need to configure your home computer.
Before you start, you must have [set up the software for your home computer](https://cs.anu.edu.au/courses/comp1110/help/05-working-remotely/).

Once you have the software installed, you will need to repeat the following steps on your home computer:
1. [clone your labs repo](#clone-your-repository);
2. [set up the JDK in IntelliJ](#set-up-jdk-in-intellij); and
3. [set up JavaFX in IntelliJ](#hellotutor-vdi).

Note: when you clone your labs repo for the second time, you will see the HelloWorld class you already created in the lab environment.

### Modify HelloWorld (Home)

1. In IntelliJ on your own computer, go to your comp1110-labs project, and
   navigate to `HelloWorld`.
2. Check that `HelloWorld` runs correctly (use the **Run** menu), and that it passes all tests, just as it did in the [earlier exercise](#helloworld-vdi).
3. Modify `HelloWorld` so that it prints out `Goodbye World`.
   Confirm that it no longer passes the tests.
4. Commit your change.  Use a commit message such as "Broke program".
5. Fix your program so that it works correctly.
6. Commit your change.  Use a commit message such as "Fixed program".
7. *Push* your commits if you have not already done so (select **Git > Push...**).

### HelloTutor (Home)

1. Follow the [instructions for working remotely](https://cs.anu.edu.au/courses/comp1110/help/05-working-remotely/#javafx) to install and configure JavaFX on your home computer.
2. In IntelliJ on your home computer, open the comp1110-labs project and navigate to `HelloTutor`.
3. Check that the class compiles and runs and that the application window appears correctly.

If after carefully following the instructions, the class will not run, please seek assistance from your peers, your tutor, or the class forum.

There is no need to make any modifications to this program; just check that `HelloTutor` runs correctly.
   We will be coming back to JavaFX later in the semester.

### Have Your Lab Marked

Once you have completed the tasks for the lab, ask your tutor to mark the following items:
* Your signed pledge
* Your completed Week 1 journal entry
* Your work on the VDI
* Your work on your home computer (including the Git log that shows your work)

### Accessing Homework and Assignment Repos

You should fork and clone the [homework](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-homework) and [assignment 1](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass1) repositories in the same way as you did for the labs repo, above.

---
## Basic Git Concepts

* **Repository**:
  A Git repository contains a collection of files which are managed by Git and the complete history of changes to those files.

* **Fork**:
  If you are not the owner of a repo, you will need permission from the original creator of the repo to make changes.
  (If this were not the case, what could prevent you from accessing the `comp1110-labs` repo and deleting this exercise?)
  To *fork* a repo is to make a copy of the repo, under a namespace that you control.
  This gives you full control over the new copy of the repo.
  Later in the course, we will see that we can give others privileges to a repo so that they can make changes without having to make their own fork.

* **Clone**:
  You can directly edit files in your repositories on GitLab using your web browser, but imagine trying to program using that interface!
  Instead, we want to make a *local copy* of a repo and make changes as we see fit using our software development tools.
  By cloning a repo, we download the latest version of the repo from the cloud (i.e. GitLab) to our computer.
  As we make changes, we can use the below operations to track these changes and upload them back to the GitLab version.

* **Add**:
  To *track* a file means that Git will notice changes in the file and warn you if you have not committed these changes.
  By default, Git doesn't know which files you do and don't want to track.
  
  Let's say you have cloned a repo, and you want to add a `README` file.
  You create the file using a text editor and save it.
  The file now exists locally on your computer, but Git is not yet tracking it.
  You can use IntelliJ's Git menu or a terminal window to tell Git to track the file by using the add command (`git add README`), after which Git will listen for changes to the file.

  You can also [exclude files from Git tracking using a `.gitignore` file](https://git-scm.com/docs/gitignore).
  For example, you may not want to track configuration files which are specific to your home computer.
  In fact, when you create a Git repo using IntelliJ, it will automatically generate a `.gitignore` file which excludes its own configuration files!

  In summary, when you create a new file that you want Git to track, you must remember to add it to your Git repo.

* **Commit**:
  A commit is like a savepoint for your project.
  One of the magical features of Git is that you can return, at any time, to any commit point in the history of the project.
  So commit regularly!
  
  Continuing the example of our `README` file: assume you have created and added the file.
  You now want Git to save the state of the file, so you would use IntelliJ's Git menu or the terminal to commit the file (`git commit -m "my commit message" README`).
  As you can see from this command, commits require a message to describe the changes.
  Commit messages are very important.
  Think about looking back on your work a year later - what would be helpful to you?
  You might like to know what the changes you made were, why you made them (if it's not obvious), or the project's state after the commit.
  Having informative commit messages makes it easier to look back through the history of a project and find useful points to [checkout](https://git-scm.com/docs/git-checkout) or [cherry-pick](https://git-scm.com/docs/git-cherry-pick) from.

  A common mistake is to think that because a commit has been made,  this commit is now uploaded.
  Commits are entirely local, and the changes are not uploaded to `GitLab` until you **push** them (see below).
  This is useful since when we are working offline, we might need to make savepoints of our files and manipulate commits without interrupting the working release version available to others on `GitLab`.

  In summary, committing is the act of saving the state of your repo, and giving a description to this saved state.
  Once a change is committed, it is ready to be pushed.

* **Push**: Pushing is the act of taking one or multiple changes (commits) made to the repo, each labelled with a commit message, and copying these changes to another version of the repository (such as the one on GitLab).
  You can only push if Git confirms that there are no pending changes to tracked files which have not been committed.
  This rule is enforced because Git wants to be sure that when a push is made, the states of the local version and the uploaded version are consistent (with the exception of untracked files).
  
  To continue our example of `README`, assume that you realize that you made a mistake in your first change and want to fix the file.
  You make the changes locally using a text editor, then commit these new changes.
  The new commit does not overwrite the previous commit and its state; it just adds a further change to the history.
  You can now push the current state of your repo to the online version.
  
  When you push, you need to push to a target [remote](https://git-scm.com/book/en/v2/Git-Basics-Working-with-Remotes) repository and target
  [branch](https://git-scm.com/book/en/v2/Git-Branching-Branches-in-a-Nutshell).
  By default, these will be `origin` and `master` respectively.
  Don't worry too much about remotes and branches for the moment, these will
  be explained as we progress throughout the course.
  For now, remember that pushing (`git push README`) is the act of taking a savepoint and uploading it to the online version of the repo.

* **Pull**:
  Let's say that you want to share the work you are doing with someone else.
  You have made a git repo, and have added your friend with the correct privileges so that they can edit files on your repo.
  You send them the URL for your Git repo, and they clone this repo.
  Notice that, in this case, your friend does not need to fork the repo first, since they actually want to work on **your** copy of the repo, so that you can collaborate!
  Let's assume your friend doesn't like your (rushed) version of the `README`, so they decide to change it.
  They open a text editor, change the file, and commit their changes with a helpful commit message, explaining the changes and why they were made.
  Note that they did not need to add the file, since it was already being tracked by Git.
  They push their commit to your fork of the repository.
  
  The next time you work on the project, your first step should be to make sure that your local version of the repo matches the online version.
  To do this, you use a git pull, which applies any new commits available online to your local version of the repo.
  Just like a push, a pull requires you to specify a [remote](https://git-scm.com/book/en/v2/Git-Basics-Working-with-Remotes) and a [branch](https://git-scm.com/book/en/v2/Git-Branching-Branches-in-a-Nutshell).
  After pulling, you will see the changes made by your friend.
  This is the basis of collaboration in Git!
  
