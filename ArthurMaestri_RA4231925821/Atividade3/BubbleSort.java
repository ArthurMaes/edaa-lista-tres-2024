import java.util.Scanner;

public class BubbleSort {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String str = scanner.nextLine();

        char[] caracteres = str.toCharArray();

        for (int i = 0; i < caracteres.length - 1; i++) {
            for (int j = 0; j < caracteres.length - 1 - i; j++) {
                if (caracteres[j] > caracteres[j + 1]) {
                    char temp = caracteres[j];
                    caracteres[j] = caracteres[j + 1];
                    caracteres[j + 1] = temp;
                }
            }
        }

        String strOrdenada = new String(caracteres);

        System.out.println("String ordenada: " + strOrdenada);

        scanner.close();
    }
}
