
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class lab_2_5 {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter center(p,q) :");
        double p=input.nextDouble();
        double q=input.nextDouble();
        System.out.println("Enter radius :");
        double r=input.nextDouble();
        System.out.println("Enter two points(x,y) :");
        double x=input.nextDouble();
        double y=input.nextDouble();
        double d = Math.sqrt(((x-p)*(x-p))+((y-q)*(y-q)));
        if(d>r)
        {
            System.out.println("outside");
        }
        else if(d<r)
        {
            System.out.println("inside");
        }
    }
}
