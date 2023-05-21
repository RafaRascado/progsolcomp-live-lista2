/* Nome do Aluno: Rafael Rascado da Silva
* RA: 1272317508
* Nome do Programa: Venda
* Data: 18.05.2023
*/

/*Faça um programa que exiba todos os números pares a
partir de 0 até que encontre um múltiplo de 7 (utilize
do/while)*/

class Main {
  public static void main(String[] args) {

    int num = 0;

    do {
      if (num % 2 == 0) {
        System.out.println(num);
      }
      num++;
    } while (num % 7 != 0);

    System.out.println("O número múltilplo de 7: " + num);
  }
}