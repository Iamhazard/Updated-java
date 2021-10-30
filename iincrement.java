/*
Bitwise operator...
long ,int ,short ,char ,byte....
(&,|,^,<<,>>) bitwise operator....

 */
package BCA;


public class iincrement 
     
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
     }
    
}
