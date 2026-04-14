package br.com.obrasync.main;

import br.com.obrasync.service.EstoqueService;

public class TesteObra {

	public static void main(String[] args) {
		
		EstoqueService service = new EstoqueService();
		service.executar();
		
	}
}
