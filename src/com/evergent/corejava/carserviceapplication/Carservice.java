package com.evergent.corejava.carserviceapplication;
import java.io.IOException;
import java.util.*;
public class Carservice {
	    enum BookingModule {B, C, M}
	    enum AdditionalServicesModule {S, E, M}
	    enum PaymentModule {T, P, M}
	    enum ReportModule {I, S, M}
	    enum Quit{}

	    static int serviceRate;
	    static int additionalCost = 0;
	    static int totalAmount;
	    static int finalAmount;

public static void main(String[] args) throws IOException {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("\n\t\t \t\t ***Welcome To CAR SERVICE PROVIDER SYSTEM***");

	        while (true) {
	            System.out.println("======================");
	            System.out.println(" Car Service Main Menu");
	            System.out.println("======================");
	            System.out.println("B - Booking Module");
	            System.out.println("S - Additional Services Module");
	            System.out.println("P - Payment Module");
	            System.out.println("R - Report Module");
	            System.out.println("E - Quit");
	            System.out.println("======================");
	            System.out.println("Enter your Module code (B,S,P,R,E) : ");

	            String module = scanner.nextLine();

	            switch (module) {
	                case "B":
	                    System.out.println(" Booking Module");
	                    System.out.println("======================");
	                    System.out.println("B - Book Service");
	                    System.out.println("C - Check Availability");
	                    System.out.println("M - Return to Main Menu");
	                    System.out.println("======================");
	                    System.out.println("Enter your Module code (B,C,M) : ");
	                    String bookingModule = scanner.nextLine();

	                switch (BookingModule.valueOf(bookingModule)) {
	                        case B:
	                            System.out.println("Service Types");
	                            System.out.println("1 - Oil Change - INR150");
	                            System.out.println("2 - Tire Rotation - INR100");
	                            System.out.println("3 - Engine Tune-Up - INR300");
	                            System.out.println("Enter your service type (1,2,3) : ");
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
	                                    continue;
	                            }
	                            totalAmount = serviceRate;
	                            System.out.println("Total Service Cost: INR" + totalAmount);
	                            break;

	                        case C:

	                            System.out.println(" Check Service Availability");

	                            System.out.println("======================");

	                            System.out.println("1 - Car Service");

	                            System.out.println("2 - Additional Service ");

	                            System.out.println("Enter your Service type (1,2) : ");



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

	                            break;
	                        case M:
	                            break;
	                    }
	                    break;

	                case "S":
	                    System.out.println(" Additional Services Module");
	                    System.out.println("======================");
	                    System.out.println("S - Services");
	                    System.out.println("E - Extra Amenities");
	                    System.out.println("M - Return to Main Menu");
	                    System.out.println("======================");
	                    System.out.println("Enter your Module code (S,E,M) : ");
	                    String additionalServicesModule = scanner.nextLine();

	                    switch (AdditionalServicesModule.valueOf(additionalServicesModule)) {
	                        case S:
	                            System.out.println("Available Services");
	                            System.out.println("1 - Car Wash - INR50");
	                            System.out.println("2 - Interior Cleaning - INR80");
	                            System.out.println("Enter your service choice (1,2) : ");
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
	                                    continue;
	                            }
	                            System.out.println("Additional Cost for selected services: INR" + additionalCost);
	                            break;

	                        case E:
	                            System.out.println("Extra Amenities");
	                            System.out.println("1 - Car Cover - INR30");
	                            System.out.println("2 - Air Freshener - INR20");
	                            System.out.println("Enter your amenity choice (1,2) : ");
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
	                                    continue;
	                            }
	                            System.out.println("Additional Cost for selected amenities: INR" + additionalCost);
	                            break;

	                        case M:
	                            break;
	                    }
	                    break;

	                case "P":
	                    System.out.println(" Payment Module");
	                    System.out.println("======================");
	                    System.out.println("T - Display Total Amount");
	                    System.out.println("P - Make Payment");
	                    System.out.println("M - Return to Main Menu");
	                    System.out.println("======================");
	                    System.out.println("Enter your Module code (T,P,M) : ");
	                    String paymentModule = scanner.nextLine();

	                    switch (PaymentModule.valueOf(paymentModule)) {
	                        case T:
	                            System.out.println("Total Amount to be Paid: INR" + (totalAmount + additionalCost));
	                            break;

	                        case P:
	                            finalAmount = totalAmount + additionalCost;
	                            System.out.println("Payment Processed. Total Amount Paid: INR" + finalAmount);
	                            break;

	                        case M:
	                            break;
	                    }
	                    break;

	                case "R":
	                    System.out.println(" Report Module");
	                    System.out.println("======================");
	                    System.out.println("I - Display Invoice");
	                    System.out.println("S - Display Summary");
	                    System.out.println("M - Return to Main Menu");
	                    System.out.println("======================");
	                    System.out.println("Enter your Module code (I,S,M) : ");
	                    String reportModule = scanner.nextLine();

	                    switch (ReportModule.valueOf(reportModule)) {
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
	                    }
	                    break;

	                case "E":
	                    System.out.println("Thank you! Visit again:)");
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("Invalid input. Please enter a valid module code.");
	                    break;
	            }
	        }
	    }
	}
