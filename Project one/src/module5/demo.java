package module5;

public class demo {

	public static void main(String[] args) {
		
		// Bu Studentin misalidir
		
		Student student1 = new Student();
		student1.firstName = "Shabnam";
		
		Student student2 = new Student();
		student2.firstName = "Javid";
		
		Student student3 = new Student();
		student3.firstName = "Seyla";
		
		
		Student student4 = new Student();
		student4.firstName = "Bayram";
		// student4.schoolName = "Yoll School";

		
		System.out.println(student1.firstName);
		System.out.println(student2.firstName);
		System.out.println(student3.firstName);
		
		// The static variables can be accessed by object name
		System.out.println("Student's school name is: " + student1.SCHOOL );
		System.out.println("Student's school name is: "+ student2.SCHOOL );
		System.out.println("Student's school name is: "+ student3.SCHOOL );
		
		// Also static variable are accessible by className.staticVariable
		System.out.println("School name: " + Student.SCHOOL);
		
		
		
		
		//Bu AccountUtils-in misalidir
		
//		AccountUtils ac = new AccountUtils();
//		
//		String domain = ac.getDomain("dima@yoll.io");
//		System.out.println(domain);
//		
//		String emailId = ac.getEmailId("Omar@yoll.io");
//		System.out.println(emailId);
//		
//		String username = ac.generateUsername(emailId);
//		System.out.println(username);

	}

}
