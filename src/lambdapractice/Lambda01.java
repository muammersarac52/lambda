package lambdapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class  Lambda01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

        System.out.println("*****");
        // S1:listi aralarinda bosluk birakarak yazdiriniz
        hepsiniyaz(list);
        System.out.println();
        negatifyaz(list);
        System.out.println();
        ciftyaz(list);
        System.out.println();
        pozVeCift(list);
        System.out.println();
        kareleriniyadir(list);
        System.out.println();
        ciftKupyazdir(list);
        System.out.println();
        karetekrarsiz(list);
        System.out.println();
        buyuktenKucuge(list);
        System.out.println();
        kucuktenbuyuge(list);
        System.out.println();
        System.out.println(pozKup5List(list));
        System.out.println();
        pozKup5List2(list);
        System.out.println();
        System.out.println(pozkareSon5DegilList(list));
        System.out.println();
        System.out.println(elToplamiBul(list));
        System.out.println();
    }


// S1:listi aralarinda bosluk birakarak yazdiriniz

    public static void hepsiniyaz(List<Integer> l) {
        l.stream().forEach(t -> System.out.print(t + " "));
        System.out.println("*****");

    }

    //S3: negatif olanlardan yeni bir liste olustur
    public static void negatifyaz(List<Integer> l) {
        l.stream().forEach(t -> System.out.print(t + " "));

    }

    //S3: pozitif olanlardan yeni bir liste olustur
    public static void ciftyaz(List<Integer> l) {
        l.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    //S4:pozitif ve çift olanları yazdırın

    public static void pozVeCift(List<Integer> l) {

        l.stream().filter(t -> t % 2 == 0 && t > 0).forEach(t -> System.out.print(t + " "));
    }

    //S5:pozitif veya çift olanları yazdırın
    public static void pozVeyaCift2(List<Integer> l) {

        l.stream().filter(t -> t % 2 == 0 || t > 0).forEach(t -> System.out.print(t + " "));
    }

    //map():stream den gelen elemanları baska ttıplere donusturmek veya uzerlerınde
    //ıslem yapmak ıcın (update) kullanılır

    // S6: list in elemanlarin karelerini aynı satırda bır bosluklu yazdıralım
    public static void kareleriniyadir(List<Integer> l) {
        l.stream().map(t -> t * t).forEach((t) -> System.out.print(t + " "));

    }

    //  listin cift elemanlarinin kuplerini
    public static void ciftKupyazdir(List<Integer> l) {
        l.stream().filter(t -> t % 2 == 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //S8 : list in elemanlarin karelerinden tekrarsiz yazdıralım
    public static void karetekrarsiz(List<Integer> l) {
        l.stream().map(t -> t * t).distinct().forEach(t -> System.out.print(t + " "));

    }

    //S9: listin elemanlarini kucukten buyuge siralayalim
    public static void kucuktenbuyuge(List<Integer> l) {
        l.stream().sorted().forEach(t -> System.out.print(t + " "));
    }

    //sorted(Comparator.reverseOrder()) ==> Doğal sıralamanın tersini uygulayan bir karşılaştırıcı
    //S10: listin elemanlarini buyukten kucuge siralayalim
    public static void buyuktenKucuge(List<Integer> l) {
        l.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
    }

    // S11: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
    public static List<Integer> pozKup5List(List<Integer> l) {
        return l.stream().filter(t -> t > 0).map(t -> t * t * t).filter(t -> t % 10 == 5).collect(Collectors.toList());
    }

    public static void pozKup5List2(List<Integer> l) {
        List<Integer> list = l.stream().filter(t -> t > 0).map(t -> t * t * t).filter(t -> t % 10 == 5).collect(Collectors.toList());
        System.out.println(list);
    }

    //S12: list pozitif elemanlari icin karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
    public static List<Integer> pozkareSon5DegilList(List<Integer> l) {
        List<Integer> list = l.stream().filter(t -> t > 0).map(t -> t * t).filter(t -> t % 10 != 5).collect(Collectors.toList());
        return list;
    }

    // S13 :list elemanlarini toplamini bulalim
    public static int elToplamiBul(List<Integer> l) {
        int toplam = l.stream().reduce(0, (a, b) -> a + b);
        return toplam;
    }

    public static int elToplamireferance(List<Integer> l) {
        int toplam = l.stream().reduce(0, Math::addExact);//0 i yazarak opsinildan kurtuluruz
        return toplam;
    }

    public static int elToplamireferance2(List<Integer> l) {
        int toplam = l.stream().reduce(0, Integer::sum);//0 i yazarak opsinildan kurtuluruz
        return toplam;
    }

    //S14 : Listin pozitif elemanları toplamını bulalım
    public static void pozElTop(List<Integer> l) {
        System.out.println(l.stream().filter(t -> t > 0).reduce(0, Integer::sum));


    }
}

//distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
// Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
// Sıralı akışlar için, farklı elemanın seçimi sabittir
// (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
// Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.
//addExact toplam    multiplyExact  :carpim
//collect(Collectors.toList() list olarak yazdirma
//sorted(Comparator.reverseOrder() buyukten kucuge yazdirma
//sorted() kucukten buyuge siralama
//distinct() tekrarsiz
//reduce(0, (a, b) -> a + b)  ==reduce(0,Math::addExact)  == reduce(0,Integer::sum)
//sorted(Comparator.reverseOrder() ters sirala
//sorted(Comparator.comparing(String::length) dogal siralama stringleri degistirmeden
//map(String::length) stringin uzunluguna gore siralama
// sorted(Comparator.comparing(t->t.toString().length()).reversed()).karakter sayisina gore tersten siralama
