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
public class thiscon {
    thiscon(char c)
    {
        System.out.println("c");
    }
    thiscon(int a)
    { 
        this('v');
        System.out.println(a);
        
    }
    public static void main(String[] args)
    {
        thiscon c =new thiscon(9);
    }
}
