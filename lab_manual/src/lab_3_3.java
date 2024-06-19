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
public class lab_3_3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 4 point (a,b) and (x,y)");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double x=input.nextDouble();
        double y=input.nextDouble();
        double d=Math.sqrt(((a-x)*(a-x))+((b-y)*(b-y)));
        if(d==0)
            System.out.println("No circle!! How can i calculate the area?!");
        else{
            double r=d/2;
            double area=Math.PI*r*r;
            System.out.println("area is "+area);
        }
    }
}
