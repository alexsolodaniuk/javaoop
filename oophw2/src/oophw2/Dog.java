package oophw2;

public class Dog extends Animal {
	private String name;

	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}
	

	public Dog(String ration, String color, int weight) {
		super(ration, color, weight);
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVoice() {
		return "gav gav gav";
	}

	public void eat() {
		System.out.println("Ем корм для собак");
	}

	public void sleep() {
		System.out.println("Сплю в будке");
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", " + super.toString() + "]";
	}

}
