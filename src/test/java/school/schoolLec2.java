package school;
import java.util.ArrayList;
public class schoolLec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList  is resizeable and not fix
		
		ArrayList<String>Letter = new ArrayList<String>();
		
		Letter.add("A");
		Letter.add("B");
		Letter.add("C");
		Letter.add("D");
		
		System.out.println(Letter);
		
		//access
		
		System.out.println(Letter.get(3));
		System.out.println(" ");
		System.out.println(Letter.size());
		
		for(int k=0;k<Letter.size();k++) {
			System.out.println(Letter.get(k));
		}
		
		//Change
		
		Letter.set(1,"T");
		System.out.println(Letter);
		
		//Remove
		
		Letter.remove(1);
		System.out.println(Letter);
		
		//Length/Size
		System.out.println(Letter.size());
		
		//Clear all
		
		Letter.clear();
		
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(77);
		num.add(66);
		num.add(88);
		num.add(99);
		num.add(44);
		System.out.println(num);
		
		//To access
		System.out.println(num.get(2));
		
		//Change an item
		
		num.set(3,55);
		System.out.println(num);
		
		//Remove an item
		num.remove(4);
		
		System.out.println(num);
		
		//Length
		System.out.println(num.size());
		
		//Clear
		num.clear();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
