 /*
 nested if 
 */
package Chap2;


public class nestedif {
 public static void main(String args[]){
     
 {
     int x=13;
     if(x>12)
     {
         if (x%2==0)
         {
       System.out.println("X is greater than 12 and even number");
     }
     else
     {
     System.out.println("X is greater than 12 and odd number");
     }
     }
     else 
     {
      System.out.println("x is small tha 12");
     }
   }
}
  }