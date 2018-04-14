package datastructres;

/**
 * @author Abhinav Srivastava
 * Selection Sort (Slightly Better than BubbleSort)
 * Time Complexity : O(N*N)
 */
public class SelectionSort {

	// For Byte
	public void sort(byte[] arr, int order) {
		for(int i=0;i<arr.length-1;i++) {
			int min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(order==0) {
					if(arr[j]<arr[min]) {
						byte temp = arr[min];
						arr[min] = arr[j];
						arr[j] = temp;
					}
				}
				else {
					if(arr[j]>arr[min]) {
						byte temp = arr[min];
						arr[min] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
	}

	// For Short
		public void sort(short[] arr, int order) {
			for(int i=0;i<arr.length-1;i++) {
				int min = i;
				for(int j=i+1;j<arr.length;j++) {
					if(order==0) {
						if(arr[j]<arr[min]) {
							short temp = arr[min];
							arr[min] = arr[j];
							arr[j] = temp;
						}
					}
					else {
						if(arr[j]>arr[min]) {
							short temp = arr[min];
							arr[min] = arr[j];
							arr[j] = temp;
						}
					}
				}
			}
		}
	
		// For Integer
		public void sort(int[] arr, int order) {
			for(int i=0;i<arr.length-1;i++) {
				int min = i;
				for(int j=i+1;j<arr.length;j++) {
					if(order==0) {
						if(arr[j]<arr[min]) {
							int temp = arr[min];
							arr[min] = arr[j];
							arr[j] = temp;
						}
					}
					else {
						if(arr[j]>arr[min]) {
							int temp = arr[min];
							arr[min] = arr[j];
							arr[j] = temp;
						}
					}
				}
			}
		}
		
		// For Long
		public void sort(long[] arr, int order) {
			for(int i=0;i<arr.length-1;i++) {
				int min = i;
				for(int j=i+1;j<arr.length;j++) {
					if(order==0) {
						if(arr[j]<arr[min]) {
							long temp = arr[min];
							arr[min] = arr[j];
							arr[j] = temp;
						}
					}
					else {
						if(arr[j]>arr[min]) {
							long temp = arr[min];
							arr[min] = arr[j];
							arr[j] = temp;
						}
					}
				}
			}
		}
		
		// For Float
		public void sort(float[] arr, int order) {
			for(int i=0;i<arr.length-1;i++) {
				int min = i;
				for(int j=i+1;j<arr.length;j++) {
					if(order==0) {
						if(arr[j]<arr[min]) {
							float temp = arr[min];
							arr[min] = arr[j];
							arr[j] = temp;
						}
					}
					else {
						if(arr[j]>arr[min]) {
							float temp = arr[min];
							arr[min] = arr[j];
							arr[j] = temp;
						}
					}
				}
			}
		}
		
		// For Double
		public void sort(double[] arr, int order) {
			for(int i=0;i<arr.length-1;i++) {
				int min = i;
				for(int j=i+1;j<arr.length;j++) {
					if(order==0) {
						if(arr[j]<arr[min]) {
							double temp = arr[min];
							arr[min] = arr[j];
							arr[j] = temp;
						}
					}
					else {
						if(arr[j]>arr[min]) {
							double temp = arr[min];
							arr[min] = arr[j];
							arr[j] = temp;
						}
					}
				}
			}
		}
		
		// For Char
		public void sort(char[] arr, int order) {
			for(int i=0;i<arr.length-1;i++) {
				int min = i;
				for(int j=i+1;j<arr.length;j++) {
					if(order==0) {
						if(arr[j]<arr[min]) {
							char temp = arr[min];
							arr[min] = arr[j];
							arr[j] = temp;
						}
					}
					else {
						if(arr[j]>arr[min]) {
							char temp = arr[min];
							arr[min] = arr[j];
							arr[j] = temp;
						}
					}
				}
			}
		}
		
		// For String
		public void sort(String[] arr, int order) {
			for(int i=0;i<arr.length-1;i++) {
				int min = i;
				for(int j=i+1;j<arr.length;j++) {
					if(order==0) {
						if(arr[j].compareTo(arr[min])>0) {
							String temp = arr[min];
							arr[min] = arr[j];
							arr[j] = temp;
						}
					}
					else {
						if(arr[j].compareTo(arr[min])<0) {
							String temp = arr[min];
							arr[min] = arr[j];
							arr[j] = temp;
						}
					}
				}
			}
		}
		
}