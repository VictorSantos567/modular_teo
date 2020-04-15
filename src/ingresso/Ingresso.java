package ingresso;

import java.time.LocalDateTime;

public class Ingresso {
	private String nome;
	private double valor;
	private LocalDateTime data_compra;
	private static final LocalDateTime DATA_EVENTO = LocalDateTime.of(2020,12,25,12,30);
	
	public Ingresso(String nome, double valor) {
		setNome(nome);
		setValor(valor);
		data_compra = LocalDateTime.now();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public LocalDateTime getData() {
		return data_compra;
	}
	public void setData(LocalDateTime data) {
		this.data_compra = data;
	}

	public static LocalDateTime getDataEvento() {
		return DATA_EVENTO;
	}
	
	public String toString(LocalDateTime data) {
		return data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() 
		+ " - " + data.getHour() + ":" + data.getMinute() + " hs";
	}
	
	public String imprimirIngresso() {
		return "Nome: " + getNome() + "\nPreço: R$ " + getValor() + "\nData da Compra: " + toString(data_compra) 
				+ "\nData do Evento: " + toString(DATA_EVENTO);
	}
}
