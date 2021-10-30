/*
The continue statement breaks one iteration (in the loop), 
if a specified condition occurs, and continues with the next iteration in the loop.
 */
package Chap2;

public class Newcontinue {
     public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 6) {
        continue;
      }
      System.out.println(i);
    }  
  }
}
