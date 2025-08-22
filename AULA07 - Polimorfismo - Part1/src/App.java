public class App {
    public static void main(String[] args) throws Exception {
        Cachorro c = new Cachorro("Rex", 7);
        Preguica p = new Preguica("Gabi", 3);
        Animal a =  new Animal("jp", 4);

        c.exibirCachorro();
        c.correr(true);

        System.out.println("--------------------");

        p.exibirPreguica();
        p.escalando(true);

        System.out.println("------------------------");
        
        a.emitirSom();


    }
}
