package triangulovalido;

import java.util.Scanner;

public class TrianguloValido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, sumaAngulos;
		
		System.out.println("Introduce el valor del primer �ngulo");
		a = sc.nextInt();
		System.out.println("Introduce el valor del segundo �ngulo");
		b = sc.nextInt();
		System.out.println("Introduce el valor del tercer �ngulo");
		c = sc.nextInt();
		
		sumaAngulos = a + b + c;
		
		//ternario
		/*
		 * sumaAngulos == 180 ? "Es un tri�ngulo" : "No es un 			tri�ngulo"
		 */
		
		if(sumaAngulos < 180 || sumaAngulos > 180) {//!= 180
			System.out.println("El tri�ngulo no es v�lido");
		}else {
			System.out.println("El tri�ngilo es v�lido");
		}
	}
}
