
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
public class lab_9_2 {    
public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("enter 1 or 2");
        int n=input.nextInt();
        if(n==1){
            account1[] a=new checking[4];
            for (int i = 0; i < 4; i++) {
                a[i].id=input.nextInt();
                a[i].balance=input.nextDouble();
                a[i].annualinterestrate=input.nextDouble();
                a[i].withdraw(input.nextDouble());
                a[i].deposit(input.nextDouble());
                
            }
        }
        else if(n==2)
        {
          account1[] a=new saving[4];
          //saving[] a=new saving[4];
          
            for (int i = 0; i < 4; i++) {
               //  a1=(account1[])a;
                a[i].id=input.nextInt();
                a[i].balance=input.nextDouble();
                a[i].annualinterestrate=input.nextDouble();
                a[i].withdraw(input.nextDouble());
                a[i].deposit(input.nextDouble());
                ((saving)a[i]).getcredit();
            }  
        }
    }
}
 class account1{
    int id;
    double balance;
    double annualinterestrate;
    
    account1(){
        
    }
    public account1(int i,double b,double a){
        id=i;
        balance=b;
        annualinterestrate=a;
    }
    public double getmonthlyinterestrate(){
        double monthlyr=(annualinterestrate/12)/100;
        return monthlyr;
    }
     public double getmonthlyinterestamount(){
        double monthlya=balance*getmonthlyinterestrate();
        return monthlya;
    }
     public void withdraw(double withdraw)
     {
         balance=balance-withdraw;
     }
      public void deposit(double diposit)
     {
         balance=balance+diposit;
     }
      
}
class checking extends account1{
    int limit;
}
class saving extends account1{
    int card_num;
    double credit;
    public double getcredit(){
        credit=balance*3;
        return credit;
    }
}

