package com.sonata;

public class MaxRepeatingValue {
	 public void MaxRepeatingElement(int [] arrA){
	 int maxCounter = 0;
	 int element=0;
	 for (int i = 0; i <arrA.length ; i++) {
	 int counter =1;
	 for (int j = i+1; j <arrA.length ; j++) {
	 if(arrA[i]==arrA[j]){
	 counter++;
	 }
	 }
	 if(maxCounter<counter){
	 maxCounter=counter;
	 element = arrA[i];
	 }
	 }
	 System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCounter);
	 }

	 public static void main(String[] args) {
	 int [] arrA = {455, 111, 455, 232, 111, 455, 679, 788, 456, 455, 378, 122, 344, 768};
	 MaxRepeatingValue m = new MaxRepeatingValue();
	 m.MaxRepeatingElement(arrA);
	 }
	}