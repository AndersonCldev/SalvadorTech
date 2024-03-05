import java.util.Scanner;


public class SalvadorTech_Exer02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double  [] populacao = new double [4]; 
		String  [] nameCidade = new String[4] ;
		
		
		System.out.print("Escreva o nome da cidade de 4 cidades: ");
		for(int i =0; i < 4; i ++){
	
			nameCidade [i] = ler.nextLine();
			
			}
		
		System.out.println("Escreva quantidade de habitantes nas 4 cidades: ");
		for(int i =0; i < 4; i ++){
			
			populacao [i] = ler.nextDouble();
			}
		
		double maiorPopulacao = populacao[0];
		String cidadeMiorPopulacao = nameCidade[0];
			
		for(int i = 0; i< 4; i++) {	
				
				if(populacao[1] < maiorPopulacao ) {
					 maiorPopulacao = populacao[i];
					 cidadeMiorPopulacao = nameCidade[i];
				}
		System.out.println("A cidade com maior porpulação e " + cidadeMiorPopulacao + " com exatos "+ maiorPopulacao + " Habitantes");
				
		}
	}

}
