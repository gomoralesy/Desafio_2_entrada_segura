import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
    try {
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Edad registrada: " + edad);

        if  (edad >= 18) {
            System.out.println("Acceso autorizado para: "+nombre);
        } else {
            System.out.println("Acceso denegado.");
        }
    }
    catch (InputMismatchException e) {
        System.out.println("La edad debe ser un número.");
    }
    }
}