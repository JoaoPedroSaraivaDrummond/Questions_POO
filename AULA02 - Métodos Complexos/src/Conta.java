public class Conta {

    public String cpf;
    public int saldo;
    public String numeroBanco;
    public boolean contaEspecial;


    public double bonus (){
        if (contaEspecial) {
            return saldo * 0.10 ;
        } else {
            return saldo * 0.05 ;
        }

    }


    public void sacar (int valor){
    if (saldo > 0 && valor <= saldo) {
        saldo -= valor; 
        System.out.println("Valor sacado R$" + valor);
    } else {
        System.out.println("Saldo insuficiente para saque");
    }

    }

    public void depositar (int valor){
    if (valor > 0) {
        saldo += valor;
        System.out.println("Valor depositado R$" + valor);
    } else {
        System.out.println("Impossivel depositar valores negativos");
    }
    
    }

    public void transferir (int transferencia, Conta destino){
        if (saldo > 0 && transferencia <= saldo) {
            saldo -= transferencia;
            destino.saldo += transferencia;
            System.out.println("Transferencia realizada no valor de R$" + transferencia + " para o CPF: " + destino.cpf);
        }else{
            System.out.println("Transferencia nao altorizada");
        }

    }



    public void mostrar (){
        System.out.println("CPF: " + this.cpf);
        System.out.println("Numero do Banco: " + this.numeroBanco);
        System.out.println("Saldo atual: R$" + this.saldo);    
        System.out.println("Valor da bonificacao: " + bonus());
    }


}   
