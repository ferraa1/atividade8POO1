package atividade8POO1;

public class Vendas extends Funcionario implements Metodos {

	private static double metaVendas;
	private static double preco;

	public Vendas() {
		super();
	}

	public Vendas(String nome, String cpf, double salario) {
		super(nome, cpf, salario, 1);
	}

	public static double getMetaVendas() {
		return metaVendas;
	}

	public static void setMetaVendas(double metaVendas) {
		if (metaVendas > 0)
			Vendas.metaVendas = metaVendas;
	}

	public static double getPreco() {
		return preco;
	}

	public static void setPreco(double preco) {
		if (preco > 0)
			Vendas.preco = preco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vendas [metaVendas=");
		builder.append(metaVendas);
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public boolean verificarMeta(int valor) {
		if (valor * preco > metaVendas)
			return true;
		else
			return false;
	}

}
