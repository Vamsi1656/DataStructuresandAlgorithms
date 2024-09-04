package LinkedListPractice;

public class Runner {
	
	public static void main(String args[]) {
	LinkedList list=new LinkedList();
	list.insert(22);
	list.insert(7);
	list.insert(77);
	list.insert(5);
	list.insert(11);
	list.insert(66);
	
	list.insertStartAt(25);
	
	list.insertAt(3, 85);
	
	list.deleteAt(5);
	
	list.show();
	}

}
