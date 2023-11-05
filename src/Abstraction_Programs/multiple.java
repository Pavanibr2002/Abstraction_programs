package Abstraction_Programs;
interface Printable1{  
	void print();  
	}  
	interface Showable1{  
	void show();  
	}  
	class multiple implements Printable1,Showable1{  
	public void print(){System.out.println("Hello");}  
	public void show(){System.out.println("Welcome");}  
	  
	public static void main(String args[]){  
	multiple obj = new multiple();  
	obj.print();  
	obj.show();  
	 }  
}  
