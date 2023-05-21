/* Nome do Aluno: Rafael Rascado
* RA: 1272317508
* Nome do Programa: Informar qual o maior número
* Data: 18.05.2023
*/

// Construa um programa que receba como entrada três valores A, B
// e C e os imprima em ordem crescente.

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite o número A: ");
    int numeroA = teclado.nextInt();
    
    
    System.out.println("Digite o número B: ");
    int numeroB = teclado.nextInt();
  
    
    System.out.println("Digite o número C: ");
    int numeroC = teclado.nextInt();
  
    
    if(numeroA < numeroB && numeroB < numeroC){
      System.out.println(numeroA + " " + numeroB + " " + numeroC);
    } else if(numeroB < numeroA && numeroA < numeroC){
      System.out.println(numeroB + " " + numeroA + " " + numeroC);
    } else if(numeroC < numeroA && numeroA < numeroB){
      System.out.println(numeroC + " " + numeroA + " " + numeroB);
    } else if(numeroC < numeroB && numeroB < numeroA){
      System.out.println(numeroC + " " + numeroB + " " + numeroA);
    }
  }
}