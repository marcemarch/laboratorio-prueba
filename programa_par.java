import java.util.Scanner;

public class Prograama_par {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        
        // Leer el número ingresado
        int numero = scanner.nextInt();
        
        // Verificar si el número es par
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        
        scanner.close();
    }
}
