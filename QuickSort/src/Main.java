import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static ArrayList<Integer> getRandomList(int size)
    {
        Random rand=new Random();
        ArrayList<Integer> zahlen =new ArrayList<>();
        for(int i=0;i<size; i++)
        {
            zahlen.add(rand.nextInt(500)+1);
        }
        return zahlen;
    }

    public static Random rand=new Random();
    public static ArrayList<Integer> sort(ArrayList<Integer> zahlen)
    {
        if(zahlen.size()<=1)
        {
            return zahlen;
        }
        ArrayList<Integer> low = new ArrayList<>();
        ArrayList<Integer> high = new ArrayList<>();
        int Pivot=zahlen.get(rand.nextInt(zahlen.size()));
        for(int i=0;i<zahlen.size();i++)
        {
            if(zahlen.get(i)<Pivot)
            {
                low.add(zahlen.get(i));
            }
            if(zahlen.get(i)>=Pivot)
            {
                high.add(zahlen.get(i));
            }
        }
        zahlen.clear();
        zahlen.addAll(sort(low));
        zahlen.addAll(sort(high));
        return zahlen;

        public static int PivotQ=0;
        public static ArrayList<Integer> quickSort(ArrayList<Integer> zahlen1)
        {
            if(j==y)
            {
                return zahlen1;
            }



        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> zahlen = getRandomList(10);

        sort(zahlen);
        System.out.print(zahlen);

        System.out.println("Andere Art");

        ArrayList<Integer> zahlen1 =getRandomList(10);

        quickSort(zahlen1);
        System.out.println(zahlen1);





    }
}
