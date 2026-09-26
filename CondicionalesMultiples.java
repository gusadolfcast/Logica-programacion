public class CondicionalesMultiples {
    public static void main(String[] args) {
        double compra = 180000;

        if (compra >= 300000) {
            System.out.println("El descuento es del 20%");
        } else if (compra >= 200000) {
            System.out.println("El descuento es del 15%");
        } else if (compra >= 100000) {
            System.out.println("El descuento es del 10%");
        } else {
            System.out.println("No cuentas con descuento");
        }
    }
}

