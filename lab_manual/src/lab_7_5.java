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
public class lab_7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of question : ");
        int n=input.nextInt(),c=0;
        char[] ans=new char[n];
        System.out.println("Enter the number of students : ");
        int n1=input.nextInt();
        int[] r=new int[n1];
        char[][] a=new char[n1][n];
        String e=input.nextLine();
        System.out.println("Enter the correct ans of question : ");
        String s=input.nextLine();
        for (int i = 0; i < s.length(); i++) {
            ans[i]=s.charAt(i);
        }
        System.out.println("Enter the ans of student");
        //String e1=input.nextLine();
        for (int i = 0; i < n1; i++) {
            c=0;
            String s1=input.nextLine();
            for (int j = 0; j < s1.length(); j++) {
                a[i][j]=s1.charAt(j);
                if(a[i][j]==ans[j])
                {
                    c++;
                }
            }
            r[i]=c;
            if(r[i]>7)
                System.out.println("Excellent Student "+i);
        }
        
        }
    }
