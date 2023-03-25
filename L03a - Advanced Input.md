# Advanced Input

```java
import java.util.Scanner;
 
class Main {
    public static void main(String args[])
    {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
 
        String phrase = in.nextLine(); //Reads a String value from the user
        System.out.println("You entered string: " + phrase);
 
        int num = in.nextInt(); //Reads a int value from the user
        System.out.println("You entered integer: " + num);
 
        float dec = in.nextFloat(); //Reads a float value from the user
        System.out.println("You entered float: " + dec);

        boolean bool = in.nextBoolean();  //Reads a boolean value from the user
        System.out.println("You entered boolean: " + bool;
        
        double dec2 = in.nextDouble();	//Reads a double value from the user
        System.out.println("You entered float: " + dec2);

    }
}
```

There are times when we need to have different data types inputted for our variables. That is when we would use a stronger inputting tool called: ```Scanner```.

## Important Notes

```import java.util.Scanner;```

> You must import the scanner tool at the top of your program.

```Scanner in = new Scanner(System.in);```

> You must create a scanner variable.

## SOURCES
- w3schools -- [https://www.w3schools.com/java/java_user_input.asp](https://www.w3schools.com/java/java_user_input.asp)

## [Curiculum Document Reference](https://www.edu.gov.on.ca/eng/curriculum/secondary/computer10to12_2008.pdf)
- __B2.3:__ write keyboard input and screen output statements that conform to program specifications