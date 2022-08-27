package lecaccsModifier;

public class ParentsClass {
	//public Access Modifiers
//public attribute
	public int num1=20;
	
	// default modifier
	int nun2=23;
	
	//private modifier
	private int num3=40;
	
	//  what is method ?
	//Method is a platform to write code.Method always contain a block of code.
	//How to create a method: Syntax----Accessmodifier returntype methodname() {} 
	
	public void fbsignin( String email,int pw) {
		// block of code
	}
	
	private void fbsignin1() {
		
	}
	
	void signin(int phonenumber,int pw)
	{
		
	}
	 
	public static void main(String[] args) { //main method should be one in one class
		
		// Access Modifiers
		
		
		// Access Modifiers for Attribute level
	// It is default attribute	
		int num=10;
		String flower="rose";
		
		// create the object for access (in same class)And objectname can be any thing
		//To create the object syntax is classname objectname=new classname();
		ParentsClass myobj=new ParentsClass();
		System.out.println(myobj.num1);
		System.out.println(myobj.nun2);
		System.out.println(myobj.num3);
		
		
		// Access the method in same class
		
		
		myobj.fbsignin1();
	
      
	}
}
