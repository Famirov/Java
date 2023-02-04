package module7.inheritance;

public class OverloadingPractice {

    int num;
	double num2;
	
	// Constructor Overloading
	public MethodOverloading() {
		System.out.println("Default constructor");
	}
	
	public MethodOverloading(int num) {
		this.num = num;
	}
	
	public MethodOverloading(int num, double num2) {
		this.num = num;
		this.num2 = num2;
	}

    // Method Overloading
    void showNumbers() {
        System.out.println("No params");
    }
    void showNumbers(int a) {
        System.out.println("int");
    }
    float showNumbers(double a) {
        System.out.println("double");
        return 0.0f;
    }
    float showNumbers(int a, float b) {
        System.out.println("int double");
        return 0.0f;
    }

    // There are 3 ways to overload a method.
    // By changing number of parameters.
    void setInfo(){};
    void setInfo(int a){};
    void setInfo(int a, int b){};


    // By changing the datatype of parameters.
    void printInfo(String s){};
    void printInfo(int i){};
    void printInfo(double d){};


    // By changing the sequence of data types of parameters.
    void printInfo(String s, int i){};
    void printInfo(int i, String s){};


}