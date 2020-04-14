package ingresso;

import java.time.LocalDateTime;

public class Ingressos{
	private String nome;
	private double valor;
	private LocalDateTime data_compra;
	private static final LocalDateTime DATA_EVENTO = LocalDateTime.of(2020,12,25,12,0);
	
	public Ingressos(String nome, double valor) {
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
}
