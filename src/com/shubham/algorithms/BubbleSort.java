package com.shubham.algorithms;


public class BubbleSort {

	
	public static void main(String[]args){
		
		int[] a={19,13,16,17,14,9,15,10,11};
		int k=0;
		for(int j=0;j<8;j++){	
			for(int i=0;i<8;i++){
			if(a[i]>a[i+1]){
				k=a[i];
				a[i]=a[i+1];
				a[i+1]=k;
			}
		}
	}
			for(int s=0;s<9;s++){
			System.out.println("."+a[s]);
			}
		}
	}
