import java.util.Scanner;

public class Exercicio02 {
	public static void main (String[] args) {
		double notas[] = new double[5];
		String nomes[] = new String[5];
		double media = 0;
		Scanner leitor = new Scanner(System.in);
		
		for (int i=0; i<notas.length ;i++) {
			System.out.println("Por favor, digite a nota do " + (i+1) +"º aluno:");
			notas[i] = leitor.nextDouble();
			
			System.out.println("Digite o nome do Aluno: ");
			nomes[i] = leitor.next();
			
			media = media + notas[i];
		}
		
		media = media/notas.length;
	
		for (int i=0; i<notas.length; i++) {
			if (notas[i]<media) {
				System.out.println("Chamar o aluno(a) " + nomes[i] + " para conversar.");
			}
		}
	
		leitor.close();
	}
	
	
	
}
