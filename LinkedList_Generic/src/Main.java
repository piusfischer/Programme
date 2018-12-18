public class Main <T>{

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(0);
        ll.add(1);
        ll.add(2);


        T i1=ll.get(1);
        T i2=ll.get(2);


        System.out.println(i1);
        System.out.println(i2);
    }
}
