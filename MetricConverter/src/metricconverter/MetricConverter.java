/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metricconverter;

/**
 *
 * @author Administrator
 */
public class MetricConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        
        double meters = 0;
        double miles;
        double feet;
        double inches;
        
        System.out.println("What is the your distance in meters?");
        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
        }
        else
        {
            System.out.println("That is not a valid input!");
        }
        miles = meters / 1609.344;
        System.out.println("That diatsnce in miles is: " + miles);
        feet = meters / 3.2808399;
        System.out.println("That distance in feet is: " + feet);
        inches = meters / 39.3700787;
        System.out.println("That distance in inches is + inches");
    }
    
}
