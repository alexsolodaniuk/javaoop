package oophw4;

public class Human {
	private String name;
	private String surname;
	private int age;
	private Gender gender;

	public Human(String name, String surname, int age, Gender gender) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
	}
	

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Human [name=" + name + ", surname=" + surname + ", age=" + age + ", gender=" + gender + "]";
	}
}
