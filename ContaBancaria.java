public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    // Método construtor, recebe apenas titular e o número da conta. O Saldo sempre será iniciado como 0.0
    public ContaBancaria (String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    // Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    // Método para a realização da ação de depósito
    public void depositar(double valor) {
        // Caso o depósito seja zero ou menor, ele não será realizado
        if (valor >= 0.0) {
            saldo += valor; // Para caso ocorra mais depósitos, ele será somado com o saldo atual
            System.out.println("Saldo feito com sucesso!");
        } else {
            System.out.println("Saldo não realizado.");
        }
    }


    // Método para a realização do saque
    public void sacar(double valor) {
        // Caso o saque seja um valor maior que o saldo, o saque não será realizado
        if (valor <= saldo) {
            saldo -= valor; // Para caso ocorra mais saques, ele será subtraído com o saldo atual
            System.out.println("Saque feito com sucesso!");
        } else {
            System.out.println("Saque não realizado.");
        }
    }

    // Método para exibir informações da pessoa com titular, numero da conta e saldo
    public void exibirInformacoes() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("--------------------");
    }
}
