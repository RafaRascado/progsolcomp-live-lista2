/* Nome do Aluno: Rafael Rascado da Silva
* RA: 1272317508
* Nome do Programa: Imprima números pares 1 a 100 na ordem inversa 
* Data: 26/04/2023
*/

//Faça um programa que imprima todos os números pares de 1 a 100 na ordem inversa 

import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    for (int i = 100; i >= 0; i--) {
      if (i % 2 == 0) {
        System.out.println("Os números pares em ordem inversa são: " + i);
      }
    }

  }
}