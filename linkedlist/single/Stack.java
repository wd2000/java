
public class Stack {

   private IntegerLinkedList  stack;
   
   public Stack() {
       this.stack = new IntegerLinkedList();
   }
   
   public void push(Integer newInt) {
       this.stack.addToFront(newInt);
   }
   
   public Integer pop() {
       IntegerNode node = stack.removeFromFront();
	   if (node != null) {
	      return node.getValue();
	   } else {
	      return null;
	   }
   }
   
   public Integer peek() {
       IntegerNode node = stack.getHead();
	   if (node == null) {
	      return null;
	   }
	   return node.getValue();
   }
   
   public boolean isEmpty() {
       return stack.isEmpty();
   }

}