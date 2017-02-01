class MyLinkedList extends Node
{
    // String value;
    public int counter;
    private Node pointer;

    public MyLinkedList(String data)
	{
        // this.value = data;
        this.pointer = null;
    }

    public static void add(String data)
    {
        if(pointer == null)
            pointer = new Node(data);

        Node temp = new Node(data);
        Node current = pointer;

        if(current != null)
            {
                while(current.getNext() != null)
                    current = current.getNext();

                current.setNext(temp);
            }
        counter++;
    }

    public static void remove()
    {
        
    }
    public static viod add(int index)
    {
        
    }
    public static void remove(int index)
    {
        
    }
    public static MyLinkedList next()
    {
        
    }
    public static void main(String[] args)
    {
        ;
    }
}
