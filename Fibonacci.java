import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, a = 0, b = 1, siguiente;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de términos: ");
        n = sc.nextInt();

        System.out.println("Serie de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}
