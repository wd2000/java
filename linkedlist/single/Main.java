

public class Main {

    public static void main(String[] args) {

        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;

        IntegerLinkedList list = new IntegerLinkedList();
        list.insertSorted(three);
        list.printList();
        list.insertSorted(two);
        list.printList();
        list.insertSorted(one);
        list.printList();
        list.insertSorted(four);
        list.printList();
		
		System.out.println("----Stack test------");
		Stack myStack = new Stack();
		myStack.push(Integer.valueOf(1));
		myStack.push(Integer.valueOf(2));
		myStack.push(Integer.valueOf(3));
		myStack.push(Integer.valueOf(4));
		
		while(myStack.isEmpty() == false){
			Integer curInt = myStack.pop();
			System.out.println("Int: " + curInt.intValue());
		}
    }
}
