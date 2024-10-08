package com.Selectionsort;

public class Demo {
	
	public static void main(String args[]) {
		
		int nums[] = {9,8,6,5,7,4,3};
		int temp=0;
		int minIndex=-1;
		
		System.out.println("Before Sorting");
		
		for(int num : nums) {
			System.out.print(num + " ");
		}
		
		for(int i=0;i<nums.length-1;i++)
		{
			minIndex=i;
			for(int j=i;j<nums.length;j++)
			{
				if(nums[minIndex]>nums[j]) {
					minIndex=j;
				}
				temp=nums[minIndex];
				nums[minIndex] = nums[i];
				nums[i]= temp;
			}
			System.out.println();
			for(int num : nums) {
				System.out.print(num + " ");
			}
		}
		
		System.out.println();
		System.out.println("After sorting");
		for(int num : nums) {
			System.out.print(num + " ");
		}
	}

}
