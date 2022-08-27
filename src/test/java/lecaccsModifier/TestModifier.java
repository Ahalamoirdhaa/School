package lecaccsModifier;

public class TestModifier {
	  
	// method over loading same method name with different parameter/argument
	public void fbsignin(String email,String pw) {
		
	}

	
	
	
	public void fbsignin() {
		
	}
	
	public void fbsignin(String fristname,String lastname,String email ) {
		
	}
	
	public void fbsignin(String fristname,String lastname,String email,String city ) {
		
	}
	
	
	//Public access modifier  
	public int num1=20;  
   
	//default
	int num2=23;
	
	//private
	private int num3=40;
	
// how to create method:- Accessmodifier returntype methodname(){}
	public void fbsignin2() { 
	 System.out.println("Logged in");
	}
	
	 void signup() {
		
	}
	 
	 private void fbsignin1() {
		 
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		String flower="Rose";
//To create an object syntax is classname objectname=new classname();		
		 TestModifier myobj = new  TestModifier();
		  System.out.println(myobj.num1);
		  System.out.println(myobj.num2);
		  System.out.println(myobj.num3);
		  
		  
          myobj.fbsignin1();		 
		  myobj.fbsignin1();
		  

		  TestModifier myobj1 = new  TestModifier();
		  System.out.println(myobj1.num1);
		  System.out.println(myobj1.num2);
		  System.out.println(myobj1.num3);
		  
		  
		  
		  
		  

	}

}
