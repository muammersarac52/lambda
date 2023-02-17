package lambdapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1tekrar {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

        System.out.println();

        aralardaBosluk(list);
        System.out.println();
        sadeceNegatif(list);
        System.out.println();
        pozCift(list);
        System.out.println();
        ciftKup(list);
        System.out.println();
        kb(list);
        System.out.println();
        bk(list);
        System.out.println();
        System.out.println(pozKupBir5Olan(list));
        System.out.println();
        System.out.println(top(list));
        System.out.println();


    }

    public static void aralardaBosluk(List<Integer> sayi) {
        sayi.stream().forEach(System.out::print);

    }

    public static void sadeceNegatif(List<Integer> sayi) {
        sayi.stream().filter(l -> l < 0).forEach(System.out::print);
    }

    public static void pozCift(List<Integer> sayi) {
        sayi.stream().filter(l -> l % 2 == 0 && l > 0).forEach(System.out::print);
    }

    public static void kareler(List<Integer> sayi) {
        sayi.stream().map(t -> t * t).forEach(System.out::print);
    }

    public static void ciftKup(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    public static void karelerTekrarsiz(List<Integer> sayi) {
        sayi.stream().map(t -> t * t).distinct().forEach(t -> System.out.print(t + " "));
    }

    public static void kb(List<Integer> sayi) {
        sayi.stream().sorted().forEach(t -> System.out.print(t + " "));
    }

    public static void bk(List<Integer> sayi) {
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
    }

    public static List pozKupBir5Olan(List<Integer> sayi) {
        return sayi.stream().filter(t -> t > 0).map(t -> t * t * t).filter(t -> t % 10 == 5).collect(Collectors.toList());
    }

    public static List pozKupBir5Olmayanlar(List<Integer> sayi) {
        return sayi.stream().filter(t -> t > 0).map(t -> t * t).filter(t -> t % 10 != 5).collect(Collectors.toList());
    }

    public static int top(List<Integer> sayi) {
        int r = sayi.stream().reduce(0, (a, b) -> a + b);
        return r;
    }

    public static int top1(List<Integer> sayi) {
        int r = sayi.stream().reduce(0, Math::addExact);//buranin ciktisi obsinildir basina 0 virgul koyarsak bu hatadan kurtuluruz
        return r;
    }

    public static int top2(List<Integer> sayi) {
        int r = sayi.stream().reduce(0, Integer::sum);//buranin ciktisi obsinildir basina 0 virgul koyarsak bu hatadan kurtuluruz
        return r;
    }

    //addExact toplam    multiplyExact  :carpim
//collect(Collectors.toList() list olarak yazdirma
//sorted(Comparator.reverseOrder() buyukten kucuge yazdirma
//sorted() kucukten buyuge siralama
//distinct() tekrarsiz
//reduce(0, (a, b) -> a + b)  ==reduce(0,Math::addExact)  == reduce(0,Integer::sum)
    public static int top6(List<Integer> sayi) {
        int r = sayi.stream().filter(t->t>0).reduce(0, Integer::sum);//buranin ciktisi obsinildir basina 0 virgul koyarsak bu hatadan kurtuluruz
        return r;
    }

}

