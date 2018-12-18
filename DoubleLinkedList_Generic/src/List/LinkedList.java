package List;

import sun.awt.SunHints;

public class LinkedList<T> {
    private Node head=null;
    private Node tail=null;

    public LinkedList(){

    }

    public void addEnd(T value){
       Node<T> node=new Node(value);
        //list empty
        if(head==null){
            head=node;
            return;
        }
        if(tail==null){
            head.setNext(node);
            node.setPrevious(head);
            tail=node;
        }

        tail.setNext(node);
        node.setPrevious(tail);
        tail=node;


    }

    public void addStart(T value){
        Node<T> node=new Node(value);
        if(head==null)
        {
            head=node;
            return;
        }
        head.setPrevious(node);
        node.setNext(head);
        head = node;



    }
    public T get(int position){

        Node<T> tmp = head;

        for(int i=0; i<position;i++)
        {
            tmp=tmp.getNext();


        }

        return tmp.getValue();

    }
    public void delete(int position)
    {
        Node<T> a =head;
        Node<T> b= head;
        Node<T> c= tail;
        Node<T> d= tail;
        if(head==null || tail==null){

        }
        for(int i=0;i<=(position-1);i++)
        {
            a=a.getNext();
            c=c.getPrevious();

        }


        for(int i=0;i<position;i++){
            b=b.getNext();
            d=d.getPrevious();
        }


        a.setValue((T) b.getNext());
        c.setPrevious(d.getPrevious());
    }
}
