import java.util.Scanner;

public class Prestamo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorMinPrestamo = 1000;
        int valorMaxPrestamo = 5000;

        System.out.println("Ingrese el valor del prétamo");
        int valorIngresado = teclado.nextInt();

        if (valorIngresado >= valorMinPrestamo && valorIngresado <= valorMaxPrestamo){
            System.out.println("Préstamo aprobado por: $" + valorIngresado);
        }else{
            System.out.println("El valor $" + valorIngresado + " no está desntro del intervalo permitido para el préstamo.");
        }
    }
}
