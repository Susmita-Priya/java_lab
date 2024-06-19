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
public class lab_4_5 {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("Enter number n:");
        int n=input.nextInt();
        System.out.println("Even      Sum");
        int e=2,sum=2;
        for (int i = 0; i < n; i++) {
            System.out.println(" "+e+"        "+sum);
            e=e+2;
            sum=sum+e;
        }
    }
}
