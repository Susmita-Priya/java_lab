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
public class lab_5_4 {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("Enter any interger numbert :");
        int n=input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0||i==(n-1)||j==0||j==(n-1))
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
  
}
