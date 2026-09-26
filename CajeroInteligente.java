public class CajeroInteligente {
    public static void main(String[] args) {
        // 3. Arreglo con las compras base + Reto 1 (3 compras agregadas)
        int[] compras = {12000, 25000, 8000, 35000, 15000, 28000, 40000, 9000}; 

        // 4. Variables Contador y Acumulador
        int cantidadCompras = 0;   // Contador general de compras
        int totalVentas = 0;       // Acumulador de dinero recaudado
        int comprasGrandes = 0;    // Contador para compras > $30.000 (Reto 2)
        int comprasPequenas = 0;   // Contador para compras <= $20.000 (Reto 3)

        // 11. Mini Reto: Variable para la compra más alta
        int compraMayor = compras[0];

        // 5. Recorremos las compras con el ciclo for
        for (int i = 0; i < compras.length; i++) {
            totalVentas = totalVentas + compras[i]; // Acumulador: suma cada compra
            cantidadCompras++;                      // Contador: cuenta +1 compra

            // Reto 2: Evaluación de compras superiores a $30.000
            if (compras[i] > 30000) { 
                comprasGrandes++;
            }

            // Reto 3: Evaluación de compras menores o iguales a $20.000
            if (compras[i] <= 20000) {
                comprasPequenas++;
            }

            // Mini Reto: Lógica para encontrar la compra más alta
            if (compras[i] > compraMayor) {
                compraMayor = compras[i];
            }
        }

        // 6. Calculamos el promedio (usamos (double) para conservar los decimales)
        double promedio = (double) totalVentas / cantidadCompras;

        // 7. Resultado por Consola
        System.out.println("====================================");
        System.out.println("        RESUMEN DE VENTAS           ");
        System.out.println("====================================");
        System.out.println("Cantidad de compras: " + cantidadCompras);
        System.out.println("Dinero recaudado: $" + totalVentas);
        System.out.printf("Promedio por compra: $%.2f%n", promedio);
        System.out.println("Compras superiores a $30.000: " + comprasGrandes);
        System.out.println("Compras menores o iguales a $20.000: " + comprasPequenas);
        System.out.println("Compra mas alta: $" + compraMayor);

        // Reto 4: Evaluación con condicional if-else
        if (promedio > 25000) {
            System.out.println("Mensaje: Dia excelente");
        } else {
            System.out.println("Mensaje: Dia normal");
        }
        System.out.println("====================================");
    }
}