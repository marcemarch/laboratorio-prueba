<<<<<<< HEAD
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Número de elementos a mostrar
        int a = 0, b = 1;
        
        System.out.println("Serie de Fibonacci de " + n + " números:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            
            // Calculamos el siguiente número
            int siguiente = a + b;
=======
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
>>>>>>> 283bcaaded69b9e7fb5b38177642d1e75fca93a3
            a = b;
            b = siguiente;
        }
    }
}
<<<<<<< HEAD

=======
>>>>>>> 283bcaaded69b9e7fb5b38177642d1e75fca93a3
