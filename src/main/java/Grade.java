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
public class Grade {
    public static void main(String[] args) {
       // Scanner
       Scanner scanner = new Scanner( System.in );
       double score1;
       double score2;
       double score3;
       double avgScore;
       System.out.println( "Please enter the first score" );
       score1 = scanner.nextDouble();
       
        System.out.println( "Please enter the second score" );
       score2 = scanner.nextDouble();
       
        System.out.println( "Please enter the third score" );
       score3 = scanner.nextDouble();
       
       avgScore = ( score1 + score2 + score3 ) / 3;
       
       if( avgScore < 60 ){
           System.out.printf( " The average score is: %.0f. That's a grade F", avgScore );
       } else if ( avgScore < 70 ){
                System.out.printf( " The average score is: %.0f. That's a grade D ", avgScore );
       } else if ( avgScore < 80 ){
                System.out.printf( " The average score is: %.0f. That's a grade C ", avgScore );
        } else if ( avgScore < 90 ){
                System.out.printf( " The average score is: %.0f. That's a grade B ", avgScore ); 
         } else if ( avgScore <= 100 ){
                System.out.printf( " The average score is: %.0f. That's a grade A ", avgScore );        
         } else {
             System.out.println( "The average score is " + avgScore + ". That's an invalid everage" );
       }
    } 
    
            
}
