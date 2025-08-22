public class Aluno extends Pessoa{
    public int matricula;

    public Aluno (String cpf, String nome, int matricula){
        super(cpf, nome);
        this.matricula = matricula;
    }

    public void estudar(){
        System.out.println("Estudando...");
    }

    public void mostrarAluno(){
        super.mostrarPessoa();
        System.out.println("Matricula: " + this.matricula);

    }

}
