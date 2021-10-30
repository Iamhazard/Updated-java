

package filehandling;

public class filehandling1 {
    public static void main(String args[]){
  try{
    int a[]=new int[5];
      a[5]=30/0;
   }
  catch (Arithmetic Execution e)
  {
      System.out.println("task 1 is compeleted"); 
  }
  catch(ArraindexoutofbondsExeception e){
          System.out.println("task 2 is completed");
          }
  catch(Exception e)
          {
          System.out.println("comman task is completed");
          }
  System.out.println("rest of code the code ");
    }
    }
}


