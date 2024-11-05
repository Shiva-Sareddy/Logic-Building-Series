package arrays;

import java.util.Scanner;

public class UniqueElements {

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
		
		// finding unique elements in the array:
		for(int i = 0; i < n; i++) {
			int count = 0;
			for(int j = 0; j < n; j++) {
				if(array[i] == array[j]) {
					count++;
				}
			}
			if(count == 1) {
				System.out.print(array[i] + " ");
			}
		}
		sc.close();
	}

}
