package com.sonata.q3;

public class YearException extends Exception {
	String s;
	YearException(String s){
		this.s=s;
	}
	public String toString() {
		return s;
	}
}