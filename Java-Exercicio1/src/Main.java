import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}

	private void start() {
				
		System.out.println("Digite o primeiro valor inteiro: ");
		Scanner n1 = new Scanner(System.in);
		int numero1 = n1.nextInt();
		
		System.out.println("Digite o segundo valor inteiro: ");
		Scanner n2 = new Scanner(System.in);
		int numero2 = n2.nextInt(); 
		
		System.out.println("Digite o terceiro valor inteiro: ");
		Scanner n3 = new Scanner(System.in);
		int numero3 = n3.nextInt();
		
		System.out.println("digite o quarto valor inteiro: ");
		Scanner n4 = new Scanner(System.in);
		int numero4 = n4.nextInt();
		
		System.out.println("O menor valor é: " + Math.min(numero1, Math.min(numero2, Math.min(numero3, numero4))));
		System.out.println("O maior valor é: " + Math.max(numero1, Math.max(numero2, Math.max(numero3, numero4))));
		
	}

}


