package oophw4;

public class Main {

	public static void main(String[] args) {
		Group groupMD = new Group("MD");
		Student student1 = new Student("Jora", "Bolt", 20, Gender.MALE, 2112, "MD1");
		Student student2 = new Student("Alex", "Dom", 22, Gender.MALE, 2113, "MD1");
		Student student3 = new Student("Tolya", "Pop", 19, Gender.MALE, 2114, "MD1");
		Student student4 = new Student("Alina", "Juke", 21, Gender.FEMALE, 2115, "MD1");
		Student student5 = new Student("Nora", "Miclyan", 26, Gender.FEMALE, 2116, "MD1");
		Student student6 = new Student("Emila", "Tor", 28, Gender.FEMALE, 2117, "MD1");
		groupMD.addStudent(student1);
		groupMD.addStudent(student2);
		groupMD.addStudent(student3);
		groupMD.addStudent(student4);
		groupMD.addStudent(student5);
		groupMD.addStudent(student6);
		groupMD.searchStudent("Juke");
		System.out.println(groupMD.toString());
		groupMD.delStudent(2113);
		System.out.println(groupMD.toStringSortLastName());
		StudentByKey stud = new StudentByKey();
		Student student7 = stud.toKeyStud();
		groupMD.addStudent(student7);
		Student student8 = stud.toKeyStud();
		groupMD.addStudent(student8);
		Student student9 = stud.toKeyStud();
		groupMD.addStudent(student9);
		Student student10 = stud.toKeyStud();
		groupMD.addStudent(student10);
		System.out.println(groupMD.toString());
	}

}