import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite sua quantia de renda mensal: ");
    double salario = sc.nextDouble();
    if (salario < 1.293){
      System.out.println("Não aceitamos essa quantia. valor minímo: R$1.293");
      System.out.println("Digite sua quantia salarial novamente ");
    }
    
    





    sc.close();
  }

 /
}