package polymorphismeExercise;

public class ChildClass1 extends ParentClass {

	public static void main(String[] args) {
	
		System.out.println("I am subclass of parent class");
		
		System.out.println("********************************");
		ChildClass1 lnl=new ChildClass1();
		lnl.twitterSignin(2345890, "dfbn890");
		System.out.println("********************************");
		lnl.twitterSignin("ahalam@gmail.com", "wer456");
		System.out.println("********************************");
		lnl.twitterSignup();
		System.out.println("********************************");
		lnl.twitterSignup("ahalam@gmail.com", "Ahalam", "345 state college", "rt56fg67");
		
		
		
		
		
		
	}

}
