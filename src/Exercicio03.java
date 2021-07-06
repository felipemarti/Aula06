import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args){
		int numeros[] = new int[50];
		int qtdEntre=0, qtdPar=0, qtdMenor=0, qtdImpar=0;
		Random gerador = new Random();
		for (int i=0; i<numeros.length; i++) {
			
			numeros[i] = gerador.nextInt(10);
			
			if(numeros[i]>3 && numeros[i]<7) {
				qtdEntre++;
		
			}
			if(numeros[i] < 3 ) {
				qtdMenor++;
			}
		
			if ( numeros[i] % 2 == 0) {
				qtdPar++;
			}
			if( numeros[i] % 2 != 0)
			{
				qtdImpar++;
			}
		}
		System.out.println("A quantidade de números entre 3 e 7 é: " + qtdEntre);
		System.out.println("A quantidade de numeros pares é: " + qtdPar);
		System.out.println("A quantidade de números menores que 3 é: " + qtdMenor);
		System.out.println("A quantidade de números impares é: " + qtdImpar);
		System.out.println("O vetor final tem os seguintes némeros: ");
		
		for (int i=0 ; i<numeros.length; i++) {
			System.out.println("Número "+ (i+1) + " : " + numeros[i]);	
		}
	}
}
