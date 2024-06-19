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
public class lab_9_1 {
    public static void main(String[] args) {
        account a=new account(1122,20000,4.5);
        a.withdraw(2500);
        a.deposit(3000);
        double amount=a.getmonthlyinterestamount();
        System.out.println(a.id+" "+a.balance+" "+amount);
    }
}
 class account{
    int id;
    double balance;
    double annualinterestrate;
    
    account(){
        
    }
    public account(int i,double b,double a){
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