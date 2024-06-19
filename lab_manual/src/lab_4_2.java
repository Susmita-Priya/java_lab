
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
public class lab_4_2 {
      public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any interger number :");
        int n= input.nextInt();
        int j=1,sum=0;
          for (int i = 0; i < n; i++) {
              j=j+i;
              sum=sum+j;
              System.out.print(j);
              if(i<(n-1))
              {
                  System.out.print("+");
              }
          }
          System.out.println(" sum is "+sum);
    }
}
