public class Pessoa {

    public String nome;
    public int anoDeNacimento;
    public double peso;
    public double altura;


    public double calcularIMC (){
    return peso / (altura * 2);
    } 

    public int calcularIdade (){
    return 2025 - anoDeNacimento;
    }

    public double calcularAgua (){
        return peso * 0.035;
    }

    public void mostrar (){
        System.out.println("Nome: " + this.nome);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("Idade: " + this.calcularIdade());
        System.out.println("IMC: " + this.calcularIMC());
        System.out.println("Beber " + this.calcularAgua() + " litros de agua");
    }









}
