/* Nome do Aluno: Rafael Rascado
* RA: 1272317508
* Nome do Programa: Informar qual o maior número
* Data: 18.05.2023
*/

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe o primeiro número");
    int numA = teclado.nextInt(); 
    System.out.println("Informe o segundo número");
    int numB = teclado.nextInt(); 

    if(numA % numB == 0 ){
      System.out.println("Os números são múltiplos");
    } else{
      System.out.println("Os números não são múltiplos");
    }
  }
}