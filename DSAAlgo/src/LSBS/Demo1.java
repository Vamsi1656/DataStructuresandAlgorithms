package LSBS;

public class Demo1 {
	
	public static int LinearSearch(int num[],int target) {
		int steps = 0;
		for(int i=0;i<num.length;i++) 
		{
			steps++;
			if(num[i]==target) {
				System.out.println("Steps taken by linearsearch are " + steps);
				return i;
			}
		}
		System.out.println("Steps taken by linearsearch are " + steps);
		return -1;
	}
	
	public static int BinarySearch(int num[],int target) {
		
		int steps = 0;
		int left=0;
		int right=num.length-1;
		
		while(left<=right) {
			steps++;
			int mid = (left+right)/2;
			if(num[mid]==target) {
				System.out.println("Steps taken by binarysearch are " + steps);
				return mid;
			}
			else if(num[mid]< target) {
				left=mid+1;
			}
			else 
				right = mid-1;
		}
		System.out.println("Steps taken by binarysearch are " + steps);
		return -1;
		
	}
	
	public static void main(String args[]) {
		
		int num[]= new int [10000];
		int target = 900;
		
		int result1 = LinearSearch(num,target);
		int result2 = BinarySearch(num, target);
		
		if(result1 != -1) {
			System.out.println("Element Found at index  :" + result1);
		}
		else
			System.out.println("Element found not found");
		
		if(result2 != -1) {
			System.out.println("Element Found at index  :" + result2);
		}
		else
			System.out.println("Element found not found");

	}
	
}
