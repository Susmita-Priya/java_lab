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
public class lab_5_1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=input.nextInt();
        int a=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                    System.out.print(a+" ");
                    a++;
                    
            }
            System.out.println("");
        }
    }
}
