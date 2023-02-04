package module7.encapsulation;

public class EncapPractice {

	public static void main(String[] args) {

		Person p1 = new Person();
		//7. set the Name
		p1.setName("Omar");
		System.out.println(p1.getName());
		
		
		
		Cat garfield = new Cat("Garfield");
		System.out.println(garfield.getEnergy());
		System.out.println(garfield.getHungry());
		
		garfield.feed();
		System.out.println("Energy: " + garfield.getEnergy());
		System.out.println("Hunger: " + garfield.getHungry());

		garfield.sleep();
		garfield.sleep();
		garfield.sleep();
		
		System.out.println("Energy: " + garfield.getEnergy());
		System.out.println("Hunger: " + garfield.getHungry());
		System.out.println("Mood: " + garfield.getMood());
		
		
		garfield.play();
		garfield.play();
		
		
		System.out.println("Energy: " + garfield.getEnergy());
		System.out.println("Hunger: " + garfield.getHungry());
		System.out.println("Mood: " + garfield.getMood());
		
		
		// here we create an object with default constructor 
//		TV lg22 = new TV();
		
		// here we create an object with 1 args constructor 
		TV lg23 = new TV("LG");
		
		
		lg23.channelUp();
		
		lg23.turnOn();
		System.out.println("TV is on: "+lg23.isOn());
		
		lg23.channelUp();
		System.out.println(lg23.getChannel());
		
		lg23.turnOn();
		
		lg23.volumeDown();
		
		lg23.turnOff();
		
		
	}

}
