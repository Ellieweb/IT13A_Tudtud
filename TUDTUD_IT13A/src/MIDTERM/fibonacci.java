/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIDTERM;

/**
 *
 * @author user
 */
public class fibonacci {
     public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci Sequence:");
        printFibonacci(0, n);
    }

    public static void printFibonacci(int i, int n) {
        if (i < n) {
            System.out.print(fibonacci(i) + ",");
            printFibonacci(i + 1, n);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
