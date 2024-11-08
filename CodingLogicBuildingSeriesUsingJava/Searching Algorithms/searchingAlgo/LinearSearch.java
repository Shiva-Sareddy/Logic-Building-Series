package searchingAlgo;
import java.util.*;

public class LinearSearch {
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the array size: ");
	     int size = sc.nextInt();
	     int[] arr = new int[size];
	     System.out.print("Enter " + size + " elements to insert in array: ");
	     for(int i = 0; i < size; i++){
	         arr[i] = sc.nextInt();
	     }
	     System.out.print("Enter the data to search: ");
	     int item = sc.nextInt();
 
	     // Linear search
	     int flag = 0;
	     for(int i = 0; i < size; i++){
	    	if(arr[i] == item){
	    		System.out.println("Element found at index: " + i);
	    		flag = 1;
	    		break;
	    	}
	     }
      if(flag == 0){
          System.out.println("Element not found");
      }
     
     
     sc.close();
 }
 
}