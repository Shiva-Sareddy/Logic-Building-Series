package searchingAlgo;

import java.util.Scanner;

public class BinarySearch {

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
	     
	     
	     // Binary Search
	     int left = 0;
	     int right = size-1;
	     int flag = 0;
	     while(left <= right){
	         
	         int mid = left + (right - left) / 2;
	         
	         if(arr[mid] == item){
	             System.out.print("Element found at index: " + mid);
	             flag = 1;
	             break;
	         }
	         if(arr[mid] < item){
	             left = mid+1;
	         }
	         if(arr[mid] > item){
	             right = mid-1;
	         }
	     }
	     if(flag == 0){
	         System.out.println("Element not found");
	     }
	     sc.close();

	}

}
