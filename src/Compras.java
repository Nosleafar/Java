import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compras {
    private List<String> itens;
    
    public Compras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }

    public void removerItem(String item) {
        itens.remove(item);
    }

    public void listarItens() {
        System.out.println("Itens na lista de compras:");
        for (String item : itens) {
            System.out.println(item);
        }
    }

    public double calcularCustoTotal() {
        return 0.0;
    }

    public static void main(String[] args) {
        Compras lista = new Compras();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Listar itens");
            System.out.println("4 - Calcular custo total");
            System.out.println("5 - Sair");
            System.out.print("Digite o número da opção: ");
            int opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.print("Digite o nome do item: ");
                scanner.nextLine();
                String nomeItem = scanner.nextLine();
                lista.adicionarItem(nomeItem);
            } else if (opcao == 2) {
                System.out.print("Digite o nome do item a ser removido: ");
                scanner.nextLine();
                String nomeItem = scanner.nextLine();
                lista.removerItem(nomeItem);
            } else if (opcao == 3) {
                lista.listarItens();
            } else if (opcao == 4) {
                double custoTotal = lista.calcularCustoTotal();
                System.out.println("Custo total da lista de compras: R$" + custoTotal);
            } else if (opcao == 5) {
                break;
            }
        }

        scanner.close();
    }
}
