
package testapp;

import java.util.Scanner;


public class Testapp {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner (System.in);
        
      String name;
      int birthyear;
      
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        
        System.out.print("Enter year of birth: ");
        birthyear = sc.nextInt();
        int age = 20255 - birthyear; 
        System.out.println("Hello "+name+", your age is "+age);
        
        if(age >= 18){
            System.out.println("Votable");
        }else{
            System.out.println("Minority");
        }
        
        
        
        
        
        
    
     
      
    
    }
    
}
