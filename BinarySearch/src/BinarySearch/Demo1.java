package BinarySearch;



public class Demo1 {
	
	public static void main(String args[]) {
		
		
		int arr[] = {2,4,6,8,10};
		int target = 8;
		
		int result= BinarySearch(arr, target);
		if(result !=-1) {
			System.out.println("Element index at :" + result);
		}
		else
			System.out.println("Element not found");
	}
	
	
	public static int BinarySearch(int arr[],int target) {
		int steps = 0;
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			steps++;
			int mid = (left+right)/2;
			
			if(arr[mid]==target) {
				System.out.println("Steps taken by BinarySearch:" + steps);
				return mid;
			}
			else if(arr[mid]<target) {
				left=mid+1;
			}
			else
				right=mid-1;
		}
		System.out.println("Steps taken by BinarySearch:" + steps);
		return -1;
		
	}

}
