import java.util.Scanner;

public class Boletin_6_1 {
    public static void main(String[] args) {
        enteros();
    }

    static void enteros() {
        int n1;
        int n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dam el primer numero: ");
        n1 = sc.nextInt();
        System.out.println("Dame el segundo numero: ");
        n2 = sc.nextInt();

        for (int i = n1 + 1; i < n2; i++) {
            System.out.println(i);
        }

    }
}