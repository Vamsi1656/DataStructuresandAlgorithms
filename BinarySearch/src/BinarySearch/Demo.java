package BinarySearch;

public class Demo {
	
	public static int BinarySearch(int[] nums,int target) {
		
		int left=0;
		int right= nums.length-1;
		
		while(left <=right) {
			int mid=(left+right)/2;
			
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid] <target) {
				left = mid + 1;
			}
			else
				right=mid - 1;
		}
		
		return -1;
	}
	
	public static void main(String args[]) {
		
		int nums[]= {1,3,5,7,9};
		int target =7;
		
		int result =BinarySearch(nums, target);
		
		if(result != -1)
		System.out.println("Element found at index : " + result);
		else
		    System.out.println("Element not found");
	}

}
