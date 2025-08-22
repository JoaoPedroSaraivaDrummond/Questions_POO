public class Presidente extends Funcionario{
    public int acoes;


    public Presidente(String nome, String cpf, double salario, int acoes){
        super(nome, cpf, salario);
        this.acoes = acoes;
    }


    @Override
    
    public double bonus(){
        return salario * 0.10;
    }

    
    public void mostrarPresidente(){
        super.mostrarFuncionario();
        System.out.println("Acoes: " + this.acoes);
    }

}
