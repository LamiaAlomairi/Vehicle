package src;

public class Truck extends Vehicle{
	
	int numberOfAxles;
	int capacityInTons;
	
	//set and get *************************	
		public void setnumberOfAxles( Integer numberOfAxles){
	        this.numberOfAxles = numberOfAxles;
	    }
	    
	    public Integer getnumberOfAxles(){
			return numberOfAxles;  
	    }
	    
	    public void setcapacityInTons( Integer capacityInTons){
	        this.capacityInTons = capacityInTons;
	    }
	    
	    public Integer getcapacityInTons(){
			return capacityInTons;  
	    }
	    
	  //   Method *************************	
	void load(double weight) {
		//takes in parameter for the weight of the load and print "Loaded X tons"
		System.out.println(" Loaded " + weight + " tons");
	}
	
}
