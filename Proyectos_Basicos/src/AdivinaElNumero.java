import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
	/*
	 * Descripción: Desarrolla un juego donde el usuario tiene que adivinar un número
	 *  generado aleatoriamente dentro de un rango específico.
		Características:
    		Mensajes que indiquen si el número es más alto o más bajo.
    		Contador de intentos.
    		Opción para jugar nuevamente.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();
		int numero = 0;
		
		int numeroAleatorio = aleatorio.nextInt(100)+1;
		System.out.println(numeroAleatorio);
		
		do {
			System.out.println("Introduce un numero");
			numero = entrada.nextInt();
			
			if(numero > numeroAleatorio) {
				System.out.println("El numero es mas alto");
			}
			
			else if(numero < numeroAleatorio) {
				System.out.println("El numero es mas bajo");
			}
			
			else {
				System.out.println("Has adivinado el numero");

			}
			
		}while(numero != numeroAleatorio);
		
		
		
	

	}

}
