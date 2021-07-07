import java.util.Scanner;

public class Exercicio04 {
	public static void main (String[] args) {
		
		double vetCarrinhoValores[] = new double[50];
		String vetCarrinhoNomes[] = new String[50];
		int opcao = 0, controleNomes=0, controlePrograma = 1;
		int posicaoFinal = 0, qtdItens=0;
		double totalCompra = 0.00, maiorValor=0.00;
		String nomeProduto = "";
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Bem vindo ao controle do carrinho de produtos do cliente!");
		
		//Estruturando o menu
		while(controlePrograma == 1) {
			System.out.println("");
			System.out.println("Caso queria acrescentar um novo produto ao carrinho, digite 1\n" + 
			"Caso queira remover um produto do carrinho, digite 2 \n" +
			"Para calcular o valor total da compra, digite 3\n" + 
			"Para exibir a quantidade de produtos comprados, digite 4 \n" + 
			"Exibir o nome do produto com maior valor, digite 5\n" +
			"Exibir o nome de cada produto ao lado de seu pre�o, digite 6 \n" + 
			"Deseja sair do programa? Digite 7");
			
			
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				if(posicaoFinal == vetCarrinhoValores.length) {
					System.out.println("Carrinho cheio");
				}else {
				System.out.println("Digite o nome do produto: ");
				vetCarrinhoNomes[posicaoFinal] = leitor.next();
				System.out.println("Digite o valor do produto: ");
				vetCarrinhoValores[posicaoFinal] = leitor.nextDouble();
				posicaoFinal++;}
				System.out.println(posicaoFinal);
				break;
			
			case 2:
				System.out.println("Digite o nome do produto que deseja remover:");
				nomeProduto = leitor.next();
				for (int i=0; i<vetCarrinhoNomes.length; i++) {
					if (vetCarrinhoNomes[i].equalsIgnoreCase(nomeProduto)) {
						vetCarrinhoNomes[i] = "";
						vetCarrinhoValores[i]= 00;
						System.out.println("Produto " + nomeProduto + " removido!");
						controleNomes = 0;
						i = vetCarrinhoNomes.length;
					} else {
						controleNomes = 1;
					}
				}
				if(controleNomes==1) {
					System.out.println("Produto digitado n�o encontrado.");
				}
				break;
			
			case 3:
				totalCompra = 0.00;
				for (int i=0; i <= posicaoFinal; i++) {
					totalCompra = totalCompra + vetCarrinhoValores[i];
				}
				System.out.println("O valor total da compra � de R$ " + totalCompra);
				break;
			
			case 4:
				qtdItens = 0;
				for (int i=0; i<= posicaoFinal; i++) {
					if (vetCarrinhoValores[i] != 0) {
						qtdItens++;
					}
				}
				System.out.println("Quantidade de produtos = "+qtdItens);
				break;
			
			case 5:
				maiorValor=0;
				for(int i = 0; i<= posicaoFinal; i++) {
					if(vetCarrinhoValores[i] > maiorValor) {
						maiorValor = vetCarrinhoValores[i];
						nomeProduto = vetCarrinhoNomes[i];
					}
				}
				System.out.println("O produto de maior valor � o " + nomeProduto);
				break;
			
			case 6:
				System.out.println("Os produtos que est�o no carrinho s�o: ");
				for (int i=0; i <= posicaoFinal; i++) {
					if(vetCarrinhoNomes[i] != null && vetCarrinhoNomes[i].length() != 0) {
						System.out.println("Produto " + vetCarrinhoNomes[i] + " " + vetCarrinhoValores[i]);
					}}
				break;
			
			case 7:
				controlePrograma = 0;
				System.out.println("Obrigado por usar o nosso programa!");
				break;
			}
		
			
		}	
		leitor.close();
	}
}
