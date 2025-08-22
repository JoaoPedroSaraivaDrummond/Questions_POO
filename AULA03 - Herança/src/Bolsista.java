public class Bolsista extends Aluno{

    public boolean jogador;


    public Bolsista (String cpf, String nome, int matricula, boolean jogador){
        super(cpf, nome, matricula);
        this.jogador = jogador;
    }

    public void bolsa(boolean jogador){
        if (jogador) {
            System.out.println("Bolsa de jogador");
        } else {
            System.out.println("Bolsa por outro motivo");
        }
    }


    public void mostrarBolsista(){
        super.mostrarAluno();
        bolsa(jogador);
    }
}
