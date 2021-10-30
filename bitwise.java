/*
Bitwise operator...
long ,int ,short ,char ,byte....
(&,|,^,<<,>>) bitwise operator....

 */
package BCA;

public class bitwise
{
     public static void main(String[]args)
     {
         int a=60; //convert into binary form(60=0011 1100)....
         int b=13; //convert into binary form(13=0000 1101)....
         System.out.println(a&b);//(0000 1100)=12
         System.out.println(a|b);//(0011 1101)=61
         System.out.println(a^b);//(0011 0001)=49
         System.out.println(a<<2);//(1111 0000)=240
         System.out.println(a>>2);//(0000 1111)=15
         
         int i=1;
         System.out.println("i: " +i); // 1
         System.out.println("++i: " + ++i);//pre increment(2)....first increment then print...
         System.out.println("i++: "+ i++);//post increment(2)...first print then increment...
         System.out.println("i: "+ i);// 3
         
         System.out.println("i--:"+ i--);//pre decrement(2)first decrement then print..
         System.out.println("--i"+ --i);//post decrement(2)first print then decrement..
         System.out.println("i: "+i);// 1
     }
}
