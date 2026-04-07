package br.com.obrasync.model;

public class Material {

	//Atributos
	private String nome;
	private int peso;
	private double preco;
	
	//Construtor
	public Material(String nome, int peso, double preco) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}

	//Métodos
	public void exibirDetalhes() {
		System.out.println("--- Relátório do Material ---");
		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso + "kg");
		System.out.println("preço: R$ " + preco);
	}
	
	public void usarMaterial(int quantidadeUsada) {
		if (peso >= quantidadeUsada) {
			peso -= quantidadeUsada;
			System.out.println("Sucesso! Foram usados " + quantidadeUsada + 
					"kg de " + nome);
		} else {
			System.out.println("Erro! Estoque insuficiente de " + nome);
		}
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		if (peso < 0) {
			System.out.println("Atenção: peso não pode ser negativo!");
		} else {
			this.peso = peso;
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	

}
