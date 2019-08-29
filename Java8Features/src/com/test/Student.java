package com.test;

public class Student {

	int id;
	String name;
	int age;
	int[] mark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String s) {
		super();
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student : [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public int[] getMark() {
		return mark;
	}

	public void setMark(int[] mark) {
		this.mark = mark;
	}

	public int getAverage() {
		int sum = 0;
		for (int i : getMark()) {
			sum += i;
		}
		return sum / getMark().length;
	}

	public static void main(String[] args) {
		Student student = new Student(1, "Aneesh", 18);
		int[] m = { 1, 2, 3, 4 };
		student.setMark(m);
		System.out.println(student.toString());
		System.out.println("Average : " + student.getAverage());
		Student s = new Student("hello");
		System.out.println(s.toString());
	}
}
