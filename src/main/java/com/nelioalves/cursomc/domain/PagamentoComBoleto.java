package com.nelioalves.cursomc.domain;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L;	
	//class que herdam, nao precisam implements Serializable, somente o serialVersionUID.
	
	//ID é herdado da Class Pai
	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
	}
	
	/*Aula 22: Como é uma sub class (herda de pagamento,inclusive o id que no caso de 
	  pagemamento é o id pedidos_id), gerar o contrutor from Superclass.
	 Acrescentar no contrutor os atributos da classe também.*/
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido,
			Date dataVencimento, Date dataPagamento ) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}

	// Getter e Setter somente dos atributos da classe. Os da super class
	// pega diretamente dela.
	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}
