package school;

import java.util.ArrayList;
import java.util.Arrays;

public class MorningWork {
  public int abc =34;
	public static void main(String[] args) {
		
		MorningWork myobj3 = new MorningWork ();
		System.out.println(myobj3.abc);
		
		
		String []studentclass= {"VI","VII","VIII","IX","X"};
		
	
		System.out.println("***************************");
		ArrayList<String> VI = new ArrayList<String>();
		VI.add("A");
		VI.add("B");
		VI.add("C");
		 System.out.println("Total student of class Six = "+"Total " + VI.size());
		 
		//for(int five=0;five<VI.size();five++) {
		//	System.out.println(VI.get(five));	
		//}
		 System.out.println(VI);
	
		System.out.println("***************************");
		ArrayList<String> VII = new ArrayList<String>();
		
		VII.add("D");
		VII.add("E");
		VII.add("F");
		VII.add("G");
 	   System.out.println("Total student of class Seven = " +"Total " + VII.size());
       for(int f=0;f<VII.size();f++) {
    	   
    	   System.out.println(VII.get(f));	
		}
	
		
       System.out.println("***************************");
		ArrayList<String> VIII = new ArrayList<String>();
		
		VIII.add("H");
		VIII.add("J");
		VIII.add("K");
		VIII.add("L");
		VIII.add("A");
		
		 System.out.println("Total student of class Eight = " +"Total " + VIII.size());
	       for(int f=0;f<VIII.size();f++) {
	    	   
	    	   System.out.println(VIII.get(f));	
			}
		
	       System.out.println("***************************");
		ArrayList<String> IX = new ArrayList<String>();
		IX.add("M");
		IX.add("N");
		IX.add("P");
		IX.add("Q");
		IX.add("R");
		
		 System.out.println("Total student of class Nine = " +"Total " + IX.size());
	       for(int f=0;f<IX.size();f++) {
	    	   
	    	   System.out.println(IX.get(f));	
			}
		
	       System.out.println("***************************");
		ArrayList<String> X = new ArrayList<String>();
		
		X.add("B");
		X.add("F");
		X.add("S");
		X.add("T");
		X.add("U");
		X.add("V");
		X.add("Y");
		X.add("Z");
		
		 System.out.println("Total student of class Ten = " +"Total " + X.size());
	       for(int f=0;f<X.size();f++) {
	    	   
	    	   System.out.println(X.get(f));	
			}
		
		System.out.println("***************************");
		//R1:- Number of student in class IX
		System.out.println(IX);
		System.out.println("            ");
		System.out.println("Number of student class IX =" + IX.size());
		System.out.println("            ");
		//R2:- Number of student of entire school
		
		System.out.println("Number of student of entire school are :"+(VI.size()+VII.size()+VIII.size()+IX.size()+X.size()));
		System.out.println("            ");
		//R3:- The list of students of class VI
		
		System.out.println( "The list of students of class VI :" + (VI));
		System.out.println("            ");
		System.out.println( "The list of students of class VII :" + (VII));
		System.out.println("            ");
		System.out.println( "The list of students of class VIII :" + (VIII));
		System.out.println("            ");
		System.out.println( "The list of students of class IX :" + (IX));
		System.out.println("            ");
		System.out.println( "The list of students of class X :" + (X));
		System.out.println("            ");
		
		
		
		
		for(int i= 0;i < VI.size(); i++) {
			System.out.println(VI.get(i));
		}
		
		//R4.class wise list of students of entire school  
		
		String []class1 =new String[5];
		class1[0]="Class VI=3 Students";
		class1[1]="Class VII=4 Students";
		class1[2]="Class VIII=4 Students";
		class1[3]="class IX=5 Students";
		class1[4]="Class X=8 syudents";
		
		
		System.out.println(Arrays.toString(class1));
		int q=class1.length;
		System.out.println(q);
		for (int s=0;s<5;s++){
			System.out.println(class1[s]);
		}
		
		System.out.println("*********************");
		
		
		ArrayList<String>classes = new ArrayList<String>();
		
		classes.add("VI");
		classes.add("VII");
		classes.add("VIII");
		classes.add("IX");
		classes.add("X");
		
		System.out.println(classes.size());
		
		for (int W=0;W<classes.size();W++) {
			System.out.println(classes.get(W));	
		}
		
		
		
		
		
	}
}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


	

		