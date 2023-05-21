/* Nome do Aluno: Rafael Rascado da Silva
* RA: 1272317508
* Nome do Programa: Venda
* Data: 18.05.2023
*/

//  Faça um programa que receba o valor da venda, escolha a 
// condição de pagamento no menu e mostre o total da venda final 
// conforme condições a seguir:
// Venda a Vista - desconto de 10%
// Venda a Prazo 30 dias- desconto de 5%
// Venda a Prazo 60 dias - mesmo preço
// Venda a Prazo 90 dias - acréscimo de 5%
// Venda com cartão de débito - desconto de 8%
// Venda com cartão de crédito - desconto de 7

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("Olá, o valor da venda foi: ");
    Scanner teclado = new Scanner(System.in);
    double valorVenda = teclado.nextDouble();

    System.out.println(
        "Como deseja pagar: A vista - 10% desconto / A prazo 30 Dias - 5% desconto / A prazo 60 dias - mesmo preço / A prazo 90 dias - acréscimo de 5% / Cartão de débito - 8% desconto / Cartão de crédito - 7% desconto");

    Scanner tecladoEscolha = new Scanner(System.in);
    String escolha = tecladoEscolha.nextLine();

    switch (escolha) {
      case "A vista":
        double valorPagar = valorVenda * 0.90;
        System.out.println(valorPagar);
        break;
      case "30":
        valorPagar = valorVenda * 0.95;
        System.out.println(valorPagar);
        break;
      case "60":
        valorPagar = valorVenda;
        System.out.println(valorPagar);
        break;
      case "90":
        valorPagar = valorVenda * 1.05;
        System.out.println(valorPagar);
        break;
      case "Debito":
        valorPagar = valorVenda * 0.92;
        System.out.println(valorPagar);
        break;
      case "Credito":
        valorPagar = valorVenda * 1.07;
        System.out.println(valorPagar);
        break;
      default:
        System.out.println("Opção inválida, informe uma das opções: A vista - 30 - 60 - 90 - Debito - Credito");
    }

  }
}