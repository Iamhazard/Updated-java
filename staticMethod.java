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
public class staticMethod {
    static void add(int a, int b) // "static keyword"- method
     {
         int sum = a+b;
         System.out.println(sum);
     }
     //main method..
     public static void main(String[] args)
     {
         add(3, 7);//---->using"static keyword" DON'T NEED OBJECT--
     }
    }
    

