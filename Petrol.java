/**
 *program that replace how much you can drive in miles with 1 gallon
 to how much liters you need to drive 100km
 * author: Matan Cohen
 * Date:22/03/2020
 **/
import java.util.Scanner;
public class Petrol
{
    public static void main(String [] args)
    { 
        final int MAX = 100;
        final double ONE_MILE_IN_KM = 1.609;  
        final double ONE_GALLON_IN_LITERS = 3.785; 
        
        System.out.println("Please enter the car's petrol consumption measured in miles/gallon:");
                            
        Scanner scan = new Scanner(System.in);
        double milesPerGallon = scan.nextDouble();
        
        //calculation section
        double calculatedIndex = 100 / (milesPerGallon * ONE_MILE_IN_KM) * ONE_GALLON_IN_LITERS;//the calculation
        double rounding = Math.round(calculatedIndex * MAX) / (MAX * 1.0);
          
        System.out.println("The car's petrol consumption converted to litres/100km is:\n" + rounding); 
    }//end of method   
}//end of class Petrol
