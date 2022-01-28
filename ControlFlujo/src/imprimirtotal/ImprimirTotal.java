package imprimirtotal;

import java.text.DecimalFormat;
import java.util.Scanner;

//solicitar el total de una compra por consola.
		// si la cuenta es de menos de 1000
		// si la cuenta es de 1001 - 4999 10%
		// si la cuenta es de 5001 a 9999 20%
		// si la compra es de 10000 o más 30%
//imprimir el total con los descuentos incluidos

public class ImprimirTotal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el precio de tu compra");
		double compra = sc.nextDouble();
		DecimalFormat df = new DecimalFormat("#.##");
		
		//(cuenta *.9) es iguala un descuento de 10%
		if(compra >= 1000 && compra < 5000){
			System.out.println("El total de tu compra es: $" + compra);
			System.out.println("El descuento aplicado es: 10% ");
			System.out.println("El total menos el descuento aplicado es: $" + (compra - (compra * .10)));
			System.out.println("Te ahorraste: " + df.format(compra * .1));
		}else if(compra >= 5000 && compra < 10000) {
			System.out.println("El total de tu compra es: $" + compra);
			System.out.println("El descuento aplicado es: 20% ");
			System.out.println("El total menos el descuento aplicado es: $" + (compra - (compra * .20)));
			System.out.println("Te ahorraste: " + df.format(compra * .2));
		}else if(compra >= 10000) {
			System.out.println("El total de tu compra es: $" + compra );
			System.out.println("El descuento aplicado es: 30% ");
			System.out.println("El total menos el descuento aplicado es: $" + (compra - (compra * .30)));
			System.out.println("Te ahorraste: " + df.format(compra * .3));
		}else {
			System.out.println("El total de tu compra es: $" + compra);
			System.out.println("No se aplica ningún descuento");
		}
		
	}
}
