
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
public class lab_6_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n=input.nextInt();
        int[] a=new int[n];
         System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
        }
        System.out.println("enter position :");
        int p=input.nextInt();
        
        for (int i = (p-1); i <(a.length-1); i++) {
            a[i]=a[i+1];
        }
        for (int i = 0; i < (a.length-1); i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
