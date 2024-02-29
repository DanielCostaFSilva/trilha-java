import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);


        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Por favor digite o numero da conta");
        numeroConta = ler.nextInt();
        cliente.setNumeroConta(numeroConta);

        System.out.println("Por favor digite o numero da agencia");
        agencia = ler.next();
        cliente.setAgencia(agencia);

        System.out.println("Por favor digite o nome do cliente");
        nomeCliente = ler.next();
        cliente.setNomeCliente(nomeCliente);

        System.out.println("Por favor digite o saldo Inicial");
        saldo = ler.nextFloat();
        cliente.setSaldo(saldo);

        System.out.println(cliente.toString());




    }
}
