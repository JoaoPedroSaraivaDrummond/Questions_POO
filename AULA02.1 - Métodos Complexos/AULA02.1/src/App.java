public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("012-567-899-55", "0000", 1000, false);
        Conta c2 = new Conta("015-544-776-81", "1111", 2000, true);
        c2.transferir(500, c1);
        c1.mostrar();
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        c2.mostrar();
    }
}
