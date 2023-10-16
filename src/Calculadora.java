import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro n�mero: ");
        double numero1 = sc.nextDouble();
        System.out.println("Digite o segundo n�mero: ");
        double numero2 = sc.nextDouble();

        sc.nextLine(); 

        System.out.println("Digite a opera��o que deseja realizar (+, -, *, /): ");
        String operacao = sc.nextLine();

        double resultado = 0.0;

        if (operacao.equals("+")) {
            resultado = numero1 + numero2;
        } else if (operacao.equals("-")) {
            resultado = numero1 - numero2;
        } else if (operacao.equals("*")) {
            resultado = numero1 * numero2;
        } else if (operacao.equals("/")) {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                System.out.println("Erro: divis�o por zero.");
                return;
            }
        } else {
            System.out.println("Opera��o inv�lida.");
            return;
        }

        System.out.println("O resultado da opera��o �: " + resultado);
    }
}