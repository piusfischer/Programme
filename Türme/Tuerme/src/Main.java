import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void move(int n, ArrayList<Integer> src, ArrayList<Integer> aux, ArrayList<Integer> target)
    {
        if(n==1)
        {
            return;
        }
        move(n-1,src,target,aux);
        target.add(src.remove(src.size()-1));
        move(n-1,aux,src,target);
    }
    public static void printStatus(ArrayList<Integer> src, ArrayList<Integer> aux, ArrayList<Integer> target)
    {
        System.out.println(src);
        System.out.println(aux);
        System.out.println(target);
        System.out.println();

    }
    public static void main(String[] args) {
        int n=3;

        ArrayList<Integer> src = new ArrayList<>();
        ArrayList<Integer> target = new ArrayList<>();
        ArrayList<Integer> aux = new ArrayList<>();
        for(int i=n;i>0;i--)
        {
            src.add(i);
        }
        move(3,src,aux,target);
        printStatus(src,aux,target);
    }
}
