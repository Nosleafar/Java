import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		int celsius = sc.nextInt();
		
		System.out.println("A temperatura em Fahrenheit é de: " + ((celsius*1.8)+32));

	}

}
