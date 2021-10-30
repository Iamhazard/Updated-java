
package javamethod;

/**
 *
 * @author amrit
 */
public class returnmeth {
    int add(int a,int b) // data type lekheo vane return lekhna parxa natara void lekhe pardaiana//
    {
        int sum =a+b;
        return sum;
        
    }
    public static void main(String[] args)
    {
        returnmeth r=new returnmeth();
        int d=r.add(10,20);
        System.out.println(d);
        
    }
}
