public class MainEncapsulamento {

    public static void main(String[] args){

        System.out.println("------TESTANDO ENCAPSULAMENTO------");

        // EXERCÍCIO 1 - CONTA BANCÁRIA
        
        System.out.println("Exercicio 1: Conta Bancaria");

        ContaBancaria minhaConta = new ContaBancaria("Davi Gonçalves");

        System.out.println("O saldo atual e: R$ " + minhaConta.getSaldo());

        // Depósito inválido
        minhaConta.depositar(-50.00);

        // Depósito válido
        minhaConta.depositar(130.20);

        System.out.println("O saldo apos deposito e: R$ "
                + minhaConta.getSaldo());

        // =========================
        // EXERCÍCIO 2 - PRODUTO
        // =========================
        System.out.println("Exercicio 2: Produto");

        Produto produto = new Produto("Teclado", 100.50);

        System.out.println("Produto: " + produto.getNomeProduto());
        System.out.println("Preco: R$ " + produto.getPrecoProduto());

        // Testando preço inválido
        produto.setPreco(-20);
    }
}