// My solution to the HackerRank.com problem "Equalize the Array."
// https://www.hackerrank.com/challenges/equality-in-a-array/problem

import java.util.ArrayList;
import java.util.Scanner;

public class EqualizeTheArrayApp {
    static int equalizeArray(int[] arr) {
        ArrayList<Integer> tempArray = new ArrayList<>();
        for(int idx1 = 0; idx1 < arr.length; idx1++) {
        	int count = 0;
        	for(int idx2 = 0; idx2 < arr.length; idx2++) {
        		if(arr[idx1] == arr[idx2]) {
        				count++;
        		}
        	}
        	tempArray.add(count);
        }
        System.out.println("Temp Array = "+ tempArray.toString());
    	int max = 0;
    	for(int idx3 = 0; idx3 < tempArray.size(); idx3++) {
    		max = Math.max(max,  tempArray.get(idx3));
    		System.out.println("Max num = "+max);
    	}
		System.out.println("Max num = "+max);
    	return (arr.length - max);  	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of array elements, n (integer 1-100): "); 
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            System.out.print("Enter the value of array element #"+ (arr_i + 1)+" (1-100): "); 
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }
}
