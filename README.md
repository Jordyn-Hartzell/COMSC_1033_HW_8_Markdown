# COMSC_1033_HW_8_Markdown 

## Introduction
The programs in this report are both designed to randomly generate characters. The first program is an addition game that asks the user to add two random numbers. The second program will display a randomly generated upper case letter. 
# Code: Addition Game
```java
/*
 * This program will quiz the
 * participant using increasingly
 * difficult addition problems.
 */
import java.util.Scanner;
  public class Jordyn_Hartzell_Homework_6 {
 	public static void main(String[] args) {
 		
 		// Output instructions for quiz
 		System.out.println("Welcome to the addition quiz!");
 		System.out.println("Please input integers only.");
 		System.out.println("Good luck!");
 		
 		// Establish score and difficulty variables
 		int score              = 0;
 		int questionDifficulty = 10;
 		
 		// Establish rounds and increment them
 		for(int round=1; round<5; round++){
 		
 		// Generate random numbers
 		int number1 = (int)(Math.random() * questionDifficulty);
 		int number2 = (int)(Math.random() * questionDifficulty);
 		
 		// Present problem to the user
 		System.out.print("\nWhat integer is " + number1 + " + " + 
 				number2 + "? ");
 		
 		// Prompt user input
 		Scanner input = new Scanner(System.in);
 		int answer    = input.nextInt();
 		
 		// Determine if answer was correct
 		int correctAnswer = number1 + number2;
 		
 		// Establish what to do based on input
 		if(answer == correctAnswer){
 			// Give points
 			score += questionDifficulty;
 			System.out.println("Correct!\nYou've earned " + score + 
 					" points.");
 			// Increase difficulty
 			questionDifficulty *= 10;
 			System.out.println("End of round " + round + ".");
 		}else{
 			System.out.println("Incorrect!\nNo points awarded.");
 			// Output correct answer
 			System.out.println("Correct answer was: " + 
 					correctAnswer);
 			// Lessen the difficulty
 			if(questionDifficulty > 10){
 				questionDifficulty /= 10;
 			System.out.println("End of round " + round + ".");
  			}
 		}
 		}
 		
 		// Output final score
 		System.out.println("\nYour final score is: " + score + "/11110\n");
 		
 		// Output ending message based on score
 		int finalScore = score;
 		if(finalScore == 11110){
 			System.out.println("Congratulations, you are a math genius!");
 			System.out.println("Unless you cheated and used a " +
 					"calculator.");
 			System.out.print("Either way, props!");
 		}if(finalScore == 0){
 			System.out.println("You didn't get any points?");
 			System.out.println("Maybe you should consider using a " +
 					"calculator.");
 	 	}if(finalScore < 11110){
 	 		System.out.print("Better luck next time!");
 	 	}
 	}
}
```

## Console
This is an example of what will run when all answers are correct. The difficulty increases with each question and an increasing amount of points are awarded.
```java
Welcome to the addition quiz!
Please input integers only.
Good luck!

What integer is 4 + 6? 10
Correct!
You've earned 10 points.
End of round 1.

What integer is 30 + 40? 70
Correct!
You've earned 110 points.
End of round 2.

What integer is 103 + 502? 605
Correct!
You've earned 1110 points.
End of round 3.

What integer is 4151 + 1072? 5223
Correct!
You've earned 11110 points.
End of round 4.

Your final score is: 11110/11110

Congratulations, you are a math genius!
Unless you cheated and used a calculator.
Either way, props!
```

This is an example of all incorrect answers. Notice that the difficulty never increases and no points are awarded.
```java
Welcome to the addition quiz!
Please input integers only.
Good luck!

What integer is 4 + 7? 0
Incorrect!
No points awarded.
Correct answer was: 11

What integer is 3 + 9? 0
Incorrect!
No points awarded.
Correct answer was: 12

What integer is 6 + 4? 0
Incorrect!
No points awarded.
Correct answer was: 10

What integer is 0 + 7? 0
Incorrect!
No points awarded.
Correct answer was: 7

Your final score is: 0/11110

You didn't get any points?
Maybe you should consider using a calculator.
Better luck next time!
```

This is an example with a missed answer. The difficulty decreased when the answer was missed, and the points awarded for the next correct answer were lessened along with the difficulty.
```java
Welcome to the addition quiz!
Please input integers only.
Good luck!

What integer is 5 + 2? 7
Correct!
You've earned 10 points.
End of round 1.

What integer is 20 + 9? 19
Incorrect!
No points awarded.
Correct answer was: 29
End of round 2.

What integer is 0 + 0? 0
Correct!
You've earned 20 points.
End of round 3.

What integer is 19 + 23? 42
Correct!
You've earned 120 points.
End of round 4.

Your final score is: 120/11110

Better luck next time!
```
### Command Prompt
This project was done previously and I was happy with my work, so the process for this was just a series of adds and commits to copy the text over.

I added and commited the files that I had updated.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git add .

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git commit -m "Updated the re
adme file"
[master 3895dec] Updated the readme file
 3 files changed, 260 insertions(+), 6 deletions(-)
