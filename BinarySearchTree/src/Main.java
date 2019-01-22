public class Main {

    public static void main(String[] args) {
	// write your code here
        Tree bitree= new Tree();

        bitree.add(5);
        bitree.add(6);
        bitree.add(2);
        bitree.add(7);



        bitree.search(6);
        bitree.search(7);

        bitree.delete(2);

        bitree.search(2);
    }
}
