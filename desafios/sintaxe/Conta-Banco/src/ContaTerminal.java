import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String agencia;
        String nomeCliente;
        int numero;
        double saldo;

        Scanner e = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da sua agência.");
        agencia = e.nextLine();

        System.out.println("Por favor, digite o numero da sua conta");
        numero = e.nextInt();
        e.nextLine();
        System.out.println("Por favor, informe seu nome.");
        nomeCliente = e.nextLine();

        saldo = 0;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " conta " + numero + " seu saldo de " + saldo + " já está disponível para saque.");

        e.close();
    }
}
