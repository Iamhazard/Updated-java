/* It is used to "jump out" of a switch statement.

The break statement can also be used to jump out of a loop.*/
package Chap2;


public class Newbreak {
    public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
      if (i == 4) {
        break;
      }
    }  
  }
}
