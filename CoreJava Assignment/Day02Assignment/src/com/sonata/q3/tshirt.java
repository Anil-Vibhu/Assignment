package com.sonata.q3;



public class tshirt {
	
	String color;
	String material;
	String design;
     String size;
  
     tshirt(){}
     tshirt(String color, String material, String design){
 	this.color = color;
 	this.material = material;
 	this.design = design;
 	}
     
 	public void display() {
 	System.out.println("color:" + color);
 	System.out.println("material:" + material);
 	System.out.println("design:" + design);
 	}
		 

	public static void main(String[] args) {
		
		tshirt tee  = new tshirt();  
		tee.size = "small";
		
		 
		tshirt teel  = new tshirt();  
		teel.size = "large";
		
		tshirt teex  = new tshirt();  
		teex.size = "xtralarge";
		
		tshirt t = new tshirt("red", "cotton", "solid");
		
		 t.display();
		System.out.println(tee.size);
		System.out.println(teel.size);
		System.out.println(teex.size);
		//System.out.println(tshirt.color);
		
		

	}

}
