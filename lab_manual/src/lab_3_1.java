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
public class lab_3_1 {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a=input.nextInt();
        int b=input.nextInt();
        if(b==0)
        {
            System.out.println("Error!!can't divided");
        }
        else{
            int q=a/b;
            int r=a%b;
            System.out.println("quotient = "+q+" and reminder = "+r);
        }
        
        
    }
}
