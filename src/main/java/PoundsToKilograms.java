import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número de libras a convertir: ");
        double libras = input.nextDouble();
        double conversion = 0.45349237;
        double kilos = libras * conversion;

        System.out.println("282 libras son " + kilos + " kilos");
    }
}
