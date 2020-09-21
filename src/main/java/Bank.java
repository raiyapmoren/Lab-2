/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raisa
 */
import java.util.Scanner;

public class Bank {
    public static void main( String [] args ) {
       
        //Scanner
        
       Scanner keyboard = new Scanner( System.in );
       System.out.println( "How many checks were written for the month? " );
       int check = keyboard.nextInt();
       double charge = 0;
       if(check<20)
           charge = .10; 
       else if(check<40)
           charge = .08;
        else if(check<60)
           charge = .06;
        else 
            charge = .04;
       
       System.out.println("Total Service Fee: "+((check*charge)+10));
           
        
        
       
    }
}
