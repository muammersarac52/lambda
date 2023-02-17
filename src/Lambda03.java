import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>(Arrays.asList("trileçe", "havucDilim", "güvec", "kokorec",
                "küşleme", "arabAşı", "waffle", "künefe", "guvec"));

        alfBykTekrsz(menu);
        System.out.println();
        chsSayisiTersSiraliUnique(menu);
        System.out.println();
        chrSayisiBykSirali(menu);
        System.out.println();
        harfSayisi7denAzKontrol(menu);
        System.out.println();
        charSayisiEnBuykPrint(menu);
        System.out.println();
        ilkElemanharicSonHarfSirali(menu);

    }
    // Task -1 : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.

    public static void alfBykTekrsz(List<String> yemek) {
        yemek.
                stream().//akis basladi
                map(String::toUpperCase).//buyuk harf oldu
                sorted().//alfabetik siralandi
                distinct().//elemanlarin tekrarsiz olmasi saglandi
                forEach(t -> System.out.print(t + " "));

    }

    // Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void chsSayisiTersSiraliUnique(List<String> ikram) {
        ikram.
                stream().//akis basladi
                map(String::length).//akisi kelimelerin uzunlugu olarak degistirdim
                sorted(Comparator.reverseOrder()).
                distinct().
                forEach(Lambda01::yazdir);

    }

    // Task-3 : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
    public static void chrSayisiBykSirali(List<String> ikram) {
        ikram.
                stream().
                sorted(Comparator.comparing(String::length)).//string ifadeleri karakter sayisina gore kucukten buyuge siraladim
                forEach(Lambda01::yazdir);
    }
// ******************************************************************************************
// *********************** anyMatch() *** allMatch() **** noneMatch() ************************
    //*******************************************************************************************

    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
    //  biri-hepsi-hiçbiri : )

// Task-4 : List elelmmalarinin hepsinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.

    public static void harfSayisi7denAzKontrol(List<String> ikram) {
        System.out.println(ikram.
                stream().
                allMatch(t -> t.length() <= 7) ? "list elemanlari 7 ve aha az harften olusuyor" :
                "list elemanlari 7 harften buyuk");
    }

    // Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.
    public static void wIlebaslayanElKont(List<String> ikram) {
        System.out.println(ikram.
                stream().
                noneMatch(t -> t.startsWith("w")) ? "w ile yemek ismi mi olur" :
                "w ile yemek icat ettik");

    }

    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı var mi kontrol ediniz.
    public static void xIleBitenElemanKont(List<String> ikram) {
        System.out.println(ikram.stream().anyMatch(t -> t.endsWith("w")) ? "masallah" :
                "w ile yemek is mi biter mi");
    }
    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.

    public static void charSayisiEnBuykPrint(List<String> ikram) {
        Stream<String> sonIsim = ikram.
                stream().
                sorted(Comparator.comparing(t -> t.toString().length()).
                        reversed()).//karakter sayisina gore tersten siralandi
                        limit(1);//ilk elemani getirdi
        //limit methodunun donen degeri stream <String> yapidadir

        System.out.println(Arrays.toString(sonIsim.toArray()));


    }

    // Task-8 : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public static void ilkElemanharicSonHarfSirali(List<String> ikram) {
        ikram.stream().
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                skip(1).//ilk elemani almadi
                forEach(Lambda01::yazdir);

    }
}
//distinct() tekrarsiz
//sorted(Comparator.reverseOrder()) ters yazdirir
//skip(1) ilk elemani almadi
// sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))) son harfine gore alfabetik siralandi





