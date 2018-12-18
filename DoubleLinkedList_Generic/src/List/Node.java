package List;

public class Node<T> {
    private T value;
    private Node<T> next=null;
    private Node<T> previous=null;

    public Node(T value){ this.value= value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value)
    {
        this.value=value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious(){return previous;}

    public void setPrevious(Node previous){this.previous =previous;}

}
