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
        public class NewClass {
    public static void main(String [] args ){
{
   int[] stores = new int[5];
Scanner in = new Scanner(System.in);
for(int i = 0; i < stores.length; i++) {
    System.out.println ("Enter today's sales for store " + (1+i) + ": ");
    stores[i] = in.nextInt();
}
for(int i = 0; i < stores.length; i++) {
    System.out.print("Store " + (i+1) + ": ");
    for(int j =0; j < stores[i]; j++) {
        System.out.print("*");
    }
    System.out.println();
}
}
    }
}
