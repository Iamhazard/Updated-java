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
public class passingbyreference {
     int data = 50;//instance variable /globale variable
            

    void add(passingbyreference p)
            //class type^       ^object //passing object
    {
        p.data = p.data + 10; //able to access and can change
    }
    public static void main(String[] args)
    {
        passingbyreference p = new passingbyreference();
        System.out.println(p.data);//before change data or origine data
        p.add(p); //-->"Refefence"= help passing object
        System.out.println(p.data); //changed data
    }
}


