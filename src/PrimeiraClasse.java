

public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao MarcoslicoFlix");
        System.out.println("Filme: Viva, a vida é uma festa!");

        int anoDeLancamento = 2017;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Incluido no plano?");

        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.6;

        double media = (9.8 + 8.5 + 8) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Viva, a vida é uma festa!
                Filme incrível!
                Ano de Lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);


        double temperaturaCelcius = 20;
        double temperaturaFar = (temperaturaCelcius * 1.8) + 32;
        System.out.println(temperaturaFar);



    }
}
