/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap2;


import java.util.Scanner;
public class IfElseLadder {
    public static void main(String[] args){
        System.out.println("Enter Month number:");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        String season;
        
        if(month == 12 || month == 1 || month == 2)
        season = "winter";
        
        else if (month == 3 || month == 4 || month == 5)
            season = "Spring";
        else if (month == 6 || month == 7 || month == 8)
            season = "Summer";
        else if (month == 9 || month == 10 || month ==11)
            season = "Autum";
        else 
            season = "Incorrect entry";
        
        System.out.println(season);
           
    }
    
}

   