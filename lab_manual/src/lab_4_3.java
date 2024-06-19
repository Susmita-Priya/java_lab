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
public class lab_4_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two interger : ");
        int a=input.nextInt();
        int b=input.nextInt();
        int mul=1;
        for (int i = 0; i < b; i++) {
            mul=mul*a;
        }
        System.out.println(mul);
    }
}
