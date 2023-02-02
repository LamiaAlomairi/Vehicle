package src;

public class ElectricVehicle extends Vehicle{
	//inherits from Vehicle class
	int batteryCapacity;
	int chargeLevel;
	
	//************* set and get *************************	
		public void setBatteryCapacity( Integer batteryCapacity){
	        this.batteryCapacity = batteryCapacity;
	    }
	    
	    public Integer getBatteryCapacity(){
			return batteryCapacity;  
	    }
	    
	    public void setChargeLevel( Integer chargeLevel){
	        this.chargeLevel = chargeLevel;
	    }
	    
	    public Integer getChargeLevel(){
			return chargeLevel;  
	    }
	    
	    
	    
	    
	
	void charge(int amountOfCharge) {
		//increases the charge level of the battery
		
		System.out.println(" Charge Level = " + (chargeLevel += amountOfCharge));
		
	}
	
	@Override
	void drive(int numberOfMiles) {
		//print Electric Vehicle driven X miles
		System.out.println(" Electric Vehicle driven " + numberOfMiles + " miles");
	}
	
}
