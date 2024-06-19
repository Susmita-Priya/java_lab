
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
public class lab_2_3 {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number of minutes :");
        int m=input.nextInt();
        int y=m/525600;
        int d=(m%525600)/1440;
        System.out.println(m+" is approximetly "+y+" years and "+d+" days ");
    }
}
