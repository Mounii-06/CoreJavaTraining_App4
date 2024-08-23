package com.evergent.corejava.mouni.application4;

import java.util.Scanner;

// Enum for menu options
enum MainMenu {
    B, S, P, R, E
}

enum BookingModule {
    B, C, M
}

enum AdditionalServicesModule {
    S, E, M
}

enum PaymentModule {
    T, P, M
}

enum ReportModule {
    I, S, M
}

// Implementation of the interfaces and abstract class
public class CarExecution extends OutModule implements Modules, Module2 {

    private int serviceRate = 0;
    private int additionalCost = 0;
    private int totalAmount = 0;
    private int finalAmount = 0;

    // Implementing methods from Module2
    @Override
    public void paymentModule() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Payment Module");
        System.out.println("======================");
        System.out.println("T - Display Total Amount");
        System.out.println("P - Make Payment");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your Module code (T,P,M): ");
        String option = scanner.nextLine().toUpperCase();

        switch (PaymentModule.valueOf(option)) {
            case T:
                System.out.println("Total Amount to be Paid: INR" + (totalAmount + additionalCost));
                break;

            case P:
                finalAmount = totalAmount + additionalCost;
                System.out.println("Payment Processed. Total Amount Paid: INR" + finalAmount);
                break;

            case M:
                break;

            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    @Override
    public void reportModule() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Report Module");
        System.out.println("======================");
        System.out.println("I - Display Invoice");
        System.out.println("S - Display Summary");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your Module code (I,S,M): ");
        String option = scanner.nextLine().toUpperCase();

        switch (ReportModule.valueOf(option)) {
            case I:
                System.out.println("Invoice");
                System.out.println("==================");
                System.out.println("Service Rate: INR" + serviceRate);
                System.out.println("Additional Costs: INR" + additionalCost);
                System.out.println("Total Amount: INR" + (serviceRate + additionalCost));
                break;

            case S:
                System.out.println("Summary");
                System.out.println("==================");
                System.out.println("Service Rate: INR" + serviceRate);
                System.out.println("Total Service Cost: INR" + serviceRate);
                System.out.println("Additional Costs: INR" + additionalCost);
                System.out.println("Total Amount: INR" + (serviceRate + additionalCost));
                break;

            case M:
                break;

            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    // Implementing methods from Modules
    @Override
    public void bookingModule() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Booking Module");
        System.out.println("======================");
        System.out.println("B - Book Service");
        System.out.println("C - Check Availability");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your Module code (B,C,M): ");
        String option = scanner.nextLine().toUpperCase();

        switch (BookingModule.valueOf(option)) {
            case B:
                bookService(scanner);
                break;

            case C:
                checkAvailability();
                break;

            case M:
                break;

            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    @Override
    public void additionalServicesModule() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Additional Services Module");
        System.out.println("======================");
        System.out.println("S - Services");
        System.out.println("E - Extra Amenities");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.print("Enter your Module code (S,E,M): ");
        String option = scanner.nextLine().toUpperCase();

        switch (AdditionalServicesModule.valueOf(option)) {
            case S:
                additionalServices(scanner);
                break;

            case E:
                extraAmenities(scanner);
                break;

            case M:
                break;

            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    // Booking a service
    private void bookService(Scanner scanner) {
        System.out.println("Service Types");
        System.out.println("1 - Oil Change - INR150");
        System.out.println("2 - Tire Rotation - INR100");
        System.out.println("3 - Engine Tune-Up - INR300");
        System.out.print("Enter your service type (1,2,3): ");
        int serviceChoice = Integer.parseInt(scanner.nextLine());

        switch (serviceChoice) {
            case 1:
                serviceRate = 150;
                break;
            case 2:
                serviceRate = 100;
                break;
            case 3:
                serviceRate = 300;
                break;
            default:
                System.out.println("Invalid service choice.");
                return;
        }
        totalAmount = serviceRate;
        System.out.println("Total Service Cost: INR" + totalAmount);
    }

    // Checking service availability
    private void checkAvailability() {
        System.out.println("Check Service Availability");
        System.out.println("======================");
        System.out.println("1 - Car Service");
        System.out.println("2 - Additional Service");
        System.out.print("Enter your Service type (1,2): ");
        Scanner scanner = new Scanner(System.in);
        int checkServiceChoice = Integer.parseInt(scanner.nextLine());

        switch (checkServiceChoice) {
            case 1:
                System.out.println("***Today All Car Services are Available***");
                break;
            case 2:
                System.out.println("***All additional services are Available.***");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    // Handling additional services
    private void additionalServices(Scanner scanner) {
        System.out.println("Available Services");
        System.out.println("1 - Car Wash - INR50");
        System.out.println("2 - Interior Cleaning - INR80");
        System.out.print("Enter your service choice (1,2): ");
        int additionalServiceChoice = Integer.parseInt(scanner.nextLine());

        switch (additionalServiceChoice) {
            case 1:
                additionalCost += 50;
                break;
            case 2:
                additionalCost += 80;
                break;
            default:
                System.out.println("Invalid service choice.");
                return;
        }
        System.out.println("Additional Cost for selected services: INR" + additionalCost);
    }

    // Handling extra amenities
    private void extraAmenities(Scanner scanner) {
        System.out.println("Extra Amenities");
        System.out.println("1 - Car Cover - INR30");
        System.out.println("2 - Air Freshener - INR20");
        System.out.print("Enter your amenity choice (1,2): ");
        int amenityChoice = Integer.parseInt(scanner.nextLine());

        switch (amenityChoice) {
            case 1:
                additionalCost += 30;
                break;
            case 2:
                additionalCost += 20;
                break;
            default:
                System.out.println("Invalid amenity choice.");
                return;
        }
        System.out.println("Additional Cost for selected amenities: INR" + additionalCost);
    }

    // Implementing exitModule method from ExitClass
    @Override
    public void exitModule() {
        System.out.println("Thank you! Visit again :)");
        System.exit(0);
    }

    // Main method to run the application
    public static void main(String[] args) {
    	Welcoming we=new Welcoming();
        CarExecution app = new CarExecution();
        Scanner scanner = new Scanner(System.in);
        String option;

        while (true) {
            System.out.println("======================");
            System.out.println("Car Service Main Menu");
            System.out.println("======================");
            System.out.println("B - Booking Module");
            System.out.println("S - Additional Services Module");
            System.out.println("P - Payment Module");
            System.out.println("R - Report Module");
            System.out.println("E - Exit");
            System.out.println("======================");
            System.out.print("Enter your Module code (B,S,P,R,E): ");
            option = scanner.nextLine().toUpperCase();

            switch (MainMenu.valueOf(option)) {
                case B:
                    app.bookingModule();
                    break;
                case S:
                    app.additionalServicesModule();
                    break;
                case P:
                    app.paymentModule();
                    break;
                case R:
                    app.reportModule();
                    break;
                case E:
                    app.exitModule();
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid module code.");
                    break;
            }
        }
    }
}
