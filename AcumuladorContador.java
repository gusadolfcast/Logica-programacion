
public class AcumuladorContador {
    
    public static void main(String[] args) {
        int[] notas = {4, 2, 5, 3, 1};
        int aprobados = 0;
        int suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
            
            if (notas[i] >= 3) {
                aprobados++;
            }
        }
        double promedio = (double) suma / notas.length;
        System.out.println("=======================");
        System.out.println("  RESULTADO DEL CURSO");
        System.out.println("=======================");
        System.out.println("Total de notas: " + notas.length);
        System.out.println("Suma de las notas: " + suma);
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + (notas.length - aprobados));
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("=======================");

        if (promedio >= 4.5) {
            System.out.println("Nivel del grupo: EXCELENTE");
        } else if (promedio >= 3) {
            System.out.println("Nivel del grupo: APROBADO");
        } else {
            System.out.println("Nivel del grupo: DEBE MEJORAR");
        }
    }
}
