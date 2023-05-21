/* Nome do Aluno: Rafael Rascado da Silva
* RA: 1272317508
* Nome do Programa: Informacoes do usuário
* Data: 20.05.2023 
*/

/*Crie um programa que lê um número entre 1 e 12, correspondendo
a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
Ao final, o programa deve imprimir uma mensagem identificando,
com base no número digitado, o nome do mês e a estação.*/

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    
    System.out.println("Informe qual mês deseja visualizar: sendo 1 - janeiro, 2 - Feveireiro, 3 - Março, 4 - Abril, 5 - Maio, 6 - Junho, 7 - Julho, 8 - Agosto, 9 - Setembro, 10 - Outubro, 11 - Novembro, 12 - Dezembro");

  int escolha = teclado.nextInt(); 

    switch(escolha){
      case 1: 
        System.out.println("Janeiro - Verão");
        break; 
        case 2: 
        System.out.println("Fevereiro - Verão");
        break; 
      case 3: 
        System.out.println("Março até 21 - Verão");
        break;
      case 4: 
        System.out.println("Abril - Outono");
        break;
        case 5: 
        System.out.println("Maio - Outono");
        break;
        case 6: 
        System.out.println("Junho até o dia 21 - Outono");
        break;
      case 7: 
        System.out.println("Julho - Inverno");
        break;
      case 8: 
        System.out.println("Agosto - Inverno");
        break; 
      case 9: 
        System.out.println("Setembro até o dia 21 - Inverno");
        break;
        case 10: 
        System.out.println("Outubro - Primavera");
        break;
        case 11: 
        System.out.println("Novembro - Primavera");
        break;
        case 12: 
        System.out.println("Dezembro até o dia 21 - Primavera");
      default: System.out.println("Tente novamente");
        break;
    }
  }
}