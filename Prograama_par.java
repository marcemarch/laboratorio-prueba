import java.util.Scanner;

public class Prograama_par {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Intro. un número: ");
        
        int numero = scanner.nextInt();
        
        // Verificar si el número es par
        if (numero % 2 == 0) {
            System.out.println(" es par.");
        } else {
            System.out.println(" es impar.");
        }
        
        scanner.close();
    }
}
