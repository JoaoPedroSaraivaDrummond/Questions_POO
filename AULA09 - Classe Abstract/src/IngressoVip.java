public class IngressoVip extends Ingresso{


    public IngressoVip(String nome, boolean ehMeia, double preco, int lote){
        super(nome, ehMeia, preco, lote);
    }
    @Override
    public double calcularReembolso(){
        if (!ehMeia && lote == 1) {
            return preco * 0.10;
        }else
            return preco *0.06;
    }
}
