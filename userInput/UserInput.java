package userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

      public static void main(String[] args) {

            System.out.println("Enter a number: ");

            // InputStreamReader in = new InputStreamReader(System.in);
            // BufferedReader bf = new BufferedReader(in);

            // int num;

            // try {
            // num = Integer.parseInt(bf.readLine());
            // System.out.println(num);
            // bf.close();
            // } catch (NumberFormatException e) {
            // e.printStackTrace();
            // System.out.println(e);
            // } catch (IOException e) {
            // e.printStackTrace();
            // System.out.println(e);
            // }

            
            // modern way with Scanner
            Scanner sc = new Scanner(System.in);

            int num2;
            try {
                  num2 = sc.nextInt();
                  System.out.println(num2);
                  sc.close();
            } catch (Exception e) {
                  e.printStackTrace();
                  System.out.println(e);
            }

      }
}
