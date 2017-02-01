/*
 * Tutorial Group 8 - SOFE 2715U
 * Members: Jehro Celemin, Jeffrey Zhang, Justin Kaipada, Nico Zarfino
 * 
 * Node Class that accomplishes the following:
 * 
 * 1. The constructor takes a string and sets it's value member of the class, sets the next member which is of type Node to null
 * 2. Have functions so that you can get and set the next  member of the class called getNext and setNext
 * 
 */

class Node {
	String data;
	Node next;
	Node(String d) {
        data = d;
        next = null;
    }
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node newNext) {
		next = newNext;
	}
}