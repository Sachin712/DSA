// Doubly LinkedList Source Code

public class DoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node prev, next;

        // constructor to create the node data
        Node(int d) {
            data = d;
        }
    }

    // Method to print the DLL
    public void printlist(Node node) {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    // Add node to front of list
    public void push(int newData) {
        // 1. Allocate newNode and put it in data
        Node newNode = new Node(newData);

        // 2. Assign next of newNode to head and prev to null
        newNode.next = head;
        newNode.prev = null;

        // 3. assign prev of head to newNode
        if (head != null)
            head.prev = newNode;

        // 4. assign head to prev od newNode
        head = newNode;

    }

    // Insert new node after a given node
    public void insertAfter(Node prevNode, int newData) {
        // 1. Check if prevNode is null
        if (prevNode == null) {
            System.out.println("Givev prev Node can't be null.");
            return;
        }

        // 2. Assign node and put it in data
        Node newNode = new Node(newData);

        // 3. Make next of newNode as next of prevNode
        newNode.next = prevNode.next;

        // 4. Make next of prevNode to newNode
        prevNode.next = newNode;

        // 5. Make prevNode as prev of newNode
        newNode.prev = prevNode;

        // 6. Change prev of newNode.next to newNode
        if (newNode.next != null)
            newNode.next.prev = newNode;
    }

    // Insert a node at the end of the list
    public void append(int newData) {
        // 1. Allocate node and put in data
        Node newNode = new Node(newData);

        Node last = head;

        // 2. As newNode is last node, its next is null
        newNode.next = null;

        // 3. If newNode is the only node in list
        if (head == null) {
            newNode.prev = null;
            newNode = head;
            return;
        }

        // 4. If LL is not empty, then traverse
        while (last.next != null)
            last = last.next;

        // 5. Change next of last node
        last.next = newNode;

        // 6. Make last node as prev to newNode
        newNode.prev = last;
    }

    // Insert before a node
    public void insertBefore(Node nextNode, int newData) {
        // 1. Check if nextNode is null
        if (nextNode == null) {
            System.out.println("Next Node can't be null.");
            return;
        }

        // 2. Allocate and put in data
        Node newNode = new Node(newData);

        // 3. Make prev of newNode as prev of nextNode
        newNode.prev = nextNode.prev;

        // 4. Make next of newNode as nextNode
        newNode.next = nextNode;

        // 5. prev of nextNode as newNode
        nextNode.prev = newNode;

        // 6. Check if head is null
        if (newNode.prev != null)
            newNode.prev.next = newNode;
        else
            head = newNode;

    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.push(7);
        dll.push(8);
        dll.insertAfter(dll.head, 9);
        dll.append(1);
        dll.insertBefore(dll.head.next, 5);

        System.out.println("Created dll is: ");
        dll.printlist(dll.head);
    }

}
