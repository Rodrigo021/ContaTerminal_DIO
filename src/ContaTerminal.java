import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta.");
        int numero = read.nextInt();

        System.out.println("Por favor, digite o número da agência.");
        String agencia = read.next();
        read.nextLine();
        
        System.out.println("Por favor, digite seu nome.");
        String nomeCliente = read.nextLine();

        System.out.println("Por favor, digite o saldo da conta.");
        double saldo = read.nextDouble();


        System.out.println("\nOlá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
