package com.sonata.carexample;

public class Car 
{
	 int speed; 
    double regularPrice;
	 String color;
	public Car (int Speed,double regularPrice,String color)
	{
		this.speed = Speed; 
		this.regularPrice = regularPrice; 
		this.color = color;
		}

public double getSalePrice() { return regularPrice; } }