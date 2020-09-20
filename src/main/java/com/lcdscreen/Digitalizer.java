package com.lcdscreen;

import java.util.LinkedList;

public class Digitalizer {
	
	private static Digitalizer instance;
	private static final LinkedList<String> firstLinevalues = new LinkedList<>();
	private static final LinkedList<String> secondLinevalues = new LinkedList<>();
	private static final LinkedList<String> thirdLinevalues = new LinkedList<>();
	
	private Digitalizer() {
		firstLinevalues.add(" _ ");//0
		firstLinevalues.add("   ");//1
		firstLinevalues.add(" _ ");//2
		firstLinevalues.add(" _ ");//3
		firstLinevalues.add("   ");//4
		firstLinevalues.add(" _ ");//5
		firstLinevalues.add(" _ ");//6
		firstLinevalues.add(" _ ");//7
		firstLinevalues.add(" _ ");//8
		firstLinevalues.add(" _ ");//9
		
		secondLinevalues.add("| |");//0
		secondLinevalues.add("  |");//1
		secondLinevalues.add(" _|");//2
		secondLinevalues.add(" _|");//3
		secondLinevalues.add("|_|");//4
		secondLinevalues.add("|_ ");//5
		secondLinevalues.add("|_ ");//6
		secondLinevalues.add("  |");//7
		secondLinevalues.add("|_|");//8
		secondLinevalues.add("|_|");//9
		
		thirdLinevalues.add("|_|");//0
		thirdLinevalues.add("  |");//1
		thirdLinevalues.add("|_ ");//2
		thirdLinevalues.add(" _|");//3
		thirdLinevalues.add("  |");//4
		thirdLinevalues.add(" _|");//5
		thirdLinevalues.add("|_|");//6
		thirdLinevalues.add("  |");//7
		thirdLinevalues.add("|_|");//8
		thirdLinevalues.add("  |");//9
	}
	
	public static Digitalizer getInstance() {
		if (instance == null) {
			instance = new Digitalizer();
		}
		return instance;
	}
	
	public String getFirstLineValue(Integer digit) {
		return firstLinevalues.get(digit);
	}
	
	public String getSecondLineValue(Integer digit) {
		return secondLinevalues.get(digit);
	}
	
	public String getThirdLineValue(Integer digit) {
		return thirdLinevalues.get(digit);
	}
	
}
