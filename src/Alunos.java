import java.util.Scanner;

public class Alunos {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o nome do aluno: ");
	String aluno = sc.nextLine();
	System.out.println("Digite a matrícula do Aluno: ");
	int matricula = sc.nextInt();
	System.out.println("Digite a nota do Aluno no 1° Bimestre: ");
	double nota1 = sc.nextDouble();
	System.out.println("Digite a nota do Aluno no 2° Bimestre: ");
	double nota2 = sc.nextDouble();
	System.out.println("Digite a nota do Aluno no 3° Bimestre: ");
	double nota3 = sc.nextDouble();
	System.out.println("Digite a nota do Aluno no 4° Bimestre: ");
	double nota4 = sc.nextDouble();
	
	if(nota1 + nota2 + nota3 + nota4>=20){
		System.out.println("O aluno, " + aluno + ", de matrícula " + matricula + ", foi aprovado, com média final: " + ((nota1 + nota2 + nota3 + nota4)/4));
	}else{
		System.out.println("O aluno, " + aluno + ", de matricula " + matricula + " foi reprovado");
	}
	
	sc.close();
	}

}
