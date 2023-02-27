 /* Determinar la suma de los N primeros números enteros de acuerdo a la siguiente fórmula:
        suma= N*(N+1)2   */
import java.util.*;
public class Ejercicio6 {
    public static void main (String[] args) {
        int suma = 0; 
        int N = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número a sumar: ");
        int sumaScan = sc.nextInt();

        N = sumaScan;
        suma = (N * (N+1)) / 2 ;

        System.out.println("El resultado es:" + suma);
    }
}