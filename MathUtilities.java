
/**
 * class MathUtilities here.
 *
 * @author Cherry Cui
 * @version 2020-02-14
 */
public class MathUtilities {

    /**
     * static method power create a method using while loop
     */
    public static int power(int base, int exponent) {
        if (base == 0 && exponent == 0)
            throw new IllegalArgumentException("0 to the power 0 is undefined");

        int count = 1;
        int result = 1;
        while (count <= exponent) {
            result *= base;
            count++;
        }
        return result;
    }

    /**
     * static method calculator create a method to do different kinds of
     * calculations using switch
     */
    public static void calculator(double firstNumber, char operation, double secondNumber) {
        double result = 0.0;
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                // System.out.println("The result of " + firstNumber + operation + secondNumber
                // + " = " + result);
                break;

            case '-':
                result = firstNumber - secondNumber;
                // System.out.println("The result of " + firstNumber + operation + secondNumber
                // + " = " + result);
                break;

            case '*':
                result = firstNumber * secondNumber;
                // System.out.println("The result of " + firstNumber + operation + secondNumber
                // + " = " + result);
                break;

            case '/':
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("The denominator cannot be zero");
                }
                result = firstNumber / secondNumber;

                // System.out.println("The result of " + firstNumber + operation + secondNumber
                // + " = " + result);
                break;

            case '%':
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("The denominator cannot be zero");
                }
                result = firstNumber % secondNumber;

                // System.out.println("The result of " + firstNumber + operation + secondNumber
                // + " = " + result);
                break;
            default:
                System.out.println("The given operation value was invalid.");
        }

        //pulled outside the switch scope because it does not rely on "operation"
        System.out.println("The result of " + firstNumber + " " + operation + " " + secondNumber + " = " + result);
    }

    /**
     * static method sumOddNumbers create a method to sum odd numbers using while
     * loop
     */
    public static double sumOddNumbers(int number) {

        int count = 0;
        int sum = 0;

        if (number < 0) {
            System.out.println("The entered number: " + number + " is negative. Supply a non-negative number");
        } else {
            while (count <= number) {
                if (count % 2 != 0) {
                    sum = sum + count;
                    System.out.println(count + " is an odd number");
                }
                // the below was in both branches. reduce branching
                count++;
            }
            System.out.println("Total sum is: " + sum);
        }
        return sum;
    }

    /**
     * static method displaySquareNumbers create a method to display square numbers
     * using while loop
     */
    public static void displaySquareNumber(int number) {

        int sum = 0;

        int count = 1;
        while (count <= number) {
            sum = count * count;
            System.out.println("the square of " + count + " is： " + sum);
            count++;
        }
    }

    /**
     * static method getFactorial create a method to get factorial result using
     * while loop
     */
    public static void getFactorial(int number) {

        if (number < 0) {
            System.out.println("The factorial of a negative number is undefined.");
        } else {
            int count = 1;
            int fact = 1;
            if (number == 0) {
                fact = 1;
            } else {
                while (count <= number) {
                    fact *= count;
                    count++;
                }
            }
            System.out.println("The factorial of " + number + " is " + fact);
        }
    }
}
