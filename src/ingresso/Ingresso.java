package ingresso;

import java.time.LocalDateTime;

public class Ingresso {

	private String nomeEvento;
	private LocalDateTime data_compra;
	private float valor;
	
	
	public Ingresso() {
	}

	public String getnomeEvento() {
		return nomeEvento;
	}
	public void setnomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}

	public LocalDateTime getData() {
		return data_compra;
	}
	public void setData(LocalDateTime data) {
		this.data_compra = data;
	}
	
	public String toString(LocalDateTime data) {
		return data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() 
		+ " - " + data.getHour() + ":" + data.getMinute() + " hs";
	}
	
	public String imprimirIngresso() {
		if (getData() != null) {
			return "\nEvento: " + getnomeEvento() + "\nPreco: R$ " + getValor() + "\nData da Compra: " +  toString(data_compra);	
		}
		else {
			return "\nEvento: " + getnomeEvento() + "\nPreco: R$ " + getValor();
		}
		
	}
}
