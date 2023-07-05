package day25.practice.student.vo;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {

	
	private static final long serialVersionUID = 3349834132614870043L;
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
	
	@Override
	public String toString() {
		return "학번 : " + num + "\n이름 : " + name + "\n전공 : " + major;
	}


	public Student(String name, String major, String num) {
		this.name = name;
		this.major = major;
		this.num = num;
	}

}
