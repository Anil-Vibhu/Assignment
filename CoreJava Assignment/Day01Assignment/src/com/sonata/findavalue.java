package com.sonata;

public class findavalue {

	public static void main(String[] args) {
		int[] arr = {156, 342, 653, 984, 511};
	    int find = 342;
	   boolean check=false;

	    for (int n : arr) {
	      if (n == find) {
	      check = true;
	        break;
	      }
	    }
	    
	    if(check)
	      System.out.println(find + " is found.");
	    else
	      System.out.println(find + " is not found.");

	}

}
