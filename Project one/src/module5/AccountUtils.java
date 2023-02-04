package module5;

import java.util.Random;

public class AccountUtils {
	
	// Define instance methods
	
//	Method: getDomain()
//	Accept an email address as parameter
//	Return domain of the email address
    public String getDomain(String email) {
    	return email.substring(email.indexOf("@")+1);
    }

//	Method: getEmailID()
//	Accept an email address as parameter
//	Return email ID part of the email address
    public String getEmailId(String email) {
    	return email.substring(0, email.indexOf("@"));
    }
 
//	Method : generateUsername()
//	Accept a string (emailID)
//	Add random  3 numbers to the end of it
//	Return it as username
    public String generateUsername(String emailId) {
    	Random random = new Random();              
    	String username = emailId + random.nextInt(100,1000);
        return username.toLowerCase();

    	}
  
    
}