package exercises;

import java.util.Scanner;

public class YetAnotherExercises {

//Write a program called Add2Integers that prompts user to enter two integers.
// The program shall read the two integers as type int; compute their sum; and print the result.

    public Integer Add2Integers(){
        Scanner scanner=new Scanner(System.in);
        Integer sum;
        System.out.print("Please enter first");
        Integer a= scanner.nextInt();
        System.out.print("Please enter second");
        Integer b=scanner.nextInt();
        sum=a+b;
        System.out.println("Suma"+sum);
        return sum;
    }
    //Write a program called OddEven that prompts user for an integer.
    // The program shall read the input as an int; and check if the integer is odd or even.

    public Integer OddEven(){
        System.out.println("Enter number");
        Scanner scanner=new Scanner(System.in);
        Integer number= scanner.nextInt();
        if(number%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
        return number;

    }
    //Write a program called Multiple that prompts user for 2 integers.
    // The program shall read the inputs as int; and check if the first integer is a multiple of the second integer.

    public void Multiple(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter first");
        Integer a= scanner.nextInt();
        System.out.print("Please enter second");
        Integer b=scanner.nextInt();
        if(a%b==0){
            System.out.print(a+"is multiple of"+b);
        }else{
            System.out.print(a+"is not multiple of"+b);
        }

    }

}
