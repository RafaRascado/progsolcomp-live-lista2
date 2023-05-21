/* Nome do Aluno: Rafael Rascado da Silva
* RA: 1272317508
* Nome do Programa: Venda
* Data: 18.05.2023
*/

/*Faça um programa que solicite ao usuário que digite um
número até que ele digite um número menor que 0*/

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe um número que seja menor que 0");

    int numA = teclado.nextInt();

    while(numA > 0){
      System.out.println("Ops... O número foi maior que zero, digite novamente!"); 
      numA = teclado.nextInt();
    }
  }
}