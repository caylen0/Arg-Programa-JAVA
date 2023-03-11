import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
		//PUNTO A
		String frase = "ha00la";
		char letra = 'a';
		int contador = 0;
		System.out.println(ejercicio_a(frase, letra, contador));
		
		//PUNTO B
		Scanner orden = new Scanner(System.in);
		System.out.println("Ingrese 1 para ordenar de forma ascendente o 2 para ordenar de forma descendente: ");
		int respuesta_b;
		respuesta_b = orden.nextInt();

		System.out.println(ejercicio_b(7, 5, 6, respuesta_b));


		//PUNTO C
		Scanner numero = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int respuesta_c;
		respuesta_c = numero.nextInt();
		int vector[] = {5,1,5,2};

		ejercicio_c(vector, respuesta_c);



	}


//a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String
	public static int ejercicio_a(String frase, char letra, int contador){
		

		for (int i = 0; i < frase.length(); i++){
			if (frase.charAt(i) == letra){
				contador++;
			}
				
		}
		return contador;
	}

 //b. Dados 3 números y un orden (ascendente o decreciente) que ordene los mismos y los retorne en un vector de 3
	public static Integer[] ejercicio_b (int numero_1, int numero_2, int numero_3, int orden) {
		Integer [] resultado = new Integer[3];
		resultado [0] = numero_1;
		resultado [1] = numero_2;
		resultado [2] = numero_3; 
		Scanner valor = new Scanner(System.in);


		while (orden !=1 && orden !=2){
			System.out.println("Ingrese un valor correcto");
			System.out.println("Ingrese 1 para ordenar de forma ascendente o 2 para ordenar de forma descendente: ");
			orden = valor.nextInt();

		}
		if (orden == 1){
			Arrays.sort(resultado);
		}
		else if (orden == 2){
			Arrays.sort(resultado, Collections.reverseOrder()); 
		}

		for (int numeros : resultado) {
			System.out.println(numeros);
		}
		

		return resultado;
	}


 // c. dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado

	public static int ejercicio_c(int[] vector, int numero){

		int suma = 0;

		for (int i = 0; i < vector.length; i++){
			if (vector[i] > numero){
				suma = suma + vector[i];
			}
			

		}
		System.out.println("El total de la suma es: " + suma);

		return suma;
	}



}
