/*
 Short circuit  and (&&)
 */
package BCA;


public class shortcircuit {
    public static void main(String[]args)
    {
        int a =10,b=55,c=20;
        boolean d=(a<b && a<c);//first check A<B if true then only moves to 2nd condition A<C.....
        System.out.println(d);

    }
    
    
}
