import java.util.Scanner;

public class  CalculadoraSimples{
    public static float entradaDados() {
		System.out.println("*- Entrada de Dados -*");
		Scanner input = new Scanner(System.in);
		System.out.println("Numero: ");
		float n = input.nextFloat();
		return n;
	}

	public static double entradaDadosDouble() {
		System.out.println("*- Entrada de Dados -*");
		Scanner input = new Scanner(System.in);
		System.out.println("Numero: ");
		double n = input.nextDouble();
		return n;
	}
	


	public static int menu() {
		int op;
		do {
			System.out.println("*- Menu -*");
			Scanner input = new Scanner(System.in);
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Divisão");
			System.out.println("4 - Multiplicação");
			System.out.println("5 - Raiz Quadrada");
			System.out.println("6 - Potencia");
			System.out.println("Opção: ");
			op = input.nextInt();
			if (op < 1 || op > 6) {
				System.err.println("Opção Inválida");
			}
		} while (op < 1 || op > 6);

		return op;
	}

	public static float adicao(float n1, float n2) {
		System.out.println("*- Adição -*");
		return n1 + n2;
	}

	public static float subtracao(float n1, float n2) {
		System.out.println("*- Subtração -*");
		return n1 - n2;

	}

	public static float divisao(float n1, float n2) {
		System.out.println("*- Divisão -*");
		return n1 / n2;

	}

	public static float multipli(float n1, float n2) {
		System.out.println("*- Multiplicao -*");
		return n1 * n2;

	}

	public static double raizQ(double n1) {
		System.out.println("*- Raiz Quadrada -*");
		return Math.sqrt(n1);

	}

	public static double potencia(double n1, double n2) {
		System.out.println("*- Potencia -*");
		return Math.pow(n1 , n2);
	}

	public static void imprimirResultado(double r) {
		System.out.println("*- Imprimir Resultado -*");
		System.out.println("Resultado " + r);
	}

	public static void imprimirResultadoDou(double r) {
		System.out.println("*- Imprimir Resultado -*");
		System.out.println("Resultado " + r);
	}

	public static float controlador(float n1, float n2, int op) {
		System.out.println("*- Controlador -*");
		float resultado;
		switch (op) {
		case 1:
			resultado = adicao(n1, n2);
			break;
		case 2:
			resultado = subtracao(n1, n2);
			break;
		case 3:
			resultado = divisao(n1, n2);
			break;
		case 4:
			resultado = multipli(n1, n2);
			break;
		default:
			resultado = 0;

		}
		return resultado;
	}

	public static void main(String[] args) {
		int op = menu();
		if (op == 5) {
			double n1 = entradaDadosDouble();
			double resultadoRaiz = raizQ(n1);
			imprimirResultadoDou(resultadoRaiz);
		} else if (op == 6) {
			double n1 = entradaDados();
			double n2 = entradaDados();
			double resultadoPot = potencia(n1 , n2);
			imprimirResultado(resultadoPot);
		} else {
			float n1 = entradaDados();
			float n2 = entradaDados();
			float resultado = controlador(n1, n2, op);
			imprimirResultado(resultado);
		}
	}
}
