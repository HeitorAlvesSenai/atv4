public class Main {
    public static void main(String[] args) {
        ContaBancaria pessoa1 = new ContaBancaria("yuz", 1945);
        ContaBancaria pessoa2 = new ContaBancaria("Samuel", 1872);

        pessoa1.depositar(1000.0);
        pessoa2.depositar(2222.2);

        
    }
}
