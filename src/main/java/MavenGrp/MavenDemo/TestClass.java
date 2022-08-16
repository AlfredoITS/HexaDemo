package MavenGrp.MavenDemo;

class Animal {
	public Animal() {
		System.out.println("I am super constructor.");
	}
	public String color = "White";
	
	public void disp() {
		System.out.println("I am the disp method.");
	}
}

class Dog extends Animal {	
	public Dog() {
		super();
		System.out.println(super.color);
		super.disp();
	}
	
	public String color = "Black";	
	
	public void disp() {
		System.out.println("I am the child disp method.");
	}
}

public class TestClass {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Dog dg = new Dog();
	}
}
