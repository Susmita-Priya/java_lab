
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
public class lab_6_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n1=input.nextInt();
        int temp=0,n=n1-1;
        int[] a=new int[n1];
         System.out.println("Enter elements :");
        for (int i = 0; i <=n; i++) {
            a[i]=input.nextInt();
        }
        for (int i = 0; i <=n/2; i++) {
            temp=a[i];
            a[i]=a[n-i];
            a[n-i]=temp;
        }
        for (int i = 0; i <=n; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
