package com.linkedlist;


public class Runner {
	
	public static void main(String args[]) {
		LinkedList list=new LinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(7);
		list.insertStartAt(25);
		
		list.insertAt(0, 77);
		list.deleteAt(2);
		list.show();
		
		
	}

}
