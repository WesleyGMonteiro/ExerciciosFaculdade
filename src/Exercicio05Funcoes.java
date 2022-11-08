import java.util.Scanner;

public class Exercicio05Funcoes {
    public static double entradaDados() {
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		return n;
	}

	public static void imprimirTexto() {
		System.out.println("Escolha 3 numeros Reais, A, B e C");
	}

	public static void imprimirTextoDel(double r) {
		System.out.println("Delta: " + r);
	}
	public static void imprimirTextoDeX1X2(double r, double r2) {
		System.out.println("x1: "+r);
		System.out.println("x2: "+r2);
	}
	
	public static void imprimirTextoSemR() {
		System.out.println("Delta não Tem Raiz");
	}
	public static double calculoDeX1(double b, double delta, double a) {
		double x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
		return x1;

	}

	public static double calculoDeX2(double b, double delta, double a) {
		double x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
		return x2;
	}

	public static double bhaskara(double a, double b, double c) {
		double delta = (Math.pow(b, 2)) + (-4 * a * c);
		return delta;
	}

	public static void main(String[] args) {
		imprimirTexto();
		double a = entradaDados();
		double b = entradaDados();
		double c = entradaDados();
		double delta = bhaskara(a, b, c);
		imprimirTextoDel(delta);
		if (delta>=0) {
		double x1 = calculoDeX1(b, delta, a);
		double x2 = calculoDeX2(b, delta, a);
		imprimirTextoDeX1X2(x1, x2);
		}else {
			imprimirTextoSemR();
		}

	}
}
