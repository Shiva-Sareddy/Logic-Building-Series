package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElementsOptimised {

	public static void main(String[] args) {
		// import and create a Scanner class object
		Scanner sc = new Scanner(System.in);
		
		// take an integer n represents the size of an array
		int n = sc.nextInt();
		
		// create an array with size n
		int[] array = new int[n];
		
		// taking user entered values and store it in array
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		// finding duplicates using arrayList
		// create an arrayList
		HashSet<Integer> seen = new HashSet<>();
		ArrayList<Integer> duplicates = new ArrayList<>();
		
		// using for loop to find duplicate elements in our array
		for(int i = 0; i < n; i++) {
			if(seen.contains(array[i])) {
				if(!duplicates.contains(array[i])) {
					duplicates.add(array[i]);
				}
			}else {
				seen.add(array[i]);
			}
		}
		
		if(duplicates.isEmpty()) { // printing message when no duplicates found
			System.out.println("No Duplicates Found");
		}else {
			for(int elements : duplicates) { // printing elements using for each loop:
				System.out.print(elements + " ");
			}
		}
		sc.close();

	}

}
