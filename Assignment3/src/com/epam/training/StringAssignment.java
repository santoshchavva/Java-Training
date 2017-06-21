package com.epam.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAssignment {

	public static final String SPACE = " ";
	
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in))) {

			System.out.print("Enter inputString : ");
			String inputString = br.readLine();
			System.out.print("Enter defined ending string: ");
			String endsWith = br.readLine();
			System.out.print("Enter pre-defined String : ");
			String addString = br.readLine();
			System.out.println("-------------");
			System.out.println("input String:" + inputString + " ,endsWith:"
					+ endsWith + " ,addString:" + addString);
			String result = addDefinedString(inputString, endsWith, addString);
			System.out.println("-------------");
			System.out.println("result : "+result);

		} catch (IOException ex) {
			System.err.println("Error reading data from console");
		}

	}
	
	public static String addDefinedString(String inputString, String endsWith,
			String addString) {
		String[] stringArray = inputString.split(SPACE);
		StringBuilder stringBuilder = new StringBuilder();
		for (String word : stringArray) {
			stringBuilder.append(word);
			if (word.endsWith(endsWith)) {
				stringBuilder.append(addString);
			}
			stringBuilder.append(SPACE);
		}

		return stringBuilder.toString();
	}

}
