public class Node {
    private int value;
    private Node nextRight=null;
    private Node nextLeft=null;
    private Node getPre=null;

    public Node(int value){ this.value= value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value)
    {
        this.value=value;
    }

    public Node getNextRight() {
        return nextRight;
    }

    public void setNextRight(Node next) {
        this.nextRight = next;
    }

    public Node getNextLeft() {
        return nextLeft;
    }

    public void setNextLeft(Node next) {
        this.nextLeft = next;
    }

    public Node getPrevious(){return getPre;}

    public void setPrevious(Node previous){this.getPre = previous;}



}
