package arrays;

import java.util.Scanner;

public class SubArrays {

	public static void main(String[] args) {
		// Import and create a Scanner class
		Scanner sc = new Scanner(System.in);
		
		// Taking user input n which indicates the size of the array
		int n = sc.nextInt();
		
		// create an array of size n
		int[] array = new int[n];
		
		// take and store the elements from the user into the array
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		// Forming sub arrays from array
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				for(int k = i; k <= j; k++) {
					System.out.print(array[k]);
					if (k < j) { // Only print a comma if not the last element
                        System.out.print(", ");
                    }
				}
				System.out.println();
			}
		}
		sc.close();

	}

}
