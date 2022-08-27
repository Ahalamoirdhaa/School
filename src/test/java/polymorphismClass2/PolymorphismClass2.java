package polymorphismClass2;

public class PolymorphismClass2 extends Polymorphism1 implements PolymorphismInterface ,PolymorphismInterface2 {
	
	public void hotmailsignin(String email,String pw) {
		System.out.println("sucessfully hotmailsignin"+" "+email+" "+pw  );
	}
	
	public void hotmailsignin(int phonenumber,String pw) {
		System.out.println("sucessfully hotmailsignin option 2"+" "+phonenumber+" "+pw  );
	}

	public static void main(String[] args) {
		
		PolymorphismClass2 obj=new PolymorphismClass2();
		obj.hotmail();
		obj.hotmail("Ifraz", "wer456");
		
		
		
		
		obj.google();
		obj.googleinbox();
		obj.googlesignin();
		obj.googlesignup();
		obj.googlesignup1();
		
		obj.fbsignin("dfg@gmail.com", "fg567");
		obj.fbsignin(890654, "rtyuio", "Ahalam");
		obj.fbsignup();
		obj.fbsignin("ghjkl@gmail.com", "tyuio","Oirdhaa");
		
		obj.yahoosignup();
		obj.yahoosignin("asdf45@yahoo.com", "er4567");
		obj.yahoosignin("wer@yahoo.com", "jkloi","Ahalam");
		obj.fbsignup();
		
		
	}

	public void fbsignin(String email, String pw) {

	System.out.println("Sucessfully signin fb"+"  "+email+"  "+pw);	
	}

	public void fbsignin(String email, String pw, String name) {
		
		
	}

	public void fbsignin(int phonenumber, String pw, String name) {
		
		
	}

	public void fbsignup() {
		
		
	}

	public void yahoosignin(String email, String pw) {
		
		System.out.println("Sucessfully signin yahoo"+"  "+email+" "+pw);	
	}

	public void yahoosignin(String email, String pw, String Name) {

		System.out.println("Sucessfully signin yahoo"+"  "+email+" "+pw+"  "+Name);
	}

	public void yahoosignup(String email,String pw) {
		System.out.println("Sucessfully signup yahoo"+"  "+email+" "+pw);
		
	}

	public void yahoosignup() {
	
		
	}

}
