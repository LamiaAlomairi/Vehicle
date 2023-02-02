package src;

public class Car extends Vehicle{
	
	int numberOfDoors;
	
	//set and get *************************	
			public void setnumberOfDoors( Integer numberOfDoors){
		        this.numberOfDoors = numberOfDoors;
		    }
		    
		    public Integer getnumberOfDoors(){
				return numberOfDoors;  
		    }
		    
	//****   Method   *************************	
	void openTrunk() {
		//print Trunk opened
		System.out.println(" Trunk opened!");
	}
	
}
