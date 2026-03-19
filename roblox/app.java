 public class app {
    public static void main(String[]agr){
      calculadora minhaCalculadora = new calculadora();

          Double n1 = 10.0;
          Double n2 = 5.0;

    System.out.println("Soma: " + minhaCalculadora.somar(n1,n2));
    System.out.println("Subtração: " + minhaCalculadora.subtrair(n1,n2));
    System.out.println("Multiplicão: " + minhaCalculadora.multiplicar(n1,n2));
    System.out.println("Divisão: " + minhaCalculadora.divisao(n1,n2));
    System.out.println("Percentual: " + minhaCalculadora.percentual(n1,n2));
    System.out.println("Resto da divisão: " + minhaCalculadora.restodivisao(n1,n2));
    
    }
 }