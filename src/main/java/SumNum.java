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
public class SumNum {
    public static void main( String [] args ) {
        Scanner scanner = new Scanner( System.in );
        int Number = -1;
        int sum = 0;
       
        while( Number < 1 ){
        System.out.println( "Please enter a positive non-zero integer" );
        Number = scanner.nextInt();
        }
      for( int num = 1; num <= Number; num++ ){
        sum = sum + num;
        }
      System.out.println( "The sum of numbers from 1 to " + Number + " is " + sum );
                
    }
}
