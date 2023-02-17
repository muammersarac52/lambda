package lambda4tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lambda04tekrar {
    /*
TASK :
fields --> Universite (String)
          bolum (String)
          ogrcSayisi (int)
          notOrt (int)
          olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
*/
    public static void main(String[] args) {
        Universite1 u1 = new Universite1("omu", "fizik", 850, 98);
        Universite1 u2 = new Universite1("sivas", "kimya", 1200, 90);
        Universite1 u3 = new Universite1("ordu", "beden", 1420, 87);
        Universite1 u4 = new Universite1("amasya", "din", 1250, 78);
        Universite1 u5 = new Universite1("rize", "matematik", 1000, 85);

        List<Universite1> unv = new ArrayList<>(Arrays.asList(u1, u2, u3, u4, u5));

        System.out.println(notOrt70DenBuyukMu(unv));
        System.out.println();
        System.out.println(matVarMi(unv));
    }

    // butun unuversitelerin not ortalamalarinin  74 ten buyuk olup olmadigini test edin
    public static boolean notOrt70DenBuyukMu(List<Universite1> unv) {
        return unv.
                stream().
                allMatch(t -> t.getNotOrt() > 75);
    }

    //task 02-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean matVarMi(List<Universite1> unv) {
        return unv.
                stream().
                anyMatch(t -> t.getBolum().toLowerCase().contains("mat"));
    }

    //task 03-->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static List bk(List<Universite1> unv) {
        return unv.stream().sorted(Comparator.comparing(Universite1::getOgrsayisi).reversed()).collect(Collectors.toList());


    }
}

