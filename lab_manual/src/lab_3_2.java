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
public class lab_3_2 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year");
        int y=input.nextInt();
        if(y%400==0)
        {
            System.out.println("Leap Year");
        }
        else if(y%4==0 && y%100!=0)
        {
            System.out.println("Leap Year");
        }
        else
            System.out.println("Not Leap year");
    }
}
