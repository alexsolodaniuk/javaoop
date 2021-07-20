package oophw2;

public class Cat extends Animal {
	private String name;

	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}
	

	public Cat(String ration, String color, int weight) {
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
		return "miay miay miay";
	}

	public void eat() {
		System.out.println("Ем корм для котов");
	}

	public void sleep() {
		System.out.println("Сплю на подоконнике");
	}

	@Override
	public String toString() {
		return "Cat [name= " + name + ", " + super.toString() + "]";
	}

}