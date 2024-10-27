import java.util.Scanner;

public class AdivinarNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		
		int numeroAdivinar = 100;
		do {
			System.out.println("Introduce un numero");
			numero = entrada.nextInt();
			
			if(numero > numeroAdivinar) {
				System.out.println("El numero es mayor al numero a adivinar");
			}
			
			if(numero < numeroAdivinar) {
				System.out.println("El numero es menor al numero a adivinar");
			}
			
			if(numero == numeroAdivinar ) {
				System.out.println("Has adivinado el numero");
			}
			
		}while(numero != numeroAdivinar);
		
		
	
		
		
	}

}
