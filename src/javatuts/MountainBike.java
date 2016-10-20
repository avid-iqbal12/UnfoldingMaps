package javatuts;

public class MountainBike extends Bicycle{

	public int seatHeight;
	// subclass has only one field
	
	public MountainBike(int startHeight, int startCadence, 
			int startSpeed, int startGear){
		super(startCadence, startSpeed, startGear);
		seatHeight = startHeight;
		// subclass with one constructor
	}
	
	public void setHeight(int newValue){
		seatHeight = newValue;
	}
}
