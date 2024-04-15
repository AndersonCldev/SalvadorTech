import java.util.Scanner;

//Este código recebe do úsuario um número que ele quer a tabuada e o programa entra em um loop for para mostrar estas operações 
public class SalvadorTech_exercico05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tabuadaEscolhida, resultado;
			
		System.out.println("Escreva até onde o programa deve contar: ");
		tabuadaEscolhida = ler.nextInt();
		
		System.out.println("Número escolhido: " + tabuadaEscolhida);
		System.out.println("______________________________________");
		for(int i = tabuadaEscolhida; i <= tabuadaEscolhida ; i ++) {
			
			for(int j = 0; j<= 10; j++) {
				
				resultado = i * j;
				System.out.println(i +" x " + j +  " = "+ resultado);
			}
			
		}

		System.out.println("Fim");
		System.out.println("Fim");
		System.out.println("Fim");

	}

}
