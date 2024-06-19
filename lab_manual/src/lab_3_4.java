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
public class lab_3_4 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your score :");
        double g=input.nextDouble();
        if(g<0 || g>100)
            System.out.println("Invalid input !!");
        else if(g>=90 &&g<=100)
        {
            System.out.println("A");
        }
        else if (g>=80&& g<90) {
            System.out.println("B");   
        }
        else if (g>=70&& g<80) {
            System.out.println("C");   
        }
        else if (g>=60&& g<70) {
            System.out.println("D");   
        }
        else if (g>=0&& g<60) {
            System.out.println("F");   
        }
    }
}
