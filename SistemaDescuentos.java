import java.util.Scanner;

public class SistemaDescuentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente:");
        String nombreCliente = scanner.nextLine();

        
        System.out.print("Ingrese el valor de la compra: $");
        double valorCompra = scanner.nextDouble();

        double porcentajeDescuento = 0.0;
        int etiquetaPorcentaje = 0;

        
        if (valorCompra >= 300000) {
            porcentajeDescuento = 0.20;
            etiquetaPorcentaje = 20;
        } else if (valorCompra >= 200000) {
            porcentajeDescuento = 0.15;
            etiquetaPorcentaje = 15;
        } else if (valorCompra >= 100000) {
            porcentajeDescuento = 0.10;
            etiquetaPorcentaje = 10;
        } else {
            porcentajeDescuento = 0.0;
            etiquetaPorcentaje = 0;
        }

        double valorDescontado = valorCompra * porcentajeDescuento;
        double totalAPagar = valorCompra - valorDescontado;

        
        System.out.println("\n===== TIENDA TECNOLÓGICA =====");
        System.out.println("Cliente: " + nombreCliente);
        System.out.printf("Compra: $%.0f%n", valorCompra);
        System.out.println("Descuento aplicado: " + etiquetaPorcentaje + "%");
        System.out.printf("Valor descontado: $%.0f%n", valorDescontado);
        System.out.printf("Total a pagar: $%.0f%n", totalAPagar);
        System.out.println("¡Gracias por su compra!");
        System.out.println("===============================");

        scanner.close();


    }
}