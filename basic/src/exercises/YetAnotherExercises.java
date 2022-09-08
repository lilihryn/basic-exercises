package exercises;

import com.sun.jdi.Value;

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
        temp = firstInteger + secondtInteger;
        firstInteger = temp - firstInteger;
        secondtInteger = temp - secondtInteger;
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
        Integer sum = 0;
        Double average;
        for (int i = lowerbound; i <= upperbound; i++) {
            sum += i;
        }
        average = Double.valueOf(sum / (upperbound - lowerbound + 1));
        System.out.printf("Average:%.2f%n", average);
        System.out.println("Sum" + sum);
    }

    public void IncomeTaxCalculator() {
        /*
        The progressive income tax rate is mandated as follows:
         The first $20000 of taxable income is tax exempted; the next $20000 is taxed at 10%; the next $20000 is taxed at 20%;
         and the rest is taxed at 30%. For example, suppose that the taxable income is $85000,
         the income tax payable is $20000*0% + $20000*10% + $20000*20% + $25000*30%.
         Write a program called IncomeTaxCalculator that reads the taxable income (in int).
         The program shall calculate the income tax payable (in double); and print the result rounded to 2 decimal places.
         */
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;
        final int TAX_EMPTED = 20000;
        double taxPayable;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your income");
        int taxableIncome = scanner.nextInt();


        if (taxableIncome <= 20000) {         // [0, 20000]
            taxPayable = 0;
        } else if (taxableIncome <= 40000) {  // [20001, 40000]
            taxPayable = (taxableIncome - TAX_EMPTED) * TAX_RATE_ABOVE_20K;
        } else if (taxableIncome <= 60000) {  // [40001, 60000]
            taxPayable = TAX_EMPTED * TAX_RATE_ABOVE_20K + (taxableIncome - TAX_EMPTED) * TAX_RATE_ABOVE_40K;
        } else {                              // [60001, ]
            taxPayable = TAX_EMPTED * TAX_RATE_ABOVE_20K + TAX_EMPTED * TAX_RATE_ABOVE_40K + (taxableIncome - 3 * TAX_EMPTED) * TAX_RATE_ABOVE_60K;
        }
        System.out.printf("Taxpayable:%.2f%n", taxPayable);//two digits after coma......

    }

    public void PensionContributionCalculator() {
        /*
The pension fund contribution of an employee is mandated as follows:
For employee aged 55 and below, the employee contributes 20% of the monthly salary (subjected to a ceiling stated below) and the employer contributes 17%.
For employee aged above 55 to 60, the employee contributes 13% and the employer contributes 13%.
For employee aged above 60 to 65, the employee contributes 7.5% and the employer contributes 9%.
For employee aged above 65, the employee contributes 5% and the employer contributes 7.5%.
The salary ceiling that attracts contribution is capped at $6000.
In other words, if an employee earns $6800, only $6000 attracts employee's and employer's contributions, the remaining $800 does not.
Write a program called PensionContributionCalculator that reads the monthly salary and the age (in int) of an employee.
Your program shall calculate the employee's, employer's and total contributions (in double); and print the results rounded to 2 decimal places.
         */
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;

        // Declare variables
        // to be input
        int contributableSalary;
        double employeeContribution, employerContribution, totalContribution;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your income");
        int employeeIncome = scanner.nextInt();
        System.out.print("Please enter your age");
        int employeeAge = scanner.nextInt();

        if (employeeIncome <= SALARY_CEILING) {
            contributableSalary = employeeIncome;
        } else {
            contributableSalary = SALARY_CEILING;
        }

        // Compute various contributions in "double" using a nested-if to handle 4 cases
        if (employeeAge <= 55) {
            employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
            employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
            totalContribution = employeeContribution + employerContribution;
            System.out.printf("The employee's contribution is:%.2f%n", employeeContribution);
            System.out.printf("The employer's contribution is:%.2f%n", employerContribution);
            System.out.printf("The total contribution is:%.2f%n", totalContribution);
        } else if (employeeAge <= 60) {
            employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
            employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
            totalContribution = employeeContribution + employerContribution;
            System.out.printf("The employee's contribution is:%.2f%n", employeeContribution);
            System.out.printf("The employer's contribution is:%.2f%n", employerContribution);
            System.out.printf("The total contribution is:%.2f%n", totalContribution);

        } else if (employeeAge <= 65) {
            employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
            employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
            totalContribution = employeeContribution + employerContribution;
            System.out.printf("The employee's contribution is:%.2f%n", employeeContribution);
            System.out.printf("The employer's contribution is:%.2f%n", employerContribution);
            System.out.printf("The total contribution is:%.2f%n", totalContribution);

        } else {
            employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
            employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
            totalContribution = employeeContribution + employerContribution;
            System.out.printf("The employee's contribution is:%.2f%n", employeeContribution);
            System.out.printf("The employer's contribution is:%.2f%n", employerContribution);
            System.out.printf("The total contribution is:%.2f%n", totalContribution);

        }
       /*
       What is a Sentinel Value in Java? Sometimes the endpoint of input data is not known.
        A Java sentinel value can be used to notify the program to stop acquiring input.
        If the input is from a user, the user could enter a specific value to stop collecting data.
        ( For example, -1, where standard input is a positive number ).
        */
    }

    public void SalesTax() {
        /*
        A sales tax of 7% is levied on all goods and services consumed.
        It is also mandatory that all the price tags should include the sales tax.
        For example, if an item has a price tag of $107, the actual price is $100 and $7 goes to the sales tax.
        Write a program using a loop to continuously input the tax-inclusive price (as double);
        compute the actual price and the sales tax (in double); and print the results rounded to 2 decimal places.
        The program shall terminate in response to input of -1; and print the total price, total actual price, and total sales tax.
         */
        // Declare constants
        final double SALES_TAX_RATE = 0.07;
        final int SENTINEL = -1;        // Terminating value for input

        // Declare variables
        double price, actualPrice, salesTax;  // inputs and results
        double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;  // to accumulate


        // Read the first input to "seed" the while loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the tax-inclusive price in dollars (or -1 to end):  ");
        price = scanner.nextDouble();

        while (price != SENTINEL) {
            // Compute the tax
            actualPrice = price / (1 + SALES_TAX_RATE);
            salesTax = price - actualPrice;

            // Accumulate into the totals
            totalPrice += price;
            totalActualPrice += actualPrice;
            totalSalesTax += salesTax;

            // Print results
            System.out.printf("Actual Price is:%.2f%n", actualPrice);
            System.out.printf("Sales Tax is:%.2f%n", salesTax);
            System.out.printf("Total Price is:%.2f%n", totalPrice);
            System.out.printf("Total Actual Price is:%.2f%n", totalActualPrice);
            System.out.printf("Total Sales Tax is:%.2f%n", totalSalesTax);


            // Read the next input
            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
            price = scanner.nextDouble();
            // Repeat the loop body, only if the input is not the sentinel value.
            // Take note that you need to repeat these two statements inside/outside the loop!
        }
        System.out.printf("Total Price is:%.2f%n", totalPrice);
        System.out.printf("Total Actual Price is:%.2f%n", totalActualPrice);
        System.out.printf("Total Sales Tax is:%.2f%n", totalSalesTax);
        // print totals
    }

    public void HarmonicSum() {
        /*
        Write a program that prompts user for the maximum denominator (n).
        The program shall read the input as int; compute the sum of the Harmonic series upto n; and print the result (in full precision).
        The Harmonic Series is:
        Sum = 1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + ..... + 1/n
        You are to compute two sums: from left-to-right and from right-to-left. Also compute their absolute difference.
         */
        // Declare variables
        int maxDenominator;   // to be input
        double sumL2R = 0.0, sumR2L = 0.0, absDiff;
        System.out.print("Enter the maximum denominator");
        // to compute these in "double"
        Scanner scanner = new Scanner(System.in);
        maxDenominator = scanner.nextInt();


        // Prompt and read inputs as "int"


        // Compute sum from left-to-right in "double"
        for (int denominator = 1; denominator <= maxDenominator; denominator++) {
            sumL2R += (double) 1 / (denominator);

            // Take note that int/int gives int.
        }

        // Compute sum from right-to-left in "double"
        for (int denominator = maxDenominator; denominator >= 1; denominator--) {
            sumR2L += (double) 1 / (denominator);

        }

        // Compute the absolute difference in "double"
        absDiff = sumL2R - sumR2L;
        if (absDiff < 0) {
            absDiff = -absDiff;
        }
        System.out.println("The sum from left-to-right is:" + sumL2R);
        System.out.println("The sum from right-to-left is:" + sumR2L);
        System.out.println("The absolute difference is::" + absDiff);

        // Print results in full precision using println()

    }

    public void ComputePIa() {
        /*
        Write a program to compute the value of PI, using the following series:
         PI = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 .....)
         Your program shall prompt the user for the "maximum denominator" used in the computation.
         Display the computed value of PI to 10 decimal places.
         */
        Scanner scanner = new Scanner(System.in);
        int maxDenominator = scanner.nextInt();  // to be input
        double sum = 0.0;


        for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {
            // denominator = 1, 3, 5, 7, ..., maxDenominator
            if (denominator % 4 == 1) {
                // add into sum
                sum=(double) (sum+1/denominator);

            } else if (denominator % 4 == 3) {
                // subtract from sum
                sum=(double) (sum-1/denominator);
            } else {
                System.out.println("impossible - error in logic");
            }
            System.out.printf("The PI computed is:%.10f%n",sum);
        }
    }
}