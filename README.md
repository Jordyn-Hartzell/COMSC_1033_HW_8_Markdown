# COMSC_1033_HW_8_Markdown 

## Introduction

# Code
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
This is an example of what will run when all answers are correct.
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

# Code: Random Character Program

## Console

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
I tried to commit again, and this time it worked.
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
```
E:\Jordyn_CS1_Workspace\Jordyn_Hartzell_Homework_8>
