import java.util.Scanner;

public class SingleDArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i;
		int a[]=new int [5];
		for(i=0; i<=4; i++)
		{
			
				System.out.print("Enter any value:");
				a[i]=sc.nextInt();
				
    	}
		
			System.out.println("Values from 1DArray is:");
	        for(i=0; i<=4; i++)
			{
						System.out.print(a[i] + " ");
						
		    }
	}
}	

