package controlflujo;

import java.util.Scanner;

public class ControlFlujo {
	public static void main(String[] args) {
		System.out.println("Introduce tu edad");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}
		
		
		/*
		 * Pedir 3 n�meros al usuario y mostrar n�mero con el mensaje
		 * n�mero mayor
		 */
	}
}

