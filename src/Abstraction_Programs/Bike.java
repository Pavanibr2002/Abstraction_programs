package Abstraction_Programs;
	abstract class Bike1{  
	  abstract void run();  
	}  
	class Bike extends Bike1{  
	void run(){System.out.println("running safely");}  
	public static void main(String args[]){  
	 Bike1 obj = new Bike();  
	 obj.run();  
	}  }

