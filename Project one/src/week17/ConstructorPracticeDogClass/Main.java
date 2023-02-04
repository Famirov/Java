package week17.ConstructorPracticeDogClass;

public class Main {

	public static void main(String[] args) {
		
        Dog dog = new Dog();

        System.out.println("Main constructor print outs");
        System.out.println("Dog name: " + dog.name);
        System.out.println("Dog breed: " + dog.breed);
        System.out.println("Dog weight: " + dog.weight);

        Dog dog2 = new Dog("West", 7);

        System.out.println("Secondary constructor print outs");
        System.out.println("Dog name: " + dog2.name);
        System.out.println("Dog breed: " + dog2.breed);
        System.out.println("Dog weight: " + dog2.weight);

		


		
		
		

	}

}
