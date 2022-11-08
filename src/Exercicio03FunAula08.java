import java.util.Scanner;

public class Exercicio03FunAula08 {
    public static int maior(int n1, int n2) {
		System.out.println("Retorna o maior");
		int maior;
		if (n1>n2){
			maior = n1;
		}else {
			maior = n2;
		}
		return maior;
	}
    public static void texto() {
        System.out.println("Digite dois número e encontre o menor: ");
        
    }
    public static void resul(int r) {
        System.out.println("A maior nota é : " + r);
    }
    public static int entradaDados() {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        return n;
    }
    public static void main(String[] args) {
        texto();
        int n1 = entradaDados();
        int n2 = entradaDados();	
        int r = maior(n1,n2);
        resul(r);
    }
}
