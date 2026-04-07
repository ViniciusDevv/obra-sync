package br.com.obrasync.main;

import br.com.obrasync.model.Material;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class TesteObra {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao = 1;
		
		List<Material> estoque = new ArrayList<>();
		
		while (opcao != 0) {
		System.out.println("--- Cadastro de Material ---");
		
		System.out.println("Nome: ");
		String nome = teclado.next();
		
		System.out.println("Peso: ");
		int peso = teclado.nextInt();
		
		System.out.println("Digite o preço: ");
		double preco = teclado.nextDouble();
		
		Material m = new Material(nome, peso, preco);
		estoque.add(m);
		m.exibirDetalhes();
		System.out.println("\n--- Deseja cadastrar outro? (1-Sim / 0-Não ---");
		opcao = teclado.nextInt();
		
		}
		
		double totalGeral = 0;
		
		System.out.println("\n--- RELATORIO FINAL DO ESTOQUE ---");
		for (Material item : estoque) {
			item.exibirDetalhes();
			totalGeral += item.getPreco();
			System.out.println("Item: " + item.getNome() + " | Peso: "
					+ item.getPeso() + "kg");
			System.out.println("\nVALOR TOTAL DA OBRA: " + totalGeral);
		}
		
		System.out.println("Sistema encerrado.");
		
		teclado.close();
	}

}
