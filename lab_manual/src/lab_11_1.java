/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class lab_11_1 {
    public static void main(String[] args) {
        calculator c=new calculator(2,-2);
        c.add();
    }
}
class calculator{
    int a,b;
    public calculator(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void add()
    {
        System.out.println(a+" "+b);
        try{
            if(b<0)
                throw new ArithmeticException();
            else{
                int sum=0;
        sum=a+b;
                System.out.println(sum);
            }
        }
        catch(ArithmeticException e){
            System.out.println("error");
        }
        
    }
}