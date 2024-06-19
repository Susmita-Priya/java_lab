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
public class Helloworld {
    private static int a;
    private static int b;
    public Helloworld(int x,int y)
    {
        a=x;
        b=y;
    }
    public Helloworld(int i)
    {
        a=i;
        b=i;
    }
    public void show()
    {
        System.out.println(a+""+b);
    }
    public static void main(String[] args) {
        int b[]={1,2,3,4};
        Helloworld s=new Helloworld(1,2);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
            s.show();
        }
    }
  
}
