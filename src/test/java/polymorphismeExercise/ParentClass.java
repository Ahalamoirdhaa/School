package polymorphismeExercise;

public class ParentClass {


	public void twitterSignin (String email,String pw) {
		if (email=="ahalam@gmail.com" && pw=="wer345") {
			System.out.println("Logged in successfully with valid email & pw");
		}
		else {
			System.out.println("Enter valid email or pw or both");
		}
	}
	
	public void twitterSignin (int phonenumber, String pw) {
		if (phonenumber == 12890458 && pw == "fghj890" ) {
			System.out.println("Logged in Successfully with valid phone number & pw");
		}
		else {
			System.out.println("Enter valid phonenumber & pw or both");
		}
	}
	
	void twitterSignup() {
		System.out.println("Signup in defult method");
	}
	
	protected void twitterSignup(String email,String name,String adress, String pw) {
		System.out.println("Sin up in protected method with the following detals: "+ "Name:"+name+"email:"+email +" "+"adress:"+adress+"pw:"+pw);
	}
	
	private void twitterProfile() {
		System.out.println("I am protected method and only accessile n parent class");
	}
	
	
	public static void main(String[] args) {
	
		
		System.out.println(("I am a superclass. I have different method with different accessmidifers."));

		
		ParentClass obj=new ParentClass();
		obj.twitterProfile();
		obj.twitterSignin("ahalam@gmail.com","wer345");
	}

}
