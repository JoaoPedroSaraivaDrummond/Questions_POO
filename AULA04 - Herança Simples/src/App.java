public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f = new Funcionario("Joao","9999", 1500.00);
        f.mostrarFuncionario();

        System.out.println("-----------------------------");

        Presidente p = new Presidente("Pedro","8888",7000.00, 10);
        p.mostrarPresidente();
    }
}
