package org.ssglobal.training.codes;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TrapArray {
	
	private static Logger logger = LogManager.getLogger("traplogger");
	
	private Scanner scan = new Scanner(System.in);
	private Scanner scan2 = new Scanner(System.in);
	private Scanner scan3 = new Scanner(System.in);
	
	public void arrayTransact() {
		logger.info("execute arrayTransact");
		int size = 0;
		size = askUser();
		int[] myArray = new int[size];
		
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = askValue();
		}
		arrayValue(myArray);
		scan.close();
		scan2.close();
		scan3.close();
		logger.info("exiting without error arrayTransact");
	}
	
	public int askUser() {
		logger.info("execute askUser");
		String input;
		int size = 0;
		
		logger.info("validating user input");
		while (true) {
			System.out.print("Enter the array size: ");
			input = scan.nextLine();
	
			try {		
				size = Integer.parseInt(input);
				if (size <= 0) {
					logger.error("Error: {}",new InvalidSizeException().getMessage());
				} else {
					logger.info("exiting askUser without error");
					return size;
				}
			} catch(NumberFormatException e) {
				logger.error("Error: {}",new LetterSizeException().getMessage());
			}
		}
		
	}
	
	public int askValue() {
		logger.info("execute askValue");
		String input;
		int size = 0;
		logger.info("validating user input");
		while (true) {
			System.out.print("Enter the value: ");
			input = scan2.nextLine();
			try {		
				size = Integer.parseInt(input);
				logger.info("exiting askValue without error");
				return size;
			} catch(NumberFormatException e) {
				try {
					Double.parseDouble(input);
					logger.error("Error: {}",new ElementDecimalException()
							.getMessage());
					
				} catch (NumberFormatException e1) {
					if (input.length() == 1) {
						logger.error("Error: {}",new ElementCharException()
								.getMessage());
					}
					else {
						logger.error("Error: {}",new ElementStringException()
								.getMessage());
					}
				}
			}
		}
		
	}
	
	public boolean arrayValue(int[] myArray) {
		logger.info("executing arrayValue");
		int[] temp = myArray;
		String input;
		logger.info("validating user input");
		while(true) {
			int index = 0;
			System.out.print("Enter the index that you want to view:");
			input = scan.nextLine();
			
			if(input.equalsIgnoreCase("E")) {
				System.out.println("Good Bye");
				logger.error("exiting arrayValue without error");
				return false;
			}
			
			try {
				index = Integer.parseInt(input);
			} catch(NumberFormatException e) {
				logger.error("Error: {}",new BadIndexException().getMessage());
			}
			
			try {
				System.out.printf("The value in index %d is %d \n", 
								   index, temp[index]);
			} catch(IndexOutOfBoundsException e) {
				logger.error("Error: {}",new BadIndexException().getMessage());
			}
			
		}
	}
		
}
