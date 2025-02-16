import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String nomeCliente;
        String agencia;
        int numero;
        float saldo;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Numero: ");
            numero = scanner.nextInt();
            scanner.nextLine(); // Captura a quebra de linha deixada pelo nextInt()
            System.out.print("Agencia: ");
            agencia = scanner.nextLine();
            System.out.print("Nome: ");
            nomeCliente = scanner.nextLine();
            System.out.print("Saldo: ");
            String saldoStr = scanner.nextLine();
            saldo = Float.parseFloat(saldoStr);
        }

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência " + agencia +
                ", conta " + numero +
                " e seu saldo " + saldo +
                " já está disponível para saque");
    }
}