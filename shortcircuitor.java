/*
short circuit or
 */
package BCA;


public class shortcircuitor {
    public static void main(String[]args)
     {
          int a =10,b=5,c=8;
        boolean d=(a>b || a++<c);//first check A<B if true then autonatically true ,doest check 2nd conditon.....
        boolean e=(a>b | a++<c);// check both conditions simultaniously....
        System.out.println(d);
        System.out.println(e);
     }
    
}
