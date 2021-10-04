package com.sonata;

public class twohighestnumbers {
	 public void printtwohighestnumbers(int[] nums){
	        int maxOne = 0;
	        int maxTwo = 0;
	        for(int n:nums){
	            if(maxOne < n){
	                maxTwo = maxOne;
	                maxOne =n;
	            } else if(maxTwo < n){
	                maxTwo = n;
	            }
	        }
	        System.out.println("First Max Number: "+maxOne);
	        System.out.println("Second Max Number: "+maxTwo);
	    }
	     
	    public static void main(String a[]){
	        int num[] = {1,2,3,4,5,6,7,8};
	        twohighestnumbers two = new twohighestnumbers();
	        two.printtwohighestnumbers(num);



	}

}
