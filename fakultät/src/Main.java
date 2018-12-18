public class Main {

    public static int fac(int size) {
        int erg = 1;
        for (int i = 1; i <= size; i++) {
            erg = erg * i;
        }
        return erg;
    }

    public static boolean isPalindrom(String wort) {
        boolean a=false;

        for (int i = 0; i < (wort.length() / 2); i++) {


            String w1 = ("");
            w1.charAt((wort.length() - wort.length() / 2) + i);
            String w2 = ("");
            w2.charAt(wort.length() - i);

            if (w1 == w2) {
                a= true;
            } else {
                a= false;
            }
        }

        return a;
    }

    public static boolean rekPolidrom (String s)
    {
        if(s.length()==1 || s.length()==0)
        {
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1))
        {
            return false;
        }
        return rekPolidrom(s.substring(1,s.length()-1));

    }

    public static int pd(int a, int b)
    {
        if(a==b)
        {
            return 1;
        }
        if(b==0)
        {
            return 1;
        }
        return pd(a-1,b-1)+pd(a-1,b);
    }



    public static void main(String[] args) {

            System.out.print("Die Fakultät beträgt: ");
            System.out.println(fac(5));
            System.out.print("Der Wert in dem Pascalschen Dreieck ist: ");
            System.out.println(pd(5,3));
            System.out.print("Polidrom: ");
            System.out.println(rekPolidrom("otto"));

    }
}
