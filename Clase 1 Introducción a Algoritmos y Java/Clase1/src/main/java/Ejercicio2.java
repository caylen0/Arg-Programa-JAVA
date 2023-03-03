
public class Ejercicio2 {

    public static void main(String[] args) {

        float ingreso_mensual_total = 100000;
        int cant_vehiculos = 10;
        int cant_inmuebles = 1;
        boolean tiene_embarcacion_aeronave = false;

        if ((ingreso_mensual_total > 489083) || (cant_vehiculos >= 3) || (cant_inmuebles >= 3)
                || (tiene_embarcacion_aeronave == true)) {
            System.out.println("Es segmento alto");

        } else {
            System.out.println("No es segmento alto");
        }

    }

}
