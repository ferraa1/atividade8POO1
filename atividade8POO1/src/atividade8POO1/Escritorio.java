package atividade8POO1;

import java.util.ArrayList;
import java.util.List;

public final class Escritorio {

	private String endereco;
	private List<Funcionario> lfuncionario = new ArrayList<Funcionario>();
	private List<Impressora> limpressora = new ArrayList<Impressora>();

	public Escritorio() {
	}

	public Escritorio(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco.length() > 0)
			this.endereco = endereco;
	}

	public List<Funcionario> getLfuncionario() {
		return lfuncionario;
	}

	public void setLfuncionario(List<Funcionario> lfuncionario) {
		if (lfuncionario.size() > 0)
			this.lfuncionario = lfuncionario;
	}

	public List<Impressora> getLimpressora() {
		return limpressora;
	}

	public void setLimpressora(List<Impressora> limpressora) {
		if (limpressora.size() > 0)
			this.limpressora = limpressora;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Escritorio [endereco=");
		builder.append(endereco);
		builder.append(", lfuncionario=");
		builder.append(lfuncionario);
		builder.append(", limpressora=");
		builder.append(limpressora);
		builder.append("]");
		return builder.toString();
	}

	public boolean addFuncionarioVendas(String nome, String cpf, double salario) {
		Vendas vendas = new Vendas(nome, cpf, salario);
		return lfuncionario.add(vendas);
	}

	public boolean addFuncionarioTelemarketing(String nome, String cpf, double salario) {
		Telemarketing telemarketing = new Telemarketing(nome, cpf, salario);
		return lfuncionario.add(telemarketing);
	}

	public boolean addImpressora(Impressora impressora) {
		return limpressora.add(impressora);
	}
}
