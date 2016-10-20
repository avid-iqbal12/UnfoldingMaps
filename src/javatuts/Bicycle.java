package javatuts;

public class Bicycle { //three fields
	private int cadence;
	private int gear;
	private int speed;
	
	//add an instance variable for the object ID
	private int id;	
	private static int numberOfBicycles = 0;
	
	//Bicycle class has one constructor
	public Bicycle(	int startCadence, 
					int startSpeed, 
					int startGear){
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;	
		
		id = ++numberOfBicycles;
	}
	
	public int getID(){
		return id;
	}
	
	public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    public int getCadence() {
        return cadence;
    }
    
	// four methods 
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public int getGear(){
        return gear;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public int getSpeed() {
        return speed;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
}
