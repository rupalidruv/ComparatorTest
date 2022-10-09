import java.util.Scanner;
public class Subtraction2DArray
{
    public static void main(String[] args) 
    {

            int a[][] = new int[3][3];    
            int b[][] = new int[3][3];   
            int c[][] = new int[3][3];    
			Scanner sc = new Scanner(System.in);
			
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i <=2; i++) 
            {
                for (int j = 0; j <=2; j++) 
                {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println(" ");
           
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i <=2; i++) 
            {
                for (int j = 0; j<=2; j++) 
                {
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println(" ");
           
            System.out.println("First Matrix:");
            for (int i = 0; i<=2; i++) 
            {
                for (int j = 0; j<=2; j++) 
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
			
            System.out.println("Second Matrix:");
            for (int i = 0; i <=2; i++) 
            {
                for (int j = 0; j <=2; j++) 
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
			
            for (int i = 0; i <=2; i++) 
            {
                for (int j = 0; j <=2; j++) 
                {
                    for (int k = 0; k <=2; k++) 
                    {
                        c[i][j] = a[i][j] - b[i][j];
                    }
                }
            }
			
            System.out.println("Matrix after subtraction:");
            for (int i = 0; i <=2; i++) 
            {
                for (int j = 0; j <=2; j++) 
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
    }
}