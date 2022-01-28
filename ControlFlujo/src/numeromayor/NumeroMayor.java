package numeromayor;

import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el primer número");
		int a = sc.nextInt();
		System.out.println("Escribe el segundo número");
		int b = sc.nextInt();
		System.out.println("Escribe el tercer número");
		int c = sc.nextInt();
		
		System.out.println("a = " + a +", " + "b = " + b + ", " + "c = " + c);
		
		if(a > b && a > c) {
			System.out.println("a = " + a + " Es el número mayor");
		}else if (b > a && b > c) {
			System.out.println("b = " + b + " Es el número mayor");
		}else if (c > a && c > b) {
			System.out.println("c = " + c + " Es el número mayor");
		}else if (a == b && a == c && b == c) {
			System.out.println("Los tres números son iguales");
		}else {
			if(a == b && a != c && b != c) {
				System.out.println("a y b son iguales");
			}else if(c == a && c != b && a != b) {
				System.out.println("a y c son iguales");
			}else if(c == b && a != c && a != b) {
				System.out.println("b y c son iguales");
			}
		}
	}
}
