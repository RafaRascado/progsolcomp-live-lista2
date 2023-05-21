/* Nome do Aluno: Rafael Rascado da Silva
* RA: 1272317508
* Nome do Programa: Venda
* Data: 18.05.2023
*/

/*Faça um programa que preencha com zeros todas as posições
de uma matriz com 10 linha e 10 colunas*/

class Main {
  public static void main(String[] args) {
    int[] v10 = new int[10];
    int[] j10 = new int[10];

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        v10[i] = i * 0;
        j10[j] = j * 0;

        System.out.println("Valor da matriz V10: " + v10[i] + " Valor da matriz J10: " + j10[j]);
      }
    }
  }
}