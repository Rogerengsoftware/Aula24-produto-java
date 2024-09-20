package Curso;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);

        double precoTV, imposto, valorFinal, valorTotalSemImposto;
        int quantidade;
        final double TAXA_IMPOSTO = 15.0; // 15% de imposto

        String nomeCliente, cpf, modeloTV;

        // Entrada de dados do cliente
        System.out.print("Nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.print("CPF do cliente: ");
        cpf = sc.nextLine();

        System.out.print("Qual o modelo de TV deseja adquirir: ");
        modeloTV = sc.nextLine();

        // Entrada de dados sobre a TV
        System.out.print("Informe o valor da Smart TV: ");
        precoTV = sc.nextDouble();

        System.out.print("Quantas unidades serão compradas: ");
        quantidade = sc.nextInt();

        // Cálculo do valor total sem imposto e o valor do imposto
        valorTotalSemImposto = precoTV * quantidade;
        imposto = (valorTotalSemImposto * TAXA_IMPOSTO) / 100;
        valorFinal = valorTotalSemImposto + imposto;

        // Saída formatada
        System.out.println("\nResumo da Compra:");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("CPF: " + cpf);
        System.out.println("Modelo de TV: " + modeloTV);
        System.out.println("Quantidade de Smart TVs: " + quantidade);
        System.out.println("Valor total das Smart TVs (sem imposto): " + currencyFormatter.format(valorTotalSemImposto));
        System.out.println("Imposto de 15%: " + currencyFormatter.format(imposto));
        System.out.println("Valor final com imposto: " + currencyFormatter.format(valorFinal));

        sc.close();
    }
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


