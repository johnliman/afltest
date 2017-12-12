# AFLTEST

### Exercise 1
 
Consider the following children’s game:

-	n children stand around a circle. 
-	To play the game there needs to be more than 1 child.
-	Starting with a given child and working clockwise, each child gets a sequential number, which we will refer to as it’s id.
-	Then starting with the first child, they count out from 1 until k. The k’th child is now out and leaves the circle. The count starts again with the child immediately next to the eliminated one.
-	k can be larger than or less than the number of children
-	Children are so removed from the circle one by one. The winner is the child left standing last.
 
Write a program, which, when given n and k, returns the sequence of children as they go out, and the id of the winning child. Create any additional classes you need to support the design of your solution.

### Exercise 2
Write a program that will iterate though a sequence of integers starting from 0 up to and including a number that can be passed in and the program will:
-	output the number and “FOO” when the integer is divisible by 3
-	output the number and “BAR” when the integer is divisible by 5
-	output the number and “BAZ” only when the integer is divisible by both 3 and 5
Take into consideration that we might want to add new rules in the future including different numbers, operators and iteration patterns. Create any additional classes you need to support the design of your solution.

### How to Run The Program
The project is build using Maven.

To run the program
1.  Compile ```mvn compile```
2.  Create the jar ```mvn package```
3.  ```java -cp target/my-afl-1.0-SNAPSHOT.jar com.aflmedia.app.App```

The program will run the first exercise then the second exercise.
