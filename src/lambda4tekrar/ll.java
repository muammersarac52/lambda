package lambda4tekrar;

public class ll {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i; k++) {
                if (i == 1 && k == 1 ||i == 21 && k == 3 ||i == 2 && k == 1 ||i == 3 && k == 2 || i == 4 && k == 2 || i == 4 && k == 3) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


