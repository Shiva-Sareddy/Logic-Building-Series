package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueElementsOptimised {

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
		
		// create an hashmap
		HashMap<Integer, Integer> hmap = new HashMap<>();
		
		// count occurences:
		for(int num : array) {
			hmap.put(num, hmap.getOrDefault(num, 0) + 1);
		}
		
		// print unique elements:
		for(Map.Entry<Integer, Integer> entry: hmap.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
		sc.close();
	}

}
