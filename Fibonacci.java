/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praktikum
 */
import java.util.Scanner;

public class Fibonacci {
   int hasil[];
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the value of n: ");
       int n = s.nextInt();
       fibonacci(n);
   }

   public static void fibonacci(int n) {
      hasil=ne wint[n];
       if (n == 0) {
           System.out.println("0");
       } else if (n == 1) {
           System.out.println("0 1");
       } else {
           int a = 0;
           int b = 1;
           for (int i = 1; i < n; i++) {
               int nextNumber = a + b;
               hasil[i]=nextNumber;
               a = b;
               b = nextNumber;
           }
           for(int i=n; i>0; i++)
           {
              System.out.println(hasil[i]);
           }
           System.out.prinln("1 0");
       }
   }
}
