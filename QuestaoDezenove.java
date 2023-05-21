/* Nome do Aluno: Rafael Rascado da Silva
* RA: 1272317508
* Nome do Programa: Volume do gás
* Data: 29.04.2023
Um determinado gás duplica seu volume a cada segundo. Dada um
volume inicial, em centímetros cúbicos, digitado pelo usuário
faça um programa que determine o tempo necessário para que
esse volume se torne maior que 1000 centímetros cúbicos. 
*/

import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    System.out.println("informe um valor");
    Scanner teclado = new Scanner(System.in);
    int valorDoGas = teclado.nextInt();
    int valorSegundo = 60;

    while (valorDoGas < 1000) {
      valorDoGas *= 2;
      valorSegundo += 60;
    }

    System.out.println("O tempo necessário para o gás atingir o valor foi: " + valorSegundo + "Segundos");

  }
}