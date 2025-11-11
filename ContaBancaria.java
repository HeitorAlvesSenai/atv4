public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria (String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        if (valor >= 0.0) {
            saldo += valor;
            System.out.println("Saldo feito com sucesso!");
        } else {
            System.out.println("Saldo não realizado.");
        }
    }


    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque feito com sucesso!");
        } else {
            System.out.println("Saque não realizado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }
}
