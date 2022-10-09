import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i,j;
		int a[][]=new int [3][3];
		for(i=0; i<=2; i++)
		{
			for(j=0; j<=2; j++)
			{
				System.out.print("Enter any value:");
				a[i][j]=sc.nextInt();
			}	
				
    	}
	
	System.out.println("Values from 2DArray is:");
	for(i=0; i<=2; i++)
	{
		for(j=0; j<=2; j++)
		{
		System.out.print(a[i][j] + " ");
		}
		System.out.println();
	}	
	}
}
