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
public class lab_6_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n=input.nextInt();
        int[] a=new int[n+1];
         System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
        }
        System.out.println("enter the the number :");
        int n1=input.nextInt();
         System.out.println("enter position :");
        int p=input.nextInt();
        a[n]=0;
        for (int i = (a.length-1); i >=p; i--) {
            a[i]=a[i-1];
        }
        a[p-1]=n1;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
