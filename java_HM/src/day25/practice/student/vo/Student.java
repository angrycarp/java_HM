package day25.practice.student.vo;

import java.util.Objects;

public class Student {
	private String name, major;
	private String num;

	
	@Override
	public int hashCode() {
		return Objects.hash(major, name, num);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(major, other.major) && Objects.equals(name, other.name) && num == other.num;
	}


	public Student(String name, String major, String num) {
		this.name = name;
		this.major = major;
		this.num = num;
	}

}
