package datastructres;

/**
 * @author Abhinav Srivastava
 * Bubble Sort
 * Time Complexity : O(N*N)
 */
public class BubbleSort {

	
	// For Byte
		public void sort(byte arr[],int order) {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-1-i;j++) {
					if(order==0) {
						if(arr[j]>arr[j+1]) {
							byte temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1]= temp;
								}
						 }
					else {
						if(arr[j]<arr[j+1]) {
							byte temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1]= temp;
						}
					}
				}
			}
		}
	
	// For Short
		public void sort(short arr[],int order) {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-1-i;j++) {
					if(order==0) {
						if(arr[j]>arr[j+1]) {
							short temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1]= temp;
								}
						 }
					else {
						if(arr[j]<arr[j+1]) {
							short temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1]= temp;
						}
					}
				}
			}
		}
	
	// For Integer
	public void sort(int arr[],int order) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(order==0) {
					if(arr[j]>arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1]= temp;
							}
					 }
				else {
					if(arr[j]<arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1]= temp;
					}
				}
			}
		}
	}
	
	// For Long
		public void sort(long arr[],int order) {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-1-i;j++) {
					if(order==0) {
						if(arr[j]>arr[j+1]) {
							long temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1]= temp;
								}
						 }
					else {
						if(arr[j]<arr[j+1]) {
							long temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1]= temp;
						}
					}
				}
			}
		}
		
		// For Float
		/*
		 * Enter 0 for ascending order and non zero integer for descending order.
		 */
		public void sort(float arr[],int order) {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-1-i;j++) {
					if(order==0) {
						if(arr[j]>arr[j+1]) {
							float temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1]= temp;
								}
						 }
					else {
						if(arr[j]<arr[j+1]) {
							float temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1]= temp;
						}
					}
				}
			}
		}
		
		// For Double
		public void sort(double arr[],int order) {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-1-i;j++) {
					if(order==0) {
						if(arr[j]>arr[j+1]) {
							double temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1]= temp;
								}
						 }
					else {
						if(arr[j]<arr[j+1]) {
							double temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1]= temp;
						}
					}
				}
			}
		}
		
		// For char
		public void sort(char arr[],int order) {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-1-i;j++) {
					if(order==0) {
						if(arr[j]>arr[j+1]) {
							char temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1]= temp;
								}
						 }
					else {
						if(arr[j]<arr[j+1]) {
							char temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1]= temp;
						}
					}
				}
			}
		}
	
		// For String
		public void sort(String arr[],int order) {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-1-i;j++) {
					if(order==0) {
						if(arr[j].compareTo(arr[j+1])>0) {
							String temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1]= temp;
								}
						 }
					else {
						if(arr[j].compareTo(arr[j+1])<0) {
							String temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1]= temp;
						}
					}
				}
			}
		}
}