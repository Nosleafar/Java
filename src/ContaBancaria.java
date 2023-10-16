import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o n�mero da conta (somente n�meros): ");
        int conta = sc.nextInt();
        
        System.out.println("O saldo atual da sua conta, � de R$1000");
        double saldo = 1000.0;

        sc.nextLine();

        System.out.println("Deseja sacar ou depositar? (Digite 'sacar' ou 'depositar'): ");
        String operacao = sc.nextLine();
        
        if (operacao.equals("sacar")) {
            System.out.println("Qual valor voc� deseja sacar?: ");
            double valorSaque = sc.nextDouble();
            if (valorSaque > saldo) {
                System.out.println("Saldo insuficiente para sacar o valor solicitado.");
            } else {
                saldo -= valorSaque;
                System.out.println("Saque de R$" + valorSaque + " realizado com sucesso.");
                System.out.println("O valor atual de sua conta � de: R$" + saldo);
            }
        } else if (operacao.equals("depositar")) {
            System.out.println("Qual valor voc� deseja depositar?: ");
            double valorDeposito = sc.nextDouble();
            saldo += valorDeposito;
            System.out.println("Dep�sito de R$" + valorDeposito + " realizado com sucesso.");
            System.out.println("O valor atual de sua conta � de: R$" + saldo);
        } else {
            System.out.println("Opera��o inv�lida. Digite 'sacar' ou 'depositar'.");
        }

        sc.close();
    }
}