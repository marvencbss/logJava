import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero = teclado.nextInt();
		
		String result = numero >= 7 ? "aprovado" : "reprovado";
		System.out.println(result);
		
		teclado.close();
	}
}
