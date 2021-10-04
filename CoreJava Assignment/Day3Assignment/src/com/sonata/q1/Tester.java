package com.sonata.q1;

public class Tester extends Employee {
	private int empId;
	private String empName;
	private double empSal;
	public Tester(int eid, String ename, double esal) {
		super(eid,ename,esal);
		this.empId=eid;
		this.empName=ename;
		this.empSal=esal;
	}

	public void salCal() {
		empSal=empSal*12;
		System.out.println("After salary calculation:"+empSal);
	}
}