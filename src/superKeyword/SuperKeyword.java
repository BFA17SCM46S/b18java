package superKeyword;

class Animal {
	String color = "white";
	
	void sleep() {
		System.out.println("sleeping soundly");
	}
}

class Dog extends Animal {
	String color = "black";
	
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
	void sleep() {
		System.out.println("sleeping until midnight");
		super.sleep();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sleep();
		dog.printColor();
	}

}
