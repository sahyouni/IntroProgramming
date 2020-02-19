class QuickStart {
    public static void main(String[] args) {

      TestMath();

    }


    private static void TestMath(){

        MathUtilities.calculator(5, '+', 10);
        MathUtilities.calculator(0, '+', 0);
        MathUtilities.calculator(-1, '+', -78);

        MathUtilities.calculator(5, '-', 10);
        MathUtilities.calculator(0, '-', 0);
        MathUtilities.calculator(-1, '-', -78);

        MathUtilities.calculator(5, '*', 10);
        MathUtilities.calculator(0, '*', 0);
        MathUtilities.calculator(-1, '*', -78);

        MathUtilities.calculator(5, '/', 10);
       // MathUtilities.calculator(0, '/', 0);
        MathUtilities.calculator(-1, '/', -78);

        MathUtilities.calculator(5, '%', 10);
        //MathUtilities.calculator(0, '%', 0);
        MathUtilities.calculator(-1, '%', -78);


        MathUtilities.sumOddNumbers(5);
        MathUtilities.sumOddNumbers(15);
        MathUtilities.sumOddNumbers(0);
        MathUtilities.sumOddNumbers(-5);


        MathUtilities.displaySquareNumber(-5);
        MathUtilities.displaySquareNumber(5);
        MathUtilities.displaySquareNumber(0);


        MathUtilities.getFactorial(0);
        MathUtilities.getFactorial(1);
        MathUtilities.getFactorial(6);
    }


    private static void TestCommission(){

        CommissionSales sales = new CommissionSales();
        sales.displayDetails();

        // makes too much money
        // sales = new CommissionSales("Dr. Green Thumb", 100000);
        // sales.displayDetails();

        // makes money
        sales = new CommissionSales("Dr. Evil", 59000);
        sales.displayDetails();

        // makes money
        sales = new CommissionSales("Dr. Evil", 29000);
        sales.displayDetails();

        // makes money
        sales = new CommissionSales("Dr. Evil", 10000);
        sales.displayDetails();
    }
}