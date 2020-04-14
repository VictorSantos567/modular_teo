package ingresso;

import java.time.LocalDateTime;

public class Ingressos{
	private String nome;
	private double valor;
	private LocalDateTime data;
	
	public Ingressos(String nome, double valor, int ano, int mes, int dia, int horas, int minutos) {
		setNome(nome);
		setValor(valor);
		data = LocalDateTime.of(ano, mes, dia, horas, minutos);
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
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
}
