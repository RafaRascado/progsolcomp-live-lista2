/* Nome do Aluno: Rafael Rascado da Silva
* RA: 1272317508
* Nome do Programa: Nota Conceito
* Data: 18.05.2023
*/

// Faça um programa para imprimir o conceito de um aluno. O 
// conceito é calculado em função da nota do aluno que varia de 0 
// a 100. As faixas da correlação são mostradas abaixo:
// Nota Conceito
// 0 a 49 Insuficiente
// 50 a 64 Regular
// 65 a 84 Bom
// 85 100 Ótimo

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

    System.out.println("Digite a nota conceito do aluno: ");
    Scanner teclado = new Scanner(System.in);
    double notaConceito = teclado.nextDouble();
    

    while(notaConceito < 0 || notaConceito > 100){
      System.out.println("Digite a nota novamente, a nota tem que ser entre 0 a 100");
      notaConceito = teclado.nextDouble();
      
    }
    
    

    if(notaConceito == 0 || notaConceito <= 49){
      System.out.println("A nota conceito do aluno é: " + notaConceito + " sua nota foi insuficiente" );
    } else if(notaConceito == 50 || notaConceito <= 64){
      System.out.println("A nota conceito do aluno é: " + notaConceito + " sua nota foi regular" );
    } else if(notaConceito == 65 || notaConceito <= 84){
      System.out.println("A nota conceito do aluno é: " + notaConceito + " sua nota foi boa");
    } else if(notaConceito == 85 || notaConceito <= 100){
       System.out.println("A nota conceito do aluno é: " + notaConceito + " sua nota foi ótima");
    }
  }
}