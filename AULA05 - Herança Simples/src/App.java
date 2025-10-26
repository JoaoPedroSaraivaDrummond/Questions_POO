public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno p = new Aluno("1111", 2023, "ADS" );

        //double valor =  p.valorCopia(15);

        System.out.println("Valor gasto com copias R$" + p.valorCopia(15));
        p.mostrarAluno();

        System.out.println("--------------------------------------");

        Bolsista b = new Bolsista("8563", 2020, "Medicina", 600.00);

        double valor1 = b.valorCopia(15);

        System.out.println("Valor gasto com copias R$" + valor1);
        b.mostrarBolsista();
    }
}
