public class App {
    public static void main(String[] args) throws Exception {
        IngressoComum A1 = new IngressoComum("Cinema", true, 40, 1);
        IngressoVip A2 = new IngressoVip("CinemaVip", false, 100, 1);
        

        System.out.println("Reembolso A1: " + A1.calcularReembolso() + "R$");
        System.out.println("Reembolso A2: " + A2.calcularReembolso() + "R$");
    }
}
