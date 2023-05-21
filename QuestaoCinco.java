/* Nome do Aluno: Rafael Rascado da Silva
* RA: 1272317508
* Nome do Programa: Informacoes do usuário
* Data: 20.05.2023 
*/

/*Faça um programa que leia o nome, o sobrenome, a idade, em
anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja
visualizar dados completos?”. Se o caractere digitado pelo
usuário for ‘S’ o programa deve imprimir na tela Nome,
Sobrenome, idade e naturalidade. Se o caractere digitado pelo
usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
o caractere não for nenhuma das outras opções acima o programa
deve imprimir “Digitação errada. Tente Novamente”.*/

import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Informe o seu nome: ");
    String nome = teclado.nextLine();
    
    System.out.println("Informe o seu sobrenome: ");
    String sobrenome = teclado.nextLine();
    
      System.out.println("Informe sua naturalidade: ");
    String naturalidade = teclado.nextLine();
    
    System.out.println("Informe sua idade: ");
    int idade = teclado.nextInt();
    
    System.out.println("Ok, agora escolha se deseja visualizar a resposta 'S' ou 'N' ");
    
    Scanner tecladoEscolha = new Scanner(System.in);
    String escolha = tecladoEscolha.nextLine();

    switch(escolha){
      case "S":
    System.out.println(nome + " " + sobrenome + " " + idade + " " + naturalidade);
        break;
      case "N": 
        System.out.println(nome + " " + idade);
          break;
      default: 
        System.out.println("Resposta incorreta, tente novamente");
    }

  }
}