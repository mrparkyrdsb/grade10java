# Data & Variables in Java
## A Basic Java Program w/ Variables
```java
class Main {
    public static void main(String[] args) {
        int age = 31;
        float temp = -2.5f;
        double large_decimal = 12345.6789;
        char grade = 'A';
        String name = "Mr. Park";
        boolean working = false;

        System.out.println("Age: " + age);
        System.out.println("Current Outside Temperature: " + temp);
        System.out.println("Large Decimal:" + large_decimal);
        System.out.println("Letter Grade: " + grade);
        System.out.println("Name: " + name);
        System.out.println("Are they working?: " + working);
    }
}
```
## The Five Data Types
In Java Programming, there are many datatypes we can work with. We will be analyzing 6 different datatypes.

### Integer : ```int```
Integer helps us to represent integer values in our program. 

The ```int``` data type can store whole numbers from -2147483648 to 2147483647. We can use these values to do arithmetic operations.

### Decimals : ```float```

The ```float``` data type allows us to represent decimal based numbers. The values must end with a letter ```f```. Example: ```float pi = 3.14f;```

### Longer Decimals : ```double```

The ```double``` data type also allow us to represent decimal based numbers. The big difference between ```double``` and ```float``` is that a ```double``` variable is able to contain a larger value than ```float```.

### Text : ```String```
The ```String``` data type is used to store a sequence of characters (text). String values must be surrounded by double quotes.

### Single Character : ```char```
The ```char``` data type is used to store a single character. The character must be surrounded by single quotes, like ```'A'``` or ```'c'```.

### True & False Values : ```boolean```

For this, Java has a boolean data type, which can only take the values ```true``` or ```false```.

> __FUN FACT:__ boolean was named after a mathematician named [George Boole](https://en.wikipedia.org/wiki/George_Boole)

## Variables

Variables are labelized containers that helps to hold data in programming. The variables have labels so that we can reference them in our code. We can also update variables, create variables, and manipulate variables to help our code have functionality.

### Variable Formatting
```java
DATATYPENAME variable_label = VALUE;
```

All variables must have an explict datatype stated, given a label name, and assigned a value. It must also have a semi-colon to end the line.

### Variable Naming Conventions
1. start with lowercase letters
2. labels that have multiple words are either ```camelCased``` or use ```under_scores```
3. labels cannot be the same as the [built-in keywords](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html) in Java
4. labels should not be ambiguous ```String a = "Park"``` is less descriptive than ```String last_name = "Park"```

## Data Type and Their Storage Size
| Data Type | RAM Storage Size         |
| --------- | ------------------------ |
| int       | 32 bits                  |
| float     | 32 bits                  |
| double    | 64 bits                  |
| char      | 16 bits                  |
| string    | depends on String object |
| boolean   |  1 bit                   |

## SOURCES
- w3schools -- [https://www.w3schools.com/java/java_data_types.asp](https://www.w3schools.com/java/java_data_types.asp)