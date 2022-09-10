package multaTransito;

import java.util.Scanner;

/*
   Pedir ao usuario quantos pontos na carteira ele tomou
   O sistema ira verificar a gravidade e o valor da multa
  
                        Tabela
   Infração Leve - R$ 88,38 de multa - 3 pontos na CNH
   Infração Média - R$ 130,16 de multa - 4 pontos na CNH
   Infração Grave - R$ 195,23 de multa - 5 pontos na CNH
   Infração Gravíssima - R$ 293,47 de multa - 7 pontos na CNH
 */
public class Desafio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte pontosCNH = 0;
		int continuar = 0;
		
		do {
			System.out.println("Quantos pontos na CNH você recebeu? ");
			pontosCNH = scanner.nextByte();

			if (pontosCNH == 3) {
				System.out.println("Infração Leve ");
				System.out.println("R$ 88,38 de multa ");
				continuar = 2;
			} else if (pontosCNH == 4) {
				System.out.println("Infração Média");
				System.out.println("R$ 130,16 de multa ");
				continuar = 2;
			} else if (pontosCNH == 5) {
				System.out.println("Infração Grave ");
				System.out.println("R$ 195,23 de multa ");
				continuar = 2;
			} else if (pontosCNH == 7) {
				System.out.println("Infração Gravíssima ");
				System.out.println("R$ 283,47 de multa ");
				continuar = 2;
			}
			
			if (pontosCNH != 3 && pontosCNH != 4 && pontosCNH != 5 && pontosCNH != 7) {
				continuar = 1;
				System.out.println("Digite uma quantidade valida (3,4,5 ou 7)");
			}
		} while (continuar == 1);

		scanner.close();
	}

}
