package src;

public class Main {

	public static void main(String[] args) {
		
		//Vehicle vehicleObject = new Vehicle();
	    ElectricVehicle electricVehicle = new ElectricVehicle();
	    Truck truck = new Truck();
	    Car car = new Car();
	    
	     System.out.println(" Electric Vehicle"); 
	     electricVehicle.setMake("Oman");
	     electricVehicle.setModel("Y9");
	     electricVehicle.setYear(2019);
	     electricVehicle.setColor("White");
	     electricVehicle.setNumberOfWheels(4);
	     electricVehicle.setWeight(50);
	     electricVehicle.setBatteryCapacity(20);
	     electricVehicle.setChargeLevel(2);
	     System.out.println(" Make in: "+electricVehicle.getMake());
	     System.out.println(" Model is: "+electricVehicle.getModel());
	     System.out.println(" year: "+electricVehicle.getYear());
	     System.out.println(" Color is: "+electricVehicle.getColor());
	     System.out.println(" Number Of Wheels: "+electricVehicle.getNumberOfWheels());
	     System.out.println(" Weight: "+electricVehicle.getWeight());
	     System.out.println(" Battery Capacity: "+electricVehicle.getBatteryCapacity());
	     System.out.println(" Charge Level: "+electricVehicle.getChargeLevel());
	     electricVehicle.start();
	     electricVehicle.charge(2);
	     electricVehicle.drive(60);
	     electricVehicle.honk(); 
	     electricVehicle.stop();
	     System.out.println();
	     System.out.println("_____________________________"); 
	                               
	     System.out.println(" Truck");
	     truck.setMake("Korea");
	     truck.setModel("A1");
	     truck.setYear(2003);
	     truck.setColor("Black");
	     truck.setNumberOfWheels(6);
	     truck.setWeight(200);
	     truck.setnumberOfAxles(4);
	     truck.setcapacityInTons(66);
	     System.out.println(" Make in: "+truck.getMake());
	     System.out.println(" Model is: "+truck.getModel());
	     System.out.println(" year: "+truck.getYear());
	     System.out.println(" Color is: "+truck.getColor());
	     System.out.println(" Number Of Wheels: "+truck.getNumberOfWheels());
	     System.out.println(" Weight: "+truck.getWeight());
	     System.out.println(" Number Of Axles: "+truck.getnumberOfAxles());
	     System.out.println(" Capacity In Tons: "+truck.getcapacityInTons());
	     truck.start();
	     truck.drive(40);
	     truck.honk();
	     truck.load(150.6);
	     truck.stop();
	     System.out.println();
	     System.out.println("_____________________________"); 
	     
	     System.out.println(" Car");
	     car.setMake("Iraq");
	     car.setModel("00q");
	     car.setYear(1999);
	     car.setColor("Read");
	     car.setNumberOfWheels(4);
	     car.setWeight(20);
	     car.setnumberOfDoors(2);
	     System.out.println(" Make in: "+car.getMake());
	     System.out.println(" Model is: "+car.getModel());
	     System.out.println(" year: "+car.getYear());
	     System.out.println(" Color is: "+car.getColor());
	     System.out.println(" Number Of Wheels: "+car.getNumberOfWheels());
	     System.out.println(" Weight: "+car.getWeight());
	     System.out.println(" Number of doors: "+car.getnumberOfDoors());
	     car.start();
	     car.drive(35);
	     car.honk();
	     car.openTrunk();
	     car.stop();
		
	}

}
