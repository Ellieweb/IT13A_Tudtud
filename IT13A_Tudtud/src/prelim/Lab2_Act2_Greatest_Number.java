/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelim;

import java.util.Scanner;

/**
 *
 * @author yielc
 */
public class Lab2_Act2_Greatest_Number {
    public static void main(String[] args){
        int l, g, t;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Input the 1st number: ");
        l = in.nextInt();
        System.out.println("Input the 2nd number: ");
        g = in.nextInt();
        System.out.println("Input the 3rd number: ");
        t = in.nextInt();
        
        if (l > g && l > t){
            System.out.println("l is the greatest number");
        } else if (g > l && g > t){
            System.out.println("g is the greatest number");
        } else if (t > l && t > g){
            System.out.println("t is the greatest number");
        }
    }
}
