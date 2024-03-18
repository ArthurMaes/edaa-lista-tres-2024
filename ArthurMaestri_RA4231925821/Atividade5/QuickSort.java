import java.util.Scanner;

public class QuickSort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite uma string: ");
        String input = scanner.nextLine();

        char[] caracteres = input.toCharArray();

        quickSort(caracteres, 0, caracteres.length - 1);

        
        System.out.println("\nString ordenada: ");
        for (char c : caracteres) {
            System.out.print(c);
        }

        scanner.close();

    }

    public static void quickSort(char[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivor = particionar(arr, inicio, fim);
            quickSort(arr, inicio, indicePivor - 1);
            quickSort(arr, indicePivor + 1, fim);
        }
    }

    public static int particionar(char[] arr, int inicio, int fim) {
        char pivo = arr[fim];
        int indicePivo = inicio;

        for (int i = inicio; i < fim; i++) {
            if (arr[i] < pivo) {
                char temp = arr[i];
                arr[i] = arr[indicePivo];
                arr[indicePivo] = temp;
                indicePivo++;
            }
           

        }

        char temp = arr[indicePivo];
        arr[indicePivo] = arr[fim];
        arr[fim] = temp;

        return indicePivo;

       
    }
}