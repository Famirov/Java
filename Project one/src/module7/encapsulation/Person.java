package module7.encapsulation;

public class Person {
	
	// 1.To achieve Encapsulation
	//2.Make fields private
	
	private String name;
	private int age;
	private double height;
	// set-get are public methods
	// 3.Create accessors (getters and setters)-which are public methods that will set the value to fiels and get the value from fields
	// 4.Create the method setters
	public void setName(String name) {
		//5.setter method how to set the value--setter	
		this.name =name ;
	}
	
	//6.get the value --getter
	
	public String getName() {
		return name;
	}
	
	//8. set the value to age
	public void setAge(int age) {
		
		//this.age is ==private int age; and 2nd age is setAge(int age)
		this.age = age;
					
	}
	
	public int getAge() {
		return age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	
	
	
	
	
	
	
	
	

}
