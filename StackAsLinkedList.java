//Stack implementation using a singly linkedlist

public class StackAsLinkedList {
    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    // Method to check for empty stack
    public boolean isEmpty() {
        if (root == null)
            return true;
        else
            return false;
    }

    // Method to add to Stack
    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if (root == null)
            root = newNode;
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " push in stack");
    }

    // Method to remove from top of stack
    public int pop() {
        int popped = Integer.MIN_VALUE;
        if (root == null)
            System.out.println("Stack is empty");
        else {
            popped = root.data;
            root = root.next;

        }
        return popped;
    }

    // Method to see which element is on top of stack
    public int peek() {

        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else
            return root.data;
    }

    // Main method
    public static void main(String[] args) {
        StackAsLinkedList sll = new StackAsLinkedList();
        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println("Element removed: " + sll.pop());
        System.out.println("Element on top of stack: " + sll.peek());
    }
}
