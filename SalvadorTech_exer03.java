import java.util.ArrayList;
import java.util.Scanner;

public class SalvadorTech_exer03 {
    public static void main(String[] args) {
    	
        ArrayList<String> produtos = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        adicionarIntens(produtos, ler);
        removerItens(produtos, ler);
          
        
}

    public static void adicionarIntens(ArrayList<String> produtos, Scanner ler) {
    	
        System.out.println("Escreva os nomes dos lanches para adicionar à lista: ");

        for (int i = 0; i < 4; i++) {
            produtos.add(ler.nextLine());
        }

        System.out.println("Confira a lista: ");
        for (String produto : produtos) {
            System.out.println(produto);
        }
    }

    public static void removerItens(ArrayList<String> produtos, Scanner ler) {
    	
        System.out.println("Deseja remover algum produto? Sim(1) Não(2) ");
        byte desejaRemover = ler.nextByte();
        ler.nextLine();

        if (desejaRemover == 1) {
            System.out.println("Qual item quer remover?");
            for (int i = 0; i < 4; i++) {
                System.out.println(i + ": " + produtos.get(i));
            }

            System.out.println("Contando a partir de 0, qual você quer remover?");
            byte remover = ler.nextByte();
            if (remover >= 0 && remover < produtos.size()) {
                produtos.remove(remover);
                System.out.println("Item removido com sucesso!");
            } else {
                System.out.println("Índice inválido. Nenhum item removido.");
            }
        }
        		System.out.println("Produtos atuais");
        		for(int i = 0; i < produtos.size() ; i++) {
        				System.out.println(produtos.get(i));
            }
    }
    

    
}
