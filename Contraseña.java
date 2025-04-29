import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        int contraseña = 123456;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la contraseña");
        int contraseñaIngresada = teclado.nextInt();


        if (contraseñaIngresada == contraseña){
            System.out.println("¡Acceso permitido!");
        }else {
            System.out.println("¡Acceso denegado!");
        }
    }
}
