
public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

	public IntegerNode getHead() {
		return head;
	}
	
    public void insertSorted(Integer value) {

        // add your code here
		
		// find the first Integer great or equal than "value"
		IntegerNode cur = head, prev = head;
		while(cur != null) {
			if (cur.getValue().intValue() >= value.intValue() ){
				break;
			}
			prev = cur;
			cur = cur.getNext();
		}
	
        if (cur == head) {   // if it is the head or empty
			addToFront(value);
		} else { // if it is last or in the middle
			IntegerNode node = new IntegerNode(value);
			prev.setNext(node);
			node.setNext(cur);
			size++;
		}
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
