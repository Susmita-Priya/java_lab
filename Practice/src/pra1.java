/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public abstract class pra1 {
    private static int a;
     private static int b;
     public pra1(int i){
         a=i;
         b=i;
     }
     public pra1[] show(){
         System.out.println(a);
         System.out.println(b);
         pra1[] p0=new pra1[4];
         return p0;
     }
   public static void main(String[] args) {
       //pra1 p=new pra1(9);
       //pra1 p1;
       //p1=p;
       int b[]={1,2,3,4};
       for (int i = 0; i < b.length; i++) {
           System.out.println(b[i]);
        //   p.show();
           String s1="priya";
           String s2="Priya";
           System.out.println(s1.compareTo(s2)); 
       }
   }
}
interface j{
    j(){
        
    }
}

// static class ak extends pb{
////    public static void main(String[] args) {
////        pra1[] a1=ab();
////        // pra1 a2=new pra1(2);
////        // test(a1);
////         //a1.a=8;
////        // a2.a=1;
////         a1[1].test();
////        // System.out.println(a2.a);
////    }
//     public ak(){
//     //super(9);
// }
//     
//    @override 
//    public void test()
//    {
//       // p.a=0;
//        super.test();
//        System.out.println("khjkj");
//    }
//    public static pra1[] ab(){
//        pra1[] obj=new pra1[2];
//       // obj[1]=new pra1(2);
//        return obj;
//    }
//}
//static class pb{
//    pb()
//    {
//        System.out.println("world");
//    }
// public void test()
//    {
//       // p.a=0;
//        System.out.println("hello");
//    }
//}
//}
