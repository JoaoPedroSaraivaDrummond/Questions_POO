public class Aluno {
    public String matricula;
    public int anoIngresso;
    public String curso;


    public Aluno(String matricula, int anoIngresso, String curso){
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
        this.curso = curso; 
    }


    public double valorCopia(int quantidade){
        return 0.10 * quantidade;
        
    }

    public void mostrarAluno(){
       System.out.println("Matriucula: " + this.matricula);
       System.out.println("Ano de ingresso: " + this.anoIngresso);
       System.out.println("Curso: " + this.curso);
    }
}
