package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Sistema de Criação de Conta Bancária ---");

        // Solicita e recebe o nome do usuário
        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine(); // Lê a linha inteira digitada pelo usuário

        // Solicita e recebe o número da agência
        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia = scanner.nextLine(); // Lê a linha inteira digitada pelo usuário
        
        // Solicita e recebe o nome do usuário
        System.out.println("Por favor, digite o número da conta:");
        Integer numeroConta = scanner.nextInt(); // Lê a linha inteira digitada pelo usuário

        // Solicita e recebe o número da agência
        System.out.println("Por favor, digite o saldo:");
        Double saldo = scanner.nextDouble(); // Lê a linha inteira digitada pelo usuário
        
        while (saldo < 0) {
        	System.out.println("O saldo não pode ser negativo, digite outro saldo:");
        	saldo = scanner.nextDouble();
		}

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", 
        		nomeCliente, numeroAgencia, numeroConta, saldo);

        // Fecha o scanner para liberar recursos
        scanner.close();
	}

}
