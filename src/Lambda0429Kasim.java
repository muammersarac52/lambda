import java.util.*;
import java.util.stream.Collectors;

public class Lambda0429Kasim {
    /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
 */
    public static void main(String[] args) {
        Universite u01 = new Universite("bogazici", "matematik", 571, 93);
        Universite u02 = new Universite("istanbul tk", "matematik", 600, 51);
        Universite u03 = new Universite("istanbul", "hukuk", 1400, 71);
        Universite u04 = new Universite("marmara", "bilg muh", 1080, 77);
        Universite u05 = new Universite("odtu", "gemi mh", 333, 74);

        List<Universite> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04));

        System.out.println(notOrt74ByUnv(unv));
        System.out.println();
        System.out.println(matBolVarMi(unv));
        System.out.println();
        System.out.println(ogrByKucSir(unv));
        System.out.println();
        System.out.println(ogrencisayisi550BuyukEnBuyuk(unv));
        System.out.println();
        System.out.println(ogrencisayisi1050azMinOrt(unv));

    }

    // butun unuversitelerin not ortalamalarinin  74 ten buyuk olup olmadigini test edin
    public static boolean notOrt74ByUnv(List<Universite> unv) {
        return unv.
                stream().
                allMatch(t -> t.getNotOrt() > 74);

    }

    //task 02-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean matBolVarMi(List<Universite> unv) {
        return unv.
                stream().
                anyMatch(t -> t.getBolum().toLowerCase().contains("mat"));


    }

    //task 03-->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static List<Universite> ogrByKucSir(List<Universite> unv) {
        return unv.
                stream().
                sorted(Comparator.comparing(Universite::getOgrsayisi).//universiteleri istiyor sayi isteseydi map
                        reversed()).
                collect(Collectors.toList());//stream yapisi list yapisina donustu

    }

    //task 04-->"matematik" bolumlerinin sayisini  print ediniz.
    public static int matBolumSayisi(List<Universite> unv) {
        return (int) unv.//return yazinca kizdi ve yanina (int) yazdi
                stream().
                filter(t -> t.getBolum(). contains("mat")).

                count();//long dondurur bunu int yapmaya calisirak kiza=r istersek static ten sonra long yaz

    }

    //task 05-->Ogrenci sayilari 550'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
    public static OptionalInt ogrencisayisi550BuyukEnBuyuk(List<Universite> unv) {
    return unv.
             stream().
             filter(t->t.getOgrsayisi()>550).
            mapToInt(t->t.getNotOrt()).max();
    }

    //task 06-->Ogrenci sayilari 1050'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
    public static OptionalInt ogrencisayisi1050azMinOrt(List<Universite> unv) {
        return unv.stream().
                filter(t -> t.getOgrsayisi() < 1050).
                 mapToInt(t -> t.getNotOrt()).
                 min();

    }

    public static class Lambda0529kasim {



    }
}

