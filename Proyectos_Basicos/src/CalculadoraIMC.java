import java.util.Scanner;

public class CalculadoraIMC {
	//Crea un programa que permita al usuario ingresar su peso y altura, 
	//y calcule su índice de Masa Corporal (IMC).

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Declaramos las variables
		double peso = 0;
		double altura = 0;
		double imc = 0; 
		
		//Pedimos el peso y altura por teclado
		System.out.println("Introduce peso");
		peso = entrada.nextDouble();
		
		System.out.println("Introduce altura");
		altura = entrada.nextDouble();
		
		//altura es altura entre 100
		altura = altura /100;

		//El indice de masa corporal es el peso entre altura al cuadrado
		imc = peso / (altura * altura);
		
		if(imc < 18.5) {
			System.out.println("Bajo peso");
		}
		
		if(imc >=18.5 && imc <= 24.9) {
			System.out.println("Peso saludable");
		}
		
		if(imc >= 25 && imc <=29.9) {
			System.out.println("Sobrepeso");
		}
		
		if(imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidad grado 1");
		}
		
		if(imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidad grado 2");
		}
		
		if(imc >= 40) {
			System.out.println("Obesidad grado 3");
		}
		
		//Imprimimos el resultado
		System.out.println("El imc " + imc);
		
		
	}

}
