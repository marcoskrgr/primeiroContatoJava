import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nome = "Marcos Kruger";
        String tipoConta = "Corrente";
        double saldoAtual = 1599.99;
        int opcao = 0;


        System.out.println("**********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldoAtual);
        System.out.println("\n**********************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Enviar Pix
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("O saldo atualizado é: " + saldoAtual);
            } else if (opcao == 2) {
                System.out.println("Qual o valor do pix a ser enviado?");
                double valor = leitura.nextDouble();
                    if (valor > saldoAtual) {
                        System.out.println("Não há saldo para isso.");
                    else {
                        saldoAtual -= valor;
                        System.out.println("Novo saldo: " + saldoAtual);
                    }

            } else if (opcao == 3) {
                    System.out.println("Valor pago: ");
                    double valor = leitura.nextDouble();
                    saldoAtual += valor;
                }
            }

        }
    }
}
