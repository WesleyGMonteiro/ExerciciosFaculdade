import java.util.Scanner;

public class Exercicio06Funcoes {
    public static double entradaDados() {
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		return n;
	}

	public static void imprimirTexto() {
		System.out.println(
				"Escolha 3 numeros Reais, A, B, C e D (1 ou 2)\nSendo D: 1 para receber Maior Raiz ou D: 2 para receber Menor Raiz");
	}

	public static void imprimirTextoDel(double r) {
		System.out.println("Delta: " + r);
	}

	public static void imprimirResultadoD(double r) {
		System.out.println("o retorno da sua função é: " + r);

	}

	public static void imprimirTextoDeMaiorOuMenor(double r) {
		System.out.println("x1: " + r);

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

	public static double testeRaizes(double x1, double x2, double d, double delta) {
		double res = 0;
		if (delta < 0) {
			res = -1;
			return res;
		} else {
			if (d == 1) {
				if (x1 >= x2) {
					res = x1;

				} else if (x2 >= x1) {

					res = x2;

				}
			} else if (d == 2) {
				if (x1 < x2) {
					res = x2;

				} else if (x2 < x1) {

					res = x2;

				}

			}
		}
		return res;

	}

	public static void main(String[] args) {
		imprimirTexto();
		double a = entradaDados();
		double b = entradaDados();
		double c = entradaDados();
		double d = entradaDados();
		double delta = bhaskara(a, b, c);
		imprimirTextoDel(delta);
		double x1 = calculoDeX1(b, delta, a);
		double x2 = calculoDeX2(b, delta, a);

		imprimirResultadoD(testeRaizes(x1, x2, d, delta));
	}
}
