public class LinkedList {

    private Node head=null;

    public LinkedList(){

    }

    public void add(int value){
        Node node=new Node(value);
        //list empty
        if(head==null){
            head=node;
            return;
        }
        //list has one element
        if(head.getNext()==null)
        {
            head.setNext(node);
        }

        Node tmp = head;
        while(tmp.getNext()!=null){
            tmp=tmp.getNext();
        }
        tmp.setNext(node);

    }
    public int get(int position){

        Node tmp = head;

        for(int i=0; i<position;i++)
        {
            tmp=tmp.getNext();


        }

        return tmp.getValue();

    }
    public void delete(int position)
    {
        Node a =head;
        Node b= head;
        for(int i=0;i<(position-1);i++)
        {
            a=a.getNext();
        }
        for(int i=0;i<position;i++){
            b=b.getNext();
        }
        a.setValue(b.getValue());
    }
}
