package com.rbuddhar.assignment;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Keep the program running until user chooses to exit
        do {
            System.out.println("1. Simple Interest \n2. Compound Interest\n3. EMI \n4. Exit \nEnter your choice: ");
            choice = scanner.nextInt();

            // Exit condition
            if (choice == 4) {
                System.out.println("Exit!");
                break; // Exit the loop
            }

            // Prompt for valid options only
            if (choice == 1 || choice == 2 || choice == 3) {
                System.out.print("\nEnter amount: ");
                double amount = scanner.nextDouble();
                System.out.print("\nEnter rate: ");
                double rate = scanner.nextDouble();

                switch (choice) {
                    case 1 -> {
                        // Handle Simple Interest
                        System.out.println("You Have two options to Select duration: Either you can select months or years." +
                                " Enter \"M\" to calculate in months or \"Y\" to calculate in years: ");
                        char option = scanner.next().charAt(0);
                        if (option == 'M' || option == 'm') {
                            System.out.print("\nEnter number of months: ");
                            int months = scanner.nextInt();
                            System.out.println("Simple Interest is: " + calculateSI_M(amount, rate, months));
                        } else if (option == 'Y' || option == 'y') {
                            System.out.print("\nEnter number of years: ");
                            int years = scanner.nextInt();
                            System.out.println("Simple Interest is: " + calculateSI_Y(amount, rate, years));
                        } else {
                            System.out.println("Invalid option selected. Try Again!");
                        }
                    }
                    case 2 -> {
                        // Handle Compound Interest
                        System.out.println("You Have two options to Select duration: Either you can select months or years." +
                                " Enter \"M\" to calculate in months or \"Y\" to calculate in years: ");
                        char option = scanner.next().charAt(0);
                        if (option == 'M' || option == 'm') {
                            System.out.print("\nEnter number of months: ");
                            int months = scanner.nextInt();
                            System.out.println("Compound Interest is: " + calculateCI_M(amount, rate, months));
                        } else if (option == 'Y' || option == 'y') {
                            System.out.print("\nEnter number of years: ");
                            int years = scanner.nextInt();
                            System.out.println("Compound Interest is: " + calculateCI_Y(amount, rate, years));
                        } else {
                            System.out.println("Invalid option selected. Try Again!");
                        }
                    }
                    case 3 -> {
                        // Handle EMI
                        System.out.println("You Have two options to select duration:" +
                                " Enter \"M\" for months or \"Y\" for years: ");
                        char option = scanner.next().charAt(0);

                        if (option == 'M' || option == 'm') {
                            System.out.print("\nEnter number of months: ");
                            int months = scanner.nextInt();
                            System.out.println("Your monthly EMI: " + calculateEMI_Months(amount, rate, months));
                        } else if (option == 'Y' || option == 'y') {
                            System.out.print("\nEnter number of years: ");
                            int years = scanner.nextInt();
                            System.out.println("Your monthly EMI: " + calculateEMI_Years(amount, rate, years));
                        } else {
                            System.out.println("Invalid option selected. Try Again!");
                        }
                    }
                    default -> System.out.println("Invalid option selected. Try Again!");
                }
            } else {
                System.out.println("Invalid option selected. Try Again!");
            }

        } while (choice != 4);

        scanner.close(); // Close scanner after usage
    }

    // Method to calculate Simple Interest for years
    public static double calculateSI_Y(double p, double r, int t) {
        return (p * r * t) / 100.0;
    }

    // Method to calculate Simple Interest for months
    public static double calculateSI_M(double p, double r, int t) {
        return (p * r * t) / 1200.0;
    }

    // Method to calculate Compound Interest for years
    public static double calculateCI_Y(double p, double r, int t) {
        return Math.round((p * Math.pow(1 + (r / 100.0), t) - p) * 100.0) / 100.0;
    }

    // Method to calculate Compound Interest for months
    public static double calculateCI_M(double p, double r, int t) {
        return Math.round((p * Math.pow(1 + (r / 1200.0), t) - p) * 100.0) / 100.0;
    }

    // Method to calculate EMI when duration is in months
    public static double calculateEMI_Months(double p, double r, int months) {
        double monthlyRate = r / 12.0 / 100; // Convert annual rate to monthly
        return Math.round(((p * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1)) * 100.0) / 100.0;
    }

    // Method to calculate EMI when duration is in years
    public static double calculateEMI_Years(double p, double r, int years) {
        int months = years * 12; // Convert years to months
        return calculateEMI_Months(p, r, months); // Reuse the months-based calculation method
    }
}
