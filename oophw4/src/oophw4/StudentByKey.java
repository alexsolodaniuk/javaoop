package oophw4;

import java.util.Scanner;

public class StudentByKey {

	public StudentByKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Student toKeyStud() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ���:");
		String name = sc.nextLine();
		System.out.println("������� �������:");
		String surName = sc.nextLine();
		System.out.println("������� �������:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("������� ���:");
		String gender = sc.nextLine();
		System.out.println("������� ������� ����� �������:");
		long numGradebook = sc.nextLong();
		sc.nextLine();
		System.out.println("������� �������� �����:");
		String nameGroup = sc.nextLine();
		Student student = new Student(name, surName, age, Gender.valueOf(gender), numGradebook, nameGroup);
		System.out.println(student);
		return student;
	}
}
