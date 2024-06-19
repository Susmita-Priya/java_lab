
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class lab_2_4 {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 3 numbers :");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double d=b*b - 4*a*c;
        double rt=Math.sqrt(d);
        if(d>0)
        {
            System.out.println("The equation has 2 real root : ");
            double r1= (-b+rt)/(2*a);
            double r2= (-b-rt)/(2*a);
            System.out.println(r1+","+r2);
            System.out.printf("%.4f",r1);
        }
        else if(d==0)
        {
            System.out.println("The equation has 1 real root : ");
            double r= -b/(2*a);
            System.out.println(r);
        }
        else
        { 
            System.out.println("The equation has no real root");
        }
    }
}
