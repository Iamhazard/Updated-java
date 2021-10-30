/*
if else if ladder
 */
package Chap2;

public class ifstatement {
    public static void main(String args[])
    {
        int x=79;
       
        if(x>=40 && x<=50)
        {
            System.out.println("Fourth Division");
        }
         else if(x>50 && x<=60)
        {
            System.out.println("Third Division");
        }
          else if(x>60 && x<=70)
        {
            System.out.println("Second Division");
        }
            else if(x>70 && x<=80)
        {
            System.out.println("First Division");
        }
           else if(x>80 && x<=100)
        {
            System.out.println("Distinction ");
        }
        else
        {
            System.out.println("fail");
        }
        
    }
    
   
}
