package LinearSearchEx;

public class LSExample {
	
	public static int linearsearch(int[]arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i; // return the index value of key 
			}
		}
		return -1; // return if key value is not found
	}
	
	public static void main(String a[]) {
		int[] num= {5,6,7,8,9,10,11,12};
		int key=7;
		
		System.out.println(key + " is found at index "+linearsearch(num,key));
	}

}
