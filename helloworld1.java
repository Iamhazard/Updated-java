/*
 ata type:
a.primitive  b.non-premitive
1.byte: smallest type data type:8bits,-128 to 127
2.short: 16bits
3.int: 32bits
4.long: 64bits
5.float: 32bits ,decimal values
6.double: 64 bits ,stores more decimal values
7.charecter:16bits
8.boolean:1bits ,(true or false)

keywords vs identifiers
kw= reserve words used by java.e.g: class,void,int..
ident= class names and other words declared by user..

varibles
de: address of a memory.
= varible a b of some data types:
=int a;
decl/init..
dynamic init...
*types:
1.local: used in the declared method only....
2.instance: above method and below class,used through out the class except in static method(if used then object should be formed)...
3.static/class: declare in static which can be accessed/used through out the class without use of object, memory management.....
 */
package Chap2;

public class helloworld1 {
     public static void main(String agrs[])
    {
        byte b = 12; //assigned values are called literals....
        short sh = 345;
        int a = 1234456;
        int c;//declaration.....
        c = 52;//initialization...
        long lighttravell = 123456789;// l can be and cannot be witten...
        float pi = 3.14f;// f must be include to value...
        double d = 1234.142;// d can be and cannot be written...
        char section = 'a';
        boolean t =false;
        
        //varibles...
        
        int f=4, r=5;
        int e = f^r;//dynamic initialization....
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(r);
        System.out.println(lighttravell);
        System.out.println(pi);
        System.out.println(section);
        System.out.println(t);
        System.out.println(sh);
        
        
        
    }
}
