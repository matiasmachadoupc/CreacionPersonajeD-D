import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar atributos aleatorios del 3 al 18
        int fuerza = random.nextInt(16) + 3; // Genera un valor entre 3 y 18
        int destreza = random.nextInt(16) + 3;
        int constitucion = random.nextInt(16) + 3;
        int inteligencia = random.nextInt(16) + 3;
        int sabiduria = random.nextInt(16) + 3;
        int carisma = random.nextInt(16) + 3;

        // Mostrar los atributos al usuario
        System.out.println("Atributos generados:");
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Destreza: " + destreza);
        System.out.println("Constitución: " + constitucion);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Sabiduría: " + sabiduria);
        System.out.println("Carisma: " + carisma);

        // Elegir clase/race
        Personaje personaje = null;

        boolean seleccionValida = false;
        while (!seleccionValida) {
            System.out.println("\nElige una clase de personaje:");
            System.out.println("1. Guerrero");
            System.out.println("2. Clérigo");
            System.out.println("3. Ladrón");
            System.out.println("4. Mago");
            System.out.println("5. Elfo (Inteligencia >= 9)");
            System.out.println("6. Mediano (Constitución >= 9 y Destreza >= 9)");
            System.out.println("7. Enano (Constitución >= 9)");
            System.out.print("Introduce el número de la clase que deseas elegir: ");

            int eleccionClase = scanner.nextInt();

            // Crear personaje según la elección
            switch (eleccionClase) {
                case 1:
                    personaje = new Guerrero(100, new String[]{"Común"}, fuerza, destreza, constitucion, inteligencia,
                            sabiduria, carisma);
                    seleccionValida = true;
                    break;
                case 2:
                    personaje = new Clerigo(100, new String[]{"Común"},
                            fuerza, destreza, constitucion, inteligencia,
                            sabiduria, carisma);
                    seleccionValida = true;
                    break;
                case 3:
                    personaje = new Ladron(100, new String[]{"Común"},
                            fuerza, destreza, constitucion, inteligencia,
                            sabiduria, carisma);
                    seleccionValida = true;
                    break;
                case 4:
                    personaje = new Mago(100, new String[]{"Común"},
                            fuerza, destreza, constitucion, inteligencia,
                            sabiduria, carisma);
                    seleccionValida = true;
                    break;
                case 5:
                    // Verificar si el usuario tiene inteligencia >= 9 para elegir Elfo
                    if (inteligencia >= 9) {
                        personaje = new Elfo(100, new String[]{"Común"},
                                fuerza, destreza, constitucion, inteligencia,
                                sabiduria, carisma);
                        seleccionValida = true;
                    } else {
                        System.out.println("No tienes suficiente inteligencia para elegir Elfo.");
                    }
                    break;
                case 6:
                    // Verificar si el usuario tiene constitución >= 9 y destreza >= 9 para elegir Mediano
                    if (constitucion >= 9 && destreza >= 9) {
                        personaje = new Mediano(100, new String[]{"Común"},
                                fuerza, destreza, constitucion, inteligencia,
                                sabiduria, carisma);
                        seleccionValida = true;
                    } else {
                        System.out.println("No tienes suficiente constitución y destreza para elegir Mediano.");
                    }
                    break;
                case 7:
                    // Verificar si el usuario tiene constitución >= 9 para elegir Enano
                    if (constitucion >= 9) {
                        personaje = new Enano(100, new String[]{"Común"},
                                fuerza, destreza, constitucion, inteligencia,
                                sabiduria, carisma);
                        seleccionValida = true;
                    } else {
                        System.out.println("No tienes suficiente constitución para elegir Enano.");
                    }
                    break;
                default:
                    System.out.println("Elección no válida.");
            }
        }

        // Establecer tiradas de salvación y habilidades
        personaje.establecerTiradasDeSalvacion();
        personaje.establecerHabilidades();


        System.out.println("Elige el alineamiento de tu personaje:");
        System.out.println("1. Neutral");
        System.out.println("2. Legal");
        System.out.println("3. Caótico");
        System.out.print("Introduce tu elección (1, 2 o 3): ");

        int eleccionAlineamiento = scanner.nextInt();
        if (eleccionAlineamiento == 1) {
            personaje.setAlineamiento("Neutral");
            personaje.setIdiomasHablados(new String[]{"Neutral"});
        } else if (eleccionAlineamiento == 2) {
            personaje.setAlineamiento("Legal");
            personaje.setIdiomasHablados(new String[]{"Legal"});
        }
        else if (eleccionAlineamiento == 3) {
            personaje.setAlineamiento("Caótico");
            personaje.setIdiomasHablados(new String[]{"Caótico"});
        }
        else {
            System.out.println("Opción no válida, el alineamiento se establecerá como Neutral por defecto.");
            personaje.setAlineamiento("Neutral");
            personaje.setIdiomasHablados(new String[]{"Neutral"});
        }


        // Mostrar detalles del personaje creado
        System.out.println("\nDetalles del personaje creado:");
        personaje.mostrarDetalles();

        // Cerrar el scanner
        scanner.close();
    }
}
