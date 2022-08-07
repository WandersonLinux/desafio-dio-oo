public class Main {
    public static void main(String[] args) {
        Cliente wanderson = new Cliente();
        wanderson.setNome("Wanderson");

        Conta cc = new ContaCorrente(wanderson);
        Conta poupancao = new ContaPoupanca(wanderson);
        cc.transferir(100, poupancao);

        cc.imprimirExtrato();
        poupancao.imprimirExtrato();
    }
}
