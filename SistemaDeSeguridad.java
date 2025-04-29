import java.util.Scanner;

public class SistemaDeSeguridad {
    public static void main(String[] args) {

        int codigoDeAcceso = 2023;
        int permisoMin = 1;
        int permisomax = 3;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el código de acceso:");
        int codigoIngresado = teclado.nextInt();

        System.out.println("Ingrese nivel de acceso:");
        int nivelIngresado = teclado.nextInt();

        boolean codigoValido = codigoDeAcceso == codigoIngresado;
        boolean nivelValido = nivelIngresado >= permisoMin && nivelIngresado <= permisomax;

        if (codigoValido && nivelValido){
            System.out.println("Acceso permitido, entrando al sistema.");
        } else {
            System.out.println("Acceso denegado.");

            if(!codigoValido){
                System.out.println("Motivo: código incorrecto.");
            }
            if(!nivelValido){
                System.out.println("Motivo: Nivel inválido.");
            }
        }
        teclado.close();
    }
}
