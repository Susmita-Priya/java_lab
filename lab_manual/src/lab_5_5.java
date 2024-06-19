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
public class lab_5_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any interger numbert :");
        int n=input.nextInt();
        int k=0;
        if(n%2==0)
        {
            k=n;
        }
        else
            k=(n/2)+1;
        for (int i = 0; i < k; i++) {
            for (int j = (k-1); j >i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i < k; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = k; j >i; j--) {
                System.out.print("*");
            }
            
            for (int j = k; j > (i+1); j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
