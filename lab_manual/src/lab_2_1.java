/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.*;
public class lab_2_1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius :");
        double r=input.nextDouble();
        double p,a;
        p=2*Math.PI*r;
        a=Math.PI*r*r;
        System.out.println("Perimeter is "+p);
        System.out.println("Area is "+a);
    }
}
