import java.util.Random;
import java.util.Scanner;

public class Simulador_Dados {
	/*
	 * Descripción: Un programa que simule el lanzamiento de dados y muestre los resultados.
		Características adicionales: Permite al usuario elegir cuántos dados quiere lanzar
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();
		int numero = 0;
		int dado1 = 0, dado2 = 0;
		
		System.out.println("Introduce cuantos dados quieres introducir");
		numero = entrada.nextInt();
		
		if(numero == 1) {
			 dado1 = aleatorio.nextInt(6);
			 System.out.println("El dado 1 " +dado1);

		}
		
		if(numero == 2) {
			dado1 = aleatorio.nextInt(6);
			dado2 = aleatorio.nextInt(6);
			 System.out.println("El dado 1 " +dado1);
			 System.out.println("El dado 2 " +dado2);

			
		}
		
		 
		
		
	}

}
