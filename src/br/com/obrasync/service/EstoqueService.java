package br.com.obrasync.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.com.obrasync.model.Material;

public class EstoqueService {

	private List<Material> estoque = new ArrayList<>();
	
	public void adicionar(Material m) {
		estoque.add(m);
	}
	
	public void gerarRelatorio() {
		double totalGeral = 0;
		System.out.println("\n--- RELATORIO PROFISSIONAL DE ESTOQUE ---");
		for (Material item : estoque) {
			item.exibirDetalhes();
			totalGeral += item.getPreco();
		}
		System.out.println("VALOR TOTAL ACUMULADO: R$ " + totalGeral);
	}

	
	public void executar() {
		Scanner teclado = new Scanner(System.in);
		int opcao = 1; 


	    while (opcao != 0) {
	        System.out.println("\n--- Cadastro de Material ---");
	        System.out.print("Nome: ");
	        String nome = teclado.next();
	        
	        System.out.print("Peso: ");
	        int peso = teclado.nextInt();
	        
	        System.out.print("Preço: ");
	        double preco = teclado.nextDouble();

	        estoque.add(new Material(nome, peso, preco));

	        System.out.print("Deseja cadastrar outro? (1-Sim / 0-Não): ");
	        opcao = teclado.nextInt();
		}
		
		this.gerarRelatorio();
		teclado.close();
	}
}
