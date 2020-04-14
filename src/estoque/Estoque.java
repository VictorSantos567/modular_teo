package estoque;

public class Estoque {
	private static final int CAPACIDADE_TOTAL_ESTOQUE = 100;
	private int quantidade_atual_de_ingressos = 100;
	
	public void retirar(int qtd_ingressos) {
		quantidade_atual_de_ingressos -= qtd_ingressos; 
	}
	
	public void devolver(int qtd_ingressos) {
		quantidade_atual_de_ingressos += qtd_ingressos;
	}

	public int getQuantidade_atual_de_ingressos() {
		return quantidade_atual_de_ingressos;
	}

	public static int getCapacidadeTotalEstoque() {
		return CAPACIDADE_TOTAL_ESTOQUE;
	}
	
}
