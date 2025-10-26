public class Bolsista extends Aluno{

    public double valorBolsa;


    public Bolsista(String matricula, int anoIngresso, String curso, double valorBolsa){
        super(matricula, anoIngresso, curso);
        this.valorBolsa = valorBolsa;
    }

    @Override
    public double valorCopia(int quantidade){
        return quantidade * 0.07;
    }


    public int quantidadeCopias(){
        return (int) (valorBolsa / 0.07);
    }



    public void mostrarBolsista(){
        super.mostrarAluno();
        System.out.println("Valor da bolsa: R$" + this.valorBolsa);
        System.out.println("Numero maximo de copisa com valor da bolsa: " + this.quantidadeCopias());
    }

}
