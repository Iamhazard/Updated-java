
package assignment;


public class grading2 {
    public static void main(String args[]){
    int marks=26;
    String Grade = null;
    switch( marks/10) {
  // for > 80
  case 10:
  case 9 :
  case 8:
    Grade= "A";
 break;
 // for 61 to 80   
  case 7:
  case 6:
   Grade = "B";
    break;
   // >51 to 60
  case 5:
    Grade ="C"; 
    break;
    // =>46 t0 <50
  case 4:
    Grade ="D";
    break;
  case 3:
      // >25 to <45
    Grade = "E";
    break;
    // for >=25
  default:
    Grade ="F";
    break;
 }
 System.out.println("Grade = " + Grade);
}  
}