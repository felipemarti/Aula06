import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		String atividades[] = new String[3];
		Scanner leitor = new Scanner(System.in);
		String escolha;
		
		for (int i=0; i<atividades.length; i++) { 
			System.out.println("Por favor, digite sua ativade n�mero " + (i+1) + " do dia de hoje: ");
			atividades[i] = leitor.next();
		}
		
		System.out.println("Gostaria que as atividades sejam apresentadas na ORDEM que digitou ou INVERSA?");
		escolha = leitor.next();
		
		if(escolha.equalsIgnoreCase("ORDEM")){
			for (int i=0; i<atividades.length; i++) {
				System.out.println("A atividade n�mero " + (i+1) + " foi : " + atividades[i]);
			}
		}else if(escolha.equalsIgnoreCase("INVERSA")) {
			for (int i= atividades.length-1; i>=0; i--)
			{
				System.out.println("A atividade n�mero " + (i+1) + " foi : " + atividades[i]);
			}
		}else {
			System.out.println("Ordem inv�lida.");
		}
	
		leitor.close();
	}
	
}
