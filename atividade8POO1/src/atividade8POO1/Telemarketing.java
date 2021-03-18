package atividade8POO1;

public class Telemarketing extends Funcionario implements Metodos {

	private static int metaLigacoes;

	public Telemarketing() {
		super();
	}

	public Telemarketing(String nome, String cpf, double salario) {
		super(nome, cpf, salario, 2);
	}

	public static int getMetaLigacoes() {
		return metaLigacoes;
	}

	public static void setMetaLigacoes(int metaLigacoes) {
		if (metaLigacoes > 0)
			Telemarketing.metaLigacoes = metaLigacoes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Telemarketing [metaLigacoes=");
		builder.append(metaLigacoes);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public boolean verificarMeta(int valor) {
		if (valor > metaLigacoes)
			return true;
		else
			return false;
	}

}
