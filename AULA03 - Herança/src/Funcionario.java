public class Funcionario extends Pessoa{
    public int indentificacao;

    public Funcionario(String cpf, String nome, int indentificacao){
        super(cpf, nome);
        this.indentificacao = indentificacao; 


    }

    public void salario (){
        System.out.println("Recebemdo salario");
    }

    public void mostrarFuncionario(){
        super.mostrarPessoa();
        System.out.println("Indentificacao: " + this.indentificacao);
        salario();
    }









}
