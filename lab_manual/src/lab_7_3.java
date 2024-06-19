
import java.util.Scanner;

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
public class lab_7_3 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of student : ");
        int n=input.nextInt();
        String[] nm=new String[n];
        double[] s=new double[n];
        double temp=0;
        String nm1=""; 
        System.out.println("Enter names and scores:");
        for (int i = 0; i <n; i++) {
            nm[i]=input.next();
            s[i]=input.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            for (int j = (i+1); j <n; j++) {
               if(s[j]<s[i])
               {
                   temp=s[i];
                   s[i]=s[j];
                   s[j]=temp;
                   
                   nm1=nm[i];
                   nm[i]=nm[j];
                   nm[j]=nm1;
                   
               }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student name = "+nm[i]+" and score = "+s[i]);
        }
    }
    
}
