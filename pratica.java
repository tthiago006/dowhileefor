package exercicios2310;

import java.util.Scanner;

public class pratica {

	public static void main(String[] args) {
		// PRATICA
Scanner leitura = new Scanner (System.in);
		
		int i=1,expoente,base,result=1;
		System.out.println ("leia o valor da base:" );
		base = leitura.nextInt();
		System.out.println ("leia o valor do expoente:");
		expoente = leitura.nextInt();
		while (i<expoente) {
			result = result*expoente;
		System.out.println ("o resultado sera:" +result);	
		i = i+1;
		}
		
		leitura.close();


		
		

	}

}
