package oophw2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("meat", "brown", 12, "Bim");
		System.out.println(dog.toString());
		System.out.println(dog.getVoice());
		dog.eat();
		dog.sleep();
		Cat cat = new Cat("fly", "grey", 6, "Matroskin");
		System.out.println(cat.toString());
		System.out.println(cat.getVoice());
		cat.eat();
		cat.sleep();
		Veterinarian veter = new Veterinarian("Alex");
		veter.treatment(cat);
		veter.treatment(dog);
	}

}
