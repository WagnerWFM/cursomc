package com.nelioalves.cursomc.domain;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA (2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	// Método para receber um código e verificar se corresponde ao tipo de pessoa.Aula 19/cap2.
	public static TipoCliente toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		// Caso não encontre o código informado no parâmetro, lança uma exceção.
		
		throw new IllegalArgumentException("ID inválido! " + cod);
		
	}

}
