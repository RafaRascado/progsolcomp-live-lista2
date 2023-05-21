/* Nome do Aluno: Rafael Rascado da Silva
* RA: 1272317508
* Nome do Programa: Venda
* Data: 18.05.2023
*/

/*Faça um programa que preencha com zeros todas as posições
de um vetor de tamanho 50*/

class Main {
  public static void main(String[] args) {
    int[] v50 = new int[50];
    
    for(int i = 0; i < 50; i++){
        v50[i] = i * 0;
        System.out.println(v50[i]);
    }
  }
}