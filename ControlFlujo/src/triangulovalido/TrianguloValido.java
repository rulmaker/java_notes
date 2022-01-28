package triangulovalido;

import java.util.Scanner;

public class TrianguloValido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, sumaAngulos;
		
		System.out.println("Introduce el valor del primer ángulo");
		a = sc.nextInt();
		System.out.println("Introduce el valor del segundo ángulo");
		b = sc.nextInt();
		System.out.println("Introduce el valor del tercer ángulo");
		c = sc.nextInt();
		
		sumaAngulos = a + b + c;
		
		//ternario
		/*
		 * sumaAngulos == 180 ? "Es un triángulo" : "No es un 			triángulo"
		 */
		
		if(sumaAngulos < 180 || sumaAngulos > 180) {//!= 180
			System.out.println("El triángulo no es válido");
		}else {
			System.out.println("El triángilo es válido");
		}
	}
}
