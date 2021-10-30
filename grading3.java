
package assignment;


public class grading3 {
    public static void main(String args[]){

    System.out.println("----Choose option ------ ");
        System.out.println("1:- Marks between 0-25");
        System.out.println("2:- Marks between 25-45");
        System.out.println("3:- Marks between 46-50");
        System.out.println("4:- Marks between 51-60");
        System.out.println("5:- Marks between 61-80");
        System.out.println("6,7,8,9:- Marks between 80 above");
        
        int marks=7;
        switch(marks){
            case 1:
                System.out.println("Grade: F");
                break;
            case 2:
                System.out.println("Grade: E");
                break;
            case 3:
                System.out.println("Grade: D");
                break;
            case 4:
                System.out.println("Grade: C");
                break;
            case 5:
                System.out.println("Grade: B ");
                break;
            case 6:
            case 7:
            case 8:
           case 9:
                        
            System.out.println("Grade: B");
           break;
           default:
         System.out.println("NOT FOUND!!!");
    
}
    }
}
        