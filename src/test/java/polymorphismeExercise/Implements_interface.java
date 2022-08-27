package polymorphismeExercise;

public class Implements_interface implements Interface1 , Interface2 {

	public static void main(String[] args) {
		
		Implements_interface ogh = new Implements_interface();
		
		ogh.fbsignin(67890567, "werdfg34");
        ogh.fbsignin("Ahalam@yahoo.com", "ertfghnm90");
        ogh.fbsignup();
       
	}

	public void googlesignin(String email, String pw) {
		System.out.println("Google signin sucessfully with email and pw");	
	
	}

	public void googlesignin(int phonenumber, String pw) {
		System.out.println("Google signin sucessfully with phonenumber and pw");	
			
	}

	public void googlesignin() {
		
	}

	public void googlesignup(String email, String pw) {
		System.out.println("Google signup sucessfully with email and pw");			
	}

	public void googlebox() {
		
	}

	public void fbsignin(String email, String pw) {
		System.out.println("Fb sign in sucessfully with email and pw");	
	
	}

	public void fbsignin(int phonenumber, String pw) {
		System.out.println("Fb signin sucessfully with phonenumber and pw");	
	
	}

	public void fbsignup() {
	System.out.println("Fb signup sucessfully");	
	}

}
