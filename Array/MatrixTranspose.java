import java.util.Scanner;

public class MatrixTranspose{  
public static void main(String args[]){  
	Scanner sc=new Scanner(System.in);
	int i,j;
	int original[] []=new int[3][3];  
	int transpose[][]=new int[3][3];
    
for(i=0; i<=2; i++)
{
	for(j=0; j<=2; j++)
	{
			
		System.out.print("Enter any value:");
		original[i][j]=sc.nextInt();
				
    }
}
System.out.println("Values from original is:");	
for(i=0;i<=2;i++){    
for(j=0;j<=2;j++){    
transpose[i][j]=original[j][i];  
}    
}    
  
System.out.println("Printing Matrix without transpose:");  
for(i=0;i<=2;i++){    
for(j=0;j<=2;j++){    
System.out.print(original[i][j]+" ");    
}    
System.out.println();  
}    
System.out.println("Printing Matrix After Transpose:");  
for(i=0;i<=2;i++){    
for(j=0;j<=2;j++){    
System.out.print(transpose[i][j]+" ");    
}    
System.out.println();   
}    
}}  