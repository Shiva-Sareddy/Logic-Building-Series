package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		// import and create a Scanner class
		Scanner sc = new Scanner(System.in);
		
		// Take the size of array i.e. n
		int n = sc.nextInt();
		
		// create an array of size n
		int[] array = new int[n];
		
		// store the elements into the array entered by user
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		//Sorting using manual methods 
		int[] newArray = array.clone();
		int temp;
		for(int i = 0; i < n-1; i++) {
			int flag = 0;
			for(int j = 0; j < n-1-i; j++) {
				if(newArray[j] > newArray[j+1]) {
					temp = newArray[j];
					newArray[j] = newArray[j+1];
					newArray[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0) {
				break;
			}
		}
		
		// Printing sorted elements in ascending order
		System.out.print("Sorted in Ascending order(bs): ");
		for(int element2 : newArray) {
			System.out.print(element2 + " ");
		}
		System.out.println();
		
		// Printing elements in descending order
		System.out.print("Sorted in Descending order(bs): ");
		for(int i = n-1; i >= 0; i--) {
			System.out.print(newArray[i] + " ");
		}
		System.out.println();
		sc.close();
		
		
		//Sorting using built in methods:
				// Ascending order:
				Arrays.sort(array);
				
				// Printing the sorted array that used built in methods using for each loop
				System.out.print("Sorted using built in (ascending order): ");
				for(int element1: array) {
					System.out.print(element1 + " ");
				}
				System.out.println();
				
				// Printing the array in descending order (manually) as there is no built in method in arrays to descending order
				System.out.print("Sorted using built in (descending order): ");
				for(int i = n-1; i >= 0; i--) {
					System.out.print(array[i] + " ");
				}
				System.out.println();

	}

}
