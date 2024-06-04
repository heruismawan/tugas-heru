package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Library System ===");

        int option;
        for (;;) {
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");

            System.out.print("Choose option (1-3)\t: ");
            option = input.nextInt();

            if (option == 1) {
                System.out.print("Enter your NIM\t: ");
                String nim = input.next();

                int panjangNim = nim.length();

                if (panjangNim != 15) {
                    System.out.println("NIM tidak valid!");
                } else {
                    System.out.println("Successful Login as Student");
                }
            } else if (option == 2) {
                System.out.print("Enter your username\t: ");
                String user = input.next();

                System.out.print("Enter your password\t\t: ");
                String pw = input.next();

                if (user.equals("heru") && pw.equals("ismawan")) {
                    System.out.println("Successful Login as Admin");
                } else {
                    System.out.println("Admin user Not Found!");
                }
            } else if (option == 3) {
                System.out.println("Exit the program.");
                input.close();
                System.exit(0);
            } else {
                System.out.println("Option hanya 1-3 saja");
            }
        }
    }
}