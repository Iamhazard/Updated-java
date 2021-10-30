/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BCA.keyword;

/**
 *
 * @author amrit
 */
public class parameterizedConstructor {
    

 String name;
    int id;
//==============================================================================    
    parameterizedConstructor(String name, int id)
    {
        this.name = name;
        this.id= id;
    }
    void diplay()
    {
        System.out.println(name+""+id);
    }
//==============================================================================
    public static void main(String args[])
    {
        parameterizedConstructor s1 = new parameterizedConstructor("hazard ",10);
        parameterizedConstructor s2 = new parameterizedConstructor("ramos ",5);
        s1.diplay();
        s2.diplay();
    }
}
