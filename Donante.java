import java.util.Scanner;

public class Donante {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la edad del donante");
        int edad = teclado.nextInt();

        System.out.println("Ingrese el peso del donante");
        int peso = teclado.nextInt();

        boolean edadValida = edad >= 18 && edad <= 65;
        boolean pesoValido = peso > 50;

        if (edadValida && pesoValido){
            System.out.println("El donante es compatible, puede donar sangre.");
        }else {
            System.out.println("El donante NO es compatible, no puede donar sangre.");

            if(!edadValida){
                System.out.println("Motivo: debe tener entre 18 y 65 años");
            }
            if (!pesoValido){
                System.out.println("Motivo: debe pesar más de 50 kilos");
            }
        }
        teclado.close();
    }
}
