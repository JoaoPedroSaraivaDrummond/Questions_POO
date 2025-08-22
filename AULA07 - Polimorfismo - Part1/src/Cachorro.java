public class Cachorro extends Animal{

    public Cachorro(String nome, int idade){
        super(nome, idade);
    }

    public void correr(boolean corre){
        if (corre) {
            System.out.println("Correndo...");
        }else{
            System.out.println("Parado");
        }
    }

    @Override
    public void emitirSom(){
        System.out.println("Latindo...");
    }

    
    public void exibirCachorro() {
        super.exibir();
    }
}
