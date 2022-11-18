/*Faça um programa para imprimir:
    1
    2   2
    3   3   3
    .....
    n   n   n   n   n   n  ... n
para um n informado pelo usuário. Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.
*/
import java.util.Scanner;

class App {
	
	public void print(int n) {
		for (int i = 1; i <= n; i++) { // o número que será impresso
			for (int j = 1; j <= i; j++) { // a quantidade de vezes que esse número será impresso na mesma linha.
				System.out.print(i + " ");
			}
			System.out.println(); //terminou de imprimir, passando para o próximo número imprime outra linha.
		}
	}
	
	public static void main(String[] args) {
		App e = new App();
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Digite o Número \"n\": ");
			
			e.print(scan.nextInt());
		}
	}
}
