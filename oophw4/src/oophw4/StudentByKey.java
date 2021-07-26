package oophw4;

import java.util.Scanner;

public class StudentByKey {

	public StudentByKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Student toKeyStud() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите им€:");
		String name = sc.nextLine();
		System.out.println("¬ведите фамилию:");
		String surName = sc.nextLine();
		System.out.println("¬ведите возраст:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("¬ведите пол:");
		String gender = sc.nextLine();
		System.out.println("¬ведите введите номер зачетки:");
		long numGradebook = sc.nextLong();
		sc.nextLine();
		System.out.println("¬ведите название групы:");
		String nameGroup = sc.nextLine();
		Student student = new Student(name, surName, age, Gender.valueOf(gender), numGradebook, nameGroup);
		System.out.println(student);
		return student;
	}
}
