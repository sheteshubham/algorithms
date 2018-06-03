package com.shubham.algorithms;

/**
 * 
 * @author zippo
 *
 */
public class BubbleSort {

	/**
	 * 
	 * @param input
	 * @return
	 */
	public int[] sort(int[] input) {
		
		for (int i : input) {
			System.out.println(i);
		}
		return null;
	}
	

	public static void main(String[] args) {
		
		int[] input = {3,75,3,2,6,7,9,45,78,32};
		BubbleSort bubbleSort = new BubbleSort();
		int[] output = bubbleSort.sort(input);
	}
	
}
