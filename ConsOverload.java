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
public class ConsOverload {
     int id;
    String name;
    int age;
    
  ConsOverload(int i, String n)
  {
      id = i;
      name = n;
  }
  ConsOverload(int i, String n, int a)
  {
      id=i;
      name = n;
      age = a;
  }
  void display()
  {
      System.out.println(id+" "+name+""+age);
  }
  public static void main(String args[])
  {
      ConsOverload s1 = new ConsOverload(1,"harry kane ",11);
      ConsOverload s2 = new ConsOverload(2," david luiz ",19);
      s1.display();
      s2.display();
  }
}

