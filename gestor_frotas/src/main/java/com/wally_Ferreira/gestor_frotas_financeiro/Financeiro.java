package com.wally_Ferreira.gestor_frotas_financeiro;

import java.util.List;

public class Financeiro {
	private List<Pagamento> pagamento;
	private List<Recebimento> recebimento;
	
	

	public List<Pagamento> getPagamento() {
		return pagamento;
	}

	public void setPagamento(List<Pagamento> pagamento) {
		this.pagamento = pagamento;
	}

	public List<Recebimento> getRecebimento() {
		return recebimento;
	}

	public void setRecebimento(List<Recebimento> recebimento) {
		this.recebimento = recebimento;
	}

	public Financeiro(List<Pagamento> pagamentos, List<Recebimento> recebimentos) {
		this.pagamento = pagamentos;
		this.recebimento = recebimentos;
	}

	public double calculaSaldo() {
		double totalRecebido = 0;
		for (Recebimento r : recebimento) {
			totalRecebido += r.getValor();
		}

		double totalPago = 0;
		for (Pagamento p : pagamento) {
			totalPago += p.getValor();
		}

		return totalRecebido - totalPago;
	}
}
