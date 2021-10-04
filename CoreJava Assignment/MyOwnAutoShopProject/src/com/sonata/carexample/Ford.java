package com.sonata.carexample;

public class Ford extends Car 
{
	private int manufacturerDiscount; 
	public Ford (int Speed,double regularPrice,String color, int year, int manufacturerDiscount) 
	{
		super (manufacturerDiscount, regularPrice, color);
		this.manufacturerDiscount = manufacturerDiscount; 
		}
	public double getSalePrice() 
	{
		return (super.getSalePrice() - manufacturerDiscount); 
		}
	}