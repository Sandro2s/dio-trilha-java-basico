
import java.util.Locale;
import java.util.Scanner;

  //TODO: Conhecer e importa a classe Scanner
 
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

    // Exibir as mensagens para o nosso usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Olá,seja bem vindo");
        System.out.println("Para podermos abrir sua nova conta gentileza informar os dados abaixo :");

        System.out.println("==================================================="); 

    //Obter pela scanner os valores digitados no terminal
    System.out.println("Por favor,digite o numero da Agência!");
    String agencia = scanner.next();
    
    System.out.println("Numero da conta:");
    int numero = scanner.nextInt();

    System.out.println("Por favor,digite seu nome!");
    String nome = scanner.next();
    
    System.out.println("Valor do Depósito");
    double saldo = scanner.nextDouble();
    
    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    
    // Exbir a mensagem de conta criada.
    System.out.println(" Olá "+ nome +", obrigado por criar uma conta em nosso banco.");
    System.out.println(" Sua agência é "+ agencia );
    System.out.println(" Conta "+  numero  + " e seu saldo R$" + saldo + " já está disponível para saque. "); 

    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

      }
}
