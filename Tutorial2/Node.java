class Node
{
    String value;
    Node next = null;

    public Node(String data, Node pointer)
	{
        this.value = data;
        this.next = pointer;
    }
    public Node getNext(){
        return next; 
    }
    public void setNext(Node pointer)
    {
        this.next = pointer; 
    }
    public void setData(String data){
        this.value = data;
    }
    public String getData(){
        return this.value;
    }
}
