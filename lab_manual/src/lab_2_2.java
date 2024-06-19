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
public class lab_2_2 {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter any integer number :");
        int a=input.nextInt();
        if(a%2==0 && a%3==0)
        {
            System.out.println("FALSE");
        }
        else if(a%2==0 || a%3==0)
        {
            System.out.println("TRUE");
        }
        else
            System.out.println("FALSE");
    }
}
