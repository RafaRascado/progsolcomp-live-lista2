/* Nome do Aluno: Rafael Rascado da Silva
* RA: 1272317508
* Nome do Programa: Peso máximo no elevador
* Data: 29.04.2023
Escreva um programa que, dada a carga máxima de um elevador e
a quantidade máxima de pessoas digitadas pelo usuário, leia o
peso de cada pessoa, também digitada pelo usuário, que entra
no elevador até que a carga máxima seja atingida ou o número
máximo de pessoas seja atingido (utilize do / while).
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // Elevador
    Scanner tecladoElevador = new Scanner(System.in);
    Scanner tecladoMaximoPessoaElevador = new Scanner(System.in);

    // Pessoa
    Scanner tecladoPesoPessoa = new Scanner(System.in);
    Scanner maximoPessoaElevador = new Scanner(System.in);

    // Elevador
    System.out.println("Informe a capacidade de carga máxima do elevador: ");
    float pesoElevador = tecladoElevador.nextFloat();

    System.out.println("Informe a capacidade de máxima pessoa no elevador: ");
    int numeroMaximoPessoaElevador = tecladoMaximoPessoaElevador.nextInt();

    // Pessoa
    System.out.println("Informe o peso da  pessoa que entrou");
    float pesoPessoa = tecladoPesoPessoa.nextFloat();
    int numeroPessoa = maximoPessoaElevador.nextInt();

    do {
      System.out.println("Informe o peso da próxima pessoa que entrou");
      pesoPessoa += tecladoPesoPessoa.nextFloat();
      System.out.println("Informe a quantidade de  pessoa que entrou");
      numeroPessoa += maximoPessoaElevador.nextInt();

    } while (pesoPessoa < pesoElevador && numeroPessoa < numeroMaximoPessoaElevador);

  }
}