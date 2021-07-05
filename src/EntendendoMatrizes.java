import java.util.Scanner;

public class EntendendoMatrizes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int matriz[][] = new int[5][2];
		
		//Atribuir manualmente;
		matriz[0][1] = 99;
		
		for (int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<2; coluna++){
				System.out.println("Digite o consumo do aluno " + linha + " e coluna " + coluna);
				matriz[linha][coluna] = leitor.nextInt();
				
			}
		
		}
		
		for (int linha=0; linha<5; linha++) {
			for(int coluna=0; coluna<2; coluna++){
				System.out.println("O consumo do aluno " + linha + " e coluna" + coluna + "foi " + matriz[linha][coluna] );
				
			}

		}

		leitor.close();
	}
}
