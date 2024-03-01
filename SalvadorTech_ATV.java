import java.util.Scanner;

public class SalvadorTech_ATV {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        metodoAula(ler);
    }

    public static void metodoAula(Scanner ler) {
        int numeros;
        System.out.println("A partir daqui, escreva 2 números...");

        for (int i = 0; i < 2; i++) {
        	System.out.println(" ");
            System.out.print("Escreva um número:");
            System.out.println(" ");
            numeros = ler.nextInt();

            if (numeros % 2 != 0) {
                System.out.println("Números ímpares até " + numeros + ":");
                int soma = 0;

                for (int k = 1; k <= numeros; k += 2) {
                    System.out.println(k);
                    soma += k;
                }

                System.out.println("Soma dos números ímpares: " + soma);
            } else {
            	
                System.out.println("Números pares ao quadrado até " + numeros + ":");
                System.out.println(" ");
                
                for (int j = 0; j <= numeros; j += 2) {
                    System.out.println("Numeros pares: " + j);
                    
                    System.out.println("Quadrado dos pares: " + j * j);
                }
            }
        }
    }
}
