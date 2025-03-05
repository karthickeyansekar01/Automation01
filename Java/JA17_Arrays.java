package basics;

public class Arrays {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * Different ways of declaring array

						1.datatype[]  arrayname=new datatype[size];
						
						2.int arrayname[];
						   arrayname=new int[size];
						
						3.int array[]={val1,val2,val3,val4,val5};
						             (Or)
						 int array[]=new int[]{val1,val2,val3};



					Examples:
						
						1.int age[]=new int[3];
						
						2.int[] marks=new int[4];
						        
						3.int score[];
						    score=new int[5];


		 */
		
		
		
		
		
		
		
		//calling array value using normal for loop
		//Integer array
		int[] arr;
		arr=new int[3];// size is declared
	    arr[0]=10;// initializing
		arr[1]=20;
		arr[2]=30;
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);	
		}	
		
		//using enhanced for loop   
		//String array
		
		String s1[]=new String[3];
	    s1[0]="i";
		s1[1]="love";
		s1[2]="java";
		
		for(String a:s1)// enhanced for loop
		{
			System.out.println(a);
		}

		
		
		

	}

}
