import java.util.Scanner;

public class ContaTerminal {

    public void abreConta(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        int numConta = sc.nextInt();

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = sc.nextDouble();

        System.out.println(("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque."));

    }


}
