public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2017;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.6;
        String tipoPlano = "normal";

        if(anoDeLancamento > 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        }  else {
            System.out.println("Filme de antes de 2022.");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Alugar");
        }
    }
}
