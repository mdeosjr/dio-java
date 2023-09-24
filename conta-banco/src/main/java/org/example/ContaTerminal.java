package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numeroDaConta;
        String agencia;
        String nomeDoCliente;
        float saldo;

        System.out.println("Por favor, digite o número da sua conta: ");
        numeroDaConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agência: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome: ");
        nomeDoCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo R$" + saldo +  " já está disponível para saque.");
    }
}
