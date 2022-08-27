package school;


import java.util.Arrays;

public class schoolLec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = new int[5];
		
		arr[0]=23;
		arr[1]=45;
		arr[2]=233;
		arr[3]=545;
		arr[4]=3;
		System.out.println(arr[2]);
		
		int L=arr.length;
		System.out.println(L);
		System.out.println(arr[4]);
		
		System.out.println(Arrays.toString(arr));
		//Change
		arr[0]=40;
		System.out.println(arr);
		
		for(int t=0;t<arr.length;t+=1) {
			System.out.println(arr[t]);
		}
		//String car [] = new String [4];
		
		//cars[0]="Toyota";
		//cars[1]="Mazda";
		//cars[2]="Honda";
		//cars[3]="BMW";
		
		String[]cars = {"Toyota","Mazda","Honda","BMW"};
		
		System.out.println(" ");
		System.out.println(Arrays.toString(cars));
		
		System.out.println(cars[2]);
		
		int Fun = cars.length;
		System.out.println(Fun);
		
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);  
		}
		//change
		cars[1]="M";
		System.out.println(Arrays.toString(cars));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
	}

}
