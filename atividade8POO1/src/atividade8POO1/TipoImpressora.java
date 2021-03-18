package atividade8POO1;

public enum TipoImpressora {
	TINTA(1),
	CERA(2),
	LASER(3);
	
	private final int valor;
	
	TipoImpressora(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
}
