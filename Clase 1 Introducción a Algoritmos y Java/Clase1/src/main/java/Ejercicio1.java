import java.util.Scanner;

/*a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
y “b”. Su código puede arrancar (por ejemplo):
int numeroInicio = 5;
int numeroFin = 14;
// Se deberían mostrar los números:
5,6,7,8,9,10,11,12,13,14
b. A lo anterior, solo muestre los números pares
c. A lo anterior, con una variable extra, elija si se deben mostrar los números
pares o impares
d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden */

public class Ejercicio1{
     
    public static void main (String[] args) {
        
        int numero_inicio = 5;
        int numero_fin = 14;
        

        /*punto A: todos los numeros del 5 al 14 inclusive
        while (numero_inicio <= numero_fin){
            System.out.println(numero_inicio);
            numero_inicio ++;
        }*/

        /*punto B: todos los numeros PARES del 5 al 14 inclusive
        while (numero_inicio <= numero_fin){
            if (numero_inicio %2 == 0){
            System.out.println(numero_inicio);
            }
            numero_inicio ++;
        }*/

        /*punto C: elegir entre mostrar impares o pares */
        Scanner pares_impares = new Scanner(System.in);
        System.out.println("Ingrese 1 para mostrar los pares y 2 para los impares: ");
        int respuesta_usuario;
        respuesta_usuario = pares_impares.nextInt();
        while (numero_inicio <= numero_fin){
            if (respuesta_usuario == 1){
                if (numero_inicio %2 == 0){
                    System.out.println(numero_inicio);
                    
                }
                numero_inicio++;
            }

            if (respuesta_usuario == 1){
                if (numero_inicio %2 != 0){
                    System.out.println(numero_inicio);
                    numero_inicio++;
                }
            }
        }







    }

    
}