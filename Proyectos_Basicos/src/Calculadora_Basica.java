import java.util.Scanner;

public class Calculadora_Basica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opcion = 0;
		double numero1 = 0, numero2 = 0;
		
		System.out.println("Menu:");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		opcion = entrada.nextInt();
		
		System.out.println("Introduce primer numero");
		numero1 = entrada.nextDouble();
		
		System.out.println("Introduce primer numero");
		numero2 = entrada.nextDouble();
		
		if(opcion == 1) {
			suma(numero1, numero2);
		}
		if(opcion == 2) {
			resta(numero1, numero2);
		}
		
		if(opcion == 3) {
			multiplicacion(numero1, numero2);
		}
		if(opcion == 4) {
			division(numero1, numero2);

		}
		

	}
	
	public static double suma(double numero1, double numero2) {
		double resultado = 0;
		resultado = numero1 + numero2;
		System.out.println("El resultado es " + resultado);
		return resultado;
		
	}
	
	public static double resta(double numero1, double numero2) {
		double resultado = 0;
		resultado = numero1 - numero2;
		System.out.println("El resultado es " + resultado);
		return resultado;
		
	}
	
	public static double multiplicacion(double numero1, double numero2) {
		double resultado = 0;
		resultado = numero1 * numero2;
		System.out.println("El resultado es " + resultado);
		return resultado;
		
	}
	
	public static double division(double numero1, double numero2) {
		double resultado = 0;
		resultado = numero1 / numero2;
		System.out.println("El resultado es " + resultado);
		return resultado;
		
	}
	
	
	
	

}
