package com.sonata.carexample;

public class MyOwnAutoShop
{
	public MyOwnAutoShop (int Speed,double regularPrice,String color, int year, int manufacturerDiscount) {
	}
	public static void main(String[] args)
	{
		Sedan mySedan = new Sedan(160, 20000, "Red", 10); 
		Ford myFord1 = new Ford (156,4452.0,"Black",2005, 10); 
		Ford myFord2 = new Ford (155,5000.0,"Pink",1998, 5);
		Car myCar = new Car (555, 56856.0, "Red");
		System.out.println(mySedan.getSalePrice()); 
		System.out.println(myFord1.getSalePrice());
		System.out.println(myFord2.getSalePrice()); 
		System.out.println(myCar.getSalePrice()); 
		}
	}
