package com.convert.app;

public class Main {

    public static void main(String[] args) {	
			
		convert<String, String> account = new convert<>("dummy","user001");
		System.out.println("Welcome " + account.getCustomerName());
		System.out.println("Your ID is: " + account.getCustomerId());
		System.out.println("\n");
		
		account.showMenu();
	}
    
}
