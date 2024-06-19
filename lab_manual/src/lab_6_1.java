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
public class lab_6_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=input.nextInt();
        int[] a=new int[n];
        int sum=0;
        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
            sum=sum+a[i];
        }
        System.out.println("array elements :");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if(i<(n-1))
            {
                System.out.print(",");
            }
        }
        System.out.println("");
        System.out.println("sum is "+sum);
         }
                
}
