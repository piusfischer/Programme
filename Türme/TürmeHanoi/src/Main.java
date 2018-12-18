public class Main {

    List<Integer> src = new ArrayList<>();
    List<Integer> target = new ArrayList<>();
    List<Integer> aux = new ArrayList<>();
    public void move(n,src,aux,target)
    {
        move(n-1,src,target,aux);
        target.add(src.remove[]);
        move(n-1,aux,src,target);
    }

    public static void main(String[] args)
    {
        move(3,src,aux,target);
    }
}
