package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);  
		
		int m = 0; 
		int n = 0; 

		System.out.println("Programa para criar uma matriz, lendo qtd de linhas e colunas.");
		System.out.println("Ler um numero da matriz, e devolver o valor que fica a direita,");
		System.out.println("a esquerda, abaixo e acima do numero lido. ");
		System.out.println();
		System.out.print("Quantidade de linhas da matriz: ");
		m = sc.nextInt();
		System.out.print("Quantidade de colunas da matriz: ");
		n = sc.nextInt(); 
		
		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Entre com o valor["+ i + ","+ j + "] da matriz: ");
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("Entre com o valor a ser comparado na matriz: ");
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Posição Encontrada " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Numero à Esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Numero à Cima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Numero à Direita: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Numero à Baixo: " + mat[i + 1][j]);
					}
				}
			}
		}
				
		sc.close();
		
	}

}
