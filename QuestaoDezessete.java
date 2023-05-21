/* Nome do Aluno: Rafael Rascado da Silva
* RA: 1272317508
* Nome do Programa: Venda
* Data: 18.05.2023
*/

/*Faça um programa que imprima os múltiplos negativos de 7,
superiores a -1000.*/

class Main {
  public static void main(String[] args) {

    int num = -1000;

    do {
      if (num % 7 == 0 && num < 0) {
        System.out.println(num);
      }
      num++;
    } while (num > -1000);
  }
}