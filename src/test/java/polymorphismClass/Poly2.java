package polymorphismClass;

public class Poly2 extends Poly1 implements  PolyInterface,PolyInterface2  {
 
  public void fbsignin(int phonenumber, String email,String pw) {
			System.out.println("Fblogin2 sucessfully");
		}
  public void fbsignin(int phonenumber, String email,String pw,String Name) {
		System.out.println("Fblogin2 sucessfully" +" "+ phonenumber+" "+ email+" "+ pw+" "+ Name );
	}
  
  
  
	public static void main(String[] args) {
		Poly2 obj = new Poly2();
		obj.googlelogin("Oirdhaa");
		obj.googlesignup();
		obj.googlesignin();
		
		obj.fbsignin(1234, "Sd34");
		obj.fbsignin("abc@gmail.com", "We45");
		//obj.fbsignin(123456, "Asdmail.com", "AS34", "Ahalam");
		
		obj.fbsignin(123456, "asd@gmail.com", "we234", "Ahalam");
		
		obj.yahoosignin("hjk@yahoo.com", "rty678");
		obj.yahoosignin("cvb@yahoo.com", "ploi", "Oirdhaa");
		obj.yahoosignup();
		
		obj.googlesignin("hjk@gmail.com", "rty678");
		obj.googlesignin("cvb@gmail.com", "ploi", "Oirdhaa");
		
 
	}
	public void fbsignin(String email, String pw, String Name) {
		
		
	}
	public void fbsignup() {
		
		
	}
	public void googlesignin(String email, String pw) {
	
		
	}
	public void googlesignin(String email, String pw, String Name) {
		
		
	}
	public void yahoosignin(String email, String pw) {
		
		
	}
	public void yahoosignin(String email, String pw, String Name) {
		
		
	}
	public void yahoosignup() {

		
	}

}
