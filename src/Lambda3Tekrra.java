import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda3Tekrra {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>(Arrays.asList("trileçe", "havucDilim", "güvec", "kokorec",
                "küşleme", "arabAşı", "waffle", "künefe"));
        alfabetik(menu);
        System.out.println();
        harfSaysi7denAz(menu);
        System.out.println();
        eb(menu);

    }

    // Task -1 : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfabetik(List<String> yemek) {
        yemek.stream().map(String::toUpperCase).sorted().distinct().forEach(t -> System.out.print(t + " "));
    }

    // Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void tersSirali(List<String> yemek) {
        yemek.stream().map(String::length).sorted(Comparator.reverseOrder()).distinct().forEach(t -> System.out.print(t + " "));

    }

    // Task-3 : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
    public static void kb(List<String> yemek) {
        yemek.stream().sorted(Comparator.comparing(String::length)).forEach(t -> System.out.print(t + " "));

    }

    // Task-4 : List elelmmalarinin hepsinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void harfSaysi7denAz(List<String> yemek) {
        System.out.println(yemek.stream().allMatch(t -> t.length() <= 7) ? "tamami 7 den kucuk" : "7 den buyuk");
    }

    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı var mi kontrol ediniz.
    public static void xiLeBitiyorMu(List<String> yemek) {
        System.out.println(yemek.
                stream().
                anyMatch(t -> t.endsWith("x")) ? "masallah" : "x ile bitmez");

    }

    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void eb(List<String> yemek) {

        Stream<String> sonisim = yemek.
                stream().
                sorted(Comparator.comparing(t -> t.toString().length()).reversed()).
                limit(1);
        System.out.println(Arrays.toString(sonisim.toArray()));


    }
}



