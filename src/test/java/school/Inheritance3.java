package school;

import lecaccsModifier.Inheritance;

public class Inheritance3 extends Inheritance {
	

	public static void main(String[] args) {
		// 
		Inheritance3 obj=new Inheritance3();
		obj.googleinbox();
		obj.googlesignin();
		obj.googlesignup();
		
		//obj.google [default will not access different package class]
		// { But public and protected will access different package class}
		
		
		
	}
 
}
