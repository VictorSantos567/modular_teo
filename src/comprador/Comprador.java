package comprador;
public class Comprador {

    private String nomeCompleto;
    private String rg;
    
    public Comprador() {
    	
    }
	public Comprador(String nomeCompleto, String rg) {
		setNomeCompleto(nomeCompleto);
		setRg(rg);
    }
    
	public void setNomeCompleto(String nomeCompleto) {
	    this.nomeCompleto = nomeCompleto;
    }

    public void setRg(String rg) {
	    this.rg = rg;
    }


    public String getNomeCompleto() {
		return nomeCompleto;
    }

    public String getRg() {
		return rg;
    }



    public String imprimirComprador() {
		return "Nome Completo: " + getNomeCompleto() + "\nRg: " + getRg();
    }
    
}