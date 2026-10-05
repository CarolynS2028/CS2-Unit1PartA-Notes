/*

This is my comment space!
------------------------------
Algorithm: a step by step proccess to accomplish a task.
Pseudocode: simplified code to outline programs/algorithms
   ex: add func()
      num1
      num2
      1 + 2
      1 + 2 prints
Sequencing: order of steps 
------------------------------
What is the difference between Javascript and Java?
   Java is a coding language that helps build complex applications like desktop software, mobile apps, and video games while JavaScript is a front-end programming language that adds the interactivity to website/ web pages. JavaScript is more lightweight compared to Java.
-----------------------------
Notes

Object-oriented Programming: programming built on classes and objects
Class: blueprint of an object
   - no memory
Object: actual implementation
   - sorted memory
Method: reusable chunk of code that accomplishes an action
   - main() entry point to our code
*We code in a IDE with a complier 
Compiler: translates our Java to binary
*Every action in java ends with a ";"

*/

// line comment *




/*

Primitive Type: storing simple information/data (ex. int x = 5;)
Object (Reference) Type: storing complex data/objects (ex. Creature cat = new Creature())

Primitive Variable Types to Know:
1. int: stores integers/positive or negative whole numbers
2. double: store decimal numbers (ex. double x = 50;)(ex. double y = 4.25;)
3. boolean: stores logic (only two options are True or False)

Object Variable Type to Know:
1. String: stores text (ex. "5.0", "Hello World!")


Setting Up Variables In Code:
1. Declare Variable --> int x; String name;
2. Assign Variable --> x = 5; name = "Ms. Dinko"



Or Do it in One Step!
3. Initialize Variable --> int x = 5; String name = "Ms. Dinko"

*/

public class Main {

   public static void main(String []args) {
      /* System.out.println("Hi there!");
      System.out.println("Hi there!");
      System.out.println("It makes no sense to divide a number by zero!");
         // declare a variable
      double myGradeAverage;
       // assign a value
      myGradeAverage = 95.0;
      // initialize a variable --> declare and assign in one statement
      double myDreamGrade = 100;

      // we can format strings using concatenation
      System.out.println("My current grade is: " + myGradeAverage);
      // print statement for ideal grade 
      System.out.println("My ideal grade is: " + myDreamGrade);
      System.out.print("Hi ");
      System.out.print("there");
      System.out.print("!");
      // printing a quote using an escape sequence
      // escape sequences always use a \
      // \n gives a new line
      // we use \\ to actually print one
      System.out.println("My teacher \\always says,\n\"Study for your test!\"");
      System.out.println("My teacher \\always says, \n\"Study for your test!\". I listened and got a " + myDreamGrade);

      // arithmetic operations (+ - * /)
      // working with only ints, output will be int
      // int / int does TRUNCATING DIVISION removes the decimal,does not round 
     // System.out.println(5 * 10);
      // if we want to divide and get a decimal, we need to divide with a double
      // System.out.println(19/10.0);
     // System.out.println(10 + 12.0);
      // % gives us the remainder
     // System.out.println(12%10); 
 */

     // int myNum = 7;
     // int newNum = myNum; 
     // newNum = 8;

     
      // incrementing variable
     // myNum = myNum + 1;
     // myNum = myNum + 1;
     // myNum++;
     // System.out.println(myNum);
     // System.out.println(newNum);



     /* Lesson 1.5 Notes - Casting
     Casting allows us to change from one data to another
     
     We cast usuing a "Cast Operator" written in () before our expression */

      double doubleNum = 5.0;
      System.out.println((int) doubleNum / 2);

      // cast from a double to an int, it will truncate our double
      // casting from an int to a double will just add .0 to the end
      System.out.println((int) 4.3);
      System.out.println((double) 8);

   double number;    // positive value from somewhere
   double negNumber; // negative value from somewhere

      number = 4.9;
      negNumber = -3.6;

   int nearestInt = (int)(number + 0.5);
   int nearestNegInt = (int)(negNumber - 0.5);

   // 1) declare and initialize grades
 int grade1 = 85;
 int grade2 = 90;
 int grade3 = 64;

 int sum = grade1 + grade2 + grade3;

// 3) declare average as double
 double average = ((double) sum / 3);

System.out.println(average);



   }
}
