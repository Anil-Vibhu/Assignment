package com.sonata.carexample;

public class Truck extends Car{

private int weight;



public Truck (int Speed,double regularPrice,String color, int weight)
{
	super(weight, regularPrice, color); 
	this.weight = weight; 
	} 
public double getSalePrice()  
{ 
	if (weight > 2000)
	{
		return super.getSalePrice() - (0.1 * super.getSalePrice()); }
	else 
	{ 
		return super.getSalePrice(); 
		} 
	} 
}