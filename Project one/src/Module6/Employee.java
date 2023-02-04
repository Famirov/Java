package Module6;


/**Create Employees class:
Variables: employeeID, name, salary, status
Method: display() → should print all the above object variables.
Create default and parameterized constructors
When invoke default constr print - "New Employee Created"
Name the parameters same as instance variable names
Call the default constructor from the parameterized one
Instantiate an object from the class*/


// Step_1 Create Employees class:
public class Employee {
	
	//Step_2 Variables: employeeID, name, salary, status
	public int employeeID;
	public String name;
	public double salary;
	public String status;
	
	


	// 4. Create default and parameterized constructors
	

	public Employee() {
		//5. When invoke default constr print - "New Employee Created"
		System.out.println("New Employee Created");
	}
	
	//6. Name the parameters same as instance variable names
	public Employee(int employeeID, String name, double salary, String status) {
		// Call the default constructor from the parameterized one
		this();
		this.employeeID = employeeID;
		this.name = name;
		this.salary = salary;
		this.status = status;
	}
	

	
	   // 3. Method: display() → should print all the above object variables.
		public void display() {
			System.out.println("EmployeeID : "+employeeID );
			System.out.println("Name : " + name );
			System.out.println("Salary : " + salary );
			System.out.println("Status : " + status );
			
		}
	


}
