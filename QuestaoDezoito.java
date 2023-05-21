/* Nome do Aluno: Rafael Rascado da Silva
* RA:
* Nome do Programa: Imprimir o fatorial do número informado pelo usuário
* Data: 26/04/2023

Faça um programa que determine o fatorial de um número. Para
este problema, tem-se como entrada o valor do número do qual
se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O
fatorial de um número N (N!) é definido conforme a seguir
(utilize for):
i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Informe um número que queira saber o fatorial");

    Scanner teclado = new Scanner(System.in);
    int numero = teclado.nextInt();
    int fatorial = 1;

    for (int i = numero; i >= 1; i--) {
      fatorial *= i;

    }
    System.out.println(fatorial);
  }
}