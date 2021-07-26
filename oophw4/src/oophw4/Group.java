package oophw4;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
	private String name;
	private Student[] students = new Student[10];

	public Group(String name) {
		this.name = name;
	}

	public Group(String name, Student[] students) {
		super();
		this.name = name;
		this.students = students;
	}

	public Group() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {

			if (students[i] != null && students[i].getNumGradebook() == student.getNumGradebook()) {
				System.out.println("Студент " + students[i].getName() + " " + students[i].getSurname()
						+ " был зачислен в эту групу раньше");
				return;
			}
		}
		try {
			for (int i = 0; i < students.length; i++) {
				if (students[i] == null) {
					students[i] = student;
					student.setNameGroup(this.name);
					System.out
							.println("Студент " + student.getName() + " " + student.getSurname() + " зачислен в групу");
					return;
				}
			}
			throw new FullGroupExeption();
		} catch (FullGroupExeption e) {
			System.out.println(e.getExeption());
		}
	}

	public void delStudent(long gradeBook) {
		for (int j = 0; j < students.length; j++) {
			if (students[j] != null && students[j].getNumGradebook() == gradeBook) {
				System.out.println(
						"Студент " + students[j].getName() + " " + students[j].getSurname() + " отчислен с групы");
				students[j] = null;
				return;
			}
		}
	}

	public String searchStudent(String surNameStud) {
		for (int y = 0; y < students.length; y++) {
			if (students[y] != null && students[y].getSurname().equals(surNameStud)) {
				System.out.println(
						"Студент найден.Его данные: " + students[y].getName() + " " + students[y].getSurname());
				return students[y].getSurname();
			}
		}
		System.out.println("Студент " + surNameStud + " не найден");
		return null;
	}

	@Override
	public String toString() {
		return "Group [name=" + name + ", students=" + Arrays.toString(sortNames(students)) + "]";
	}

	public String toStringSortLastName() {
		return "Group [name=" + name + ", students=" + Arrays.toString(sortStudentsByLastName(students)) + "]";
	}

	public Student[] sortNames(Student[] students) {
		Arrays.sort(students, Comparator.nullsLast(new StudentsNameComparator()));
		return students;
	}

	public Student[] sortStudentsByLastName(Student[] students) {
		Arrays.sort(students, Comparator.nullsLast(new StudentsSurNameComparator()));
		return students;
	}

}
