import java.util.Scanner;

public class Exercicio01Funcoes {
    public static int entradaDados(){
        System.out.println("*- Entrada de Dados -*");
        Scanner input = new Scanner(System.in);
        System.out.println("Numero: ");
        int n = input.nextInt();
        return n;
}
 public static int teste(int n1, int n2, int n3) {
     int menor= 0;
     if (n1<=n2 && n1<=n3) {
         menor = n1;
     }else if (n2<=n3 && n2<=n1) {
         menor = n2;
     }else {
         menor = n3;
     }
     return menor;
     
 }
 public static void imprimirTexto(int r) {
     System.out.println("O menor numero é: "+r);
     
 }
 public static void main(String[] args) {
     int n1 = entradaDados();
     int n2 = entradaDados();
     int n3 = entradaDados();
     int menor = teste( n1, n2, n3);
     imprimirTexto(menor);
             
 }
}
