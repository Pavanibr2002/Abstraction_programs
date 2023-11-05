package Abstraction_Programs;
	interface Drawable{  
	void draw();  
	}  
	//Implementation: by second user  
	class Rectangle implements Drawable{  
	public void draw(){System.out.println("drawing rectangle");}  
	}  
	class Circle2 implements Drawable{  
	public void draw(){System.out.println("drawing circle");}  
	}  
	//Using interface: by third user  
	class circle{  
	public static void main(String args[]){  
	Drawable d=new Circle2();//In real scenario, object is provided by method e.g. getDrawable()  
	d.draw();  
	}}  

