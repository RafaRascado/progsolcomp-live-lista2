/* Nome do Aluno: Rafael Rascado
* RA: 1272317508
* Nome do Programa: Diaria Hotel
* Data: 18.05.2023
*/

// Faça um programa calcula o total de uma hospedagem em um 
// hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
// R$ 5.50 por diária, se o número de diárias for maior que 15;
// R$ 6.00 por diária, se o número de diárias for igual a 15;
// R$ 8.00 por diária, se o número de diárias for menor que 15.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double valorDiaria = 60;

    System.out.println("Informe quantas diárias desejam: ");
    Scanner teclado = new Scanner(System.in);
    int diaria = teclado.nextInt();

    if (diaria > 15) {
      double ValorServico = diaria * 5.50;
      double valorTotal = (valorDiaria * diaria) + ValorServico;

      System.out.println("O valor total da hospedagem é: R$ " + valorTotal + " A quantidade de diárias foram: " + diaria
          + " E o valor do serviço foi: R$ " + ValorServico);
    } else if (diaria == 15) {
      double ValorServico = diaria * 6.00;
      double valorTotal = (valorDiaria * diaria) + ValorServico;
      System.out.println("O valor total da hospedagem é: R$ " + valorTotal + " A quantidade de diárias foram: " + diaria
          + " E o valor do serviço foi: R$ " + ValorServico);
    } else if (diaria < 15) {
      double ValorServico = diaria * 8.00;
      double valorTotal = (valorDiaria * diaria) + ValorServico;
      System.out.println("O valor total da hospedagem é: R$ " + valorTotal + " A quantidade de diárias foram: " + diaria
          + " E o valor do serviço foi: R$ " + ValorServico);
    }

  }
}