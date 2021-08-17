package com.app;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Main {
	private static Logger log = Logger.getLogger(Main.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		log.info("Welcome to the cart");
		log.info("Please choose from below options");
		int ch=0;
		do {
		log.info("1) User Register");
		log.info("2) User login");
		log.info("3) Employee login");
		try {
			ch = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
		}
		switch(ch) {
		case 1:
			log.info("User Registration");
			break;
		default:
			log.warn(
					"Invalid Search Option... Choice should be only number between 1-9 only. Kindly Retry ");
			break;
		}
		}
	 while (ch != 9);
		
	}

}
