package lambdapractice;

import java.util.stream.IntStream;

public class Lambda0529Kasimm {
    public static void main(String[] args) {
        //TASK 01 --> Structured Programming ve Functional
        // Programming ile 1'den x'e kadar (x dahil) tamsayilari toplayan bir program create ediniz.
        System.out.println(topla(5));
        System.out.println();
        System.out.println(toplaCincix(5));
    }//structured
    public  static int topla(int x){
        int toplam=0;
        for (int i=0;i<=x;i++) {
            toplam=toplam+i;
        }
        return toplam;
    }//functional
    public static int toplaCincix(int x){
    return IntStream.range(1,x+1).sum();


    }


}
