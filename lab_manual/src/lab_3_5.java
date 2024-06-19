/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author HP
 */
public class lab_3_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three inputs : ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        if((a<=b&&a<=c))
        {
            System.out.print("Min = "+a+",");
            if(b<c)
            {
                System.out.println(" Median = "+b+", Max = "+c);
            }
            else
            {
                System.out.println(" Median = "+c+", Max = "+b);
            }
        }
        else if((b<=a&&b<=c))
        {
            System.out.print("Min = "+b+",");
            if(a<c)
            {
                System.out.println(" Median = "+a+", Max = "+c);
            }
             else
            {
                System.out.println(" Median = "+c+", Max = "+a);
            }
        }
        else if((c<=a&&c<=b))
        {
            System.out.print("Min = "+c+",");
            if(a<b)
            {
                System.out.println(" Median = "+a+", Max = "+b);
            }
             else
            {
                System.out.println(" Median = "+b+", Max = "+a);
            }
        }
    }
}
