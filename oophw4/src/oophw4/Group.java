package oophw4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

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
				System.out.println("??????? " + students[i].getName() + " " + students[i].getSurname()
						+ " ??? ???????? ? ??? ????? ??????");
				return;
			}
		}
		try {
			for (int i = 0; i < students.length; i++) {
				if (students[i] == null) {
					students[i] = student;
					student.setNameGroup(this.name);
					System.out
							.println("??????? " + student.getName() + " " + student.getSurname() + " ???????? ? ?????");
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
						"??????? " + students[j].getName() + " " + students[j].getSurname() + " ???????? ? ?????");
				students[j] = null;
				return;
			}
		}
	}

	public String searchStudent(String surNameStud) {
		for (int y = 0; y < students.length; y++) {
			if (students[y] != null && students[y].getSurname().equals(surNameStud)) {
				System.out.println(
						"??????? ??????.??? ??????: " + students[y].getName() + " " + students[y].getSurname());
				return students[y].toString();
			}
		}
		System.out.println("??????? " + surNameStud + " ?? ??????");
		return null;
	}

	@Override
	public String toString() {
		return "Group [name=" + name + ", students=" + Arrays.toString(sortNames(students)) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(students);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(students, other.students))
			return false;
		return true;
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

	public boolean equalsStud() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				for (int j = i + 1; j < students.length; j++) {
					if (students[i].equals(students[j])) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
