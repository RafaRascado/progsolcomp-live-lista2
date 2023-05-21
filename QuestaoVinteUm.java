/* Nome do Aluno: Rafael Rascado da Silva
* RA: 1272317508
* Nome do Programa: Venda
* Data: 18.05.2023
*/

/*Escreva um programa que, dado um número positivo digitado
pelo o usuário mostre a tabuada de todos os números de 1 até o
número digitado. (utilize for)*/

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

    int[] v11 = new int[11];
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Informe o número!");
    int numA = teclado.nextInt();
  
    for(int i = 0; i <= 10; i++){
        v11[i] = numA * i;
      System.out.println("O número: " + numA + " x " + i + " = " + v11[i]);
    }
  }
}