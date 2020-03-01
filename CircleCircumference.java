/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlecircumference;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class CircleCircumference {
   public static double CircleCircumference(double radius)
   {
       double circumference= Math.PI * 2*radius;
     System.out.println( "The circumference of the circle is:"+circumference);
     
       return 0;
       
   }
 static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Enter the radius: ");
     
      double radius = sc.nextDouble();
 
     
     CircleCircumference(radius);
    
   }
    
}
