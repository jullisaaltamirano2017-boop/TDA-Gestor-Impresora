
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class GestorImpresionesInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> pendientes = new ArrayDeque<>();
        Deque<String> historial = new ArrayDeque<>();
        int opcion = 0;

        do {
            System.out.println("\n--- GESTOR DE IMPRESIONES ---");
            System.out.println("1. Registrar documento");
            System.out.println("2. Imprimir siguiente");
            System.out.println("3. Recuperar ultima impresion");
            System.out.println("4. Mostrar estado");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del documento: ");
                    String doc = scanner.nextLine();
                    pendientes.offerLast(doc);
                    break;
                case 2:
                    if (!pendientes.isEmpty()) {
                        String impreso = pendientes.pollFirst();
                        historial.push(impreso);
                        System.out.println("Imprimiendo: " + impreso);
                    } else {
                        System.out.println("No hay documentos pendientes.");
                    }
                    break;
                case 3:
                    if (!historial.isEmpty()) {
                        String recuperado = historial.pop();
                        pendientes.addFirst(recuperado);
                        System.out.println("Recuperado al frente: " + recuperado);
                    } else {
                        System.out.println("No hay historial de impresiones.");
                    }
                    break;
                case 4:
                    System.out.println("Pendientes: " + pendientes);
                    System.out.println("Historial: " + historial);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}