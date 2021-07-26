package oophw4;

public class Student extends Human {
	private long numGradebook;
	private String nameGroup;

	public Student(String name, String surname, int age, Gender gender, long numGradebook, String nameGroup) {
		super(name, surname, age, gender);
		this.numGradebook = numGradebook;
		this.nameGroup = nameGroup;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getNumGradebook() {
		return numGradebook;
	}

	public void setNumGradebook(long numGradebook) {
		this.numGradebook = numGradebook;
	}

	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	public Student(String name, String surname, int age, Gender gender) {
		super(name, surname, age, gender);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + " Student [numGradebook=" + numGradebook + ",  nameGroup=" + nameGroup + "]";
	}
}
