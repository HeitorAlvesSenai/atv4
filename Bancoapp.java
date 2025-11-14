public class Bancoapp {
    public static void main(String[] args) {
        // === BANCO APP ===

        // Inserindo pessoas com titular e numero da conta
        ContaBancaria pessoa1 = new ContaBancaria("yuz", 1945);
        ContaBancaria pessoa2 = new ContaBancaria("Samuel", 1872);

        // Ação da primeira pessoa com deposito e sucesso no saque
        pessoa1.depositar(1000.0);
        pessoa1.sacar(123.0);
        pessoa1.exibirInformacoes();

        // Ação da segunda pessoa com deposito e falha no saque
        pessoa2.depositar(2222.2);
        pessoa2.sacar(3333.3);
        pessoa2.exibirInformacoes();
    }
}
