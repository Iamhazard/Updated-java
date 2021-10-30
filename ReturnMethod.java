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
public class ReturnMethod {
   
  int add(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]) {
       ReturnMethod r = new ReturnMethod();
       int a = r.add(8, 9);
        System.out.println(a);
    }
}

    
