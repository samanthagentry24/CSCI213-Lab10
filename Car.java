// Car.java
// author: Samantha Gentry
// date: 5-7-2024

public class Car extends Vehicle {
	
	private int numDoors;
	private int numPassangers;
	
	public Car(String make, String model, String plate, int doors, int passangers) {
		super(make, model, plate);
		this.numDoors = doors;
		this.numPassangers = passangers; 
	}
	
	public int getNumDoors() {
		return this.numDoors;
	}
	
	public int getNumPassangers() {
		return this.numPassangers; 	
	}
	
	@Override
	public String toString() {
		String result = "";
		result = String.format("%d-door %s %s with license %s", this.numDoors, super.getMake(), super.getModel(), super.getPlate());
		return result;	
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(!(obj instanceof Car)) {
			return false;
		}
		Car other = (Car) obj;
		if(this.numDoors == other.getNumDoors()) {
			if(this.numPassangers == other.getNumPassangers()) {
				return super.equals(obj);
			}
		}
		return false;
	}
	
	public Car copy() {
		String theMake = super.getMake();
		String theModel = super.getModel();
		String thePlate = super.getPlate();
		int doorNumber = this.numDoors;
		int passangerNumber = this.numPassangers;
		
		Car theCopy = new Car(theMake, theModel, thePlate, doorNumber, passangerNumber);
		return theCopy; 
	}
}