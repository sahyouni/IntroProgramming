
/**
 * class CommissionSales info
 *
 * @author Cherry Cui
 * @version 2020-02-14
 */

public class CommissionSales {

   // Symbolic Constants - make all private
   private static final double RATE_A = 0.05;
   private static final double RATE_B = 0.10;
   private static final double RATE_C = 0.13;
   private static final double RATE_D = 0.18;
   private static final double RATE_E = 0.22;
   private static final int DIVISION_FACTOR = 10000;
   private static final int AMOUNT_MAX = 59999;

   
   //the below are not used
   private static final int AMOUNT_LEVEL_A_MAX = 19999;
   private static final int AMOUNT_LEVEL_B_MAX = 29999;
   private static final int AMOUNT_LEVEL_C_MAX = 39999;
   private static final int AMOUNT_LEVEL_D_MAX = 49999;

   // Attributes
   private String salesPersonName;
   private int salesAmountInCAD;
   private double payInCad;

   /**
    * Constructor for objects of class CommissionSales
    */
   public CommissionSales(String inputSalesPersonName, int inputSalesAmountInCAD) {

      if (inputSalesPersonName == null) {
         throw new IllegalArgumentException("sales person name cannot be null");
      }

      if (inputSalesAmountInCAD <= 0 || inputSalesAmountInCAD > AMOUNT_MAX) {
         throw new IllegalArgumentException("sales amount must be positive and no more than " + AMOUNT_MAX);
      }

      salesAmountInCAD = inputSalesAmountInCAD;
      salesPersonName = inputSalesPersonName;
   }

   public CommissionSales() {
      salesPersonName = "unknown";
   }

   /**
    * Accessors
    * 
    * @return sales person name
    */
   public String getSalesPersonName() {
      return salesPersonName;
   }

   /**
    * Accessors
    * 
    * @return sales amount in CAD
    */
   public int getSalesAmountInCAD() {
      return salesAmountInCAD;
   }

   /**
    * Accessors
    * 
    * @return pay in CAD
    */
   public double getPayInCad() {
      return payInCad;
   }

   /**
    * Mutators
    * 
    * @param inputSalesPersonName to set sales person name
    */
   public void setSalesPersonName(String inputSalesPersonName) {
      if (inputSalesPersonName == null) {
         throw new IllegalArgumentException("sales person name cannot be null");
      }
      salesPersonName = inputSalesPersonName;
   }

   /**
    * Mutators
    * 
    * @param inputSalesAmountInCAD to set sales amount in CAD
    */
   public void setSalesAmountInCAD(int inputSalesAmountInCAD) {
      if (inputSalesAmountInCAD <= 0 || inputSalesAmountInCAD > AMOUNT_MAX) {
         throw new IllegalArgumentException("sales amount must be positive and no more than " + AMOUNT_MAX);
      }
      salesAmountInCAD = inputSalesAmountInCAD;
   }

   /**
    * Method - calculatePay
    * 
    * @return sales person's pay
    */
   public double calculatePay() {
      int value = salesAmountInCAD / DIVISION_FACTOR;

      switch (value) {

         case 0:
            payInCad = RATE_A * salesAmountInCAD;
            break;
         case 1:
            payInCad = RATE_A * salesAmountInCAD;
            break;
         case 2:
            payInCad = RATE_B * salesAmountInCAD;
            break;
         case 3:
            payInCad = RATE_C * salesAmountInCAD;
            break;
         case 4:
            payInCad = RATE_D * salesAmountInCAD;
            break;
         case 5:
            payInCad = RATE_E * salesAmountInCAD;
            break;
         default:
            payInCad = 0;
            System.out.println("the sales amount is either invalid or out of the acceptable range");

      }
      return payInCad;

   }

   /**
    * Method to display details
    * 
    */
   public void displayDetails() {
      System.out.println("Sales Person Name: " + salesPersonName);
      System.out.println("Sales Amount In CAD: " + salesAmountInCAD);
      System.out.println("Pay Amount : " + calculatePay());
   }
}
