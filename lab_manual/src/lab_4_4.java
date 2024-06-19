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
public class lab_4_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number series and press 9999 for stop");
        int n,sum=0,c=0;
        while(true)
        {
            n=input.nextInt();
            if(n==9999)
            {
                break;
            }
            else
                c++;
            sum=sum+n;
        }
        double avg=sum/c;
        System.out.println("Avg = "+avg);
    }
}
