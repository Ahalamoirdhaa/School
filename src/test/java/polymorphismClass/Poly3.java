package polymorphismClass;

public class Poly3 implements PolyInterface {

	public static void main(String[] args) {
		
		Poly3 obj= new Poly3 ();
		obj.fbsignin("zxc@gmail.com", "23456rt");
		
		obj.fbsignin("fgh@gmail.com", "ty678", "Oirdhaa");
	}
		
		public void fbsignin(String email, String pw) {
		
		System.out.println( "Fb signin sucessefully using "+ "  "+email+" "+ pw);
	}

	public void fbsignin(String email, String pw, String Name) {
	
		System.out.println("Fb signin sucessefully using"+ " "+email+" "+ pw+" "+Name);
	}

	public void fbsignup() {
		
		System.out.println("Fbsignin sucessfully");
	}

}
