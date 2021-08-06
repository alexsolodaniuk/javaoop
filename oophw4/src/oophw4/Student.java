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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nameGroup == null) ? 0 : nameGroup.hashCode());
		result = prime * result + (int) (numGradebook ^ (numGradebook >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (nameGroup == null) {
			if (other.nameGroup != null)
				return false;
		} else if (!nameGroup.equals(other.nameGroup))
			return false;
		if (numGradebook != other.numGradebook)
			return false;
		return true;
	}

}
