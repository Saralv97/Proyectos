import java.util.Scanner;

public class Calculadora_Edad {
	//Crea un programa que pregunte al usuario su fecha de nacimiento 
	//y calcule su edad real en años

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Declaramos las variables
		int edad = 0;
		int año = 2024;
		
		//Pedimos la fecha de nacimiento
		System.out.println("Introduce fecha de nacimiento");
		int nacimiento = entrada.nextInt();
		
		//La edad se calcula restando el año actual menos el año de nacimiento
		edad = año - nacimiento;
		
		System.out.println("Tienes " + edad + " años");
		
	}

}
