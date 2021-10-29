package com.convert.app;

import java.util.Scanner;

public class convert<s1, s2> {

    double JPY;
    double CadAll;
	
	//1JPY = 0.011CAD
    final double CAD = 0.011;

    private final s1 customerName;
    private final s2 customerId;

    public convert(s1 customerName, s2 customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public s1 getCustomerName() {
        return customerName;
    }

    public s2 getCustomerId() {
        return customerId;
    }

    //convert 
    void exchange(double amount) {
		if(amount > 0) {
            CadAll = amount * CAD;
            JPY = amount;
		} else {
            errorMessage("Invalid amount! Please enter correct amount"); 
        }
	}


    //message
	void errorMessage(String message) {
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("!!! " + message);
		System.out.println("---------------------------");
		System.out.println("\n");
	}


    //menu
    void showMenu() {

        char option;
        Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("welcome to Fumina Exchange");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("A : Check your transactions");
			System.out.println("B : Convert your JPY to CAD");
			System.out.println("C : Quit");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch (Character.toLowerCase(option)) {
				case 'a': 
					System.out.println("--------------------------------");
					System.out.println("JPY = $" + JPY);
					System.out.println("CAD = $" + CadAll);
					System.out.println("--------------------------------");
					System.out.println("\n");
					break;
					
				case 'b':
					System.out.println("--------------------------------");
					System.out.println("Enter an amount of JPY");
					System.out.println("--------------------------------");
					
					try {
						double amount = scanner.nextInt();	
						exchange(amount);
					}catch (Exception c) {
						errorMessage("Wrong Input! Only integer numbers please...");
                        scanner.nextLine();
					}

					break;
				case 'c':
                    System.out.println("================================");
                    break;

				default:
					System.out.println("Invalid Option. Please try again.");
					break;
			}
			
			
		}while(Character.toLowerCase(option) != 'c');
        System.out.println("See you next month!!");
		scanner.close();
	}
}
