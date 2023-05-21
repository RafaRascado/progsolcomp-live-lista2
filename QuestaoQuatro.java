/* Nome do Aluno: Rafael Rascado
* RA: 1272317508
* Nome do Programa: Positivo, Negativo, Impar ou Par
* Data: 18.05.2023
*/

/*Faça um programa que leia um número inteiro e mostre uma
mensagem indicando se este número é par ou ímpar e se é
positivo ou negativo.*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe um número");
    int numA = teclado.nextInt();

    if (numA > 0 && numA % 2 == 0) {
      System.out.println("O número é positivo e par");
    } else if (numA < 0 && numA % 2 != 0) {
      System.out.println("O número é negativo e impar");
    } else if (numA > 0 && numA % 2 != 0) {
      System.out.println("O número é positivo e impar");
    } else if (numA < 0 && numA % 2 == 0) {
      System.out.println("O número é negativo e par");
    }
  }
}