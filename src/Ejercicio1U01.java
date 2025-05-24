import java.util.Scanner;

public class Ejercicio1U01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = input.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println("Suma: " + (num1 + num2));
            System.out.println("Diferencia: " + (num1 - num2));
        } else {
            System.out.println("Producto: " + (num1 * num2));
            if (num2 != 0) {
                System.out.println("División: " + (num1 / num2));
            } else {
                System.out.println("No se puede dividir por cero.");
            }
        }

        input.close();
    }
}