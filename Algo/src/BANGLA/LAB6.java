/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BANGLA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author 18101424
 */
public class LAB6 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);

		String[] numbers = { "\u09E6", "\u09E7", "\u09E8", "\u09E9", "\u09EA", "\u09EB", "\u09EC", "\u09ED", "\u09EE",
				"\u09EF" };
		// int counter =0 ;
		for (int i = 0; i < 10; i++) {
			String a = numbers[i];
			byte[] charset = a.getBytes("UTF-8");
			String result = new String(charset, "UTF-8");
			System.out.println(result + " --> " + i);
		}
		int match = scan.nextInt();
		// counter = match ;
		// String match2 = scan.nextLine();
		for (int i = match; i >= 0; i--) {
			String print = numbers[i];
			byte[] charset = print.getBytes("UTF-8");
			String result = new String(charset, "UTF-8");
			System.out.println(result);
		}
		// System.out.println("=====>"+match2);

		// System.out.println("Apnar match : "+counter);
//      byte[] charset = str.getBytes("UTF-8");
//      String result = new String(charset, "UTF-8");
//      System.out.println(result);

	}

}
