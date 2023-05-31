package whatisclass;

class Student {
	String name;
	int age;
	int lev;
	String job;

	Student(String name, int age, int lev, String job){
		this.name = name;
		this.age = age;
		this.lev = lev;
		this.job = job;
				
	}



public void printinfo() {
	System.out.println("Name" + ":" + name);
	System.out.println("Age" + ":" + age);
	System.out.println("Level" + ":" + lev);
	System.out.println("Job" + ":" + job);
	}
}


public class WhatIsClass {
	public static void main(String[] arg) {
		Student student = new Student("carpcarp", 1000, 1625, "arcana");
		student.printinfo();
	}
}