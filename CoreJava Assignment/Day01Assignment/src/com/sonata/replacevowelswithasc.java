package com.sonata;

public class replacevowelswithasc {

	public static void main(String[] args) {
		String string = "Anil Vibhu";   
	      System.out.println("Input String : "+string);  
	      string = string.replaceAll("[AaEeIiOoUu]", "#");  
	      System.out.println(string); 

	}

}
