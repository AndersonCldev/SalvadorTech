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
            System.out.println("Escreva um número:");
            numeros = ler.nextInt();

            if (numeros % 2 != 0) {
                System.out.println("Números ímpares até " + numeros + ":");

                for (int k = 1; k <= numeros; k += 2) {
                    System.out.println(k);
                }
            } else {
                System.out.println("Números pares ao quadrado até " + numeros + ":");

                for (int j = 0; j <= numeros; j += 2) {
                    System.out.println(j * j);
                }
            }
        }
    }
}
