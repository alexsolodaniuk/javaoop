package oophw4;

public class FullGroupExeption extends Exception {

	public FullGroupExeption() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FullGroupExeption(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public String getExeption() {
		return "Група заполнена полностью!";
	}
}
