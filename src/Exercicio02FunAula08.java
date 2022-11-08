public class Exercicio02FunAula08 {
    static String status;

	public static void imprimirNota (double nota){
		if (nota >= 6){
		String status = "Parabéns, você foi Aprovado";
		System.out.println(status);
		
		}
		else {
		String status = "Xii, você foi Reprovado";
		System.out.println(status);
		}
		}

	public static void main(String[] args) {
		imprimirNota(4.5);
	}
}
