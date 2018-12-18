package List;

import List.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addEnd(0);
        ll.addEnd(1);
        ll.addStart(2);




        System.out.println(ll.get(0));
        System.out.println(ll.get(1));
        System.out.println(ll.get(2));
    }
}
