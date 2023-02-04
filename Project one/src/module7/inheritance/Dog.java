package module7.inheritance;

public class Dog extends Animal{

	
	public String dogBreed;
	
	public void whof() {
		System.out.println("Whooff..");
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + getAge());
	}
	
}
	