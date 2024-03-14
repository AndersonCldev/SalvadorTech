import java.util.Scanner;

public class SalvadorTech_Exercio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numeroEscolhido;
		
		System.out.println("Escreva até onde o programa deve contar: ");
		numeroEscolhido = ler.nextInt();
		
		for(int i = 0; i <= numeroEscolhido ; i ++) {
			System.out.println(i);
		}

	}

}
