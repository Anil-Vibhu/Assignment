package com.sonata.q2;

public class TestStudent {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStdId(1);
		s1.setStdName("Anil");
		s1.setStdClass(20485);
		System.out.println(s1);
		Student s2=new Student();
		s2.setStdId(2);
		s2.setStdName("Sunil");
		s2.setStdClass(101);
		System.out.println(s2);
	}

}