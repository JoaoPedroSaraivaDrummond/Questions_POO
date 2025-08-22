public class Preguica extends Animal{

    public Preguica(String nome, int idade){
        super(nome, idade);
    }

    public void escalando(boolean escala){
        if (escala) {
            System.out.println("Escalando...");
        }else{
            System.out.println("Parado");
        }
    }

    @Override
    public void emitirSom(){
        System.out.println("zzzzzzzzzzzzzzzz");
    }

    public void exibirPreguica(){
        super.exibir();
    }
}
