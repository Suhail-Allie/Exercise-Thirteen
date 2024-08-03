package org.example;

import java.util.Scanner;

public class Main {

        // Method to compute the GCD of two numbers
        private static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        // Method to compute the GCD of an array of numbers
        public static int gcdOfArray(int[] numbers) {
            int result = numbers[0];
            for (int num : numbers) {
                result = gcd(result, num);
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numbers = new int[5];

            System.out.println("Enter five numbers:");

            // Read five numbers from the user
            for (int i = 0; i < 5; i++) {
                numbers[i] = scanner.nextInt();
            }

            // Compute and display the GCD
            System.out.println("The GCD is: " + gcdOfArray(numbers));

            scanner.close();
        }
    }

