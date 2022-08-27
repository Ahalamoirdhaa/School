package school;

import lecaccsModifier.ParentsClass;

public class ChildClass2 {

	public static void main(String[] args) {
		// Create a object to access attribute from different package class
//Access attribute from accessmodifier 1(parentclass) to accessmodifier 2(childclass2) 
//Access  From different package class to another package class	
		ParentsClass obj1=new ParentsClass();
		System.out.println(obj1.num1);
		//System.out.println(obj1.nun2);[this is default thats why we can't access in different package class]
		//System.out.println(obj1.num3);[this is private thats why we can't in different class]
		
	
	

	}

}
