public class Conta {
    String CPF;
    String numConta;
    int saldo;
    boolean contaEspecial;
    
    
    public Conta(String CPF, String numConta, int saldo, boolean contaEspecial){
        this.CPF = CPF;
        this.numConta = numConta;
        this.saldo = saldo;
        this.contaEspecial = contaEspecial;
    }
    
    public double bonus(){
        if (contaEspecial) {
            return saldo * 0.10;
        }else{
            return saldo * 0.05;
        }
    }

    public void sacar(int valor){
        if (saldo > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saldo apos saque " + saldo + "R$");
        }else{
            System.out.println("Valor insuficiente para saque");
        }
    }

    public void depositar(int valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Valor do deposito: " + valor + "R$");
        }else{
            System.out.println("Valor insuficiente para saque");
        }
    }

    public void transferir(int transferencia, Conta destino){
        if (saldo > 0 && transferencia <= saldo) {
            saldo -= transferencia;
            destino.saldo += transferencia;
            System.out.println("Transferencia realizada no valor de " + transferencia + "R$");
        }else{
            System.out.println("Transferencia não pode ser realizada");
        }
    }

    public void mostrar(){
        System.out.println("Cpf: " + CPF);
        System.out.println("Numero da conta: " + numConta);
        System.out.println("Saldo inicial: " + saldo + "R$");
        System.out.println("Valor da bonificacao: " + bonus());
    }
}
