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
public class lab_8_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        String s1=input.nextLine();
        double d=input.nextDouble();
        Icecream c=new Icecream(s,s1,d);
        String in=c.toString();
        System.out.println(in);
        String h=input.nextLine();
        String s2=input.nextLine();
        String s3=input.nextLine();
        double d1=input.nextDouble();
        Icecream c1=new Icecream(s,s1,d1);
        String in1=c1.toString();
        System.out.println(in1);
        
        boolean b=c.equal(c1);
        System.out.println(b);
    }
}
class Icecream{
     String icecreamtype;
     String icecreamcompany;
     double icecreamprice;
    
    public Icecream(String t,String c,double p){
        icecreamtype=t;
        icecreamcompany=c;
        icecreamprice=p;
    }
   public String toString(){
        String info=icecreamtype+" "+icecreamcompany+" "+icecreamprice;
        return info;
    }
   public boolean equal(Icecream i){
       if(i.icecreamprice==this.icecreamprice){
            return true;
       }
      
       else
           return false;
   }
}