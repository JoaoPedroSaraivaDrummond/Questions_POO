public class Conta implements Seguranca{

    public String cpf;
    public String senha;
    public double saldo;


    public void sacar(double valor, String senhaDigitada){
        if (verificarSenha(senhaDigitada)) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                 mensagemSucesso();
                  System.out.println("Valor do saque: R$" + valor + " ,realizado com sucesso");
            }else{ 
                System.out.println("Saldo insuficiente");
            }
        }else{
            mensagemFracasso();
        }

    }

    public void depositar(double valor, String senhaDigitada){
        if (verificarSenha(senhaDigitada)) {
            if (valor > 0) {
                saldo += valor;
                 mensagemSucesso();
                  System.out.println("Valor do deposito: R$" + valor + " ,realizado com sucesso");
            }else{
                System.out.println("Valor do deposito invalido");
            }
        }else{
            mensagemFracasso();
        }

    }


    public boolean verificarSenha(String senhaDigitada){
        return this.senha.equals(senhaDigitada);

    }
    
    
    @Override
    public void mensagemSucesso(){
        System.out.println("Senha correta!");
    }

    @Override
    public void mensagemFracasso(){
        System.out.println("Senha incorreta!");
    }

}
