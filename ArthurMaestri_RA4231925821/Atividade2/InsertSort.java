import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaNomes = new ArrayList<>();

        System.out.print("Quantidade de nomes a serem inseridos: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            listaNomes.add(nome);
        }

        scanner.close();

        Collections.sort(listaNomes);

        System.out.println("\nNomes ordenados:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }
}


