/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIDTERM;

import java.util.Scanner;

public class Lab_Act3_Palindrome {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.print("Please enter a word: ");
        String word = s.nextLine();

        String reversed = "";

        for (int e = word.length() - 1; e >= 0; e--) {
            reversed += word.charAt(e);
        }

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word.toUpperCase() + " is a palindrome");
        } else {
            System.out.println(word.toUpperCase() + " is NOT a palindrome");
        }
    }  
}
