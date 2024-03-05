import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String nome = "Marcos Vinicius";
        String tipoConta = "Corrente";
        double saldo = 1500.00;
        int opcao = 0;

        System.out.println("****************************************");
        System.out.println("\nNome do cliente:" + nome);
        System.out.println("Tipo de conta:" + tipoConta);
        System.out.println("Saldo:" + saldo);

        java.lang.String menu = """
                \n ||Digite uma opcao||
                 1- Consultar Saldo
                 2- Fazer PIX
                 3- Deposito
                 4- SAIR    
          """;
        Scanner scanner = new Scanner(System.in);

        while (opcao != 4){
           System.out.println(menu);
           opcao = scanner.nextInt();

           if(opcao == 1){
               System.out.println("O saldo atualizado é:" + saldo);
           }else if (opcao == 2){
               System.out.println("Digite a chave pix:");
               int chavePix = scanner.nextInt();
               System.out.println("Digite o valor:");
               double valorPix = scanner.nextDouble();
           }if(opcao == 3){
                System.out.println("Digite o valor do deposito:");
                double valorDeposito = scanner.nextDouble();
            }

        }

    }
}