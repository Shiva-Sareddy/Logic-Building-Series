package arrays;
import java.util.Scanner;

public class BasicArray {

	public static void main(String[] args) {
		// Step 1: Create and import Scanner Class
		Scanner sc = new Scanner(System.in);
		
		// Take input n, representing the size of the array
		int n = sc.nextInt();
		
		// Create an Array of size n
		int[] array = new int[n];
		
		// use for loop to store the elements into the array
		for(int i = 0; i < n; i++) {
			// use indexing to store elements at each position
			array[i] = sc.nextInt();
		}
		
		// Print the original array using for loop
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// Print the array of elements in reverse order in list format
		for(int i = n-1; i >= 0; i--) {
			System.out.println((n-i) + ". " + array[i] );
		}
		sc.close();
	}

}
