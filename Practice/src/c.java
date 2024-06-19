/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class c {
    int a=0;
    public static void main(String[] args) {
        t1 o1=new t1();
        t2 o2= new t2();
        o1.start();
        o2.start();
        int a[]=new int[9];
    }
}
 class t1 extends Thread{
@Override
public void run(){
             System.out.println("hello1 ");
 }
}
class t2 extends Thread{
@Override
public void run(){
             System.out.println("hello2 ");
 }
}
