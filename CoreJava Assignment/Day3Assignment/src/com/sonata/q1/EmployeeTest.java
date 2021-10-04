package com.sonata.q1;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager m=new Manager(1,"anil",50000d);
		Developer d=new Developer(2,"vibhu",75000d);
		Tester t=new Tester(3,"sunil",30000d);
		m.display();
		m.salCal();
		d.display();
		d.salCal();
		t.display();
		t.salCal();
	}

}
