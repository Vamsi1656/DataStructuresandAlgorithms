package LinearSearchEx
;


public class Demo1 {
	
	public static int LinearSearch(int arr[], int target) {
		int steps = 0;
		for(int i =0;i<arr.length;i++) {
			steps++;
			if(arr[i]== target) {
				System.out.println("Steps taken by LinearSearch : "+ steps);
				return i;
			}
			
		}
		System.out.println("Steps taken by LinearSearch : "+ steps);
		return -1;
	}
	
	public static void main(String args[]) {
		
		int arr[] = {2,4,6,8,10};
		int target = 2;
		
		int result = LinearSearch(arr,target);
		
		if(result != -1) {
			System.out.println("Element is found at index :" + result);
		}
		
	}

}
