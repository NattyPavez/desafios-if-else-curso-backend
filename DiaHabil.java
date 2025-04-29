import java.util.Scanner;

public class DiaHabil {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean diaValido = false;

        while (!diaValido) { // mientras no sea un dia valido seguir preguntando
            System.out.println("Ingrese el dia de la semana");
            String dia = teclado.nextLine();

            dia = dia.toLowerCase(); // convertimos en minuscula aunque el usuario lo escriba en mayusculas.

            if (dia.equals("lunes") || dia.equals("martes") || dia.equals("miércoles") || dia.equals("jueves") || dia.equals("viernes")) {
                System.out.println(dia + " es un dia hábil.");
                break;
            } else if (dia.equals("sábado") || dia.equals("domingo")) {
                System.out.println(dia + " no es un día hábil.");
                break;
            } else {
                System.out.println("Ingresa un día válido");
            }
        }

        teclado.close();

    }
}
