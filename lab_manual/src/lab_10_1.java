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
public class lab_10_1 {
    public static void main(String[] args) {
        ArrayList<shape>a=new ArrayList<>();
        int t=3;
        while(t!=0)
        {
            a.add((shape) new area1());
            int s=a.size();
            a.get(s-1).ractanglearea(7, 8);
            t--;
        }
        area1 ak=new area1();
    }
}
interface shape{
    final double area=7;
    public abstract void ractanglearea(int l,int r);
      public abstract void sqrarea(int r);     
}

