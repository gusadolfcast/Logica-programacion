import java.util.Scanner;

public class TiendaDescuentos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double descuento = 0;
        double iva = 19;

        System.out.print("Ingrese el nombre del producto: ");
        String producto = teclado.nextLine();

        System.out.print("Ingrese el precio del producto: $");
        double precio = teclado.nextDouble();

        if (precio >= 500000) {
            descuento = 20;
        } else if (precio >= 300000) {
            descuento = 15;
        } else if (precio >= 100000) {
            descuento = 10;
        } else {
            descuento = 0;
        }

        double valorDescuento = precio * descuento / 100;
        double subtotal = precio - valorDescuento;
        double valorIva = subtotal * iva / 100;
        double total = subtotal + valorIva;

        System.out.println("\n========== RESUMEN DE COMPRA ==========");
        System.out.println("Producto: " + producto);
        System.out.printf("Precio: $%.0f%n", precio);
        System.out.println("Descuento aplicado: " + (int)descuento + "%");
        System.out.printf("Valor del descuento: $%.0f%n", valorDescuento);
        System.out.printf("Subtotal: $%.0f%n", subtotal);
        System.out.printf("IVA (19%%): $%.0f%n", valorIva);
        System.out.printf("TOTAL A PAGAR: $%.0f%n", total);
        System.out.println("=======================================");

        teclado.close();
    }
    
}



