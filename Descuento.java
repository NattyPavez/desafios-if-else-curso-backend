import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        double valorParadescuento = 100.00;
        double descuento = 0.1;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra:");
        double valorCompra = teclado.nextDouble();

        if (valorCompra >= valorParadescuento){
            double nuevoValor = valorCompra -(valorCompra * descuento);
            System.out.println(String.format("Total con descuento: $%.2f" , nuevoValor));
        }else{
            System.out.println(String.format("El valor es: $%.2f. No aplica descuento" , valorCompra));
        }
        teclado.close();
    }
}
