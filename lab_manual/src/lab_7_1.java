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
public class lab_7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of student : ");
        int n=input.nextInt();
        int[] s=new int[n];
        int best=Integer.MIN_VALUE;
        System.out.println("Enter elements :");
        for (int i = 0; i <n; i++) {
            s[i]=input.nextInt();
            if(s[i]>best)
            {
                best=s[i];
            }
        }
        int a=best-10,b=best-20,c=best-30,d=best-40;
        for (int i = 0; i < n; i++) {
            if(s[i]>=a)
            {
                System.out.println("Student "+i+" Score is "+s[i]+" and grade is A");
            }
            else if(s[i]>=b&&s[i]<a){
                System.out.println("Student "+i+" Score is "+s[i]+" and grade is B");
            }
             else if(s[i]>=c&&s[i]<b){
                System.out.println("Student "+i+" Score is "+s[i]+" and grade is C");
            }
             else if(s[i]>=d&&s[i]<c){
                System.out.println("Student "+i+" Score is "+s[i]+" and grade is D");
            }
             else{
                System.out.println("Student "+i+" Score is "+s[i]+" and grade is F");
            }
        }
    }
}
