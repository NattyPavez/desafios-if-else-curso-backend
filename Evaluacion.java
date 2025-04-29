public class Evaluacion {
    public static void main(String[] args) {
        double nota1 = 5.3;
        double nota2 = 6.7;
        double nota3 = 7.0;

        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7.0){
            System.out.println(String.format("El estudiante tuvo un promedio: %.1f + y fué aprobado", promedio));
        } else if (promedio >= 5.0 && promedio <= 6.9) {
            System.out.println(String.format("El estudiante tuvo un promedio: %.1f y está en recuperación", promedio));
        }else {
            System.out.println(String.format("El estudiante tuvo un promedio: %.1f y fué reprobado", promedio));
        }
    }
}
