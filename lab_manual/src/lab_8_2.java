
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
public class lab_8_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        String s1=input.nextLine();
        icecream c=new icecream(0);
        c.settype(s);
        c.setcom(s1);
        System.out.println(c.gettype());
        
        icecream[] i=new icecream[5];
    }
}
class icecream{
    private String icecreamtype;
    private String icecreamcompany;
    private double icecreamprice;
    
    public icecream(double p)
    {
        icecreamprice=p;
    }
    void settype(String t){
    icecreamtype=t;
}
    void setcom(String c){
    icecreamcompany=c;
}
  
   public String gettype(){
        return icecreamtype;
    }
   
}
