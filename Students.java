/*
 *A Students in Java is a special method that is used to initialize objects. 
*The Students is called when an object of a class is created.
*It can be used to set initial values for object attributes:
*Constructors can also take parameters, which is used to initialize attributes..
 
 */
package Chap2;

/**
 *
 * @author amrit
 */
public class Students {
    Students(String name,int roll)
    {
        System.out.println(name +roll);
        
    }
    // main method
    public static void main(String[]args)
    {
        Students s1=new Students("Aayush ",1);
    
    }
            
    
}
