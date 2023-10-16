import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();

        if (Primo(numero)) {
            System.out.println(numero + " � um n�mero primo.");
        } else {
            System.out.println(numero + " n�o � um n�mero primo.");
        }

        scanner.close();
    }

    public static boolean Primo(int numero) {
        if (numero <= 1) {
            return false;
        }  
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false; 
            }
        }

        return true;
    }
}