public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta();
        Conta c2 = new Conta();

         c1.cpf = "0000";
         c1.numeroBanco = "1234";
         c1.saldo = 1000;
         c1.contaEspecial = false;
         
         c2.cpf = "1111";
         c2.numeroBanco = "1234";
         c2.saldo = 500;
         c2.contaEspecial = true;
       
        c1.transferir(200, c2);
        
        c1.mostrar();

        System.out.println("------------------------------");

        c2.mostrar();
    }
}
