package Logical_Program;

public class PracticeEvenOdd {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		System.out.println("Print Even Number:- ");
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%2==0) 
				
				System.out.println(a[i]);
			
			}
		System.out.println("Print Odd Number:- ");
		for (int i = 0; i < a.length; i++) {
			
			
			if(a[i]%2!=0) 
				System.out.println(a[i]);
			
		}
		
		
		
	}

}
