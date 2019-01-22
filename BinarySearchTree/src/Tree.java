public class Tree {
    private Node head = null;


    public Tree() {

    }

    public void add(int value) {
        Node node = new Node(value);
        //list empty
        if (head == null) {
            head = node;
            return;
        }
        if (node.getValue() >= head.getValue()) {
            if (head.getNextRight() == null) {
                head.setNextRight(node);
                return;
            }


        }
        if(node.getValue()< head.getValue())
        {

            if(head.getNextLeft()==null)
            {
                head.setNextLeft(node);
                return;
            }
        }
        Node tmp = head;
        while (true)
        {
            if(node.getValue()>=tmp.getNextRight().getValue())
            {
                tmp=tmp.getNextRight();

                if(tmp.getNextRight()==null&&node.getValue()>=tmp.getValue())
                {
                    tmp.setNextRight(node);
                    node.setPrevious(tmp);
                    break;

                }
                if(tmp.getNextLeft()==null&&node.getValue()<tmp.getValue())
                {
                    tmp.setNextLeft(node);
                    node.setPrevious(tmp);
                    break;
                }
            }
            if(node.getValue()<tmp.getNextLeft().getValue())
            {
                tmp=tmp.getNextLeft();

                if(tmp.getNextRight()==null&&node.getValue()>=tmp.getValue())
                {
                    tmp.setNextRight(node);
                    break;

                }
                if(tmp.getNextLeft()==null&&node.getValue()<tmp.getValue())
                {
                    tmp.setNextLeft(node);
                    break;
                }
            }


        }



    }




    public int search(int value) {
        Node node=head;
        if (node.getValue()<=value)
        {
            if(node.getNextRight().getValue()<=value){
                if(node.getNextRight().getValue()==value){
                    System.out.println("Ja es gibt eine Node mit diesem Wert");
                    return node.getValue();
                }
                else
                {
                    node=node.getNextRight();
                }

            }
            if(node.getNextRight()==null){
                System.out.println("Nein es gibt keine Node mit diesem Wert");
                return 0;
            }

        }if(node.getValue()>value){
            if(node.getNextLeft().getValue()>value){
                if(node.getNextLeft().getValue()==value){
                    System.out.println("Ja es gibt eine Node mit diesem Wert");
                    return node.getValue();
                }
                else
                {
                    node=node.getNextLeft();
                }

            }
            if(node.getNextLeft()==null){
                System.out.println("Nein es gibt keine Node mit diesem Wert");
                return 0;
            }
        }





        return 0;


    }


    public void delete(int value)
    {
        Node tmp=head;
        while (value != tmp.getValue())
        {
            if(value<=tmp.getValue()){
                tmp=tmp.getNextLeft();
            }
            if(value>tmp.getValue()){
                tmp=tmp.getNextRight();
            }
        }
        if(tmp.getNextRight()==null&&tmp.getNextLeft()==null)
        {
            int vergleich = tmp.getValue();
            tmp = tmp.getPrevious();
            if(tmp.getNextRight().getValue()==vergleich){
                tmp.setNextRight(null);
                return;
            }
            if(tmp.getNextLeft().getValue()==vergleich){
                tmp.setNextLeft(null);
                return;
            }
        }
        if(tmp.getNextRight()==null&&tmp.getNextLeft()!=null)
        {
            Node zwischenspeicher = tmp.getNextLeft();
            tmp=tmp.getPrevious();
            tmp.setNextLeft(zwischenspeicher);
            return;
        }
        if(tmp.getNextLeft()==null&&tmp.getNextRight()!=null)
        {
            Node zwischenspeicher = tmp.getNextRight();
            tmp=tmp.getPrevious();
            tmp.setNextRight(zwischenspeicher);
            return;
        }

    }
}