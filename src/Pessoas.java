import java.util.Scanner;

public class Pessoas {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Digite o nome da pessoa: ");
	String nome = sc.nextLine();
	
	System.out.println("Digite a idade de " + nome + ":");
	int idade = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("Digite o sexo de " + nome + ":");
	String sexo = sc.nextLine();
	
	sc.close();
	
	System.out.println(nome + " tem " + idade + " de idade, e é do sexo " + sexo + ".");
	

	}

}
