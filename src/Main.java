import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character personaje = null;

        // Selección de raza
        System.out.println("Elige tu raza (1. Enano, 2. Elfo, 3. Mediano): ");
        int raza = scanner.nextInt();
        switch (raza) {
            case 1:
                personaje = new Dwarf();
                break;
            case 2:
                personaje = new Elf();
                break;
            case 3:
                personaje = new Halfling();
                break;
            default:
                System.out.println("Raza no válida.");
                System.exit(0);
        }

        // Mostrando atributos
        System.out.println("Atributos generados:");
        personaje.mostrarAtributos();

        // Validación de clase según requisitos de la raza
        if (!personaje.validarClase()) {
            System.out.println("No cumples con los requisitos para esta clase.");
            System.exit(0);
        }

        // Selección de alineación
        System.out.println("Elige tu alineación (1. Bueno, 2. Neutral, 3. Malo): ");
        int alineacion = scanner.nextInt();
        String tipoAlineacion = "";
        switch (alineacion) {
            case 1:
                tipoAlineacion = "Bueno";
                break;
            case 2:
                tipoAlineacion = "Neutral";
                break;
            case 3:
                tipoAlineacion = "Malo";
                break;
            default:
                System.out.println("Alineación no válida.");
                System.exit(0);
        }

        System.out.println("Personaje creado con éxito.");
        System.out.println("Raza: " + personaje.getClass().getSimpleName());
        System.out.println("Clase: " + personaje.tipoDeClase);
        System.out.println("Alineación: " + tipoAlineacion);
    }
}
