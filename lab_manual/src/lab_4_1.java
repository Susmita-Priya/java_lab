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
public class lab_4_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any interger number :");
        int n= input.nextInt();
        int i,sum=0;
        if(n%2==0)
        {
            i=1;
        }  
        else
        {
            i=0;
        }
        while(i<=n){
            System.out.print(i+"."+(i+1));
        sum=sum+(i*(i+1)); 
        if(i<n-1)
                System.out.print("+");
        i=i+2;
        }
        System.out.println(" Sum of the Series = "+sum);
    }
}
