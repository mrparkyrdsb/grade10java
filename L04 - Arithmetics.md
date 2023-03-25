# Arithmetics in Java

## Math Operators in Java

| Symbols | Operator       | Description |
| ------- | -------------- | -------------------------------------- |
| +	      | Addition	   | Adds together two values               |
| -	      | Subtraction    | Subtracts one value from another       |
| *	      | Multiplication | Multiplies two values                  |
| /	      | Division	   | Divides one value by another           |
| %	      | Modulus        | Returns the division remainder         |
| ++      |	Increment      | Increases the value of a variable by 1 |  
| --      |	Decrement      | Decreases the value of a variable by 1 |

## Code Examples
```java
class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 1;

        int a = x + y;
        System.out.println("Result: " + a); // Expecting 15

        int b = z - y;
        System.out.println("Result: " + b); // Expecting -4

        int c = x * y;
        System.out.println("Result: " + c); // Expecting 50

        int d = x / y;
        System.out.println("Result: " + d); // Expecting 2

        int e = 10 % 3;
        System.out.println("Result: " + e); // Expecting 1 ... remainder of 1
        z++;
        System.out.println("Z: " + z); // Z is now 2

        z--;
        System.out.println("Z: " + z); // Z is now back to 1
    }
}
```

## [Curiculum Document Reference](https://www.edu.gov.on.ca/eng/curriculum/secondary/computer10to12_2008.pdf)
- __B1.4:__ determine the expressions and instructions to use in a programming statement, taking into account the order of operations
- __B2.2:__ use variables, expressions, and assignment statements to store and manipulate numbers and text in a program
