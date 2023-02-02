package src;

public class Vehicle extends Engine implements Honkable{
	//inherit from Engine
	String make;
	String model;
	int year;
	String color;
	int numberOfWheels;
	int weight;
//************* set and get *************************	
	public void setMake( String make){
        this.make = make;
    }
    
    public String getMake(){
		return make;  
    }
	
    public void setModel( String model){
        this.model = model;
    }
    
    public String getModel(){
		return model; 
    }
    
    public void setYear( Integer year){
        this.year = year;
    }
    
    public Integer getYear(){
		return year;   
    }
    
    public void setColor( String color){
        this.color = color;
    }
    
    public String getColor(){
		return color;
    	       
    }
    
    public void setNumberOfWheels( Integer numberOfWheel){
        this.numberOfWheels = numberOfWheel;
    }
    
    public Integer getNumberOfWheels(){
		return numberOfWheels;
    }
    
    public void setWeight( Integer weight){
        this.weight = weight;
    }
    
    public Integer getWeight(){
		return weight;       
    }
    
//  **************************  Methods *****************************	
	void start() {
		//print Vehicle started
		System.out.println(" Vehicle started");	
	}
	
	void stop() {
		//print Vehicle stopped
		System.out.println(" Vehicle stopped");
	}
	
	void drive(int numberOfMiles) {
		//take in a number of miles driven as parameter and print "Vehicle driven X miles"
		System.out.println(" Vehicle driven " + numberOfMiles + " miles");
	}
	
	public void honk() {
		//print Honk Honk!
		System.out.println(" Honk Honk!");
	}
	
	//implement the method
	void startEngine() {
		
	}
	
	
	
}
