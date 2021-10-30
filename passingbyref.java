/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamethod;

/**
 *
 * @author amrit
 */
public class passingbyref {
    int data =50;
    void add(passingbyref p)
    {
       p.data =p.data +10; 
    }
    public static void main(String[] args)
    {
        passingbyref p =new passingbyref();
        p.add(p);
        System.out.println(p.data);
    }
    
}
