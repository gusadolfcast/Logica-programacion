import java.util.Scanner;
public class SistemaVentas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        int cantidadVentas;
        int ventasMayores = 0;   // Ventas > $500.000
        int ventasMenores = 0;   // Ventas <= $500.000
        
        
        int clientesVIP = 0;       // Ventas > $1.000.000
        int clientesFrecuentes = 0; // Ventas entre $500.000 y $1.000.000
        int clientesGenerales = 0;  // Ventas < $500.000

        double totalVentas = 0;
        double ventaMayor = 0;
        double ventaMenor = 0;

        while (true) {
            System.out.print("Ingrese la cantidad de ventas a registrar: ");
            try {
                cantidadVentas = entrada.nextInt();
                if (cantidadVentas > 0) {
                    break;
                }
                System.out.println("\nLa cantidad de ventas debe ser mayor a 0.");
            } catch (Exception e) {
                System.out.println("\nDebe ingresar un número entero válido.");
                entrada.next();
            }
        }

        for (int i = 1; i <= cantidadVentas; i++) {
            double venta = 0;
            while (true) {
                System.out.println("\nVenta #" + i);
                System.out.print("Ingrese el valor de la venta: $");
                try {
                    venta = entrada.nextDouble();
                    if (venta >= 0) {
                        break;
                    }
                    System.out.println("\nEl valor de la venta no puede ser negativo.");
                } catch (Exception e) {
                    System.out.println("\nDebe ingresar un valor numérico válido.");
                    entrada.next();
                }
            }

            totalVentas += venta;

            if (i == 1) {
                ventaMayor = venta;
                ventaMenor = venta;
            } else {
                if (venta > ventaMayor) {
                    ventaMayor = venta;
                }
                if (venta < ventaMenor) {
                    ventaMenor = venta;
                }
            }

            if (venta > 500000) {
                ventasMayores++;
            } else {
                ventasMenores++;
            }

            if (venta > 1000000) {
                System.out.println("Categoría: CLIENTE VIP ");
                clientesVIP++;
            } else if (venta >= 500000) {
                System.out.println("Categoría: CLIENTE FRECUENTE ");
                clientesFrecuentes++;
            } else {
                System.out.println("Categoría: CLIENTE GENERAL ");
                clientesGenerales++;
            }
        }

        double promedio = totalVentas / cantidadVentas;

        System.out.println("\n====================================");
        System.out.println("      INFORME EMPRESARIAL           ");
        System.out.println("====================================");
        System.out.println("Cantidad de ventas: " + cantidadVentas);
        System.out.println("Total recaudado: $" + totalVentas);
        System.out.printf("Promedio de ventas: $%.2f%n", promedio);
        System.out.println("Venta más alta: $" + ventaMayor);
        System.out.println("Venta más baja: $" + ventaMenor);
        System.out.println("------------------------------------");
        System.out.println("Ventas superiores a $500.000: " + ventasMayores);
        System.out.println("Ventas de $500.000 o menos: " + ventasMenores);
        System.out.println("------------------------------------");
        System.out.println("Clientes VIP (> $1'000.000): " + clientesVIP);
        System.out.println("Clientes Frecuentes ($500k - $1M): " + clientesFrecuentes);
        System.out.println("Clientes Generales (< $500k): " + clientesGenerales);
        System.out.println("====================================");

        entrada.close();
    }
}