public class SortDescending {    
    public static void main(String[] args) {        
             
        int [] arr = new int [] {5, 2, 8, 7, 1,9};     
        int temp = 0;
		int i,j;		
            
        System.out.println("Elements of original array: ");    
        for (i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        for (i = 0; i < arr.length; i++) {     
            for (j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
            
        System.out.println();    
            
        System.out.println("Elements of array sorted in descending order: ");    
        for (i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    