import java.util.Scanner;

public class ContraseñaConIntentos {

    public static void main(String[] args) {
        int contraseñaCorrecta = 123456;
        int maximoIntentos = 3;
        int intentos = 0;
        boolean acceso = false;

        Scanner teclado = new Scanner(System.in);

        while (intentos < maximoIntentos && !acceso){ // (!acceso) = que NO ha ingresado la contraseña correcta aun.
            System.out.println("Introduce la contraseña");
            int contraseñaIngresada = teclado.nextInt();

        if (contraseñaIngresada == contraseñaCorrecta){
            System.out.println("¡Acceso permitido!");
            acceso = true; //para salir de bucle
        }else {
            intentos++;
            System.out.println("¡Contraseña incorrecta! intenta de nuevo (intento " + intentos + " de " + maximoIntentos + ")");
        }

        }
        if (!acceso){ // si No se concede el acceso
            System.out.println("¡Acceso bloquedo!");
        }

        teclado.close(); //buena practica
    }
}

