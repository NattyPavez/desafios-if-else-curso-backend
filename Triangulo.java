import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer lado:");
        int ladoA = teclado.nextInt();

        System.out.println("Ingrese el segundo lado:");
        int ladoB = teclado.nextInt();

        System.out.println("Ingrese el tercer lado:");
        int ladoC = teclado.nextInt();

        if(ladoA == 0 || ladoB == 0 || ladoC ==0){
            System.out.println("No se puede formar un triángulo con esas medidas");
        }else if ((ladoA + ladoB > ladoC) && (ladoB + ladoC > ladoA) && (ladoA + ladoC > ladoB)){
            System.out.println("Los lados pueden formar un triángulo");
        }else{
            System.out.println("No se puede formar un triángulo con esas medidas");
        }
    }
}
