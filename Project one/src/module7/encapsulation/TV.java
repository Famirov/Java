package module7.encapsulation;

public class TV {
	
	//1. Write a custom class TV that has 4 instance variables: 
	private int channel = 1; 
	private int volumeLevel = 1; 
	private boolean on;  // default value is false
	private String brand;
	
	//2. Create one "no arguments" constructor that prints message: "Creating TV object using no Args- constructor".
	public TV() {
		System.out.println("Creating TV object using no Args - constructor");
	}
	
	// 3. Also, create one more constructor that defines instance variable brand,
    // and displays message:"Creating TV object using 1 arg - constructor"
	
	public TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}
	
	//4. Generate Getters and Setters for:
    //	volumeLevel, channel
	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public int getVolumeLevel() {
		return volumeLevel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	// 5.Create isOn(), turnOn() and turnOff() methods for changing the state of "on" instance variable.
    //  Create isOn method that will check tv status
    //  If tv is already on, no need to turn it on again, display message: "TV is already ON". 
    //  If tv is already off, then no need to turn it off again, display message: "TV is already OFF".
	
	public boolean isOn() {
		return on;
	}
	
	public void turnOn() {
		// we need to check if the tv is off and if it is off only then we will turn it on
		if(isOn() == true) {
			System.out.println("TV is already ON");	
		}else {
			on = true;
		}

	}
	
	public void turnOff() {
		
		if(isOn() == false) {
			System.out.println("TV is already OFF");	
		}else {
			on = false;
		}
		
	}
	
	
	//6. Declare methods channelUp() to increase variable channel by one
	//7. Declare method channelDown() to decrease variable channel by one.
	//8. Value of a variable channel cannot be negative or zero, and cannot be higher than 120.
	//   You may change channel only if TV is on.
	public void channelUp() {
		
		if(isOn() == true && getChannel() < 120 ) {
			setChannel(getChannel() + 1);
		} else {
			System.out.println("ERROR - either TV is off or the channel is out of the range!");
		}
		
	}
	
	
	public void channelDown() {
		                      
		if(isOn() == true && getChannel() > 1 ) {
			setChannel(getChannel() - 1);
		} else {
			System.out.println("ERROR - either TV is off or the channel is out of the range!");
		}

	}
	
	
	//9. Declare methods volumeUp() to increase variable volume by one
	//10. Declare method volumeDown() to decrease variable volume by one.
	//11. Volume can be only in the range between 1 and 7.
	//   You may change volume only if TV is on.
	//   Otherwise, display message: "ERROR: TV is either OFF or invalid Volume level".
	public void volumeUp() {
	
		if(isOn() == true && getVolumeLevel() < 7) {
			setVolumeLevel(getVolumeLevel() + 1);
		} else {
			System.out.println("ERROR - either TV is off or the volume is out of the range!");
		}
		
	}
	
	public void volumeDown() {
		
		if(isOn() == true && getVolumeLevel() > 1) {
			setVolumeLevel(getVolumeLevel() - 1);
		} else {
			System.out.println("ERROR - either TV is off or the volume is out of the range!");
		}
		
	}


}
