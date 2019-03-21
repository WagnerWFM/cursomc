package com.nelioalves.cursomc.domain;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento{
	private static final long serialVersionUID = 1L;
	//class que herdam, nao precisam implements Serializable, somente o serialVersionUID.
	
	Integer numeroDeParcelas;
	
	public PagamentoComCartao() {
	}

	// Aula 22: Como é uma sub class (herda de pagamento), gerar o contrutor from Superclass.
	// Acrescentar no contrutor os atributos da classe também.
	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}
	
	// Getter e Setter somente dos atributos da classe. Os da super class
	// pega diretamente dela.
	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
}
