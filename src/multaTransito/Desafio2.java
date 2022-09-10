package multaTransito;

import java.util.Scanner;

/*
Pedir ao usuario quantas mutlas ele tomou 
Pedir ao usuario quantos pontos na carteira ele tomou (uma de cada vez)
O sistema ira verificar o valor total das multas e a quantida de pontos que tomou

                     Tabela
Infração Leve - R$ 88,38 de multa - 3 pontos na CNH
Infração Média - R$ 130,16 de multa - 4 pontos na CNH
Infração Grave - R$ 195,23 de multa - 5 pontos na CNH
Infração Gravíssima - R$ 293,47 de multa - 7 pontos na CNH

*/
public class Desafio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte qtdMultas;
		int somaPontosCNH = 0, pontosCNH;
		double infraLeve = 88.38, infraMedia = 130.16, infraGrave = 195.23, infraGravissima = 293.47; // valor das infrações
		double valorTotalPagar;

			System.out.println("Quantas multas você tomou ");
			qtdMultas = scanner.nextByte();
			for(int i = 1; i <= qtdMultas; i++) {
				System.out.println("Quantos pontos na CNH você recebeu na multa " + i);
				pontosCNH = scanner.nextInt();
				somaPontosCNH += pontosCNH;
				//valor total das multas
				if(pontosCNH == 3) {
					valorTotalPagar = infraLeve;
					valorTotalPagar += valorTotalPagar;
				}else if(pontosCNH == 4) {
					valorTotalPagar = infraMedia;
					valorTotalPagar += valorTotalPagar;
				}else if(pontosCNH == 5) {
					valorTotalPagar = infraGrave;
					valorTotalPagar += valorTotalPagar;
				}else if(pontosCNH == 7) {
					valorTotalPagar = infraGravissima;
					valorTotalPagar += valorTotalPagar;
				}
			}		
			
			System.out.println("Ao todo você tomou " + somaPontosCNH + " pontos na carteira");
			System.out.println("Ao todo você ira pagar R$ " + valorTotalPagar);

		scanner.close();

	}

}
