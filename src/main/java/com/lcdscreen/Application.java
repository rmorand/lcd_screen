package com.lcdscreen;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
	
	
	
    public static void main(String[] args) {
	
    	if (args.length == 0) {
			Scanner reader = new Scanner(System.in);
			String userEntry;
		
			while (true) {
				System.out.println("Enter a number : ");
				userEntry = reader.nextLine();
				printIntoPrompt(userEntry);
			}
		} else {
			Arrays.stream(args).forEach(Application::printIntoPrompt);
		}
    }
    
    private static void printIntoPrompt(String toPrint) {
	
		if (Validator.isValidNumber(toPrint)) {
			Digitalizer digitalizer = Digitalizer.getInstance();
			List<Integer> digitsToPrint = Converter.numberToDigits(toPrint);
			
			digitsToPrint.forEach(d -> System.out.print(digitalizer.getFirstLineValue(d)));
			System.out.println();
			digitsToPrint.forEach(d -> System.out.print(digitalizer.getSecondLineValue(d)));
			System.out.println();
			digitsToPrint.forEach(d -> System.out.print(digitalizer.getThirdLineValue(d)));
			System.out.println();
		} else {
			System.out.println("Bad entry : " + toPrint);
		}
	}
}
