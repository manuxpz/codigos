import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Bem-vindo á calculadora simples!");
      System.out.print("Número 1 :");
      int num1= scanner.nextInt();
      System.out.print("Número 2 :");
      int num2= scanner.nextInt();
      System.out.print("Operação (+,-,*,/):");
      char operacao = scanner.next().charAt(0);
      if(operacao =='+'){
        System.out.println("O resultado é:" + soma(num1,num2));
    } else if(operacao =='-'){
        System.out.println("O resultado é:" + subtracao(num1,num2));
    } else if(operacao =='*'){
        System.out.println("O resultado é:" + multiplicacao(num1,num2));
    } else if(operacao =='/'){
      if(num2 !=0){
        System.out.println("O resultado é:" +divisao(num1,num2));
      }else{
      System.out.println("Erro: Divisão por zero!");
      return;
  }
}else{
  System.out.println("Operação inválida!");
  return;
}
    }
  public static int soma (int a,int b){
    return a+b;
  }
  public static int subtracao (int a,int b){
    return a-b;
  }
  public static int multiplicacao (int a,int b){
    return a*b;
  }
  public static int divisao (int a,int b){
    return a/b;
  }
}
