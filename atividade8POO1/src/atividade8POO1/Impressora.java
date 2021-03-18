package atividade8POO1;

public class Impressora {

	private String modelo;
	private int tipo;

	public Impressora() {
	}

	public Impressora(String modelo, int tipo) {
		this.modelo = modelo;
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo.length() > 0)
			this.modelo = modelo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		if (tipo > 0)
			this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Impressora [modelo=");
		builder.append(modelo);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}

	public String imprimir(Documento doc) {
		return doc.getTexto();
	}
}
