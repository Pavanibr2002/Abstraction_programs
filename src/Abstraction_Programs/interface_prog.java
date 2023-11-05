package Abstraction_Programs;
	interface printable{  
	void print();  
	}  
	class interface_prog implements printable{  
	public void print(){System.out.println("Hello");}  
	  
	public static void main(String args[]){  
	interface_prog obj = new interface_prog();  
	obj.print();  
}  
}  

