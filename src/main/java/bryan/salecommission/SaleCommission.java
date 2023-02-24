/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bryan.salecommission;

/**
 *
 * @author EL GUARDIAN
 */
import java.util.Scanner;
public class SaleCommission {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] sales = new double[5];
        int[] Counter = new int[9];
        double commission = 0.09;
        double basePay = 200;

        
        for (int i = 0; i < sales.length; i++) {
            
           int personNum = i + 1;
            System.out.print("Enter the sales for salesperson " + personNum + ": ");
            sales[i] = scanner.nextDouble();
        }

  
        for (int i = 0; i < sales.length; i++) {
            double totalSalary = calcPay(sales[i], commission, basePay);
            int salaryRange = (int) (totalSalary / 100) - 2;
            if (salaryRange < 0) {
                salaryRange = 0;
            } else if (salaryRange > 8) {
                salaryRange = 8;
            }
            Counter[salaryRange]++;
        }

        
        System.out.println("Salary Range\tNumber of Sales within range \n");
       for (int i = 0; i < Counter.length ; i++) {
           int lowerLimit = (i + 2) * 100;
          int upperLimit = lowerLimit + 99;

          
          if (lowerLimit < 1000){
            System.out.printf("$%d-$%d\t\t%d%n", lowerLimit, upperLimit, Counter[i]);
        //   System.out.print("\n" +lowerLimit + "-" + upperLimit + "\t\t\t" + Counter[i]);
          }
            else{
                    
            System.out.printf("$%d+\t\t\t%d%n", lowerLimit, Counter[i]);    
                    
                    
            }
            
        
        
          
          
          
       }
   }

    public static double calcPay(double sales, double commission, double basePay) {
        return basePay + (sales * commission);
    }
}


