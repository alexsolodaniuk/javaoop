package oophw4;

import java.util.Comparator;

public class StudentsSurNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student student1 = (Student) o1;
		Student student2 = (Student) o2;
		String surName1 = student1.getSurname();
		String surName2 = student2.getSurname();
		return surName1.compareTo(surName2);
	}

}
