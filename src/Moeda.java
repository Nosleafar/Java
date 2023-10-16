import java.util.Scanner;

public class Moeda {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a quantidade em Euro: ");
	double euro = sc.nextDouble();
	
	double dolar = euro/0.95;
	System.out.println("O valor do dólar em euro é de: " + dolar);

	}

}
