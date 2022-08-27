 package school;

import java.util.ArrayList;

public class Testdata {
	
	public static void main(String[] args) {
	
	// Array of ArrayList and concept of 2D Array
		
		
		int n=5;
		ArrayList<String>[]al=new ArrayList[n];
		for (int i=0;i<n;i++) {
			al[i]=new ArrayList<String>();
		}
		
	 //we can add any number of columns to each
		//rows as per our requirements
		
		al[0].add("A");
		al[0].add("B");
		al[0].add("C");
		al[0].add("D");
		al[1].add("E");
		al[1].add("F");
		al[1].add("G");
		al[1].add("H");
		al[2].add("I");
		al[2].add("J");
		al[2].add("K");
		al[2].add("L");
		al[2].add("M");
		al[2].add("N");
		al[2].add("O");
		al[2].add("P");
		al[3].add("Q");
		al[3].add("R");
		al[3].add("S");
		al[3].add("T");
		al[4].add("U");
		al[4].add("V");
		al[4].add("W");
		al[4].add("X");
		al[4].add("Y");
		al[4].add("Z");
		
	 
	 
	 
	 for(int i=0; i<n;i++) {
		 for(int j=0; j<al[i].size(); j++) {
			 System.out.println(al[i].get(j) +" ");
		 }
		 System.out.println();
	 }
	 
	 
	 
	 
	 
	


		
		
		

		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
