import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int primerNumero = teclado.nextInt();

        System.out.println("Ingrese el segundo número");
        int segundoNumero = teclado.nextInt();

        if (primerNumero > segundoNumero){
            System.out.println("El número mayor es: " + primerNumero);
        } else if (primerNumero == segundoNumero) {
            System.out.println("Los números son iguales (" + primerNumero + ")");
        }else {
            System.out.println("El número mayor es: " + segundoNumero);
        }
        teclado.close();
    }
}
