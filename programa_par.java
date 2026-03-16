import java.util.Scanner;

public class Prograama_par {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("intro. número: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("es par.");
        } else {
            System.out.println("es impar.");
        }
        scanner.close();
    }
}
