package polymorphismClass;

public class Poly1 {
	
	public void fbsignin(String email,String pw) {
		System.out.println("Fblogin sucessfully"+"   "+email +"  "+ pw ); // < concatenation
	}

	  void fbsignin(int phonenumber,String pw) {
			System.out.println("Fblogin1 sucessfully");
		}
	
	 public void fbsignin(int phonenumber, String email,String pw) {
			System.out.println("Fblogin2 sucessfully");
		}
	 public void fbsignin () {
		 
	 }
	
	

	public void googlesignin() {
		System.out.println("Signin sucessfully");
	}
	protected void googlesignup() {
		System.out.println("Signup sucessfully");
	}
	 void googlelogin(String name) {
		System.out.println("Login sucessfully");
	}
	 
	 void googlelogin(String name,String pw) {
			System.out.println("Login sucessfully"+" "+name+" "+pw);
		}
	 private void google() {
			System.out.println("Google sucessfully");
		}
		
	
	public static void main(String[] args) {
		
		Poly1 obj=new Poly1();
		obj.googlelogin("Ahalam");
		obj.googlelogin("Ahalam", "erty678");

		obj.googlelogin("Lamissa");
	}

}