```
I pushed the changes to the remote repository.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Counting objects: 7, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (7/7), done.
Writing objects: 100% (7/7), 2.86 KiB | 0 bytes/s, done.
Total 7 (delta 1), reused 0 (delta 0)
To https://github.com/Jordyn-Hartzell/COMSC_1033_HW_8_Markdown.git
   6343a71..3895dec  master -> master

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>
```

# Code: Random Character Program
```java
/*
 * This program will generate a random
 * uppercase letter.
 */
public class Random_Char_Project {
	public static void main(String[] args) {
		
		// Establish limits
		int startingNumber = 65;
		int endingNumber   = 90 - 65 + 1;
		
		// Generate random number
		int randomNumber = (int)(startingNumber + Math.random() * endingNumber);
	
		// Output random number as a letter
		System.out.println(randomNumber + " is your random number.");
		System.out.print("Therefore, your letter is " + (char)randomNumber + ".");

	}

}
```
## Console
Several examples of outputs:
```
75 is your random number.
Therefore, your letter is K.

90 is your random number.
Therefore, your letter is Z.

77 is your random number.
Therefore, your letter is M.

82 is your random number.
Therefore, your letter is R.

65 is your random number.
Therefore, your letter is A.
```
### Command Prompt
I started by navigating to the project within my workspace on my thumb drive.
```
E:\Jordyn_CS1_Workspace>cd Jordyn_Hartzell_Homework_8
```
Here I started using the Github commands to synchronize the local and remote repositories.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>echo # COMSC_1033_HW_8_Markdo
wn >> README.md
```
This next commands creates the initial repository.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git init
Initialized empty Git repository in E:/Jordyn_CS1_Workspace/Jordyn_Hartzell_Home
work_8/.git/
```
I added the files to be saved and commited to the changes, but I had not configured my user information yet.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git add .

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git commit -m "First commit"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'Jordyn@Home-Laptop.(none)')
```
I configured my user information.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git config user.email "hartze
llj@student.swosu.edu"

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git config user.name "Jordyn
Hartzell"
```
I tried to commit again with no issues this time.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git commit -m "first commit"
[master (root-commit) 6343a71] first commit
 5 files changed, 36 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 README.md
 create mode 100644 bin/Random_Char_Project.class
 create mode 100644 src/Random_Char_Project.java
```
These two steps finally synched up the local and remote repositories.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git remote add origin https:/
/github.com/Jordyn-Hartzell/COMSC_1033_HW_8_Markdown.git

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git push -u origin master
Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Counting objects: 9, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (8/8), done.
Writing objects: 100% (9/9), 1.23 KiB | 0 bytes/s, done.
Total 9 (delta 0), reused 0 (delta 0)
To https://github.com/Jordyn-Hartzell/COMSC_1033_HW_8_Markdown.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>
```
At this point I decided I needed to work from a new branch to avoid cluttering my master branch so I created a new branch.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git checkout -b dev
Switched to a new branch 'dev'
```
I used the push command to prompt the specific message I needed to allow the remote repository to track the new branch.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

fatal: The current branch dev has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin dev

```
I used the new git push message and my dev branch was ready to go.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git push --set-upstream origi
n dev
Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/Jordyn-Hartzell/COMSC_1033_HW_8_Markdown.git
 * [new branch]      dev -> dev
Branch dev set up to track remote branch dev from origin.

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>
```
I incrementally saved changes along the way.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git add .

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git commit -m "Added variable
s and formula for random letter"
[dev ffaeaf1] Added variables and formula for random letter
 2 files changed, 7 insertions(+), 5 deletions(-)

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Counting objects: 6, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 1.29 KiB | 0 bytes/s, done.
Total 6 (delta 1), reused 0 (delta 0)
To https://github.com/Jordyn-Hartzell/COMSC_1033_HW_8_Markdown.git
   ff1a89a..ffaeaf1  dev -> dev
```
After I was happy with my working code, I switched back to my master branch.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git checkout master
Switched to branch 'master'
Your branch is up-to-date with 'origin/master'.
```
Finally, I merged the working code into my master branch.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git merge dev
Updating 06a561b..ffaeaf1
Fast-forward
 README.md                     |  53 +++++++++++++++++++++++++++++++++++++++---
 bin/Random_Char_Project.class | Bin 400 -> 1087 bytes
 src/Random_Char_Project.java  |  12 +++++++++-
 3 files changed, 61 insertions(+), 4 deletions(-)
```
I did one final add, commit, and push to complete add the working code to the master branch on the remote repository.
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git add .

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git commit -m "Merging dev ch
anges into master"
On branch master
Your branch is ahead of 'origin/master' by 8 commits.
  (use "git push" to publish your local commits)
nothing to commit, working directory clean

E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': jordyn-hartzell
Password for 'https://jordyn-hartzell@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/Jordyn-Hartzell/COMSC_1033_HW_8_Markdown.git
   06a561b..ffaeaf1  master -> master
```
# Summary