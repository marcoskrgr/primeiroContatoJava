import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != 11) {
            System.out.println("Digite sua nota para o filme ou 11 para encerrar: ");
            nota = leitura.nextDouble();

            if(nota != 11) {
                media += nota;
                totalNotas++;
            }

        }

        System.out.println("A média do seu filme é " + media/totalNotas);
    }
}
