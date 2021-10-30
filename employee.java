/*
 the this keyword refers to the current object in a method or constructor.

The most common use of the this keyword is to eliminate the confusion between class attributes and 
parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).
If you omit the keyword in the example above, the output would be "0" instead of "5".
 */
package BCA.keyword;

public class employee {
    String name;
    int id;
   
    employee(String name,int id)
    {
        this.name=name;
        this.id=id;
        
    }
      // display method.
    void display()
    {
        System.out.println(name +"   "+ id);
        
    }
    //main method
    public static void main(String[] args)
    {
        employee e1 =new employee("aayush",1);
        employee e2 =new employee("sandip",23);
        e1.display();
        e2.display();
    }
    
    
    
}
