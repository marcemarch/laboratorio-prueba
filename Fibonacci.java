public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Número de elementos a mostrar
        int a = 0, b = 1;
        
        System.out.println("Serie de Fibonacci de " + n + " números:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            
            // Calculamos el siguiente número
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}

