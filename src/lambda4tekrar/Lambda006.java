package lambda4tekrar;

import java.util.stream.IntStream;

public class Lambda006 {
    public static void main(String[] args) {
        //TASK 01 --> Structured Programming ve Functional
        // Programming ile 1'den x'e kadar (x dahil) tamsayilari toplayan bir program create ediniz.
        System.out.println(topla(5));
        System.out.println();
        System.out.println(toplaCincix(5));
    }

    public static int topla(int x) {
        int toplam = 0;
        for (int i = 0; i <= x; i++) {
            toplam = toplam + i;
        }
        return toplam;
    }

    //TASK 02 --> 1'den x'e kadar  tamsayilari toplayan bir program create ediniz.
    public static int toplaCincix(int x) {//list<Integer>
        return IntStream.range(1, x + 1).sum();


    }
    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.

    public static int toplaCift(int x) {
        return IntStream.
                range(1, x + 1).filter(t -> t % 2 == 0).
                sum();
        // rangeClosed ikiside dahil
        //range birinci dashil ikincisi degil
    }
    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.

    public static int toplaCift1(int x) {
        return IntStream.
                rangeClosed(1, x * 2).filter(t -> t % 2 == 0).
                sum();


    }
    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static int toplaCift2(int x) {
        return IntStream.
                iterate(2, t -> t + 2).//2 den sonsuza kadar elemanlari iki artirarak akisa alir
                limit(x).//degerinde durur
                sum();

    }
}


