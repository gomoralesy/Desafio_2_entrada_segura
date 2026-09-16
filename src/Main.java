import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    try {
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Edad registrada: " + edad);
    }
    catch (InputMismatchException e) {
        System.out.println("Error de entrada incorrecta");
    }
    }
}