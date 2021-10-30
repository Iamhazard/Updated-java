// cONSTRUCTOR//
// THis KEYword is used in 3 place 1.variables,2.constructor,3.String //
package Chap2;
public class student {
    String sName;
    int sRol;
     student(String name,int rol)
    {
       sName=name;
       sRol=rol;
        
    }
     //display method
     void display()
     {
         System.out.println(sName +"" + sRol);
    
}
    // main method
    public static void main(String[]args)
    {
        student s1=new student("Aayush ",1);
    s1.display();
    }
            
    
}
    

