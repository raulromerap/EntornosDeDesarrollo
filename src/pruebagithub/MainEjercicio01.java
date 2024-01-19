package pruebagithub;

import java.util.Scanner;

public class MainEjercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("Introduzca un número: ");
		n = sc.nextInt();

		Eco.eco(n);
		

		sc.close();
	}

}
