import java.util.Scanner;

public class Exercicio04Funcoes {
    public static int fator(int n) {
		int res = 1;
		int x = 2;
		while (x <= n) {
			res = res * x;
			x = x + 1;

		}
		return res;
	}

	public static int somar(int n) {
		int res = 0;
		int x = 1;
		while (x <= n) {
			res = res + x;
			x = x + 1;

		}
		return res;
	}

	public static int entradaDados() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		return n;
	}
	public static void imprimirResultado(int r, int x) {
		System.out.println("o Resultado do fatorial dividido pela somatória é: "+(r/x));
	}
	public static void imprimirTexto() {
		System.out.println("Escolha o Seu numero para a operação");
	}
	

	public static void main(String[] args) {
		imprimirTexto();
		int n = entradaDados();
		int n1 = somar(n);
		int n2 = fator(n);
		imprimirResultado(n2,n1);
	}
}
