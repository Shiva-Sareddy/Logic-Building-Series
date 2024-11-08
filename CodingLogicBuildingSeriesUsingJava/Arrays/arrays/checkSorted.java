package arrays;

import java.util.Scanner;

public class checkSorted {

	public static void main(String[] args) {
		// import and create a scanner class
		Scanner sc = new Scanner(System.in);
		
		// take size of the array n
		int n = sc.nextInt();
		
		// create an array of size n
		int[] array = new int[n];
		
		// taking elements from the user into array
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		// checking whether the array is sorted or not
		int result = 1;
		for(int i = 0; i < n-1; i++) {
			if(array[i] > array[i+1]) {
				result = 0;
				break;
				
			}
		}
		System.out.println("Is array sorted: " + result);
		sc.close();
	}

}
