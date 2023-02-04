package Week16;

import java.util.Scanner;

public class Methodswithreturn9simpleroombooking {

	public static void main(String[] args) {
		
	/*164*/	
/*Instructions from your teacher:

To book a room first it needs to be available for rent and make sure its 
available at the date selected:
the room is already booked between 7/1/2018 - 7/8/2018 and not available
accepting bookings only for year of 2018

example:

simpleRoomBook(false,2,1,2018)

return false

simpleRoomBook(true,2,1,2018)

return true

simpleRoomBook(true,7,2,2018)

return false*/		
		
		
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Boolean Value isAvailable:");
        boolean isAvailable = input.nextBoolean();
 
        System.out.println("Enter month:");
        int month = input.nextInt();
        
 
        System.out.println("Enter day:");
        int day = input.nextInt();
 
        System.out.println("Enter year:");
        int year = input.nextInt();
 
        System.out.println(simpleRoomBook(isAvailable, month, day, year));
		

		

	}
	
	
	
	public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
		
		
		/*example:

		simpleRoomBook(false,2,1,2018)

		return false

		simpleRoomBook(true,2,1,2018)

		return true

		simpleRoomBook(true,7,2,2018)

		return false*/	
		
		
	
		
		
		
		if (isAvailable == false || month==7 && 1<=day && day<=8 && year == 2018) {
			
			
			return false;
		}	
		
		else {
			return true;
		}
		
	
		
		
		
		
	

		
		
	}
	
	
	
	
	
	
	
}
