package polymorphismClass2;

public class PolymorphismClass3 extends PolymorphismClass2 implements PolymorphismInterface, PolymorphismInterface2 {

	public void hotmailsignin(String name,String id,String pw) {
		System.out.println("Sucessfully signin hotmail"+"  "+name+" "+id+" "+pw);
	}
	
	
	
	public static void main(String[] args) {
		

		PolymorphismClass3 object=new PolymorphismClass3();
		
		object.hotmailsignin("Ahalam", "Man12134", "vbnm345");
		
		object.hotmailsignin("jon34@hotmail.com","wer45678" );
		object.hotmailsignin(814654890, "iop890");
		
		object.fbsignin("rfv@google.com", "plmn");
		object.fbsignin(4567890, "ko90890", "Ahalam");
		object.fbsignin("ertyu@gmail.com", "poiuy","Oirdhaa");
		object.fbsignup();
		
		object.yahoosignin("rtyu@yahoo.com", "efbn");
		object.yahoosignin("yhnm@yahoo.com", "tgcn", "Ahalam");
		object.yahoosignup();
		
		
	}

	public void fbsignin(String email, String pw) {
		
		
	}

	public void fbsignin(String email, String pw, String name) {
		
		
	}

	public void fbsignin(int phonenumber, String pw, String name) {
		
		
	}

	public void fbsignup() {
		
		
	}

	public void yahoosignin(String email, String pw) {
		
		
	}

	public void yahoosignin(String email, String pw, String Name) {
		
		
	}

	public void yahoosignup() {
		
		
	}

}
