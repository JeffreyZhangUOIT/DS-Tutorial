/*
 * Tutorial Group 8 - SOFE 2715U
 * Members: Jehro Celemin, Jeffrey Zhang, Justin Kaipada, Nico Zarfino
 * 
 * MyLinkedList Class that accomplishes the following:
 * 
 * 1. Have a function called "add" which adds a Node object to the very end of the list.
 * 2. Have a function called "remove" which removes the Node object from the very end of the list.
 * 3. Have a function called "add" which takes an index argument (optional) that can add a value at the index in the list.
 * 4. Have a function called "remove" which takes an index argument (optional) that can remove a value at the index from the list.
 * 5. Next, which returns the next node object
 * 
 * In your program do the following:
 * 1. Create the linked list object.
 * 2. Call the linked list object function "add" to add your Node objects with the values "A", "B", "C", "D", "E"
 * 3. Loop through the linked list and print each node's values
 * 4. Delete from the linked list the node with value "C"
 * 5. Add to the linked list at index 2 a new node with a value "Z"
 * 
 */
import java.util.Scanner;

class MyLinkedList {
	
	public static Node add(Node head) {
		if(head == null)
			return new Node(null);
		else if(head.next == null)
			head.next = new Node(null);
		else
			add(head);
		
		return head;
	}
	
	public static Node remove(Node head) {
		if(head != null && head.next.getNext() == null)
			head.next = null;
		else
			remove(head.next);
		
		return head;
	}
	
	public static Node add(Node head, String data) {
        if(head == null)
            return new Node(data);
        else if(head.next == null)
            head.next = new Node(data);
        else
            add(head.next,data);
        
        return head;
	}
        
    public static Node remove(Node head, String data) {
    	if(head.data == data)
    		head.next = head.next.getNext();
    	else if(head.next.data == data)
            head.next = head.next.getNext();
    	else
    		remove(head.next, data);
    		
    	return head;
    }
    
    public static Node add(Node head, String data, int position) {
    	if (position == 0) {
            Node temp = new Node(data);
            temp.data = data;
            temp.next = head;
            return temp;
        }
    	Node next = add(head.next, data, position - 1);
        if (position == 1) {
            head.next = next;
        }
        
        return head;
	}

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
        System.out.println();
    }

public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node node = new Node("A");
        add(node, "B");
        add(node, "C");
        add(node, "D");
        add(node, "E");
        
        display(node);
        
        remove(node, "C");
        display(node);
        
        add(node, "Z", 2);
        display(node);
        
        sc.close();
}}