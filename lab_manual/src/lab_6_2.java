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
public class lab_6_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n=input.nextInt();
        int[] a=new int[n];
        int max=Integer.MIN_VALUE ,smax=Integer.MIN_VALUE;
        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
            if(a[i]>max){
                max=a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(a[i]>smax && a[i]<max){
                smax=a[i];
            } 
        }
        System.out.println("Maximum : "+max+" , "+"Second maximum : "+smax);
    }
}
