/* Nome do Aluno: Rafael Rascado da Silva
* RA: 1272317508
* Nome do Programa: Imprima a soma dos números de 1 a 100
* Data: 26/04/2023
*/

// Faça um programa que some os números de 1 a 100 e imprima
//somente o valor total da soma 

class Main {
  public static void main(String[] args) {

    int soma = 0;
    for (int i = 0; i < 100; i++) {
      soma += i;
    }
    System.out.println(soma);

  }
}