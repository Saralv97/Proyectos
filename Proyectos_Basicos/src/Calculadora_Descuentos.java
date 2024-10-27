import java.util.Scanner;

public class Calculadora_Descuentos {
	//Programa una calculadora que tome el precio de un producto y un porcentaje de descuento, 
	//y calcule el precio final con el descuento aplicado.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final double IVA = 0.21;
		double precio = 0;
		double precio_iva = 0;
		double preciofin = 0;
		
		System.out.println("Introduce un producto");
		precio = entrada.nextDouble();
		
		precio_iva = precio * IVA;
		preciofin = precio + precio_iva;
		
		
		System.out.println("El precio final es " + preciofin);

	}

}
