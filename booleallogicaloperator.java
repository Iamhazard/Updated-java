/*
 Boolean logicall operator
 */
 package BCA;


public class booleallogicaloperator {
    public static void main(String[]args)
    {
        boolean a=true;
        boolean b=false;
        //or operation...
        boolean c=a|b;
        System.out.println(c);
        //and operation....
        boolean d=a&b;
        System.out.println(d);
        //exclusive or Operator....
        boolean e=a^b;
        System.out.println(e);
        //not operator...
        boolean f= !a;
        System.out.println(f);
        //combine...
        boolean g=(!a&b) | (a&!b);
        System.out.println(g);
        //
        
    }
    
}
