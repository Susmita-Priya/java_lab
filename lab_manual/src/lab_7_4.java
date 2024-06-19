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
public class lab_7_4 {
    public static void main(String[] args) {
        int[] p1=maxi();
//        p1[]=maxi();
        System.out.println("The location of largest element is ("+p1[0]+","+p1[1]+")");
    }

    public static int[] maxi() {
        Scanner input=new Scanner(System.in);  
        System.out.println("Enter the number of row and column :");
        int r=input.nextInt(), c=input.nextInt(),p=0,q=0;
        double max=Integer.MIN_VALUE;
        double[][] a= new double[r][c];
        int[] k=new int[2];
        System.out.println("Enter the elements :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j]=input.nextDouble();
                if(a[i][j]>max){
                    max=a[i][j];
                    p=i;
                    q=j;
                }
            }
        }
       k[0]=p;
       k[1]=q;
       return k;
    }
}
