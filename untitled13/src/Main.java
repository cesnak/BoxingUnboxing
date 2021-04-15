public class Main {

    public static void main(String[] args) {
	// write your code here
        metoda1(5);
        metoda2(2.2);
        metoda3(787L);
        metoda4(66);
        metoda5(45.4);
        metoda6(48L);
    }

    public static void metoda1(int i){
        Integer i1 = i;
        i1++;
        System.out.println(i1);

    }
    public static void metoda2(double d){
        Double d1 = d;
        d1++;
        System.out.println(d1);
    }
    public static void metoda3(long l){
        Long l1 = l;
        l1++;
        System.out.println(l1);
    }

    public static void metoda4(Integer ii){
        int iii = ii;
        iii++;
        System.out.println(iii);
    }

    public static void metoda5(Double dd){
        double dd1 = dd;
        dd1++;
        System.out.println(dd1);
    }
    public static void metoda6(Long ll){
        long ll1 = ll;
        ll1++;
        System.out.println(ll1);
    }
}
