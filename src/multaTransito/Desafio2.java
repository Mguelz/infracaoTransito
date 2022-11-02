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
		double infraLeve = 88.38, infraMedia = 130.16, infraGrave = 195.23, infraGravissima = 293.47;

		double valorTotalPagar = 0, valorTotalSomado = 0;
		boolean continuar = false;
		int posicaoMulta = 1;

		/*
		 * TODO ao usuario errar a quantidade de pontos na carteira, fazer ele repetir
		 * até que ele acerte a quantidade de pontos certa e o "i" do loop FOR tem que
		 * acompanhar, por exemplo, enquanto eu não inserir o 2º valor certo, apresentar
		 * a mensagem "Quantos pontos na CNH você recebeu na multa 2" neste exato
		 * momento o código segue pra frente, e não espera que o usuario arrume a
		 * quantidade certa para seguir
		 */
		do {
			System.out.println("Quantas multas você tomou ");
			qtdMultas = scanner.nextByte();
			for (int i = 1; i <= qtdMultas; i++) {
				System.out.println("Quantos pontos na CNH você recebeu na multa " + i);
				pontosCNH = scanner.nextInt();
				somaPontosCNH += pontosCNH;

				if (pontosCNH != 3 && pontosCNH != 4 && pontosCNH != 5 && pontosCNH != 7) {
					System.out.println("Digite uma quantidade valida (3,4,5 ou 7) \n");
					continuar = true;
					i--;
				} else if (pontosCNH == 3) {
					valorTotalPagar = infraLeve;
					valorTotalSomado += valorTotalPagar;
					posicaoMulta++;
					continuar = false;
				} else if (pontosCNH == 4) {
					valorTotalPagar = infraMedia;
					valorTotalSomado += valorTotalPagar;
					posicaoMulta++;
					continuar = false;
				} else if (pontosCNH == 5) {
					valorTotalPagar = infraGrave;
					valorTotalSomado += valorTotalPagar;
					posicaoMulta++;
					continuar = false;
				} else if (pontosCNH == 7) {
					valorTotalPagar = infraGravissima;
					valorTotalSomado += valorTotalPagar;
					posicaoMulta++;
					continuar = false;
				}
			}
		} while (continuar);

		System.out.println("Ao todo você tomou " + somaPontosCNH + " pontos na carteira");
		System.out.println("Ao todo você ira pagar R$ " + valorTotalSomado);

		scanner.close();

	}

}
