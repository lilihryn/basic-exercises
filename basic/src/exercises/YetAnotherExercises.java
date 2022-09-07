package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class YetAnotherExercises {

//Write a program called Add2Integers that prompts user to enter two integers.
// The program shall read the two integers as type int; compute their sum; and print the result.

    public Integer Add2Integers() {
        Scanner scanner = new Scanner(System.in);
        Integer sum;
        System.out.print("Please enter first");
        Integer a = scanner.nextInt();
        System.out.print("Please enter second");
        Integer b = scanner.nextInt();
        sum = a + b;
        System.out.println("Suma" + sum);
        return sum;
    }
    //Write a program called OddEven that prompts user for an integer.
    // The program shall read the input as an int; and check if the integer is odd or even.

    public Integer OddEven() {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        return number;

    }
    //Write a program called Multiple that prompts user for 2 integers.
    // The program shall read the inputs as int; and check if the first integer is a multiple of the second integer.

    public void Multiple() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first");
        Integer a = scanner.nextInt();
        System.out.print("Please enter second");
        Integer b = scanner.nextInt();
        if (a % b == 0) {
            System.out.print(a + "is multiple of" + b);
        } else {
            System.out.print(a + "is not multiple of" + b);
        }

    }

    //Write a program called SumProductMinMax3 that prompts user for three integers. The program shall read the inputs as int;
// compute the sum, product, minimum and maximum of the three integers; and print the results.
    public void SumProductMinMax3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first");
        Integer a = scanner.nextInt();
        System.out.print("Please enter second");
        Integer b = scanner.nextInt();
        System.out.print("Please enter third");
        Integer c = scanner.nextInt();
        Integer sum = 0;
        Integer product = 0;
        Integer min = a;
        Integer max = b;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("The minimum is" + min);
        if (a > max) {
            max = a;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The maximum is" + max);
        sum = a + b + c;
        product = a * b * c;
        System.out.println("The sum of integers: " + sum + "The product: " + product);
    }

    //Write a program called PrintDayInWord that prompts user for an integer 0, 1, 2, ..., 6, or other.
// The program shall read the input as int;
// and print "Sunday", "Monday", ..., "Saturday", or "Not a valid day", respectively.
// You are required to use a "nested-if" statement in this program.
    public void PrintDayInWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first");
        Integer dayNumber = scanner.nextInt();
        if (dayNumber == 0) {
            System.out.println("Sunday");
        } else if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Friday");
        } else if (dayNumber == 6) {
            System.out.println("Saturday");
        } else if (dayNumber == 7) {
            System.out.println("Not a valid day");
        } else {
            System.out.println("Enter from 0 to 7");
        }
    }

    //Write a program called PrintNumberInWord that prompts user for an integer 0, 1, 2, ..., 9, or other.
    // The program shall read the input as int; and print "ZERO", "ONE", "TWO", ..., "NINE", or "OTHER", respectively.
    // You are required to use a "switch-case" statement in this progr
    public void PrintNumberInWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first");
        Integer numberIn = scanner.nextInt();
        switch (numberIn) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 11:
                System.out.println("Other");
                break;
            default:
                System.out.println("bye");
        }
    }
    //Write a program called CircleComputation that prompts user for the radius of a circle in floating point number.
// The program shall read the input as double; compute the diameter, circumference, and area of the circle in double;
// and print the values rounded to 2 decimal places. Use System-provided constant Math.PI for pi.
    public void CircleComputation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius");
        Double radius = Double.valueOf(scanner.next());

        Double area = Double.valueOf(Math.PI * radius * radius);
        Double diametr = Double.valueOf(2 * radius);
        Double circumfarence = Double.valueOf(diametr * Math.PI);

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumfarance: %.2f%n", circumfarence);
        System.out.printf("Diametr %.2f%n", diametr);
        //Use System.out.printf() with specifier %.2f to print a double rounded to 2 decimal places; and %n to print a newlin
    }
    public static Integer temp;

    public void SwapIntegers() {
        //Write a program called SwapIntegers that prompts user for two integers.
        // The program shall read the inputs as int, save in two variables called number1 and number2;
        // swap the contents of the two variables; and print the results.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first integer");
        Integer firstInteger = scanner.nextInt();
        System.out.print("Please enter second integer");
        Integer secondtInteger = scanner.nextInt();
        temp=firstInteger+secondtInteger;
        firstInteger=temp-firstInteger;
        secondtInteger=temp-secondtInteger;
        System.out.println(firstInteger);
        System.out.println(secondtInteger);

    }

    public void SumAverage() {
        /*
        Write a program called SumAverage that prompts user for a lowerbound and an upperbound.
        The program shall read the inputs as int; compute the sum (in int) and average (in double) of the running integers from the lowerbound
        to the upperbound (both inclusive);and print the sum (int) and average (double) rounded to 2 decimal places.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first lowerbound");
        Integer lowerbound = scanner.nextInt();
        System.out.print("Please enter second upperbound");
        Integer upperbound = scanner.nextInt();
        Integer sum=0;
        Double average;
        for(int i=lowerbound;i<=upperbound;i++){
            sum+=i;
        }
        average= Double.valueOf(sum/(upperbound-lowerbound+1));
        System.out.printf("Average:%.2f%n",average);
        System.out.println("Sum"+sum);
    }
}
