import java.util.Scanner;

public class Exercicio05FunAula08 {
    public static double funcoes(double x) {
		if (x < -1) {
		x = x + 2;
		} else if (x >= -1 || x <= 2) {
			x = Math.pow(x, 2);
			x = x - 4;
		} else if (x > 2) {
			x = ((2 * x) - 1);
		}
		return x;
	}
	public static double entradaDados() {
	Scanner input = new Scanner(System.in);
	double x = input.nextDouble();
	return x;
	}
	public static void imprimir() {
		System.out.println("Escolha um numero");
	}
	public static void imprimirResultado(double r) {
		System.out.println("Imprimir Resultado");
		System.out.println("Resultado " + r);
	}
	public static void main(String[] args) {
		imprimir();
		double atv = entradaDados();
		imprimirResultado(funcoes(atv));
	}
}
