public class Funcionario {
    public String nome;
    public String cpf;
    public double salario;


    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }



    public double bonus(){
        return salario * 0.05;
    }


    public void mostrarFuncionario(){
        System.out.println("CPF: " + this.cpf);
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: R$" + this.salario);
        System.out.println("Bonus: R$" + this.bonus());
    }


}
