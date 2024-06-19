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
public class lab_7_2 {
   static int[] b=new int[100000];   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter intergers ");
        int n,i=0,p=Integer.MIN_VALUE;
        int[] a=new int[100000];
        while(true)
        {
            n=input.nextInt();
            if(n==0)
            {
                break;       
            }
            else{
                a[i]=n;
                if(a[i]>p)
                    p=a[i];
                i++;  
            }
        }
          for(int j=0;j<i;j++){
              b[a[j]]++;
          }
          for(int j=0;j<=p;j++){
              if(b[j]>0){  
                   System.out.println(j+" occurs "+b[j]+" times");
              }
             
          }
    }
}
